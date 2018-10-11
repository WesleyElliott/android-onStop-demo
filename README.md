## Android onStop Issue Demo 

The `MainActivity` is declared in the manifest with `noHistory` set to true. 
When navigating from `MainActivity` to `SecondActivity`, the `onStop` is not called for `MainActivity` until navigating 
from `SecondActivity` to `ThirdActivity`.

If `noHistory` is removed from `MainActivity`, the `onStop` is called immediately when navigating to `SecondActivity`
