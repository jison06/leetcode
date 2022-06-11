# Two Pointers

## Scenarios
Scenario | Stopping condition | Considerations | Generally when to use
---------|----------|---------|--------------------------
 left = 0; right = array.length - 1 | left < right | - If you need it to run more more the length of the array, you need to make the condition left<= right, | When an array is sorted and you want to compare values, when you can make a binary decision about the current position of the two pointers(ex: Container with water and maxmimizing area)
 left = 0; right = 1 | right < array.length | You can use also use a for loop to implement this, You can use left to manipulate l + 1st element | When you need to keep track of a place in the array. You can use the left pointer as an "anchor" and increment it accordingly and the right pointer as a "finder" to look for an element in the list
 left = mid - 1; right = mid | left > 0 && right < array.length | You need to make more loops based on which pointer finished first | When the array you can surpass the boundary of the array with one pointer before the other and you know that the rest of the elements past the pointer that hasn't reached the boundary condition can be put into the result in the order they appear
