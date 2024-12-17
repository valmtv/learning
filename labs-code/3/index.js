import * as THREE from 'three'
import { OrbitControls } from 'three/examples/jsm/controls/OrbitControls';

// woodenbox texture
import woodenBoxTexture from '../textures/wooden-box.png';
// default skybox imgs
import posxImage from '../textures/teide/posx.jpg';
import negxImage from '../textures/teide/negx.jpg';
import posyImage from '../textures/teide/posy.jpg';
import negyImage from '../textures/teide/negy.jpg';
import poszImage from '../textures/teide/posz.jpg';
import negzImage from '../textures/teide/negz.jpg';
// 2nd skybox imgs
import posxImage2 from '../textures/ryfiallet/posx.jpg';
import negxImage2 from '../textures/ryfiallet/negx.jpg';
import posyImage2 from '../textures/ryfiallet/posy.jpg';
import negyImage2 from '../textures/ryfiallet/negy.jpg';
import poszImage2 from '../textures/ryfiallet/posz.jpg';
import negzImage2 from '../textures/ryfiallet/negz.jpg';
//import rock textures
import baseColor from '../textures/red-rock/baseColor.png';
import normalMap from '../textures/red-rock/normal.png';
import roughnessMap from '../textures/red-rock/roughness.png';
import metalnessMap from '../textures/red-rock/metallic.png';
import aoMap from '../textures/red-rock/a0.png';
import heightMap from '../textures/red-rock/height.png';


class MaterialsDemo {
  constructor() {
    this.isDefaultSkybox = true;
    this.container = document.getElementById('scene-container');
    this.scene = new THREE.Scene();
    this.camera = new THREE.PerspectiveCamera(
      75,
      window.innerWidth / window.innerHeight,
      0.1,
      1000
    );

    this.renderer = new THREE.WebGLRenderer({ antialias: true });
    this.controls = null;
    this.objects = []; // Store objects for rotation
    this.skybox = null;
    
    this.init();
    this.setupLights();
    this.createObjects();
    this.animate();
    this.createSkybox();
    this.setupKeyboardListener();
  }
  setupKeyboardListener() {
    window.addEventListener('keydown', (event) => {
      if (event.key === ' ') {
        this.isDefaultSkybox = !this.isDefaultSkybox;
        this.updateSkybox();
      }
    });
  }

  updateSkybox() {
    // Remove the existing skybox if it exists
    if (this.skybox) {
      this.scene.remove(this.skybox);
      this.skybox.geometry.dispose();
      this.skybox.material.forEach((material) => material.map.dispose());
      this.skybox.material.forEach((material) => material.dispose());
    }

    // Recreate the skybox based on the new isDefaultSkybox value
    this.createSkybox();
    const cubeTextureLoader = new THREE.CubeTextureLoader();
    const newEnvMap = cubeTextureLoader.load(
      this.isDefaultSkybox
        ? [posxImage, negxImage, posyImage, negyImage, poszImage, negzImage]
        : [posxImage2, negxImage2, posyImage2, negyImage2, poszImage2, negzImage2]
    );

    this.reflectiveSphereMaterial.envMap = newEnvMap;
    this.reflectiveSphereMaterial.needsUpdate = true;
  }

  init() {
    // Setup renderer
    this.renderer.setSize(window.innerWidth, window.innerHeight);
    this.renderer.setPixelRatio(window.devicePixelRatio);
    this.container.appendChild(this.renderer.domElement);

    // Setup camera
    this.camera.position.set(0, 2, 8);

    // Setup controls
    this.controls = new OrbitControls(this.camera, this.renderer.domElement);
    this.controls.enableDamping = true;

    // Setup background
    this.scene.background = new THREE.Color(0x87ceeb); // Sky blue background

    // Handle window resize
    window.addEventListener('resize', this.onWindowResize.bind(this));
  }

    createSkybox() {
    const loader = new THREE.TextureLoader();

    // Determine the images based on isDefaultSkybox
    const materialArray = this.createMaterialArray(loader, this.isDefaultSkybox);

    // Create skybox mesh
    const skyboxGeometry = new THREE.BoxGeometry(100, 100, 100);
    this.skybox = new THREE.Mesh(skyboxGeometry, materialArray);
    this.scene.add(this.skybox);
  }

