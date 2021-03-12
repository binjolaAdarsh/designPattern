When we see "new" think concrete classes
and when we have whole set of concrete classes 
are forced to write code like 

```
Tea tea
if(outside)
tea = GingerWithMilkTea
else if (atHome)
tea = MilkTea
else if (earlyMorning)
tea = GreenTea
```

When you see code like this ,you know that when it comes
time for change,you will have to reopen this code
and examine what needs to be added(or deleted)

In this branch I will try to explain with pizza example
and its different challenges we face when CHANGE comes as a requirement