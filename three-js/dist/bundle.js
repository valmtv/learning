/*
 * ATTENTION: The "eval" devtool has been used (maybe by default in mode: "development").
 * This devtool is neither made for production nor for readable output files.
 * It uses "eval()" calls to create a separate source file in the browser devtools.
 * If you are trying to read the output file, select a different devtool (https://webpack.js.org/configuration/devtool/)
 * or disable the default devtool with "devtool: false".
 * If you are looking for production-ready output files, see mode: "production" (https://webpack.js.org/configuration/mode/).
 */
/******/ (() => { // webpackBootstrap
/******/ 	"use strict";
/******/ 	var __webpack_modules__ = ({

/***/ "./src/index.js":
/*!**********************!*\
  !*** ./src/index.js ***!
  \**********************/
/***/ ((__unused_webpack_module, __webpack_exports__, __webpack_require__) => {

eval("__webpack_require__.r(__webpack_exports__);\n/* harmony import */ var three__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! three */ \"./node_modules/three/build/three.module.js\");\n// Import necessary Three.js modules\n\n\n\n// Load textures\nvar textureLoader = new three__WEBPACK_IMPORTED_MODULE_0__.TextureLoader();\nvar baseColorTexture = textureLoader.load('../textures/red-rock/baseColor.png');\nvar normalMapTexture = textureLoader.load('../textures/red-rock/normal.png');\nvar roughnessMapTexture = textureLoader.load('../textures/red-rock/roughness.png');\nvar metallicMapTexture = textureLoader.load('../textures/red-rock/metallic.png');\nvar emissiveMapTexture = textureLoader.load('../textures/red-rock/emissive.png');\n\n// Create materials\nvar material = new three__WEBPACK_IMPORTED_MODULE_0__.MeshStandardMaterial({\n  color: 0xffffff,\n  map: baseColorTexture,\n  normalMap: normalMapTexture,\n  roughnessMap: roughnessMapTexture,\n  metalnessMap: metallicMapTexture,\n  emissiveMap: emissiveMapTexture,\n  emissiveIntensity: 1\n});\n\n// Create the rock mesh\nvar geometry = new three__WEBPACK_IMPORTED_MODULE_0__.BoxGeometry(2, 2, 2);\nvar rockMesh = new three__WEBPACK_IMPORTED_MODULE_0__.Mesh(geometry, material);\n\n// Add the rock mesh to the scene\nvar scene = new three__WEBPACK_IMPORTED_MODULE_0__.Scene();\nscene.add(rockMesh);\n\n// Add lighting\nvar ambientLight = new three__WEBPACK_IMPORTED_MODULE_0__.AmbientLight(0x404040);\nscene.add(ambientLight);\nvar directionalLight = new three__WEBPACK_IMPORTED_MODULE_0__.DirectionalLight(0xffffff, 1);\ndirectionalLight.position.set(1, 1, 1);\nscene.add(directionalLight);\n\n// Set up the camera and renderer\nvar camera = new three__WEBPACK_IMPORTED_MODULE_0__.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);\ncamera.position.z = 5;\nvar renderer = new three__WEBPACK_IMPORTED_MODULE_0__.WebGLRenderer();\nrenderer.setSize(window.innerWidth, window.innerHeight);\ndocument.body.appendChild(renderer.domElement);\n\n// Render the scene\nfunction animate() {\n  requestAnimationFrame(animate);\n  rockMesh.rotation.x += 0.01;\n  rockMesh.rotation.y += 0.01;\n  renderer.render(scene, camera);\n}\nanimate();\n\n//# sourceURL=webpack://three-js/./src/index.js?");

/***/ }),

/***/ "./node_modules/three/build/three.module.js":
/*!**************************************************!*\
  !*** ./node_modules/three/build/three.module.js ***!
  \**************************************************/
/***/ ((__unused_webpack___webpack_module__, __webpack_exports__, __webpack_require__) => {


/***/ })

/******/ 	});
/************************************************************************/
/******/ 	// The module cache
/******/ 	var __webpack_module_cache__ = {};
/******/ 	
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/ 		// Check if module is in cache
/******/ 		var cachedModule = __webpack_module_cache__[moduleId];
/******/ 		if (cachedModule !== undefined) {
/******/ 			return cachedModule.exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = __webpack_module_cache__[moduleId] = {
/******/ 			// no module.id needed
/******/ 			// no module.loaded needed
/******/ 			exports: {}
/******/ 		};
/******/ 	
/******/ 		// Execute the module function
/******/ 		__webpack_modules__[moduleId](module, module.exports, __webpack_require__);
/******/ 	
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/ 	
/************************************************************************/
/******/ 	/* webpack/runtime/define property getters */
/******/ 	(() => {
/******/ 		// define getter functions for harmony exports
/******/ 		__webpack_require__.d = (exports, definition) => {
/******/ 			for(var key in definition) {
/******/ 				if(__webpack_require__.o(definition, key) && !__webpack_require__.o(exports, key)) {
/******/ 					Object.defineProperty(exports, key, { enumerable: true, get: definition[key] });
/******/ 				}
/******/ 			}
/******/ 		};
/******/ 	})();
/******/ 	
/******/ 	/* webpack/runtime/hasOwnProperty shorthand */
/******/ 	(() => {
/******/ 		__webpack_require__.o = (obj, prop) => (Object.prototype.hasOwnProperty.call(obj, prop))
/******/ 	})();
/******/ 	
/******/ 	/* webpack/runtime/make namespace object */
/******/ 	(() => {
/******/ 		// define __esModule on exports
/******/ 		__webpack_require__.r = (exports) => {
/******/ 			if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 				Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 			}
/******/ 			Object.defineProperty(exports, '__esModule', { value: true });
/******/ 		};
/******/ 	})();
/******/ 	
/************************************************************************/
/******/ 	
/******/ 	// startup
/******/ 	// Load entry module and return exports
/******/ 	// This entry module can't be inlined because the eval devtool is used.
/******/ 	var __webpack_exports__ = __webpack_require__("./src/index.js");
/******/ 	
/******/ })()
;