  createMaterialArray(loader, isDefaultSkybox) {
    const images = isDefaultSkybox
      ? {
          posx: posxImage,
          negx: negxImage,
          posy: posyImage,
          negy: negyImage,
          posz: poszImage,
          negz: negzImage,
        }
      : {
          posx: posxImage2,
          negx: negxImage2,
          posy: posyImage2,
          negy: negyImage2,
          posz: poszImage2,
          negz: negzImage2,
        };

    return Object.values(images).map((image) =>
      new THREE.MeshBasicMaterial({
        map: loader.load(image),
        side: THREE.BackSide,
      })
    );
  }

  setupLights() {
    // Ambient light
    const ambientLight = new THREE.AmbientLight(0xffffff, 0.5);
    this.scene.add(ambientLight);

    // Directional light
    const directionalLight = new THREE.DirectionalLight(0xffffff, 1);
    directionalLight.position.set(5, 5, 5);
    this.scene.add(directionalLight);

    // Add point light for better reflections
    const pointLight = new THREE.PointLight(0xffffff, 1);
    pointLight.position.set(-5, 3, -5);
    this.scene.add(pointLight);
  }

  createObjects() {
    // Create objects with different materials
    
    // 1. Basic textured cube (wooden box)
    const woodTexture = new THREE.TextureLoader().load(woodenBoxTexture);
    const boxGeometry = new THREE.BoxGeometry(1, 1, 1);
    const boxMaterial = new THREE.MeshStandardMaterial({ map: woodTexture });
    const box = new THREE.Mesh(boxGeometry, boxMaterial);
    box.position.x = -2;
    this.scene.add(box);
    this.objects.push(box);

    // 2. rock sphere
    const textureLoader = new THREE.TextureLoader();
    const sbaseColor = textureLoader.load(baseColor);
    const snormalMap = textureLoader.load(normalMap);
    const sroughnessMap = textureLoader.load(roughnessMap);
    const smetalnessMap = textureLoader.load(metalnessMap);
    const saoMap = textureLoader.load(aoMap);
    const sheightMap = textureLoader.load(heightMap);
    const sphereGeometry = new THREE.SphereGeometry(0.7, 32, 32);

    const sphereMaterial = new THREE.MeshStandardMaterial({
      map: sbaseColor,
      normalMap: snormalMap,
      roughnessMap: sroughnessMap,
      metalnessMap: smetalnessMap,
      aoMap: saoMap,
      displacementMap: sheightMap,
      displacementScale: 0.1,
    });
    const rockSphere = new THREE.Mesh(sphereGeometry, sphereMaterial);
    rockSphere.position.x = 4;
    this.scene.add(rockSphere);
    this.objects.push(rockSphere);

    // 3. Transparent glass cube
    const glassGeometry = new THREE.BoxGeometry(1.2, 1.2, 1.2);
    const glassMaterial = new THREE.MeshPhysicalMaterial({
      transmission: 0.9,
      thickness: 0.5,
      roughness: 0.1,
      color: 0x88ccff,
      transparent: true,
    });
    const glassCube = new THREE.Mesh(glassGeometry, glassMaterial);
    glassCube.position.y = 1.5;
    this.scene.add(glassCube);
    this.objects.push(glassCube);

    // 4. Reflective sphere
    // // Load environment map (use the skybox textures for reflections)
    const cubeTextureLoader = new THREE.CubeTextureLoader();
    const environmentMap = cubeTextureLoader.load([
      posxImage, negxImage, posyImage, negyImage, poszImage, negzImage,
    ]);

    this.reflectiveSphereMaterial = new THREE.MeshPhysicalMaterial({
      envMap: environmentMap,
      roughness: 0.1,
      metalness: 1,
      color: 0x888888,
    });

    const reflectiveSphereGeometry = new THREE.SphereGeometry(0.8, 32, 32);
    const reflectiveSphere = new THREE.Mesh(reflectiveSphereGeometry, this.reflectiveSphereMaterial);
    reflectiveSphere.position.y = 1.5;
    reflectiveSphere.position.x = 2;
    this.scene.add(reflectiveSphere);
    this.objects.push(reflectiveSphere);


  }

  onWindowResize() {
    this.camera.aspect = window.innerWidth / window.innerHeight;
    this.camera.updateProjectionMatrix();
    this.renderer.setSize(window.innerWidth, window.innerHeight);
  }

  animate() {
    requestAnimationFrame(this.animate.bind(this));

    // Rotate objects
    this.objects.forEach((obj) => {
      obj.rotation.x += 0.005;
      obj.rotation.y += 0.01;
    });
    this.controls.update();
    this.renderer.render(this.scene, this.camera);
  }


}

new MaterialsDemo();
