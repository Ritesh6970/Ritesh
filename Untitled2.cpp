#include <stdio.h>
#include <stdlib.h>

void selectionsort(int a[], int n) {
    int i, j, pos, temp;
    
    for (i = 0; i < n; i++) {
        pos = i;  // Initialize position for the current iteration
        
        for (j = i + 1; j < n; j++) {
            if (a[j] < a[pos]) {
                pos = j;  // Update position if a smaller element is found
            }
        }
        
        // Swap the found minimum element with the first element
        if (i != pos) {
            temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
    }
}

int main() {
    int *a, n, i;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    
    a = (int *)malloc(n * sizeof(int));
    if (a == NULL) {
        printf("Memory allocation failed\n");
        return 1; // Exit if memory allocation fails
    }
    
    printf("Enter the array elements:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    
    selectionsort(a, n);
    
    printf("Sorted elements are:\n");
    for (i = 0; i < n; i++) {
        printf("%d\t", a[i]);
    }
    
    free(a); // Free allocated memory
    return 0; // Indicate successful completion
}

