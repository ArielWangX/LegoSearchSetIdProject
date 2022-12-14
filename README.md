# LegoSearchSetIdProject
Retrieve data from the given csv file using the Lego Set ID.

### How to run the executable

- Download the LegoSearch.jar under [Executable folder](https://github.com/ArielWangX/LegoSearchSetIdProject/tree/main/ExecutableJar)
- Make sure you have Java environment installed
- Run with `java -jar LegoSearch.jar`
- Sample input value `10030-1`
```
Please enter your set id: (enter exit if you want to leave)
10030-1
Name: Imperial Star Destroyer - UCS
Year released: 2002
Theme name: Star Wars Episode 4/5/6
Number of parts: 3115
```
- To exit the program, type `exit`
```
Please enter your set id: (enter exit if you want to leave)
exit
```


### Wireframe
- Find the Lego_Set_ID_Search.png under [Wireframes folder](https://github.com/ArielWangX/LegoSearchSetIdProject/tree/main/Wireframes)
- [Figma - Lego Set ID Search](https://www.figma.com/file/8kCWEeh6sy3w0Zm0G713Ec/Lego-Set-ID-Search?node-id=0%3A1)

![Lego_Set_ID_Search](https://user-images.githubusercontent.com/109891752/188306303-3ed41fd8-352a-4be6-8ea3-c32ce4bf9e29.png)


### Summary on what I would've done next
- Add fuzzy lookup - use part of set_id to look for a list of items containing that id.
- Add unit test.
- How to find item in list faster, maybe use hashset
