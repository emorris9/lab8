# Answers.md

   - Why does `FixedArrayQueue` require an explicit constructor?
   
   FixedArrayQueue requires an explicit constructor because it grants the capacity of the queue to be passed as an
   argument, then it is used to set the size on the fixed array. It also allows us to give set values to other variables, 
   such as size and the front index.
   
   - What happens when you offer an item to a full `FixedArrayQueue`?
   
   Due to the array being fixed, you cannot add anything into the queue.
   
   - What happens when you poll an empty `FixedArrayQueue`?
   
   The returned value is null due to there being nothing to poll.
   
   - What is the time and (extra) space complexity of each of the `FixedArrayQueue` methods?
   
   For offer, peek, poll, isEmpty, size have the time & space complexity O(1), while asList's time complexity is O(n) & the space complexity is O(1).