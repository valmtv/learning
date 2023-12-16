// GENERAL
// malloc - allocates a block of memory but doesn’t initialize it,
// calloc - allocates a block of memory and clears it,
// realloc - resizes a previously allocated block of memory.

#include <stdlib .h> // LIBRARY with malloc, calloc, realloc

// the way to estimate needed memory for different types
float* p = malloc (100 * sizeof( float ));

// memory allocation may fail so we need to check
if (!p) { // if (p == NULL ) {
  // allocation failed ; take appropriate action
}
else {
// // allocation successful
}
// or this way
if (p) { // if (p != NULL ) {
  // allocation successful 
}
else {
  // allocation failed ; take appropriate action
}
//After allocating the memory
//calloc initializes it by setting all bits to 0
double * p = calloc (100 , sizeof ( double ) ) ;
if ( p ) {
//  ...
}
//The realloc function can resize the array - 
void *realloc( void *ptr, size_t size); //*pts is a pointer to previously allocated memory

// REALLOC
// When it expands a memory block, realloc doesn’t initialize the bytes
// that are added to the block.
// If realloc can’t enlarge the memory block as requested, it returns a
// null pointer, the data in the old memory is unchanged.
// If realloc is called with a null pointer as its first argument, it behaves
// like malloc.
// If realloc is called with 0 as its second argument, it frees the memory
// block
// EXAMPLE
int n =150 , b =18;
int * tab = realloc(NULL , n * sizeof(int)); // same as malloc we initialize memory
tab = realloc(tab, (n - b) * sizeof(int)); // we change memory of tab
tab = realloc(tab , (2* n + 7* b) * sizeof(int)); // one more time we change it
tab = realloc(tab , 0); // we clear the memory

// IMPORTANT
free (tab); // we have to free the memory
// so now we can reuse its block

// TERIBLE MISTAKE of memory leak
int * p = malloc (100 * sizeof (int) ) ;
int * q = malloc (100 * sizeof (int) ) ;
p = q ; // now we cant access memory for p!
// it`s oke if before the we `free (p);`

// TO CHECK IF WE USE MEMORY PROPERLY
//use http://valgrind.org/
// valgring ./a.out when execute 
//
//The C library has two functions for copying bytes from one location
//to another.
void* memcpy (void* restrict s1 , const void* restrict s2 , size_t n);
void* memmove (void * s1 , const void* s2, size_t n);
//Each one copies n bytes from location s2 to location s1.

