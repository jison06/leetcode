# [Container with the most water](https://leetcode.com/problems/container-with-most-water/)

## Problem
- See Link

## Takeaways
- Finding the maximizing the area for this problem required you to move the pointer that contained the smaller height value
- This works because there are 3 scenarios when moving the pointer of the smallest of the 2 heights: Area is smaller, equal, or greater than the area before it
- If you move the larger of the two pointers, the area is guaranteed to be smaller
- Area is bottlenecked by the height of the smaller box in this problem
- Starting from the two pointers at the middle won't work because odds are that starting from the ends will give you the larger area because part of the formula is the length between the two heights
- Generally starting from the middle will also require more loops because one of the sides will go out of bounds before the other which isn't a problem with starting from the sides because the stopping condition usually is when they pass each other