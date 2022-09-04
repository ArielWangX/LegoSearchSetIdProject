package csv

val setsCsv =
    """
        set_id,name,year,theme_id,num_parts
        00-1,Weetabix Castle,1970,414,471
        0011-2,Town Mini-Figures,1978,84,12
        0011-3,Castle 2 for 1 Bonus Offer,1987,199,2
        0012-1,Space Mini-Figures,1979,143,12
        0013-1,Space Mini-Figures,1979,143,12
        0014-1,Space Mini-Figures,1979,143,12
        0015-1,Space Mini-Figures,1979,143,18
        0016-1,Castle Mini Figures,1978,186,15
        00-2,Weetabix Promotional House 1,1976,413,147
        00-3,Weetabix Promotional House 2,1976,413,149
        00-4,Weetabix Promotional Windmill,1976,413,126
        005-1,Basic Building Set in Cardboard,1965,366,35
        00-6,Special Offer,1985,67,3
        00-7,Weetabix Promotional Lego Village,1976,413,3
        010-1,Basic Building Set in Cardboard,1965,366,57
        010-3,Basic Building Set,1968,366,77
        011-1,Basic Building Set,1968,366,145
        022-1,Basic Building Set,1968,366,110
        03093-1,The Race to Build It Board Game,1999,502,70
        033-2,Basic Building Set,1968,366,177
        044-1,Basic Building Set,1968,366,225
        055-2,Basic Building Set,1968,366,256
        066-1,Basic Building Set,1968,366,407
        080-1,Basic Building Set with Train,1967,366,710
        088-1,Super Set,1969,469,615
        10000-1,Guarded Inn,2001,186,256
        10001-1,Metroliner,2001,233,785
        10002-1,Railroad Club Car,2001,233,272
        10003-1,1 x 2 Sand Red Bricks,2001,254,100
        10004-1,2 x 2 Sand Red Bricks,2001,254,100
        10005-1,2 x 4 Sand Red Bricks,2001,254,50
        10006-1,1 x 6 Sand Red Bricks,2001,254,50
        10007-1,2 x 4 Sand Red Ridge Roof Tiles Steep Slope,2001,254,25
        10008-1,2 x 4 Roof Tile Sand Red,2001,254,50
        10009-1,Assorted Blue Bricks,2001,254,62
        100-1,4.5V Motor with Wheels (Small Version),1966,243,16
        10010-1,Assorted Yellow Bricks,2003,254,63
        10011-1,Assorted Blue Plates,2001,254,42
        10012-1,Assorted Yellow Plates,2001,254,42
        10013-1,Open Freight Wagon,2001,238,121
        10014-1,Caboose,2001,238,170
        10015-1,Passenger Wagon,2001,238,194
        10016-1,Tanker,2001,238,128
        10017-1,Hopper Wagon,2001,238,228
        10018-1,Darth Maul,2001,158,1868
        10019-1,Rebel Blockade Runner - UCS,2001,174,1747
        100-2,4.5V Motor with Wheels (Large Version),1966,243,27
        10020-2,"Santa Fe Super Chief, Limited Edition",2002,236,433
        10021-1,U.S.S. Constellation,2003,404,974
        10023-1,Master Builder Set,2002,324,112
        10024-1,Red Baron,2002,276,669
        10025-1,Santa Fe Cars - Set I (mail or baggage car),2002,237,325
        10026-1,Naboo Starfighter - UCS,2002,172,187
        10027-1,Train Engine Shed,2003,239,670
        10029-1,Lunar Lander,2003,387,468
        10030-1,Imperial Star Destroyer - UCS,2002,174,3115
        10036-1,Pizza To Go,2002,75,150
        10037-1,Breezeway Cafe,2002,75,194
        10039-1,Black Falcon's Fortress,2002,186,431
        10040-1,Black Seas Barracuda,2002,147,914
        10042-1,American Flag,2003,206,35
        10043-1,2x2 Electrical Plate,2002,254,1
        10044-1,Windows and Doors,2002,254,44
        10045-1,Pillars and Beams,2002,254,13
        10046-1,Brown Tiles,2002,254,100
        10047-1,Light Gray Arches,2002,254,36
        10048-1,Small Wheels and Axles,2002,254,61
        10049-1,Large Wheels and Axles,2002,254,31
        10050-1,Gray Fences,2002,254,34
        10051-1,Transparent Bricks,2002,254,50
        10053-1,Black Slopes 33,2003,254,44
        10054-1,Black Slopes 33 3 x 2 and 3 x 4,2003,254,68
        10055-1,Black Slopes 33 3 x 1 and 3 x 3,2003,254,50
        10056-1,White Plates 2 x n,2002,254,56
        10057-1,Black Plates 2 x n,2002,254,56
        10058-1,Red Plates 2 x n,2002,254,56
        10059-1,Dark Green Plates 2 x n,2002,254,56
        10060-1,Light Gray Plates 2 x n,2002,254,56
        10061-1,Black Plates 1 x n,2002,254,84
        10062-1,Red Plates 1 x n,2002,254,84
        10063-1,Dark Green Plates 1 x n,2002,254,84
        10064-1,Light Gray Plates 1 x n,2002,254,84
        10065-1,White Plates 1 x n,2002,254,84
        10066-1,Castle Accessories,2002,255,41
        10067-1,Mini-Fig Headgear,2002,254,53
        10068-1,Santa Claus,2002,227,39
        10069-1,Christmas Tree,2002,227,33
        10070-1,Reindeer,2002,227,26
        10071-1,Mr. Bunny,2003,229,25
        10072-1,TECHNIC Beams,2003,256,56
        10073-1,Bushes,2003,256,130
        10074-1,Cross Axles,2003,256,68
        10075-1,Spider-Man Action Pack,2002,488,25
        10076-1,TECHNIC Gear Wheels,2002,256,38
        10077-1,TECHNIC Motor,2003,256,55
        10078-1,Train Connection Wire,2003,257,1
        10079-1,Snowman,2003,227,42
        10080-1,Angel,2003,227,33
        10081-1,Birthday Pack Heart,2004,500,70
        10082-1,Birthday Pack Daisy,2004,500,70
        10083-1,Birthday Pack Star,2004,500,70
        10090-1,Turkey,2003,231,54
        10106-1,Snowflake,2006,227,107
        101-1,4.5V Battery Case,1969,243,1
        10111-1,Foliferous Tree,2001,254,10
        10112-1,Bush,2001,254,25
        10113-1,Cypress Trees,2001,254,5
        10114-1,2 x 2 Sand Red Roof Tiles,2001,254,100
        10115-1,Jumper Bricks,2001,254,80
        10116-1,Accessories Heart,2004,500,50
        10117-1,Accessories Daisy,2004,500,50
        10118-1,Accessories Star,2004,500,50
        10121-1,NBA Basketball Teams,2003,459,16
        10123-1,Cloud City,2003,169,707
        10124-1,Wright Flyer,2003,276,663
        10127-1,NHL Action Set with Stickers,2003,461,56
        10128-1,Train Level Crossing,2003,239,326
        10129-1,Rebel Snowspeeder - UCS,2003,174,1456
        101-3,4.5V Battery Case,1966,243,1
        10131-1,TIE Fighter Collection,2004,169,688
        10132-1,Motorized Hogwarts Express,2004,246,693
        10133-1,Burlington Northern Santa Fe Locomotive,2004,236,400
        10134-1,Y-wing Attack Starfighter - UCS,2004,174,1487
        10143-1,Death Star II,2005,174,3460
        10144-1,Sandcrawler,2005,169,1679
        10145-1,Assorted Light Gray Bricks,2004,254,124
        10146-1,Assorted Dark Gray Bricks,2004,254,62
        10147-1,Assorted Brown Bricks,2004,254,62
        10148-1,Assorted Light Gray Plates,2004,254,84
        10149-1,Assorted Dark Gray Plates,2004,254,42
        10150-1,Assorted Brown Plates,2004,254,42
        10151-1,Hot Rod,2004,278,420
        10152-1,Maersk Sealand Container Ship 2004 Edition,2004,276,982
        10152-2,Maersk Sealand Container Ship 2005 Edition,2005,276,982
        10152-3,Maersk Line Container Ship 2006 Edition,2006,276,982
        10153-1,Electric Train Motor 9V (My Own Train),2002,244,3
        10155-1,Maersk Line Container Ship 2010 Edition,2010,276,984
        10156-1,LEGO Truck,2004,85,105
        10157-1,High Speed Train Locomotive,2004,239,134
        10158-1,High Speed Train Car,2004,239,151
        10159-1,City Airport -City Logo Box,2004,53,913
        10159-2,City Airport -Full Size Image Box,2004,68,913
        10160-1,Black Ridge Roof Tiles,2004,254,48
        10161-1,Black Roof Tiles,2004,254,76
        10162-1,Red Ridge Tiles,2004,254,48
        10163-1,Red Roof Tiles,2004,254,76
        10165-1,Elf Boy,2004,227,27
        10166-1,Elf Girl,2004,227,31
        10167-1,Brickmaster Kit (with Digital Designer CD),2004,301,182
        10168-1,Mrs. Bunny,2005,229,64
        10169-1,Chicken & Chicks,2005,229,60
        10170-1,TTX Intermodal Double-Stack Car,2005,236,365
        10173-1,Holiday Train,2006,236,969
        10174-1,Imperial AT-ST - UCS,2006,174,1070
        10175-1,Vader's TIE Advanced - UCS,2006,174,1211
        10176-1,Royal King's Castle,2006,197,871
        10177-1,Boeing 787 Dreamliner,2006,276,1196
        10178-1,Motorized Walking AT-AT,2007,169,1137
        10179-1,Millennium Falcon - UCS,2007,174,5195
        10181-1,Eiffel Tower 1:300 Scale,2007,276,3428
        10182-1,Cafe Corner,2007,155,2058
        10183-1,Hobby Train,2007,397,1080
        10184-1,Town Plan,2008,104,2017
        10185-1,Green Grocer,2008,155,2358
        10186-1,General Grievous,2008,173,1084
        10187-1,Volkswagen Beetle (VW Beetle),2008,276,1625
        10188-1,Death Star,2008,174,3807
        10189-1,Taj Mahal,2008,276,5922
        10190-1,Market Street,2007,155,1250
        10191-1,Star Justice,2008,397,884
        10192-1,Space Skulls,2008,397,956
        10193-1,Medieval Market Village,2009,193,1616
        10194-1,Emerald Night,2009,240,1089
        10195-1,Republic Dropship with AT-OT,2009,165,1757
        10196-1,Grand Carousel,2009,276,3260
        10197-1,Fire Brigade,2009,155,2236
        10198-1,Tantive IV,2009,169,1408
        10199-1,Winter Toy Shop,2009,227,815
        10-2,Universal Building Set,1976,469,129
        10200-1,Custom Car Garage,2008,397,893
        10201-1,Takutanuva,2003,347,3
        10202-1,Ultimate Dume (Limited Edition with Exclusive Mask Of Power),2004,347,6
        10202-2,Ultimate Dume,2004,347,3
        10203-1,Voporak,2005,347,3
        10204-1,Vezon & Kardas,2006,347,3
        10205-1,Locomotive,2002,238,231
        102-1,4.5V Motor Set,1968,243,24
        10210-1,Imperial Flagship,2010,153,1623
        10211-1,Grand Emporium,2010,155,2186
        10212-1,Imperial Shuttle - UCS,2010,174,2502
        10213-1,Shuttle Adventure,2010,276,1203
        10213sup-1,Supplemental Pack for Shuttle Adventure Set 10213,2010,443,29
        10214-1,Tower Bridge,2010,276,4295
        10215-1,Obi-Wan's Jedi Starfighter - UCS,2010,175,675
        10216-1,Winter Village Bakery,2010,227,686
        10217-1,Diagon Alley,2011,246,2031
        10218-1,Pet Shop,2011,155,2034
        10219-1,Maersk Container Train,2011,240,1232
        10220-1,Volkswagen T1 Camper Van,2011,276,1333
        10221-1,Super Star Destroyer,2011,174,3151
        10222-1,Winter Village Post Office,2011,227,821
        10223-1,Kingdoms Joust,2012,196,1574
        10224-1,Town Hall,2012,155,2771
        10225-1,R2-D2,2012,171,2130
        10226-1,Sopwith Camel,2012,276,877
        10227-1,B-wing Starfighter,2012,174,1484
        10228-1,Haunted House,2012,558,2062
        10229-1,Winter Village Cottage,2012,227,1490
        10230-1,Mini Modulars,2012,156,1358
        10231-1,Shuttle Expedition,2011,276,1229
        10232-1,Palace Cinema,2013,155,2192
        10233-1,Horizon Express,2013,240,1349
        10234-1,Sydney Opera House,2013,276,2988
        10235-1,Winter Village Market [Initial Release],2013,227,1259
        10236-1,Ewok Village,2013,169,2023
        10237-1,The Tower of Orthanc,2013,568,2360
        10240-1,Red Five X-Wing Starfighter,2013,174,1573
        10241-1,Maersk Line Triple-E,2014,38,1515
        10242-1,Mini Cooper,2014,22,1074
        10242-2,Mini Cooper,2015,22,1076
        10243-1,Parisian Restaurant,2014,155,2469
        10244-1,Fairground Mixer,2014,22,1743
        10245-1,Santa’s Workshop,2014,228,882
        1024601-1,Adventurers Value Pack (TRU Exclusive),2001,297,3
        10246-1,Detective’s Office,2015,155,2261
        10247-1,Ferris Wheel,2015,22,2463
        10248-1,Ferrari F40,2015,22,1157
        10249-1,Winter Toy Shop,2015,227,895
        10250-1,Year Of The Snake,2013,22,244
        10251-1,Brick Bank,2016,155,2383
        10252-1,Volkswagen Beetle,2016,22,1166
        10253-1,Big Ben,2016,43,4166
        10254-1,Winter Holiday Train,2016,227,737
        10255-1,Assembly Square,2017,155,4009
        10257-1,Carousel,2017,22,2669
        10285-1,Compass Sensor for Mindstorms NXT,2011,259,1
        10287-1,Intelligent NXT Brick (Black),2009,259,1
        1029-1,Milk Delivery Truck - Tine,1999,75,90
        102A-1,Front-End Loader,1970,416,64
        102A-2,Front-End Loader,1970,416,56
        10-3,Locomotive Wheels,1977,456,8
        1030-1,TECHNIC I: Simple Machines Set,1985,1,189
        103-1,4.5V Motor Set with Rubber Tracks,1969,473,24
        1031-1,Building Cards - 1030,1983,532,20
        1032-1,TECHNIC II Set {4.5v},1985,1,278
        1033-1,Building Cards - 1032,1985,532,20
        1034-1,Teachers Resource Set,1985,532,1534
        1038-1,ERBIE the Robo-Car,1985,1,120
        1039-1,Manual Control Set 1,1986,1,39
        104-1,Replacement 4.5V Motor,1970,243,1
        1045-2,Educational LEGO Building Set,1976,511,683
        1049-1,Ships - 247 elements and 1 poster,1985,510,238
        10500-1,Horse Stable,2013,504,44
        10501-1,Zoo friends,2013,504,5
        10504-1,My First Circus,2013,504,62
        10505-1,Play House,2013,504,83
        10506-1,Train Accessory Set,2013,504,24
        10507-1,My First Train Set,2013,504,52
        10508-1,Deluxe Train Set,2013,504,134
        10509-1,Dusty and Chug,2013,504,16
        105-1,Canada Post Truck,1984,81,65
        10510-1,Ripslinger's Air Race,2013,504,40
        10511-1,Skipper's Flight School,2013,504,49
        10512-1,Jake's Treasure Hunt,2013,504,22
        10513-1,Never Land Hideout,2013,504,37
        10514-1,Jake's Pirate Ship Bucky,2013,504,56
        10515-1,Ariel's Undersea Castle,2013,504,39
        10516-1,Ariel's Magical Boat Ride,2012,504,29
        10517-1,My First Garden,2013,504,37
        10518-1,My First Construction Site,2013,504,47
        105-2,Building Set,1973,469,150
        10520-1,Big Front Loader,2013,504,12
        10521-1,Baby Calf,2014,504,9
        10522-1,Farm Animals,2014,504,12
        10524-1,Farm Tractor,2014,504,29
        10525-1,Big Farm,2014,504,121
        10526-1,Peter Pan's Visit,2014,504,39
        10527-1,Ambulance,2014,504,14
        10528-1,School Bus,2014,504,26
        10529-1,Truck,2014,504,16
        1053-1,Community Buildings,1984,533,895
        10531-1,Mickey Mouse and Friends,2012,504,65
        10532-1,My First Police Set,2014,504,39
        10538-1,Fire and Rescue Team,2014,506,30
        10539-1,Beach Racing,2014,504,36
        1054-1,Stena Line Ferry,1999,471,211
        10542-1,Sleeping Beauty's Fairy Tale,2014,579,55
        10543-1,Superman™ Rescue,2014,504,19
        10544-1,The Joker Challenge,2014,504,40
        10545-1,Batcave Adventure,2014,504,59
        10546-1,My First Shop,2014,504,39
        10550-1,Circus Transport,2013,504,9
        10552-1,Creative Cars,2013,504,42
        10553-1,Toddler Build and Play Cubes,2013,505,17
        10554-1,Toddler Build and Pull Along,2013,505,15
        10555-1,Creative Bucket,2013,505,65
        10557-1,Giant Tower,2013,504,200
        10558-1,Number Train,2013,504,31
        1056-1,Basic School Pack - 773 elements with teacher's manual,1985,534,785
        10561-1,Toddler Starter Building Set,2013,505,37
        10565-1,LEGO® DUPLO® Creative Suitcase,2014,504,135
        10566-1,Creative Picnic,2014,504,52
        10567-1,Toddler Build and Boat Fun,2014,504,18
        10568-1,Knight Tournament,2014,504,16
        10569-1,Treasure Attack,2014,504,46
        10570-1,LEGO® DUPLO® All-in-One-Gift-Set,2014,504,30
        10571-1,All-in-One-Pink-Box-of-Fun,2014,504,65
        10572-1,All-in-One-Box-of-Fun,2014,504,65
        10573-1,Creative Animals,2014,504,25
        10574-1,Creative Ice Cream,2014,504,23
        10575-1,Duplo Creative Building Cube,2014,504,75
        10576-1,Zoo Care,2014,504,9
        10577-1,Big Royal Castle,2014,504,135
        10579-1,Clubhouse Café,2014,504,16
        10580-1,Deluxe Box of Fun,2014,504,95
        10581-1,Forest: Ducks,2015,504,13
        10582-1,Forest: Animals,2015,504,39
        10583-1,Forest: Fishing Trip,2015,504,30
        10584-1,Forest: Park,2015,504,102
        10585-1,Mom and Baby,2015,504,13
        10586-1,Ice Cream Truck,2015,504,11
        10587-1,Café,2015,504,51
        10589-1,Rally Car,2015,504,13
        10590-1,Airport,2015,504,29
        10591-1,Fire Boat,2015,504,19
        10592-1,Fire Truck,2015,504,26
        10593-1,Fire Station,2015,504,104
        10594-1,Sofia the First™ Royal Stable,2015,504,38
        10595-1,Sofia the First™ Royal Castle,2015,504,87
        10596-1,Disney Princess™ Collection,2015,504,63
        10597-1,Mickey & Minnie Birthday Parade,2015,504,24
        10599-1,Batman Adventure,2015,504,46
        10600-1,Disney • Pixar Cars™ Classic Race,2015,506,29
        1060-1,Road Plates and Signs,1981,533,30
        10601-1,Delivery Vehicle,2015,504,19
        10602-1,Camping,2015,504,37
        10603-1,My First Bus,2015,504,17
        10604-1,Jake and the Never Land Pirates Treasure Island,2015,504,25
        10605-1,Doc McStuffins Rosie the Ambulance,2015,504,16
        10606-1,Doc McStuffins Backyard Clinic,2015,504,39
        10607-1,Spider-Man Web-Bike Workshop,2015,504,13
        10608-1,Spider-Man Spider Truck Adventure,2015,504,28
        106-1,UNICEF Van,1985,79,59
        1061-1,Single Disk Pack,2000,20,1
        10615-1,My First Tractor,2015,504,12
        10616-1,My First Playhouse,2015,504,25
        10617-1,My First Farm,2015,504,26
        10618-1,LEGO® DUPLO® Creative Building Box,2015,504,69
        1062-1,{Town Vehicles},1980,533,158
        10622-1,Large Creative Box,2015,504,193
        10623-1,Basic Bricks – Large,2015,505,0
        1063-1,Community Workers,1985,533,169
        1064-1,Dacta Buildings,1981,533,0
        1065-1,House Accessories - 182 elements,1985,534,196
        10654-1,XL Creative Brick Box,2016,365,1599
        10655-1,Monster Trucks,2013,37,197
        10656-1,My First LEGO Princess,2013,22,88
        10657-1,My First LEGO Set,2013,37,148
        10659-1,Blue Suitcase,2013,37,152
        10660-1,Pink Suitcase,2013,37,157
        1066-1,36 Little People + Accessories,1982,533,174
        10661-1,My First LEGO Fire Station,2013,22,90
        10662-1,LEGO Creative Bucket,2013,37,607
        10663-1,LEGO Creative Chest,2013,22,607
        10664-1,Creative Tower,2013,22,1599
        10665-1,Spider-Man: Spider-Car Pursuit,2014,591,55
        10666-1,Digger,2014,591,75
        10667-1,Construction,2014,591,159
        10668-1,The Princess Play Castle,2014,591,149
        10669-1,Turtle Lair,2014,591,107
        1067-1,Community Vehicles,1988,507,251
        10671-1,Fire Emergency,2014,591,123
        10672-1,Batman: Defend the Batcave,2014,591,150
        10673-1,Race Car Rally,2014,591,349
        10674-1,Pony Farm,2014,591,305
        10675-1,Police – The Big Escape,2014,591,146
        10676-1,Knights’ Castle,2014,591,479
        10677-1,Beach Excursion,2015,591,74
        10679-1,Pirate Treasure Hunt,2015,591,57
        10680-1,Garbage Truck,2015,591,99
        1068-1,Air Patrol,1999,87,20
        10681-1,Creative Building Cube,2014,37,599
        10682-1,Creative Suitcase,2014,37,1016
        10683-1,Road Work Truck,2015,591,132
        10684-1,Supermarket Suitcase,2015,591,132
        10685-1,Fire Suitcase,2015,591,113
        10686-1,Family House,2015,591,226
        10687-1,Spider-Man™ Hideout,2015,591,137
        1069-1,Speedboat,1999,77,22
        10692-1,Creative Bricks,2015,366,220
        10693-1,Creative Supplement,2015,366,302
        10693-1-s1,Rocket,2015,365,12
        10694-1,Creative Supplement Bright,2015,366,302
        10695-1,Creative Building Box,2015,366,579
        10696-1,Medium Creative Brick Box,2015,366,483
        10697-1,XXXL Box,2015,365,1499
        10698-1,Large Creative Brick Box,2015,366,789
        10699-1,Sand Baseplate,2015,365,1
        10700-1,Green Baseplate,2015,365,1
        1070-1,Stunt Flyer,1999,87,20
        10701-1,Gray Baseplate,2015,365,1
        10702-1,Creative Building Set,2016,365,582
        10703-1,Creative Builder Box,2017,365,499
        10704-1,Creative Box,2017,365,900
        10705-1,Creative Building Basket,2016,366,999
        10706-1,Blue Creative Box,2017,365,78
        10707-1,Red Creative Box,2017,365,55
        10708-1,Green Creative Box,2017,365,66
        10709-1,Orange Creative Box,2017,365,60
        107-1,4.5V Motor Set,1976,473,31
        107-2,Canada Post Mail Truck,1985,81,138
        10720-1,Police Helicopter Chase,2016,591,63
        10721-1,Iron Man vs Loki,2016,591,66
        10722-1,Snake Showdown,2016,591,92
        10723-1,Ariel's Dolphin Carriage,2016,591,70
        10724-1,Batman & Superman vs. Lex Luthor,2016,482,164
        10725-1,Lost Temple,2016,591,171
        10726-1,Stephanie's Horse Carriage,2016,496,58
        10727-1,Emma's Ice Cream Truck,2016,494,136
        10728-1,Mia's Vet Clinic,2016,494,182
        10729-1,Cinderella's Carriage,2016,591,116
        10734-1,Demolition Site,2017,591,162
        10735-1,Police Truck Chase,2017,591,90
        10736-1,Anna & Elsa's Frozen Playground,2017,591,94
        10737-1,Batman vs. Mr. Freeze,2017,591,63
        10740-1,Fire Patrol Suitcase,2017,591,108
        10746-1,Mia's Farm Suitcase,2017,591,104
        10747-1,Andrea and Stephanie's Beach Holiday,2017,591,141
        1075-1,LEGO People Supplementary Set,1980,511,256
        1076-1,Advent Calendar 1999,1999,207,228
        1076-10,Advent Calendar 1999 (Day  9) Fire Engine,1999,217,10
        1076-11,Advent Calendar 1999 (Day 10) Santa Minifig,1999,217,5
        1076-12,Advent Calendar 1999 (Day 11) Dog,1999,217,8
        1076-13,Advent Calendar 1999 (Day 12) Hippo,1999,217,9
        1076-14,Advent Calendar 1999 (Day 13) Hovercraft,1999,217,10
        1076-15,Advent Calendar 1999 (Day 14) Penguin,1999,217,8
        1076-16,Advent Calendar 1999 (Day 15) Elf,1999,217,12
        1076-17,Advent Calendar 1999 (Day 16) Seaplane,1999,217,10
        1076-18,Advent Calendar 1999 (Day 17) Gentleman,1999,217,10
        1076-19,Advent Calendar 1999 (Day 18) Elephant,1999,217,10
        1076-2,Advent Calendar 1999 (Day  1) Plane,1999,217,11
        1076-20,Advent Calendar 1999 (Day 19) Sea Plane,1999,217,8
        1076-21,Advent Calendar 1999 (Day 20) Cow,1999,217,10
        1076-22,Advent Calendar 1999 (Day 21) Police Car,1999,217,11
        1076-23,Advent Calendar 1999 (Day 22) Dog with Red Hat,1999,217,12
        1076-24,Advent Calendar 1999 (Day 23) Police Helicopter,1999,217,10
        1076-25,Advent Calendar 1999 (Day 24) Santa,1999,217,11
        1076-3,Advent Calendar 1999 (Day  2) Snowman,1999,217,11
        1076-4,Advent Calendar 1999 (Day  3) Speedboat,1999,217,7
        1076-5,Advent Calendar 1999 (Day  4) Girl,1999,217,8
        1076-6,Advent Calendar 1999 (Day  5) Sailboat,1999,217,9
        1076-7,Advent Calendar 1999 (Day  6) Reindeer,1999,217,12
        1076-8,Advent Calendar 1999 (Day  7) Plane,1999,217,10
        1076-9,Advent Calendar 1999 (Day  8) Girl,1999,217,8
        1077-1,Supplementary Set,1976,528,170
        10801-1,Baby Animals,2016,504,13
        10802-1,Savanna,2016,504,15
        10803-1,Arctic,2016,504,32
        10804-1,Jungle,2016,504,86
        10805-1,Around the World,2016,504,148
        10806-1,Horses,2016,504,20
        10808-1,Little Plane,2016,504,13
        108-1,Battery Box,1976,243,1
        10810-1,Push Train,2016,504,46
        10813-1,Big Construction Site,2016,504,48
        10814-1,Tow Truck Set,2016,504,26
        10818-1,My First Truck,2016,504,29
        10824-1,Miles' Space Adventures,2017,504,23
        10825-1,Miles' Exo-Flex Suit,2016,504,37
        10827-1,Mickey and Friends Beach House,2016,504,48
        10829-1,Mickey's Workshop,2016,504,18
        10830-1,Minnie's Cafe,2016,504,27
        1083-1,Supplementary Pack,1986,534,106
        10831-1,My First Caterpillar,2016,504,19
        10847-1,My First Number Train,2017,504,19
        10849-1,My First Plane,2017,504,10
        10852-1,My First Bird,2017,504,7
        1088-1,Road Burner,1999,87,25
        1089-1,Lego Basic Figures - 24 elements,1985,534,24
        1090-1,TECHNIC Control I,1986,1,397
        1092-1,TECHNIC Control II,1986,1,467
        10937-1,Arkham Asylum Breakout,2012,484,1619
        1094-1,Johnny Thunder,1999,297,13
        1095-1,Super Sub,1999,311,24
        1096-1,Race Buggy,1997,82,23
        1097-1,Res-Q Runner,1999,92,18
        1098-1,Hang Glider,1998,87,19
        1099-1,Ninja Blaster,1999,434,24
        1-10,Mini-Wheel Model Maker No. 1,1971,423,86
        1100-1,Sky Pirates,2001,68,110
        110-1,Universal Building Set,1977,469,129
        1101-1,Replacement 4.5V Motor,1977,443,1
        1102-1,Motor Bushes,1977,456,4
        1103-1,Battery Box,1977,443,1
        1103-2,DNA Student Set,2008,517,521
        1104-1,Battery Cables (75cm),1977,443,2
        1105-1,Crawler Tracks,1977,443,2
        1106-1,Battery Tender,1977,456,2
        1106-2,Basic Building Set,1999,470,413
        1107-1,Signal and Direction-Change Switch,1977,456,4
        1108-1,Magnetic Couplings,1977,456,4
        1109-1,Magnetic Couplings for Railway Car,1977,456,4
        1-11,Basic Souvenir Box,1981,469,36
        1110-1,Train Wheels,1977,456,8
        111-1,Universal Building Set,1977,469,173
        1111-1,Rubber Rims for Locomotive Wheels,1977,456,8
        111-2,Starter Train Set without Motor,1966,235,118
        1112-1,Train Sliding Wheel Blocks,1977,456,2
        1113-1,Motor Frame and Couplers,1977,443,5
        1114-1,Motor Frame,1977,443,1
        1115-1,4.5V Lighting Brick (2 x 2),1977,443,1
        1118-1,"Boat Weight, Red",1977,443,1
        1119-1,Locomotive Piston Assemblies,1977,456,6
        11-2,Small Pre-School Basic Set,1973,433,31
        1120-1,Tires (42 mm),1977,443,2
        112-1,Universal Building Set,1977,469,200
        112-2,Locomotive with Motor,1966,235,74
        1122-1,Hinges,1977,443,3
        1124-1,Digger Bucket,1977,443,3
        1125-1,Crane Grab,1977,443,3
        1127-1,Santa,1999,227,39
        1128-1,Santa on Skis,1997,227,21
        1129-1,Storage Cloth (Spread Bag),1980,473,1
        1129-2,Santa on Reindeer,1999,227,34
        11-3,Locomotive Traction Tires,1977,456,8
        1130-1,Storage Folder for Building Instructions (16 Internal Pockets),1980,443,1
        113-1,Universal Building Set,1977,469,293
        1131-1,Tires (42 mm) and Hubs,1981,453,4
        113-2,Motorized Train Set,1966,235,344
        1132-1,Hinges,1981,443,8
        1133-1,Brick Hinges,1981,443,8
        1134-1,Battery Wagon,1981,456,2
        1135-2,"Battery Cable Kit: 16 Connectors, 3m Cable",1981,443,17
        1136-1,"Buffers, Magnetic Couplers",1981,456,6
        1137-1,Train Couplings,1981,456,4
        1138-1,Replacement Rubber Wheel Treads for Trains,1981,456,8
        1139-1,Motor-Mount Plate with Magnetic Couplers,1981,456,5
        1140-1,12V Light Bricks,1981,443,2
        114-1,Universal Building Set,1977,469,390
        1141-1,Wheel Bricks with Small Red Train Wheels,1981,456,2
        114-2,Small Train Set,1966,235,88
        1142-1,Wheel Bricks with Small Black Train-Wheels,1981,456,2
        1143-1,Wheel Bricks with Large Red Train Wheels,1981,456,2
        1144-1,Train Baseplate,1981,456,1
        1145-1,Bogie Plate,1981,456,1
        1147-1,"Light Prisms & Holder, Red/Yellow Light Covers",1981,456,7
        1148-1,Differential,1981,453,5
        1149-1,Air Police,2002,100,24
        1149-2,Bulldozer Chainlinks,1982,453,52
        1150-1,Replacement Motor 12V,1977,443,1
        115-1,Building Set,1973,469,190
        1151-1,Train Power Pick-Up Blocks,1977,456,2
        115-2,Starter Train Set with Motor,1966,235,132
        1152-1,Electric Wire,1977,456,2
        1154-1,Battery Control Unit,1986,453,1
        116-1,Starter Train Set with Motor,1967,235,364
        1161-1,TECHNIC Pneumatic Pump Cylinder 48mm,1985,453,1
        116-2,Deluxe Motorized Train Set,1968,235,361
        1162-1,TECHNIC Pneumatic Piston Cylinder 48mm,1985,453,1
        1163-1,TECHNIC Pneumatic Piston Cylinder 60mm,1985,453,1
        1164-1,TECHNIC Pneumatic 2 Way Valve and Nonreturn Valve,1985,453,2
        1168-1,Battery Box,1986,1,1
        1169-1,Bogie Plates,1986,456,2
        1170-1,Replacement Train Battery Tender,1986,456,2
        117-1,Locomotive without Motor,1967,235,99
        1171-1,Lighting Brick with Red and Blue Globes,1986,443,5
        1172-1,Colored Globes,1986,443,5
        1174-1,Motorhome for Basic Motor 4.5V/Train Motor 12V,1986,443,2
        1175-1,4.5v TECHNIC Motor,1982,453,1
        1176-1,Gear Racks and Turntables,1978,453,6
        1177-1,Santa In Truck with Polar Bear,2000,227,26
        1179-1,Replacement Space Siren,1986,443,1
        1180-1,Space Port Moon Buggy,1999,93,25
        118-1,Electronic Train,1968,235,103
        1181-1,Space Port Spacecraft,1999,93,23
        118-2,Small Train Set,1968,235,117
        1182-1,Adventurers Raft,1999,297,18
        118-3,Motorized Freight or Passenger Train (Sears Exclusive),1969,235,419
        1183-1,Mummy and Cart,1999,297,17
        1184-1,Cart,1999,434,24
        1185-1,Raft,1999,434,25
        1186-1,Cart,1999,434,25
        1187-1,Glider,1999,434,23
        1188-1,Fire Formula,1999,87,38
        1189-1,Rocket Boat,1999,87,30
        1190-1,Retro Buggy,1999,87,90
        11905-1,DK Star Wars Brickmaster: Battle For The Stolen Crystals,2013,497,189
        11908-1,Build Your Own Adventure with Liza Mini-Doll and Touring Car,2015,494,77
        11909-1,Lego Ninjago: Build Your Own Adventure,2015,435,74
        119-1,Super Train Set,1968,235,401
        11910-1,Micro-Scale Space Cruiser,2015,126,102
        1191-1,Try Bird,1999,87,34
        11912-1,LEGO Star Wars: Build Your Own Adventure,2016,158,73
        1194-1,Classic Building Table,1999,470,408
        1195-1,Alien Encounter,2001,135,42
        1196-1,Biker with Bicycle,2000,458,7
        1197-1,Telekom Race Cyclist and Television Motorbike,2000,458,30
        1197-2,Crown Gears,1981,453,2
        1198-1,Service Team - 2 Bikers with Service Tools,2000,458,76
        1199-1,Winning Team,2000,458,110
        11995-1,Hero Recon Team,2011,400,0
        1200-2,"LEGO Town Plan Board, Small Plastic",1956,372,1
        1200M-1,LEGO Town Plan Wooden Board,1957,372,1
        120-1,Complete Freight Train Set with Tipper Trucks,1969,235,163
        1202-1,racer polybag,2001,125,1
        1204-1,"Fences, Red and Black",1984,443,10
        120438-1,Basic Building Set,1985,469,176
        1205-1,Keys for Wind-Up Motor,1982,443,2
        1207-1,"Turntables (4 x 4), Red",1982,443,2
        1209-1,Fences and Gates,1982,443,10
        12-1,Blue Space Elements,1981,452,8
        1210-1,Winch Block and Hook Assembly,1982,443,3
        1210-2,Small Store Set,1955,372,30
        121-1,Roadster,1979,390,23
        1211-1,Space Stands and Brackets,1982,443,8
        1211-2,Small House Set,1955,372,19
        1212-2,Small House - Left Set,1955,372,21
        1213-1,Space Radar Disks,1982,452,5
        1213-2,Small House - Right Set,1955,372,23
        1214-1,Upper Part of Motorhome for 4.5V/12V Trainmotor,1984,456,1
        1214-2,Windows and Doors,1955,371,24
        1215-1,Train Motor 4.5V Type II Lower Housing,1981,456,1
        1215-2,2 x 8 & 2 x 10 Bricks,1955,371,20
        1216-1,Semaphores with Feet,1982,456,8
        1216-2,4 x 4 Corner Bricks,1955,371,20
        1217-1,Yellow Girder Beams & Plates,1982,453,20
        1217-2,2 x 4 Bricks,1955,371,52
        1218-1,Blue Girder Beams & Plates,1982,453,20
        1218-2,2 x 3 Bricks,1955,371,60
        1219-1,TECHNIC Beams & Plates [Red],1982,453,20
        1219-2,2 x 2 Bricks,1955,371,80
        1220-1,Black Girder Beams & Plates,1982,453,20
        1220-2,1 x 2 Bricks,1955,371,104
        122-1,Loco and Tender,1969,235,96
        1221-1,TECHNIC beams - yellow,1982,453,8
        1221-2,1 x 1 Bricks,1955,371,160
        1222-1,TECHNIC beams - blue,1982,453,8
        1222-2,1 x 1 Round Bricks,1955,371,200
        1223-1,TECHNIC beams - black,1982,453,8
        1223-2,2 x 2 & 2 x 4 Curved Bricks,1955,371,14
        1223-3,2 x 2 Curved Bricks,1957,371,100
        1224-1,TECHNIC Beams [Red],1982,453,8
        1224.1-1,8 Danish Named Beams,1955,371,8
        1224-2,8 Named Beams,1955,371,8
        1224A-1,1 x 6 and 1 x 8 Bricks,1955,371,36
        1225-1,Assortment of Axles,1982,453,32
        1225-2,Mixed Plates Parts Pack,1955,371,12
        1226-1,Tractor Tires & Hubs,1982,453,12
        1226-2,6 x 8 & 2 x 8 Plates,1956,371,4
        1227-1,Gear Wheel Assortment,1982,453,15
        1227-2,4 x 8 & 2 x 8 Plates,1956,371,5
        1228-1,Differential Gear Housing,1982,453,28
        1228-2,4 x 8 Curved & 2 x 8 Plates,1956,371,5
        1229-1,TECHNIC Chainlinks,1982,453,70
        12-3,Wheel Bearings for Locomotives,1977,456,2
        1230-1,TECHNIC Bulldozer Chainlinks,1982,453,54
        1230-2,Windows and Door without Glass,1955,371,7
        123-1,Passenger Coach,1969,235,98
        1231-1,X-Large Tires & Hubs,1982,453,4
        1231-3,"Windows and Door with Glass, White",1956,371,10
        1232-1,Toggle Joints & Connectors,1982,453,46
        1233-1,Axle Assortment,1984,453,34
        1233-2,Light Masts,1958,371,4
        1234-1,Gear Wheel Assortment,1984,453,21
        1235-1,Differential Gear Housing,1984,453,19
        1235-2,Garage Plate and Door,1955,371,3
        1236-1,TECHNIC wheels with hubs,1984,453,4
        1236-2,Garage,1955,372,59
        1236-3,12V Technic Motor,1979,453,1
        1237-1,Honda Promotional Set,2001,14,55
        1239-1,Subzero,2001,125,4
        1239-2,Remote Control for Electric Points,1985,456,8
        1240-2,8 Road Signs,1955,371,8
        124-1,Goods Wagon,1969,235,56
        1241-1,Digger Bucket Assembly,1985,443,4
        1241-2,8 Road Signs,1955,371,8
        1242-1,Crane Grab and Winch,1986,443,4
        1242-2,International Flags,1957,371,5
        1242D-1,5 Danish Flags,1957,371,5
        1243-1,Hinges and Couplings,1986,443,9
        1244-1,Runway Plates,1986,443,2
        1245-1,T- and Intersection Plates,1986,443,2
        1245-2,Lighting Device Pack,1957,371,3
        1246-1,Helicopter,1999,50,26
        1247-1,Patrol Car,1999,50,32
        1247-2,Esso Pumps/Sign,1955,371,2
        1248-1,Fire Boat,1999,50,24
        1248-2,Painted Trees and Bushes,1955,371,6
        1249-1,Tri-motorbike,1999,60,17
        1250-1,Dragster,1999,91,24
        125-1,Tipping Wagon,1969,235,20
        1251-1,Go-Cart,1999,91,25
        125-2,Building Set,1974,469,234
        1252-1,Shell Tanker,1999,99,106
        1253-1,Shell Car Transporter,1999,99,101
        1254-1,Shell Select Shop,1999,99,164
        1255-1,Shell Car Wash,1999,99,136
        1256-1,Shell Petrol Pump,1999,99,156
        1257-1,Trike Buggy,1999,13,30
        1258-1,Propellor Buggy,1999,11,29
        1259-1,Motorbike,1999,13,28
        1260-1,Car,1999,12,26
        1260-2,1:87 Twenty Four Models,1957,368,24
        126-1,Steam Locomotive (Push),1970,235,60
        1263-1,Easter Bunny,2000,229,29
        1264-1,Easter Chicks,2000,229,29
        1265-1,Moon Buggy,1999,93,25
        1266-1,Space Probe,1999,93,23
        1267-1,Shock Absorbers,1985,453,4
        1268-1,Bike Blaster,1999,13,28
        1269-1,White Ninja,1999,434,23
        1270-2,Trial Size Bag - Chromika,2005,37,16
        127-1,Train Set,1969,235,365
        1271-1,Jungle Surprise,1999,299,33
        1271-2,Traffic Police Set,1956,372,6
        1272-1,Blue Racer,2000,91,23
        1273-1,Red Four Wheel Driver,2000,91,20
        1274-1,Light Hover,2000,442,25
        1275-1,{Rock Saw Vehicle},2000,442,22
        1276-1,Helicopter Transport,2000,442,22
        1277-1,Drill Craft,2000,442,27
        1278-1,Johnny Thunder & Baby T,2000,298,23
        1279-1,Aeroplane,2000,298,21
        1280-1,Microcopter,2000,298,28
        128-1,Taxi Station,1979,390,33
        1281-1,Aeroplane,2000,298,25
        128-2,Mobile Crane (Train Base),1972,235,23
        1282-1,Blue Racer,2000,91,23
        128-3,Mobile Crane (Plate Base),1971,235,38
        1283-1,Red Four Wheel Driver,2000,91,20
        1284-1,Green Buggy,2000,91,23
        1285-1,Yellow Tiger,2001,91,23
        1286-1,King Leo's Cart,2000,197,22
        1287-1,Crossbows,2000,197,16
        1288-1,Fire Cart,2000,197,24
        1289-1,Catapult,2000,197,23
        1290-1,Kabaya Promotional Set: Red (Volcano Climber) RoboRider,2000,16,35
        1291-1,Power Bike,2000,16,32
        1292-1,Kabaya Promotional Set: White (Ice Explorer) RoboRider,2000,16,33
        1293-1,Kabaya Promotional Set: Yellow/Green (Swamp Craft) RoboRider,2000,16,25
        1294-1,Fire Helicopter,2000,50,31
        1295-1,Water Rider,2000,87,30
        1296-1,Land Scooper,2000,50,30
        1297-1,Speed Patroller,2000,50,34
        1298-1,Advent Calendar 1998 Classic Basic,1998,212,24
        1298-10,Advent Calendar 1998 Classic Basic (Day  9) Whale,1998,221,9
        1298-11,Advent Calendar 1998 Classic Basic (Day 10)  Steamboat,1998,221,12
        1298-12,Advent Calendar 1998 Classic Basic (Day 11) Boat,1998,221,8
        1298-13,Advent Calendar 1998 Classic Basic (Day 12) Airplane,1998,221,12
        1298-14,Advent Calendar 1998 Classic Basic (Day 13) Santa,1998,221,5
        1298-15,Advent Calendar 1998 Classic Basic (Day 14) Airplane,1998,221,9
        1298-16,Advent Calendar 1998 Classic Basic (Day 15) Green Elf,1998,221,9
        1298-17,Advent Calendar 1998 Classic Basic (Day 16) Boat,1998,221,8
        1298-18,Advent Calendar 1998 Classic Basic (Day 17) Mouse,1998,221,9
        1298-19,Advent Calendar 1998 Classic Basic (Day 18) Blue Elf,1998,221,10
        1298-2,Advent Calendar 1998 Classic Basic (Day  1)  Airplane,1998,221,10
        1298-20,Advent Calendar 1998 Classic Basic (Day 19) Boat,1998,221,9
        1298-21,Advent Calendar 1998 Classic Basic (Day 20) Helicopter,1998,221,11
        1298-22,Advent Calendar 1998 Classic Basic (Day 21) Red Elf,1998,221,9
        1298-23,Advent Calendar 1998 Classic Basic (Day 22) Police Boat,1998,221,9
        1298-24,Advent Calendar 1998 Classic Basic (Day 23) Truck,1998,221,10
        1298-25,Advent Calendar 1998 Classic Basic (Day 24) Airplane,1998,221,10
        1298-3,Advent Calendar 1998 Classic Basic (Day  2) Santa,1998,221,5
        1298-4,Advent Calendar 1998 Classic Basic (Day  3) Boat,1998,221,9
        1298-5,Advent Calendar 1998 Classic Basic (Day  4) Boat,1998,221,10
        1298-6,Advent Calendar 1998 Classic Basic (Day  5) Sailboat,1998,221,10
        1298-7,Advent Calendar 1998 Classic Basic (Day  6) Airplane,1998,221,10
        1298-8,Advent Calendar 1998 Classic Basic (Day  7) Helicopter,1998,221,8
        1298-9,Advent Calendar 1998 Classic Basic (Day  8) Airplane,1998,221,9
        1300-1,Lego Mosaik Set (Small),1955,370,47
        130-1,Wagon with Double Tippers,1972,235,20
        1306-1,VW Garage,1957,372,45
        1307-1,VW Auto Showroom,1957,372,51
        1308-1,Fire Station,1957,372,109
        1309-1,Church,1957,372,150
        13-1,Gray Space Elements,1981,452,10
        1310-1,ESSO Filling Station,1956,372,96
        131-1,Passenger Coach,1972,235,66
        1314-1,Stop bush / Small pulley,1987,1,210
        1315-1,Piston Rod,1987,1,50
        1316-1,Connector peg,1987,1,150
        1317-1,TECHNIC Chainlinks,1987,1,350
        1318-1,Gears Small,1987,1,68
        1319-1,Gears Large,1987,1,22
        13-2,Large Pre-School Basic Set,1973,433,92
        1320-1,Differential and Bevel Gears,1987,1,32
        132-1,Cottage,1979,390,115
        1321-1,Worm Gear and Racks,1987,1,22
        132-2,Port Crane and Flat Waggon,1972,235,58
        1323-1,Hubs and Tyres,1985,524,24
        1324-1,Rubber Bands and String,1985,1,101
        1325-1,Assorted Spare Axles,1987,1,68
        1327-1,Red/Black Plates,1985,524,48
        1328-1,Red/Black Plates,1985,524,32
        1329-1,Red/Black Plates,1985,525,28
        13-3,Train Motor Plate with Buffers,1977,456,5
        1330-1,Red/Black Plates,1985,525,20
        133-1,Locomotive (Push),1975,235,81
        1331-1,Red/Blue Bricks,1985,525,88
        1332-1,Red/Blue Beams,1985,525,18
        1333-1,Red/Blue Beams,1985,525,20
        1334-1,Motors (4.5V),1985,525,2
        1335-1,Battery Boxes (4.5v),1985,525,2
        1336-1,Pole Reverser Switches for Battery Box,1985,1,2
        1337-1,Connecting Leads,1985,1,18
        1338-1,Angles Swivels Turntables,1985,524,72
        1339-1,TECHNIC parts,1987,1,20
        1340-1,Weight Bricks,1987,1,18
        134-1,Mobile Crane and Waggon,1975,235,55
        1341-1,Building Plates Green,1985,524,3
        134-2,Service Station,1979,390,84
        1342-1,Electric Switches and Tiles,1986,525,7
        1343-1,Optosensors (4.5V) and Discs,1986,525,4
        1344-1,Light Bricks (4.5V),1986,524,12
        1346-1,Touch Sensors,1987,1,2
        1347-1,Leads (4.5V) Spirals,1987,524,42
        1348-1,Base Plates Grey,1987,524,3
        1349-1,Steven Spielberg Moviemaker Set,2000,273,447
        135-1,Building Set,1973,469,338
        1351-1,Movie Backdrop Studio,2001,273,211
        1352-1,Explosion Studio,2000,273,237
        1353-1,Car Stunt Studio,2001,273,168
        1354-1,Dino Head Attack,2000,273,95
        1355-1,Temple of Gloom,2000,273,58
        1356-1,Stuntman Catapult,2001,273,29
        1357-1,Cameraman,2001,273,21
        1360-1,Director's Copter,2001,273,22
        136-1,Tanker Waggon (Shell),1975,235,81
        1361-1,Camera Car,2001,273,20
        1362-1,Air Boat,2001,273,24
        1363-1,Stunt Go-Cart,2001,273,25
        1370-1,Raptor Attack Studio,2001,274,157
        137-1,Hospital,1979,391,104
        1371-1,Spinosaurus Attack Studio,2001,274,186
        137-2,Passenger Sleeping Car,1975,235,81
        1374-1,Green Goblin,2002,488,59
        1376-1,Spider-Man Action Studio,2002,488,249
        1380-1,Werewolf Ambush,2002,273,114
        138-1,Electronic Train,1969,235,107
        1381-1,Vampire's Crypt,2002,273,171
        1382-1,Scary Laboratory,2002,273,500
        1383-1,Curse of the Pharaoh,2002,273,52
        1385-1,Clikits Bracelet Sample Set,2003,500,13
        1386-1,Clikits Bracelet Sample Set,2004,500,13
        1388-1,Huki [McDonald's Promo Set #1],2001,355,8
        1389-1,Onepu [McDonald's Promo Set #2],2001,355,8
        1390-1,Maku [McDonald's Promo Set #3],2001,355,8
        139-1,Electronic Control Unit (Forward/Backward - Stop),1969,243,13
        1391-1,Jala [McDonald's Promo Set #4],2001,355,8
        1392-1,Kongu [McDonald's Promo Set #5],2001,355,8
        1393-1,Matoro [McDonald's Promo Set #6],2001,355,8
        139A-1,Electronic Control Unit (Forward - Stop),1969,243,13
        140-1,Town Hall,1979,390,135
        140-2,Bricks'n Motor Set,1969,469,96
        14-1,Space Mini Figures,1982,452,24
        1411-1,Pirate's Treasure Hunt (Quaker Oats promo),2001,273,35
        1413-1,Rover,2001,135,29
        1414-1,Double Hover (Kabaya Promotional),2001,135,21
        1415-1,Jet Scooter,2001,135,24
        1416-1,Worker Robot,2001,135,30
        1417-1,Vakama,2001,356,28
        1417-2,Vakama (bagged),2003,356,28
        1418-1,Matau,2001,356,25
        1419-1,Nokama (Kabaya Promotional),2001,356,27
        1420-1,Nuju,2001,356,29
        1421-1,Director's Copter (Kabaya Promotional),2001,273,22
        1422-1,Camera Cart (Kabaya Promotional),2001,273,20
        1423-1,Air Boat (Kabaya Promotional),2001,273,24
        1424-1,Stunt Go-Kart (Kabaya Promotional),2001,273,25
        1425-1,Dash Jet Sub,2002,305,23
        1426-1,Cam Wing Diver,2002,305,21
        1427-1,Ogel Marine Slizer,2002,305,21
        1428-1,Small Soccer Set 1 (Kabaya Box),2002,462,24
        1428-2,Small Soccer Set 1 (Polybag),2002,462,20
        1429-1,Small Soccer Set 2 (Kabaya Box),2002,462,19
        1429-2,Small Soccer Set 2 (Polybag),2002,462,19
        14-3,Small house set,1973,433,0
        1430-1,Small Soccer Set 3 (Kabaya Box),2002,462,12
        1430-2,Small Soccer Set 3 (Polybag),2002,462,13
        1431-1,Tahnok Va (Kabaya Promotional),2002,329,27
        1432-1,Nuhvok Va (Kabaya Promotional),2002,329,26
        1433-1,Gahlok Va (Kabaya Promotional),2002,329,26
        1434-1,Lehvak Va (Kabaya Promotional),2002,329,25
        1435-1,Super Glider (Kabaya Promotional),2002,282,7
        1436-1,Ultralight Flyer (Kabaya Promotional),2002,282,16
        1437-1,Turbo Chopper (Kabaya Promotional),2002,282,13
        14-4,Train Motor Plate with Coupler,1977,456,1
        1441-1,Fikou (Tree-Spider),2003,324,13
        145-1,Building Set,1974,469,412
        146-1,Level Crossing,1976,235,68
        1461-1,Turbo Force,1992,82,31
        1462-1,Galactic Scout,1992,129,23
        1463-1,Treasure Cart,1992,190,24
        1464-1,Pirate Lookout,1992,148,17
        1467-1,Shell Race Car,1987,82,46
        1468-1,Shell Tanker,1987,76,39
        1469-1,Helicopter,1986,466,39
        1470-1,Shell Station,1987,76,32
        147-1,Refrigerated Car with Forklift,1976,235,112
        1472-1,Holiday Home,1987,69,359
        1474-1,Basic Building Set with Gift Item,1991,467,69
        1475-1,Airport Security Squad,1991,68,128
        1477-1,{Red Race Car Number 3},1991,82,39
        1478-1,Mobile Satellite Up-Link,1991,136,31
        1479-1,2-Pilot Craft,1991,129,34
        1480-1,King's Catapult,1991,190,33
        148-1,Central Station,1975,235,292
        1481-1,Desert Island,1991,148,24
        1484-1,Weetabix Town House,1987,69,215
        1489-1,Mobile Car Crane,1989,85,175
        1490-1,Town Bank,1988,85,195
        149-1,Fuel Refinery,1976,235,340
        1491-1,Dual Defender,1992,188,49
        1492-1,Battle Cove,1992,148,27
        1495-1,Basic Building Set Trial Size,1988,467,26
        1496-1,Rally Car,1987,82,52
        1497-1,Rally and Pitcrew Team,1987,82,124
        1498-1,Spy-Bot,1987,130,63
        1499-1,Twin Starfire,1987,130,89
        150-1,Straight Track,1966,243,25
        1506-1,Town Value Pack,1986,67,2
        1507-1,Space Value Pack,1986,130,2
        1509-1,Town Value Pack,1987,82,2
        15-1,Castle Mini Figures,1984,447,38
        1510-1,Space Value Pack,1987,130,2
        151-1,Curved Track,1966,243,25
        1512-1,Denken mit Lego (Thinking with Lego 250pcs),1972,517,250
        1512-2,Basic Set with Storage Case,1985,467,103
        1513-1,Denken mit Lego (Thinking with Lego 900pcs),1972,517,901
        1513-2,Basic Building Set Gift Item,1989,467,71
        1514-1,Basic Building Set Trial Size,1988,467,46
        1515-1,Town Value Pack,1989,82,2
        1516-1,Theater with Play-Scenes,1987,390,21
        1517-1,Race Car,1989,82,32
        1518-1,Race Car Repair,1989,82,79
        15-2,Large House Set,1973,433,157
        1520-1,Basic Set with Storage Case,1985,467,215
        1520-2,Town 2 for 1 Bonus Offer,1990,67,2
        152-1,Two Train Wagons,1966,235,22
        1521-1,Basic Building Set Trial Size,1989,467,24
        1522-1,Basic Building Set Trial Size,1989,467,44
        1523-1,Basic Set Trial Size,1986,467,27
        1524-1,Basic Set Trial Size,1986,467,38
        1525-1,Container Lorry,1986,70,153
        1526-1,Space Radar Buggy,1986,130,105
        1528-1,Dragster,1986,82,29
        153-1,Large Train Wagon,1966,235,15
        154-1,Switch Track - 1 Right and 1 Left,1967,243,4
        1544-1,Duplo Medium Bucket,1988,505,57
        1545-1,Build-A-Rabbit,1992,229,29
        1546-1,Airplane,1985,466,31
        1547-1,Black Knights Boat,1993,188,58
        1548-1,Stena Line Ferry,1992,471,173
        1549-1,Santa and Chimney,1992,227,62
        1550-1,Sterling Super Caravelle,1972,412,49
        1551-1,Chick,1985,229,6
        1551-2,Sterling Luggage Carrier,1972,412,49
        1552-1,Maersk Line Container Truck,1985,70,377
        1552-2,Sterling Boeing 727,1974,412,45
        1554-1,Silja Line Ferry,1986,471,175
        1555-1,Santa Claus,1986,227,19
        1555-2,Sterling Airways Biplane,1978,412,44
        1556-1,Christmas Hearts,1986,227,10
        1557-1,Scooter,1986,130,26
        1558-1,Mobile Command Trailer,1986,130,68
        1560-1,Glory Glider,1990,68,26
        1560-2,Lufthansa Boeing 727,1976,412,44
        1560-3,Crest Basic Building Set,1985,467,27
        156-1,2 Signals with Automatic Stop / Go Attachment,1968,243,6
        1561-1,Stunt Chopper,1990,68,30
        1561-2,Lufthansa Flight Crew,1976,364,60
        156-2,Straight Track,1976,243,25
        1562-1,Wave Jumper,1990,77,25
        1562-2,Basic Building Set,1985,467,36
        1562-3,Lufthansa Double-Decker,1976,412,50
        1563-1,Track Blaster,1990,82,30
        157-1,Curved Track,1976,243,25
        157-2,Automatic Direction Changer,1969,243,7
        1572-1,Super Tow Truck,1986,85,79
        157-3,Four Car Auto Transport,1970,423,65
        1575-1,Finnjet Ferry,1977,471,507
        1575-2,Basic Set with Board Game,1987,467,240
        1577-1,Medium Bucket,1988,467,217
        1580-1,Lunar Scout,1986,130,70
        1580-2,Silja Line Ferry,1977,471,413
        158-1,Railroad Crossing Gate,1969,243,7
        1581-1,Silja Line Ferry,1981,471,181
        1581-2,Delivery Truck,1990,75,122
        1584-1,Knights Challenge,1988,199,168
        1588-1,Basic Set,1987,467,27
        1589-1,Town Square,1978,85,441
        1589-2,TCS Breakdown Assistance,1986,85,258
        1590-2,ANWB Breakdown Assistance,1982,85,262
        1591-1,Danone Truck,1980,75,40
        1592-1,Town Square - Castle Scene,1980,85,495
        1592-2,Town Square - Castle Scene (Dutch Version),1983,85,495
        1593-1,Super Model,1983,130,314
        1596-1,Ghostly Hideout,1993,203,37
        1597-1,Castle 3-Pack,1993,186,3
        1598-1,Basic Set,1987,467,38
        1599-1,Britannia Airways,1987,466,102
        160-1,Magnetic Couplings,1968,243,6
        1601-1,Conveyance,1976,416,187
        1602-1,Giraffe,1987,467,16
        1603-1,Trial Size Imagination,1993,467,13
        1604-1,Lion,1987,467,17
        1605-1,Snail,1987,467,14
        1606-1,Car,1987,467,23
        1607-1,Helicopter,1987,466,26
        1608-1,{Aeroplane},1987,466,24
        1609-1,Ship,1987,467,31
        16-1,Transparent Bricks,1988,443,32
        1610-1,Police Car,1991,80,23
        1610-2,Martinair Cessna,1978,412,82
        161-1,Battery Wagon with Signal and Direction - Changing,1972,243,7
        1611-1,Dune Buggy,1991,79,21
        1611-2,Martinair DC-9,1978,412,63
        1612-1,Race Car,1988,82,30
        1613-1,Basic Set in Bucket,1987,467,375
        1616-1,Space Combi-Pack,1989,132,2
        1617-1,Small Bucket,1988,467,155
        1619-1,Storage Bucket,1986,469,260
        1620-1,Astro Dart,1990,132,30
        1620-2,Factory,1978,75,233
        162-1,Locomotive without Motor,1977,235,210
        1621-1,Lunar MPV Vehicle,1990,132,96
        1624-1,King's Archer,1993,188,22
        1625-1,Snowman,1989,227,40
        1626-1,Angel,1989,227,33
        1627-1,Santa,1989,227,36
        1628-1,Santa on Sleigh with Reindeer,1989,227,63
        1630-1,Helicopter,1990,68,27
        163-1,Cargo Wagon,1977,235,127
        1631-1,Black Racer,1990,82,23
        1632-1,Motor Boat,1990,77,28
        1633-1,Loader Tractor,1990,72,24
        1636-1,Small Bucket,1990,467,185
        1637-1,Large Bucket,1990,467,493
        1638-1,Blue Bucket,1990,467,444
        1639-1,Large Bucket,1990,467,673
        164-1,Passenger Wagon,1978,235,145
        1642-2,"Lego Motion 3B, Sea Eagle - International version",1994,468,15
        1644-1,"Lego Motion 4A, Wind Whirler",1989,468,17
        1645-1,"Lego Motion 1A, Gyro Bird",1989,468,19
        1646-2,"Lego Motion 3A, Land Laser - International version",1994,468,17
        1648-1,"Lego Motion 2A, Swamp Stinger",1989,468,16
        1649-2,"Lego Motion 4B, Sea Skimmer - International version",1994,468,17
        1650-1,Maersk Line [Promotional Container Ship],1974,363,218
        165-1,Cargo Station,1978,235,267
        1651-1,Basic Building Set Trial Size,1993,467,30
        1651-2,Maersk Line Container Truck,1980,70,305
        1652-1,Basic Set,1994,467,44
        1655-1,Viking Line Ferry,1985,471,175
        1656-1,Evacuation Team,1991,74,244
        1656-2,Viking Line Ferry,1982,471,171
        1658-1,Viking Line Ferry,1982,471,201
        1660-1,Kronprins Frederik Ferry,1996,471,164
        166-1,Flat Wagon,1978,235,51
        1661-2,Basic Building Set in Bucket,1989,467,418
        1662-1,Basic Building Set in Bucket,1989,467,630
        1663-1,Basic Building Set in Bucket,1989,467,451
        1665-1,Dual FX Racers,1990,82,108
        1666-1,Brick Vac,1991,467,140
        1668-1,Basic Building Set Trial Size,1992,469,30
        1670-1,Basic Building Set Trial Size,1992,469,28
        167-1,Loading Ramp and Car Transport Wagon,1978,235,100
        1675-1,LEGOLAND Triple Pack,1990,559,3
        1676-1,Basic Building Set,1990,467,22
        1677-1,Rabbit,1990,229,25
        1678-1,Basic Building Set Trial Size,1991,469,49
        1679-1,Basic Building Set,1990,467,43
        1680-1,Hay Cart with Smugglers,1990,194,67
        1682-1,Space Shuttle,1990,68,419
        1687-1,Midnight Transport,1993,68,271
        1688-1,Large Bucket for Her,1993,467,216
        1690-1,Helicopter,1990,68,27
        1693-1,Turbo Force,1992,82,26
        1694-1,Galactic Scout,1992,129,23
        1695-1,Treasure Chest,1992,190,24
        1696-1,Pirate Lookout,1992,148,17
        1698-1,Basic Building Set Trial Size,1991,469,26
        1699-1,Small Bucket,1993,467,183
        1-7,Basic Set,1973,469,107
        170-1,Push Along Play Train,1972,235,87
        1701-1,Basic Building Set Trial Size,1994,467,26
        1702-1,Fire Fighter 4 x 4,1994,74,59
        1703-1,Dalmatian Station Building Set,1994,467,181
        1704-1,Ice Planet Satellite Plough,1994,133,47
        1705-1,Large Dinosaur Bucket,1994,467,327
        1708-1,Large Bucket,1994,469,665
        1710-1,Snowmobile,1994,79,24
        171-1,Complete Train Set Without Motor,1972,235,146
        1711-1,Ice Planet Scooter,1994,133,19
        1712-1,Crossbow Cart,1994,186,23
        1713-1,Shipwrecked Pirate,1994,148,23
        1714-1,Surveillance Scooter,1995,142,23
        1715-1,Special Value,1995,473,400
        1715-2,Basic Bricks,1995,254,400
        1716-1,Starter Set with Building Plates,1994,467,201
        1719-1,Freestyle Bricks and Plates,1995,399,199
        1720-1,Cactus Canyon Value Pack,1994,83,3
        1721-1,Sandypoint Marina Value Pack,1994,83,3
        1722-1,Rescue / Ice Planet Combi Pack,1994,559,2
        1723-1,Castle / Pirates Combi Pack,1994,559,2
        1724-1,Bird,1994,468,9
        1725-1,Dinosaur,1994,468,11
        1726-1,Girl,1994,468,7
        1727-1,Horse,1994,468,10
        1728-1,Crystal Crawler,1996,308,97
        1729-1,Barnacle Bay Value Pack,1994,148,3
        1730-1,Snow Scooter,1994,79,24
        1731-1,Ice Planet Scooter,1994,133,19
        1732-1,Crossbow Cart,1994,186,23
        1733-1,Shipwrecked Pirate,1994,148,23
        1736-1,Wizard's Cart,1995,186,18
        1737-1,Scorpion Detector,1996,131,195
        1740-1,Kayak,1994,83,16
        1741-1,Car,1994,83,36
        1742-1,Van,1994,83,81
        1745-1,"Box of Standard Bricks, 3+",1995,473,404
        1746-1,Wiz the Wizard,1995,186,18
        1747-1,Treasure Surprise,1996,148,25
        1749-1,Paravane,1996,308,16
        1750-1,Renault Formula 1 Racer,1992,82,32
        1752-1,Boat with Armour,1996,201,21
        1756-1,{Basic Promotional Set},1995,468,8
        1758-1,{Basic Promotional Set},1995,468,7
        1760-1,Go-Cart,1995,82,21
        1761-1,Paradisa Speedboat,1995,90,21
        1762-1,Go-Cart,1995,82,21
        1766-1,Small Freestyle Bucket,1995,399,109
        1767-1,{Basic Promotional Set},1995,468,6
        1768-1,{Basic Promotional Set},1995,468,9
        1769-1,Aircraft,1992,466,23
        1772-1,Airport Container Truck,1991,68,79
        1773-1,Airline Maintenance Vehicle with Trailer,1996,68,108
        1774-1,Aircraft,1991,68,139
        1775-1,Jet,1994,68,161
        1776-1,Large Bulk Bucket,1996,469,950
        1777-1,Sabah Promotional Set: Plane,1997,468,10
        1778-1,Sabah Promotional Set: Boat,1997,468,9
        1779-1,Sabah Promotional Set: Helicopter,1997,468,10
        1782-1,Discovery Station,1997,86,329
        1785-1,Introducing Crater Critters,1995,126,146
        1786-1,Jailbreak Joe,1995,80,189
        1787-1,Crater Cruiser,1995,145,183
        1788-1,Treasure Chest,1995,148,165
        1789-1,Star Hawk II,1995,145,292
        1790-1,Shark Fisherman,1994,83,20
        1791-1,Windsurfer & Van,1994,83,70
        1792-1,Pleasure Cruiser,1994,83,65
        1793-1,Space Station Zenon,1995,145,351
        1794-1,Dragon Master Chariot,1994,186,36
        1795-1,Imperial Cannon,1994,147,37
        1796-1,Freestyle Large Monster Bucket,1996,399,653
        1798-1,Building Table,1995,473,3
        1-8,Little House Set,1970,433,67
        180-1,Train with 5 Wagons and Circle of Track,1972,235,220
        1802-1,Tidy Treasure,1996,148,25
        1804-1,Crossbow Boat,1996,201,21
        1806-1,Underwater Scooter,1996,308,16
        1807-1,Santa Claus and Sleigh,1995,227,17
        1808-1,Light Aircraft and Ground Support,1996,68,121
        1809-1,Condor Promotional Airplane,1996,466,29
        1815-1,Paradisa Lifeguard,1996,90,38
        1817-1,Sea Plane with Hut and Boat,1996,83,134
        1818-1,Aircraft and Ground Support Equipment and Vehicle,1996,68,203
        1819-1,Large Bucket,1995,469,950
        182-1,Train Set with Signal,1975,235,368
        1821-1,Rally Racers,1996,82,195
        1822-1,Sea Claw 7 / Neptune III,1995,308,191
        1823-1,Sabah Promotional Set: Yacht,1997,468,10
        1824-1,Flying Duck,1997,468,17
        1825-1,Racing Car,1997,468,19
        1826-1,Bird? Boat? Plane?,1997,468,21
        1827-1,Helicopter,1997,468,20
        1828-1,{Basic Promotional Set},1995,468,7
        183-1,Complete Train Set with Motor and Signal,1976,235,186
        1831-1,Maersk Line Container Lorry,1995,70,206
        1831-2,Maersk Sealand Container Lorry,1995,70,206
        1836-1,Freestyle Cat,1995,399,9
        1837-1,Freestyle Duck,1995,399,11
        1838-1,Freestyle Bird,1995,399,18
        1839-1,Freestyle Fish,1995,399,21
        1840-1,Freestyle Set,1995,399,24
        1841-1,Plane,1999,470,15
        1843-1,Space/Castle Value Pack,1996,1,2
        1843-2,Spyrius Fold-Wing Spacecraft,1996,142,60
        1843-3,Royal Knight's Catapult,1996,201,46
        1845-1,20th Anniversary Jackpot Bucket,1993,469,717
        1846-1,Freestyle Set,1996,399,25
        1847-1,Freestyle Set,1996,399,33
        1850-1,Freestyle Set,1995,399,27
        1853-1,Navigator,1996,464,158
        1854-1,House with Roof-Windows ( Velux ),1996,69,152
        1857-1,Basic Bricks,1996,473,950
        1858-1,Droid Scout,1996,131,23
        1859-1,Sabah Promotional Set: Aeroplane,1997,468,9
        1860-1,Freestyle Set,1995,399,32
        1863-1,Freestyle Trial Set,1995,399,11
        1865-1,Airliner,1994,466,28
        1867-1,Medium Bulk Bucket,1997,469,400
        1868-1,Freestyle Box,1996,399,220
        1869-1,South African Flag,1996,468,80
        1870-1,Freestyle Set,1995,399,43
        18703535-1,Hamster Play Time - Friends Magazine - Polish Edition,2016,497,25
        1871-1,Pirates Cannon,1994,148,17
        1872-1,Imperial Guard Camp,1994,147,28
        1873-1,Pirate Treasure,1994,148,49
        1874-1,Polly Pick-Up,1993,469,141
        1875-1,Meteor Monitor,1990,128,32
        1876-1,Soil Scooper,1990,85,73
        1877-1,Crusader's Cart,1990,194,60
        1878-1,Small Bucket,1991,467,406
        1879-1,Large Bucket,1992,467,441
        1880-1,XL Bucket,1992,467,576
        1881-1,Small Bucket,1991,467,288
        1882-1,Large Bucket,1991,467,451
        1884-1,Small Bucket,1992,467,193
        1885-1,XL Bucket,1992,467,465
        1887-1,Scout Patrol Ship,1992,129,30
        1888-1,Black Knights Guardshack,1992,188,49
        1889-1,Pirate's Treasure Hold,1992,148,37
        1890-1,Octan Racer,1992,82,47
        1891-1,Four Set Value Pack,1992,559,4
        1895-1,Sky Patrol,1992,80,89
        1896-1,Trauma Team,1992,78,296
        1898-1,Weetabix Dragster,1989,82,27
        1899-1,Weetabix Racer,1989,82,24
        190-1,Farm Set,1974,364,526
        1901-2,Mini Basic Set,1984,469,36
        1905-1,Mini Basic Set,1982,469,36
        1906-1,Majisto's Tower,1994,186,196
        1910-1,Promo Basic Set,1982,469,88
        1911-1,Basic Set,1983,469,34
        1913-1,"LEGO Building Set B, Boat",1983,468,27
        1915-1,"LEGO Building Set D, Aircraft",1983,468,20
        1916-1,Starion Patrol,1993,140,23
        1917-1,King's Catapult,1993,188,22
        19-2,Locomotive Piston Assemblies,1977,456,6
        1920-1,Promo Basic Set,1982,469,119
        192-1,Policemen,1977,364,86
        1922-2,Basic Building Set,1983,469,60
        1923-1,Viking Line Ferry,1989,471,184
        1924-1,Motorcycle,1983,13,103
        1924-2,Viking Line Ferry,1992,471,232
        1929-1,Guardsman,1988,468,13
        1932-1,Basic Building Set + Storage Case,1984,469,82
        194-1,Family,1976,364,94
        1944-1,Basic Set with Storage Case,1983,469,142
        195-1,Airplane,1975,364,89
        1952-1,Dairy Tanker,1989,75,128
        1953-1,Mouse,1989,468,14
        1954-1,Surveillance Scooter,1995,142,23
        1954-2,Basic Set with Storage Case,1984,469,141
        1955-1,Color Line Ferry,1993,471,244
        1958-1,Windsurfer,1993,83,21
        1959-1,Ultra-Light,1993,68,30
        1960-2,Special Value 96 pieces (Canadian Set),1985,467,104
        196-1,Antique Car,1975,364,115
        1962-1,Basic Building Set,1985,467,219
        1963-1,Basic Set with Storage Case,1986,467,221
        1964-1,Basic Building Set,1985,467,27
        1965-1,Basic Building Set,1985,469,38
        1966-1,Car Repair Shop,1985,85,300
        1967-1,System Bonus Pack,1985,559,5
        1967-2,Town Value Pack,1985,85,3
        1968-1,Space Express,1985,130,183
        1969-1,Mini Robot,1993,140,38
        1969-2,Space Value Pack,1985,130,3
        1970-1,Pirate's Gun Cart,1993,148,31
        197-1,Farm Vehicle and Animals,1976,364,120
        1971-1,Black Knight's Battering Ram,1993,188,36
        1972-1,Go-Cart,1985,12,98
        1973-1,Emirates Airliner,1989,68,138
        1974-1,Legoland Triple Pack,1989,559,3
        1974-2,Flyercracker USA,1989,68,74
        1974-3,Smuggler's Hayride,1989,194,50
        1974-4,Star Quest,1989,132,37
        1976-1,Town 3-Pack,1984,67,3
        1977-1,Space Value Pack,1983,130,3
        1978-1,Build-A-Santa,1991,227,39
        1978-2,Town Value Pack,1983,67,3
        1979-1,Snowman,1991,227,42
        1979-2,Town Value Pack,1984,67,3
        1980-1,Santa's Elves,1991,227,30
        198-1,Cowboys,1977,364,39
        1983-1,Space Value Pack,1984,130,3
        1990-1,F1 Race Car,1993,82,35
        199-1,Scooter,1977,364,41
        1991-1,Racing Pickup,1993,82,81
        1992-1,Dragsters,1993,82,103
        1993-1,Race Value Pack,1993,82,3
        1994-1,Turtle Bucket with Motor,1992,469,192
        1995-1,Racer,1999,470,15
        1997-1,Town Value Pack,1985,67,3
        1998-1,Silja Line Ferry,1991,471,375
        1999-1,Space Value Pack,1985,130,3
        20001-1,BrickMaster,2007,22,103
        20002-1,Fire Truck,2008,58,56
        20003-1,Dinosaur,2008,22,102
        2000409-1,Window Exploration Bag,2010,507,5200
        20004-1,Jungle Cruiser,2008,265,83
        2000413-1,Connections Kit,2010,432,2045
        2000414-1,Starter Kit,2010,507,239
        2000415-1,Identity and Landscape Kit,2010,432,1536
        2000416-1,Duck,2012,507,6
        2000421-1,FLL Trophy Small,2013,398,233
        2000422-1,FLL Trophy Medium,2013,398,267
        2000423-1,FLL Trophy Large,2013,398,437
        2000424-1,Story Starter (Sample Set),2014,507,96
        2000430-1,Identity and Landscape Kit,2013,432,2844
        2000431-1,Connections Kit,2013,432,2448
        2000445-1,Crossing the River,2016,507,14
        20005-1,Winged Rahi (Klakk),2008,324,38
        20006-1,Clone Turbo Tank - Mini,2008,162,64
        20007-1,Republic Attack Cruiser - Mini,2009,162,84
        20008-1,Tow Truck,2009,22,79
        20009-1,AT-TE Walker - Mini,2009,161,94
        200-1,Family,1974,364,78
        20010-1,Republic Gunship - Mini,2009,161,94
        20011-1,Garbage Truck,2009,22,74
        20012-1,Click,2009,324,33
        20013-1,Mini Neptune Carrier,2010,316,63
        20014-1,4 x 4 Dynamo,2010,22,69
        20015-1,Alligator,2010,22,89
        20016-1,Imperial Shuttle - Mini,2010,163,70
        20017-1,Dagger Trap,2010,271,52
        20018-1,AT-AT Walker - Mini,2010,163,83
        20019-1,Slave I,2011,163,76
        200-2,Building Ideas Book,1985,501,0
        20020-1,Mini Turbo Shredder,2011,435,83
        20021-1,Bounty Hunter Gunship - Mini,2011,160,81
        200-4,"LEGO Town Plan Board, Continental European Cardboard Version",1959,372,1
        2008-1,Heart 2008,2008,232,92
        2009-2,Heart 2009,2009,232,92
        200A-1,LEGO Town Plan Wooden Board,1957,372,1
        200M-1,LEGO Town Plan Wooden Board,1957,372,1
        20-1,Universal Building Set,1976,469,217
        2010-1,Happy Holidays - The Christmas Game,2010,502,139
        2011-2,Lego Duck,2011,301,91
        20201-1,"MBA Level One - Kit 2, Microbuild Designer",2011,432,221
        20203-1,"MBA Level Two - Kit 4, Flight Designer",2011,432,145
        20205-1,MBA Level Two - Kit 6 Auto Designer,2012,432,188
        20207-1,"MBA Level Three - Kit 8, The Forbidden Bridge",2012,432,220
        20214-1,MBA Adventure Designer (Kits 7 - 9 Redesign),2013,432,3
        20215-1,MBA Invention Designer (Kits 10 - 12),2013,432,675
        20216-1,MBA Robot & Micro Designer (Kits 2 - 3 Redesign),2013,432,2
        20217-1,MBA Action Designer (Kits 4 - 6 Redesign),2013,432,3
        2025-1,Boat,1999,470,12
        2027-1,Pen Pack Alpha,2000,501,0
        2032-1,Helicopter,1999,470,18
        2045-1,Car,1999,470,17
        2047-1,Plane,1999,470,13
        205-2,Universal Figure Set,1978,364,118
        2063-1,Stormer 2.0,2011,401,31
        2064-1,Air Ambulance,2007,60,115
        2065-1,Furno 2.0,2011,401,30
        2067-1,Evo 2.0,2011,401,31
        2068-1,Nex 2.0,2011,401,31
        2069-1,Boat,1999,470,15
        2070-1,Ring Me Rabbit,1987,504,3
        2075-1,Prop Plane,1999,470,14
        208-1,Mother with Baby Carriage,1978,364,46
        2-1,Extra Large Tires & Hubs,1982,1,4
        2-10,Mini-Wheel Model Maker No. 2,1971,423,63
        21000-1,Sears Tower,2008,252,69
        21000-2,Willis Tower,2011,252,69
        21001-1,John Hancock Center,2008,252,69
        21002-1,Empire State Building,2009,252,77
        21003-1,Seattle Space Needle,2009,252,57
        21004-1,Solomon R. Guggenheim Museum,2009,252,208
        21005-1,Fallingwater,2009,252,811
        21006-1,The White House,2010,252,560
        21007-1,Rockefeller Center,2010,252,240
        21008-1,Burj Khalifa,2011,252,208
        21009-1,Farnsworth House,2011,252,546
        210-1,Cowboys,1976,364,39
        21010-1,Robie House,2011,252,2276
        21011-1,Brandenburg Gate,2011,252,363
        21012-1,Sydney Opera House,2012,252,270
        21013-1,Big Ben,2012,252,346
        21014-1,Villa Savoye,2012,252,659
        21015-1,The Leaning Tower of Pisa,2013,252,344
        21016-1,Sungnyemun,2012,252,325
        21017-1,Imperial Hotel,2013,252,1187
        21018-1,United Nations Headquarters,2013,252,596
        21019-1,Eiffel Tower,2014,252,320
        210-2,Small Store Set,1958,372,30
        21020-1,The Trevi Fountain,2014,252,730
        21021-1,Marina Bay Sands,2014,252,601
        21022-1,Lincoln Memorial,2015,252,273
        21023-1,Flatiron Building,2015,252,470
        21024-1,Louvre,2015,252,694
        21026-1,Venice,2016,253,212
        21027-1,Berlin,2016,253,289
        21028-1,New York City,2016,253,597
        21029-1,Buckingham Palace,2016,252,779
        21030-1,United States Capitol Building,2016,252,1031
        21031-1,Burj Khalifa,2016,252,332
        21032-1,Sydney,2017,253,361
        21033-1,Chicago,2017,253,444
        21034-1,London,2017,253,467
        21035-1,Solomon R. Guggenheim Museum&reg;,2017,252,744
        21050-1,Architecture Studio,2013,252,1210
        2-11,Medium Basic LEGO Set,1976,433,130
        21100-1,Shinkai 6500 Submarine,2011,576,412
        21101-1,Hayabusa,2012,576,364
        21102-1,Minecraft Micro World,2012,577,458
        21103-1,Back to the Future Delorean,2013,576,400
        21104-1,Mars Science Laboratory Curiosity Rover,2014,576,295
        21105-1,Minecraft Micro World: The Village,2013,577,465
        21106-1,Minecraft Micro World: The Nether,2013,577,469
        21107-1,Micro World - The End,2014,577,439
        21108-1,Ghostbusters,2014,576,507
        21109-1,Exo-Suit,2014,576,320
        211-1,Mother and Baby with Dog,1976,364,44
        21110-1,Research Institute,2014,576,163
        2111-1,Kai,2011,435,19
        21113-1,The Cave,2014,577,249
        21114-1,The Farm,2014,577,262
        21115-1,The First Night,2014,577,408
        21116-1,Crafting Box,2014,577,517
        21117-1,The Ender Dragon,2014,577,633
        21118-1,The Mine,2014,577,921
        21119-1,The Dungeon,2015,577,219
        211-2,Small House Set,1958,372,19
        21120-1,The Snow Hideout,2015,577,327
        2112-1,Cole,2011,435,18
        21121-1,The Desert Outpost,2015,577,518
        21122-1,The Nether Fortress,2015,577,570
        21123-1,The Iron Golem,2016,577,208
        21124-1,The End Portal,2016,577,558
        21125-1,The Jungle Tree House,2016,577,706
        21126-1,The Wither,2016,577,318
        21127-1,The Fortress,2016,577,982
        21128-1,The Village,2016,577,1596
        21129-1,The Mushroom Island,2017,577,247
        21130-1,The Nether Railway,2017,577,387
        2113-1,Zane,2011,435,19
        21131-1,The Ice Spikes,2017,577,454
        21132-1,The Jungle Temple,2017,577,598
        21133-1,The Witch Hut,2017,577,502
        21134-1,The Waterfall Base,2017,577,729
        2114-1,Chopov,2011,435,20
        2115-1,Bonezai,2011,435,21
        2116-1,Krazi,2011,435,22
        21-2,Truck,1971,433,33
        21200-1,Life of George,2011,301,144
        21201-1,Life of George II,2012,301,144
        21204-1,Town Master,2014,590,256
        21205-1,Battle Towers,2014,590,212
        21206-1,Create and Race,2014,590,222
        21208-1,Resort Designer,2014,590,262
        212-1,Small House - Left Set,1958,372,21
        2121-1,Jack in the Box Promotional Set: Stomper,1997,468,11
        212-2,Scooter,1976,364,41
        2122-1,Jack in the Box Promotional Set: Bob,1997,468,14
        2123-1,Jack in the Box Promotional Set: Spinner,1997,468,12
        2125-1,Green Bucket,1997,504,69
        2126-1,Train Cars,1997,236,382
        2127-1,Jack in the Box Promotional Set: Nanas,1997,468,13
        2129-1,Blast-Off Dragster,1997,12,63
        2130-1,Danone Promotional Set: Duck,1998,468,7
        21301-1,Birds,2015,576,579
        21302-1,The Big Bang Theory,2015,576,498
        21303-1,WALL•E [Original Version],2015,576,676
        21303-2,WALL•E [Fixed Neck Version],2015,576,675
        21304-1,Doctor Who,2015,576,623
        21305-1,Maze,2016,576,768
        21306-1,Yellow Submarine,2016,576,553
        21307-1,Caterham Seven 620R,2016,576,770
        21308-1,Adventure Time™,2016,576,496
        21309-1,LEGO Ideas NASA Apollo Saturn V,2017,576,1969
        213-1,Airplane Ride,1977,364,44
        2131-1,Danone Promotional Set: Hippo,1998,468,10
        213-2,Small House - Right Set,1958,372,21
        2132-1,Danone Promotional Set: Cow,1998,468,10
        2133-1,Danone Promotional Set: Impala,1998,468,12
        2134-1,Danone Promotional Set: Bison,1998,468,10
        2135-1,Sabah Promotional Set: Aircraft,1997,468,9
        2136-1,Sabah Promotional Set: Airplane,1997,468,12
        2137-1,Sabah Promotional Set: Swamp Boat,1997,468,8
        2138-1,Sabah Promotional Set: Helicopter,1997,468,8
        2139-1,Sabah Promotional Set: Steam Liner,1998,468,12
        2140-1,ANWB Roadside Assistance Crew,1996,85,258
        214-1,Road Repair,1977,364,64
        214.1-1,1 x 6 x 3 Window with Frame,1961,371,12
        2141-1,Surge 2.0,2011,401,30
        214.2-1,1 x 6 x 2 Triple-Pane Window in Frame,1961,371,16
        2142-1,Breez 2.0,2011,401,29
        214.3-1,1 x 6 x 2 Double-Pane Window in Frame w/Shutters,1961,371,16
        2143-1,Rocka 3.0,2011,401,30
        214.4-1,1 x 4 x 2 Window in Frame,1961,371,18
        2144-1,Nex 3.0,2011,401,29
        214.5-1,1 x 3 x 2 Window in Frame,1961,371,24
        2145-1,Stormer 3.0,2011,401,31
        214.6-1,1 x 2 x 2 Window in Frame,1961,371,15
        2146-1,Freestyle with Storage Case,1996,399,819
        214.7-1,1 x 1 x 2 Window Frame,1961,371,38
        2147-1,Dragon Fly,1997,68,182
        214.8-1,1 x 2 x 1 Window Frame,1961,371,38
        2148-1,LEGO Truck,1997,85,105
        2148-2,LEGO Truck [Lego Toy Fair 1998 25th Anniversary Edition],1998,85,106
        214.9-1,1 x 1 x 1 Window Frame,1961,371,40
        2149-1,Color Line Container Lorry,1997,70,184
        2150-1,Train Station,1996,236,609
        215-1,Red Indians,1977,364,81
        2151-1,Robo Raider,1997,138,137
        215-2,2 x 8 Bricks,1958,371,30
        2152-1,Robo Raptor,1997,138,222
        2153-1,Robo Stalker,1997,138,279
        2154-1,Robo Master,1997,138,362
        2155-1,Aircraft,2000,467,18
        2156-1,Car,2000,467,17
        2157-1,Boat,2000,467,16
        2158-1,Helicopter,2000,467,10
        2159-1,9V Train Track Starter Collection,2006,244,24
        2160-1,Crystal Scavenger,1997,309,112
        216-1,2 x 10 Bricks,1958,371,25
        2161-1,Aqua Dozer,1997,309,135
        2162-1,Hydro Reef Wrecker,1997,309,287
        2163-1,Sabah Promotional Set: Toucan,1997,468,9
        2164-1,Sabah Promotional Set: Whale,1997,468,9
        2165-1,Rhinocerous,1998,468,10
        2166-1,Animal,1998,468,10
        2167-1,Sabah Promotional Set: Penguin,1997,468,8
        2170-1,Cole DX,2011,435,21
        217-1,Service Station,1977,364,210
        2171-1,Zane DX,2011,435,22
        217-2,4 x 4 Corner Bricks,1958,371,30
        2172-1,Nya,2011,435,21
        2173-1,Nuckal,2011,435,26
        2174-1,Kruncha,2011,435,24
        2175-1,Wyplash,2011,435,23
        218-1,Firemen,1977,364,277
        2181-1,Infomaniac,1997,84,4
        218-2,2 x 4 Bricks,1958,371,78
        2182-1,Bulk 3.0,2011,401,30
        2183-1,Stringer 3.0,2011,401,29
        2186-1,Seaplane,1997,399,77
        2187-1,Racer,1997,399,64
        2188-1,Speedboat,1997,399,58
        219-1,2 x 3 Bricks,1958,371,90
        2191-1,Furno 3.0,2011,401,28
        2192-1,Drilldozer,2011,403,61
        2193-1,Jetbug,2011,403,63
        2194-1,Nitroblast,2011,403,57
        2199-1,Large Bulk Bucket,1997,469,466
        220-1,2 x 2 Bricks,1958,371,120
        22-1,Car,1971,433,47
        221-1,Idea Book #1,1973,497,0
        221-2,1 x 2 Bricks,1958,371,156
        222-1,Building Ideas Book,1976,501,0
        222-2,1 x 1 Bricks,1958,371,240
        2229-1,Bucketful of Fun,1998,470,201
        2230-1,Helicopter and Raft,2008,59,106
        2231-1,Waspix,2011,403,48
        223-2,1 x 1 Round Bricks,1958,371,160
        2232-1,Raw-Jaw,2011,403,52
        2233-1,Fangz,2011,403,53
        2234-1,Police Chase,1998,103,150
        2235-1,Fire Lord,2011,403,125
        2236-1,Scorpio,2011,403,104
        224-1,2 x 2 & 2 x 4 Curved Bricks,1956,371,14
        224-3,2 x 2 Curved Bricks,1958,371,120
        2250-1,Advent Calendar 2000,2000,207,240
        2250-10,Advent Calendar 2000 (Day  9) Duck,2000,217,7
        2250-11,Advent Calendar 2000 (Day 10) Plane,2000,217,9
        2250-12,Advent Calendar 2000 (Day 11) Elf,2000,217,10
        2250-13,Advent Calendar 2000 (Day 12) Duck,2000,217,7
        2250-14,Advent Calendar 2000 (Day 13) Boat,2000,217,9
        2250-15,Advent Calendar 2000 (Day 14) Rhinocerous,2000,217,10
        2250-16,Advent Calendar 2000 (Day 15) Girl,2000,217,10
        2250-17,Advent Calendar 2000 (Day 16) Plane,2000,217,10
        2250-18,Advent Calendar 2000 (Day 17) Bull,2000,217,11
        2250-19,Advent Calendar 2000 (Day 18) Hovercraft,2000,217,10
        2250-2,Advent Calendar 2000 (Day  1) Plane,2000,217,12
        2250-20,Advent Calendar 2000 (Day 19) Christmas Bunny,2000,217,7
        2250-21,Advent Calendar 2000 (Day 20) Jet,2000,217,9
        2250-22,Advent Calendar 2000 (Day 21) Parrot,2000,217,9
        2250-23,Advent Calendar 2000 (Day 22) Truck,2000,217,10
        2250-24,Advent Calendar 2000 (Day 23) Helicopter,2000,217,8
        2250-25,Advent Calendar 2000 (Day 24) Santa,2000,217,11
        2250-3,Advent Calendar 2000 (Day  2) Snowman,2000,217,11
        2250-4,Advent Calendar 2000 (Day  3) Ship,2000,217,12
        2250-5,Advent Calendar 2000 (Day  4) Boy,2000,217,10
        2250-6,Advent Calendar 2000 (Day  5) Elephant,2000,217,10
        2250-7,Advent Calendar 2000 (Day  6) Waterplane,2000,217,10
        2250-8,Advent Calendar 2000 (Day  7) Giraffe,2000,217,13
        2250-9,Advent Calendar 2000 (Day  8) Boat,2000,217,10
        225-1,1 x 6 and 1 x 8 Bricks,1958,371,54
        2254-1,Mountain Shrine,2011,435,168
        2255-1,Sensei Wu,2011,435,20
        2256-1,Lord Garmadon,2011,435,23
        2257-1,Spinjitzu Starter Set,2011,435,47
        2258-1,Ninja Ambush,2011,435,71
        2259-1,Skull Motorbike,2011,435,156
        2260-1,Ice Dragon Attack,2011,435,158
        226-1,8 Named Beams,1958,371,8
        226-2,Idea Book,1981,497,0
        2263-1,Turbo Shredder,2011,435,298
        227-1,4 x 8 Curved & 2 x 8 Plates,1958,371,5
        228-1,4 x 8 & 2 x 8 Plates,1958,371,5
        2282-1,Rocka XL,2011,401,174
        2283-1,Witch Doctor,2011,403,337
        229-1,6 x 8 & 2 x 8 Plates,1958,371,4
        229.1-1,2 x 8 Plates,1962,371,8
        230-1,Hairdressing Salon,1978,405,227
        230-2,Six Trees and Bushes,1958,371,6
        2304-1,Large Building Plate,1992,504,1
        23-1,Delivery Truck Set,1971,433,64
        231-1,Hospital,1978,405,400
        231-2,Esso Pumps/Sign,1956,371,2
        2312-1,Duplo Supplementary Bricks,1987,505,39
        232-1,Bungalow,1978,405,472
        232-2,16 Road Signs,1958,371,16
        233-1,Light Masts,1958,371,4
        234-1,Letter Bricks,1958,371,50
        235-1,Garage Plate and Door (White Base and Door Frame),1958,371,3
        235-2,Garage Plate and Door (Gray Base and Door Frame),1968,371,5
        236-1,Garage with Automatic Door (White base and door frame),1956,372,69
        236-2,Garage and Van,1957,372,69
        236-3,Garage with Automatic Door (Gray base and door frame),1968,372,59
        237-1,Number Bricks,1960,371,50
        238-1,Lego System Idea Book no. 1,1960,497,0
        238-2,Lego System Idea Book (by Samsonite),1961,497,0
        238-3,Lego System Idea Book no. 1,1962,497,0
        238-4,Lego System Ideas Book no. 2,1962,497,0
        238-5,Lego System Ideas Book no. 2,1963,497,0
        238-6,Lego System Idea Book,1963,497,0
        238-7,So Bauen Wir Mit LEGO,1963,497,0
        238-8,Lego System Ideas Book No. 3,1964,497,0
        238-9,Lego System Idea Book (by Samsonite),1964,497,0
        239-1,Wir bauen mit Lego Idea Book,1966,497,0
        239-2,Das große Lego-Buch Idea Book,1968,497,0
        240-2,Idea Book,1967,497,0
        24-1,Minitalia Train,1971,433,77
        241-1,4.5v Idea Book,1969,497,0
        241601-1,Miku the dragon,2016,600,12
        241602-1,Jynx cat,2016,600,26
        242-1,International Flags,1958,371,5
        242.1-1,6 International Flags -1-,1963,371,6
        242-2,5 Danish Flags,1958,371,5
        242.2-1,6 International Flags -2-,1963,371,6
        242.3-1,6 International Flags -3-,1963,371,6
        242B-1,"International Flags - Britain, France, Austria, Portugal, LEGO",1961,371,5
        242I-1,International Flags,1958,371,5
        245-1,Lighting Device Pack,1958,371,3
        245-2,Two Santas and Tree,1978,227,39
        2453-1,Large Bulk Bucket,1998,470,950
        246-2,Santa with Sleigh and Reindeer,1977,227,68
        248-2,Factory With Conveyor Belt,1971,416,208
        2490-1,Insectoids Combi Set (Woolworth's UK promo),1998,134,3
        2494-1,400-Piece Purple Bucket,1998,469,400
        250-1,Idea Book 250,1987,497,1
        250-3,Aeroplane and Pilot,1974,364,89
        2504-1,Spinjitzu Dojo,2011,435,381
        2505-1,Garmadon's Dark Fortress,2011,435,516
        2506-1,Skull Truck,2011,435,517
        2507-1,Fire Temple,2011,435,1174
        2508-1,Blacksmith Shop,2011,435,178
        2509-1,Earth Dragon Defense,2011,435,226
        251-1,Windmill with Miller and his Wife,1974,364,90
        2516-1,Ninja Training Outpost,2011,435,46
        2518-1,Nuckal's ATV,2011,435,174
        2519-1,Skeleton Bowling,2011,435,373
        2520-1,Battle Arena,2011,435,462
        252-1,Locomotive with Driver & Passenger,1974,364,115
        2521-1,Lightning Dragon Battle,2011,435,643
        2531-1,Rescue Helicopter and Jeep,1998,83,99
        253-2,Helicopter and Pilot,1975,364,49
        2532-1,Aircraft and Ground Crew,1998,68,143
        2535-1,Formula 1 Racing Car,1998,82,30
        2536-1,Divers Jet Ski,1998,86,24
        2537-1,Extreme Team Raft,1998,87,20
        2538-1,Fright Knights Fire Cart,1998,195,20
        2539-1,Fright Knights Flying Machine,1998,195,21
        2540-1,Fright Knights Catapult Cart,1998,195,26
        254-1,Family,1975,364,94
        2541-1,Adventurers Car,1998,297,24
        2542-1,Adventurers Aeroplane,1998,297,21
        2543-1,Spacecraft,1998,144,18
        2544-1,SHELL Promotional Set: TECHNIC Microbike,1998,13,27
        255-2,Farming Scene,1975,364,120
        2554-1,Formula 1 Pit Stop,1998,82,172
        2555-1,Swing Set,1998,323,53
        2556-1,Ferrari Formula 1 Racing Car,1997,278,579
        256-1,Police Officers and Motorcycle,1976,364,85
        258-1,Zoo with Baseboard,1976,364,472
        2584-1,Biker Bob,1998,85,15
        2585-1,Handcar,1998,236,27
        2586-1,Chess King,1998,186,26
        260-1,Idea Book,1990,497,0
        260-3,Complete Living Room Set,1971,405,177
        261-1,Bathroom,1979,405,179
        2613-1,Refuse Truck,1990,504,1
        261-4,Complete Kitchen Set,1971,405,157
        2617-1,Tow Truck,1989,504,4
        262-2,Complete Children's Room Set,1972,405,259
        263-1,Kitchen Set,1974,405,173
        2636-1,Tow Truck,1984,504,2
        264-1,Living Room Set,1974,405,241
        2649-1,Sea Explorer,1984,504,41
        265-1,Bathroom,1974,405,147
        266-1,Child's Bedroom,1974,405,147
        268-1,Family Room,1979,405,251
        269-1,Kitchen,1979,405,210
        2-7,Basic Set,1973,469,139
        2707-1,Glider,2000,468,9
        2708-1,Aircraft,2000,468,12
        2709-1,Snowmobile,1996,468,8
        2710-1,Helicopter,2000,468,8
        271-1,Baby's Cot and Cabinet,1973,405,48
        271-2,Traffic Police Set,1958,372,6
        271605-1,Lava fighter,2016,605,12
        2718-1,Aircraft and Ground Crew,2001,68,143
        2719-1,Heli Monster,1999,470,9
        27-2,Train Contact Bricks,1977,456,2
        272-1,Dressing Table with Mirror,1973,405,31
        2722-1,Ship,2000,468,12
        2728-1,The Chopper,1999,470,11
        2729-1,Quattro Leg,1999,470,17
        273-1,Bureau,1973,405,23
        2734-1,Straight Track (Straight Rails),1993,504,6
        2735-1,Curved Track (Curved Rails),1993,504,6
        274-1,Colour T.V. and Chair,1974,405,45
        2742-1,Loudspeaker,1999,470,9
        2743-1,Pendulum Nose,1999,470,21
        2744-1,Propeller Man,1999,470,10
        275-1,Table and Chairs,1974,405,63
        2757-1,Bad Monkey,1999,470,9
        2759-1,Rotor Head,1999,470,14
        276-1,Doctor's Office,1977,405,94
        2769-1,Aircraft and Boat,1999,83,100
        277-1,Fireplace,1977,405,86
        2774-1,Airshow (Red Tiger),1999,68,141
        2775-1,Bathroom,1991,504,7
        278-1,Television Room,1978,405,107
        2-8,Medium House Set,1970,433,109
        280-2,"Sloping Roof Bricks, Blue",1958,371,14
        28-1,Train Contact Plate with Cables,1977,456,2
        281-2,"1 x 2 and 3 x 2 Sloping Bricks, Blue",1959,371,21
        282-2,"2 x 2 Sloping Roof Bricks, Blue",1958,371,22
        2824-1,Advent Calendar 2010 City,2010,208,24
        2824-10,Advent Calendar 2010 City (Day 9) Toy Airplane,2010,220,11
        2824-11,Advent Calendar 2010 City (Day 10) Man with Suitcase,2010,220,5
        2824-12,Advent Calendar 2010 City (Day 11) Fireplace,2010,220,13
        2824-13,Advent Calendar 2010 City (Day 12) Sled with Wood and Axe,2010,220,14
        2824-14,Advent Calendar 2010 City (Day 13) Toy Fire Truck,2010,220,15
        2824-15,Advent Calendar 2010 City (Day 14) Woman with Bread,2010,220,5
        2824-16,Advent Calendar 2010 City (Day 15) Table with Chairs and Lamp,2010,220,13
        2824-17,Advent Calendar 2010 City (Day 16) Couch / Sofa,2010,220,9
        2824-18,Advent Calendar 2010 City (Day 17) Shower Stall,2010,220,9
        2824-19,Advent Calendar 2010 City (Day 18) Santa Claus (almost Naked) with Brush,2010,220,6
        2824-2,Advent Calendar 2010 City (Day 1) Snowman with Broom,2010,220,11
        2824-20,Advent Calendar 2010 City (Day 19) Toy Train Car Red,2010,220,15
        2824-21,Advent Calendar 2010 City (Day 20) Toy Bulldozer,2010,220,17
        2824-22,Advent Calendar 2010 City (Day 21) Toy Train Car Yellow,2010,220,15
        2824-23,Advent Calendar 2010 City (Day 22) Toy Helicopter,2010,220,7
        2824-24,Advent Calendar 2010 City (Day 23) Christmas Tree,2010,220,23
        2824-25,Advent Calendar 2010 City (Day 24) Santa Claus with Toy Train Engine,2010,220,21
        2824-3,Advent Calendar 2010 City (Day 2) Boy with Sword,2010,220,5
        2824-4,Advent Calendar 2010 City (Day 3) Skateboard with Ramp and Railing,2010,220,10
        2824-5,Advent Calendar 2010 City (Day 4) Toy Crane,2010,220,15
        2824-6,Advent Calendar 2010 City (Day 5) Drum Set,2010,220,10
        2824-7,Advent Calendar 2010 City (Day 6) Girl with Cat,2010,220,5
        2824-8,Advent Calendar 2010 City (Day 7) Piano / Organ,2010,220,10
        2824-9,Advent Calendar 2010 City (Day 8) Dog with Bowl and Sausage,2010,220,7
        283-2,"Sloping Ridge and Valley Bricks, Blue",1957,371,20
        2840-1,Danone Promotional Set: Girl,1998,468,10
        2841-1,Danone Promotional Set: Boy,1998,468,9
        2842-1,{Basic Promotional Set},1997,468,8
        2845-1,Indian Chief,1997,477,20
        2846-1,Indian Kayak,1997,477,18
        2847-1,Flyer,1997,144,15
        2848-1,Fright Knights Flying Machine,1997,195,19
        2849-1,Helicopter,1997,68,20
        2850828-1,LEGO® Star Wars™ Darth Vader™ Watch,2011,501,0
        2850829-1,Luke Skywalker Watch,2011,501,0
        2851193-1,LEGO® Star Wars™ Darth Maul™ Watch,2009,501,0
        2852724-1,Accelerometer Sensor for Mindstorms NXT,2011,259,0
        2852725-1,Infrared Seeker for Mindstorms NXT (Version 2),2011,259,1
        2852726-1,Gyroscopic Sensor for Mindstorms NXT,2011,259,0
        2853216-1,Infrared Link Sensor for Mindstorms NXT,2011,259,1
        2853300-1,Space Police Collection,2009,141,5
        2853301-1,CITY Transport Collection,2009,63,5
        2853302-1,CITY Construction Collection,2009,56,4
        2853303-1,Bionicle Glatorian Legends Collection,2009,332,6
        2853508-1,LEGO Star Wars: The Visual Dictionary,2009,497,6
        2853590-1,Stormtrooper,2009,169,5
        2853835-1,White Boba Fett Figure,2010,158,5
        2853944-1,Astronaut,2010,598,5
        2854-1,Bungee Chopper,1998,3,70
        2855028-1,Exclusive Spaceman Magnet,2010,501,8
        2855040-1,Infrared Receiver Sensor for Mindstorms NXT,2011,259,0
        2855057-1,LEGO® Star Wars™ Stormtrooper™ Kid’s Watch,2011,501,0
        2855113-1,Brickmaster Star Wars,2011,501,251
        2855127-1,LEGO Harry Potter: Years 1-4 Video Game,2010,501,0
        2856079-1,Creationary Booster Pack,2011,502,30
        2856080-1,Storm Trooper Minifigure Clock,2010,501,0
        2856081-1,LEGO® Star Wars™ Darth Vader Minifigure Clock,2010,501,0
        2856089-1,Hero Factory 2.0 Collection,2011,401,6
        2856128-1,LEGO® Star Wars™ Anakin Skywalker™ Minifigure Watch,2011,501,0
        2856130-1,LEGO® Star Wars™ Yoda™ Minifigure Watch,2011,501,0
        2856134-1,Ninjago Card Shrine,2011,435,98
        2856195-1,LEGO Minifigure Ultimate Sticker Collection,2011,501,1
        2856197-1,Shadow ARF Trooper,2011,178,5
        2856203-1,LEGO® Star Wars™ Yoda Minifigure Clock,2011,501,0
        2856217-1,LEGO Star Wars III: The Clone Wars,2011,501,0
        2856224-1,"Magnet Set, Minifig Retro Forestman - with 2 x 4 Brick Base (Bricktober Week 2)",2011,501,0
        2856226-1,"Magnet Set, Minifig Retro Classic Space Astronaut - with 2 x 4 Brick Base (Bricktober Week 4)",2011,501,3
        2856227-1,Hero Factory Fire Villains Collection,2011,403,4
        2856236-1,LEGO® Red Brick Clock,2013,501,0
        2856238-1,LEGO® Yellow Brick Clock,2015,501,0
        2856453-1,LEGO Brand Pirates of the Caribbean Video Game - PS3,2011,501,0
        2858-1,Girl with Two Cats,1999,323,5
        2866-1,Animal Playground,1998,504,28
        2870-1,Paradisa Barbeque,1997,90,21
        2871-1,Diver and Shark,1997,86,17
        2872-1,Witch and Fireplace,1997,195,19
        2873-1,Small Santa Claus,1997,227,9
        2876-1,Christmas Set,1997,227,9
        2878-1,Santa Claus,1997,227,16
        2878-2,Santa Claus Mos Burger Gift Box 1- Hawaiian Shirt Santa,2001,227,1
        2878-3,Santa Claus Mos Burger Gift Box 2 - Tuxedo Santa,2001,227,1
        2878-4,Santa Claus Mos Burger Gift Box 3 - Soccer Santa,2001,227,1
        2879-1,Desert Expedition,1998,297,195
        2880-1,Open-Top Jeep,1997,85,29
        2881-1,Parking Gate Attendant,1997,85,19
        2882-1,Speedboat,1997,77,22
        2883-1,Boat,1997,77,28
        2884-1,Microlight,1997,68,20
        2885-1,Ice Cream Seller,1997,75,27
        2886-1,Formula 1 Racing Car,1997,82,25
        2887-1,Petrol Station Attendant and Pump,1997,76,15
        2889-1,Treasure Cart,1998,190,24
        2890-1,Stone Bomber,1998,188,22
        2891-1,Wizard Trader,1998,186,18
        2892-1,Thunder Arrow Boat,1998,201,21
        290-2,Dining Suite,1973,405,113
        29-1,4.5V Motor,1977,453,1
        291-1,Blackboard and School Desk,1973,405,88
        2912-1,Radical Racer,2000,504,16
        292-1,Kitchen Sink and Cupboards,1973,405,51
        2928-1,Airline Promotional Set,2006,53,137
        2928-2,Airline Promotional Set - ANA limited edition,2008,53,137
        293-1,Piano,1973,405,89
        2933-1,Freight Train,2000,504,79
        294-1,Wall Unit,1974,405,58
        2949-1,RC Dozer,2001,504,22
        295-1,Secretary's Desk,1974,405,80
        296-1,Ladies' Hairdressers,1977,405,163
        2962-1,Res-Q Lifeguard,1998,92,69
        2963-1,Extreme Team Racer,1998,87,83
        2964-1,Space Spider,1998,134,45
        2965-1,Hornet Scout,1998,134,72
        297-1,Nursery,1978,405,168
        2981-1,Pooh's Corner,1999,504,0
        2982-1,Pooh's Birthday,1999,504,9
        2995-1,Adventurers Car & Skeleton,1998,297,69
        2996-1,Adventurers Tomb,1998,297,81
        2998-1,Stena Line Ferry,1998,471,195
        30000-1,Doctor With Car,2009,60,30
        3000-1,Trike Buggy,1999,13,30
        30001-1,Fireman's Car,2009,58,39
        30002-1,Police Boat,2009,61,30
        30003-1,Road Roller,2009,56,31
        30004-1,Battle Droid on STAP,2009,165,23
        30005-1,Imperial Speeder Bike,2009,169,33
        30006-1,Clone Walker,2009,165,31
        30008-1,Snowman,2009,206,44
        30009-1,Christmas Tree,2009,206,47
        300-1,T-Junction Road Plates,1978,84,2
        30010-1,Fire Chief,2010,58,31
        3001-1,Kabaya Promotional Set: Propeller Buggy,1999,11,29
        30011-1,Police Dinghy,2010,61,16
        30012-1,Mini Airplane,2010,53,34
        30013-1,Police Quad,2010,61,30
        30014-1,Police Helicopter,2011,61,32
        30015-1,Jet Ski,2011,59,24
        30016-1,Small Satellite,2011,52,34
        30017-1,Police Boat,2012,61,35
        30018-1,Police Plane,2012,61,32
        30019-1,Fire Helicopter,2012,58,37
        30020-1,Jet,2010,23,43
        30021-1,Parrot,2010,23,48
        30022-1,Bee,2011,22,23
        30023-1,Lighthouse,2011,22,25
        30024-1,Truck,2011,22,56
        30025-1,Clown Fish,2011,22,59
        30026-1,Panda,2011,23,61
        30027-1,Reindeer,2011,22,66
        30028-1,Wreath,2011,227,50
        30029-1,LEGO Pudsey Bear,2011,301,95
        30030-1,Racing Car,2010,120,29
        3003-1,Motorbike,1999,13,28
        30031-1,World Race Powerboat,2010,123,27
        30032-1,World Race Buggy,2010,123,35
        30033-1,Racing Truck,2010,120,40
        30034-1,Racing Tow Truck,2010,120,34
        30035-1,Racing Car,2010,120,30
        30036-1,Buggy Racer,2011,120,26
        30040-1,Octopus,2010,315,42
        30041-1,Piranha,2010,315,45
        30042-1,Mini Sub,2010,315,37
        30050-1,Republic Attack Shuttle - Mini,2010,160,54
        3005-1,Kabaya Promotional Set: Car,1999,12,26
        30051-1,X-wing Fighter - Mini,2010,163,61
        30052-1,AAT - Mini,2011,161,46
        30053-1,Republic Attack Cruiser - Mini,2011,162,41
        30054-1,AT-ST - Mini,2011,163,46
        30055-1,Vulture Droid - Mini,2011,162,42
        30056-1,Star Destroyer,2012,163,38
        30057-1,Anakin's Pod Racer,2012,164,38
        30058-1,STAP,2012,158,19
        30059-1,MTT,2012,158,51
        30061-1,Attack Wagon,2010,196,36
        30062-1,Target Practice,2010,196,31
        30066-1,Circus Clown Polybag,2013,504,3
        30066-2,Circus Ringmaster Polybag,2013,504,3
        30066-4,Circus Tiger Polybag,2013,504,3
        30066-5,Circus Rabbit Polybag,2013,504,3
        30067-1,Duplo Farm Polybag (farmer),2014,504,5
        30067-2,Duplo Farm Polybag (calf),2014,504,5
        30067-3,Duplo Farm Polybag (goat),2014,504,5
        30067-4,Duplo Farm Polybag (cat),2014,504,5
        30068-1,Food,2014,504,6
        30070-1,Alien Space Ship,2010,275,29
        30071-1,Army Jeep,2010,275,37
        30072-1,Woody's Camp Out,2010,275,15
        30073-1,Buzz's Mini Ship,2010,275,20
        30080-1,Ninja Glider,2011,435,26
        30081-1,Skeleton Chopper,2011,435,41
        30082-1,Enemy Training,2011,435,32
        30083-1,Dragon Fight,2011,435,31
        30084-1,Ninjago Promotional Set,2011,435,5
        30085-1,Snake Battle,2012,435,42
        30086-1,Hidden Sword,2012,435,39
        30087-1,Cole ZX's Car,2012,435,27
        30088-1,Rattla,2012,435,5
        30090-1,Desert Glider,2011,437,29
        30091-1,Desert Rover,2011,437,31
        30-1,Universal Building Set,1976,469,200
        30100-1,Andrea on the Beach,2012,494,28
        30101-1,Skate Boarder,2012,494,28
        30102-1,Desk,2012,494,28
        30103-1,Car,2012,494,32
        30105-1,Stephanie and Mailbox,2012,494,41
        30106-1,Ice Cream Stand,2013,494,34
        30107-1,Birthday Party,2013,494,39
        30108-1,Summer Picnic,2013,494,33
        301-1,Curved Road Plates,1978,84,2
        30110-1,Trolley,2011,246,22
        30111-1,The Lab,2011,246,34
        30112-1,Emma's Flower Stand,2014,494,35
        30113-1,Stephanie's Bakery Stand,2014,494,28
        30114-1,Andrea's Beach Lounge,2014,494,29
        30115-1,Jungle Boat,2014,495,31
        30116-1,Rapunzel's Market Visit,2014,579,37
        30120-1,Guido,2011,269,34
        3012-1,Space Hover,1999,144,20
        30121-1,Grem,2011,269,52
        30130-1,Mini Black Pearl,2011,263,47
        3013-1,Space Jet,1999,142,23
        30131-1,Jacks Boat,2011,263,21
        30132-1,Voodoo Jack,2011,263,4
        30133-1,Jack Sparrow,2011,263,4
        30140-1,ADU Walker,2011,127,34
        3014-1,Ice Planet Scooter,1999,133,19
        30141-1,ADU Jetpack,2011,127,19
        30150-1,Race Car,2012,63,35
        3015-1,Space Police Car,1999,140,23
        30151-1,Mining Dozer,2012,56,33
        30152-1,Mining Quad,2012,56,40
        30160-1,Bat Jetski,2012,484,40
        3016-1,Boss with Cannon,1998,434,24
        30161-1,Batmobile,2012,484,45
        30162-1,Quinjet,2012,487,33
        30163-1,Thor and the Cosmic Cube,2012,487,25
        30164-1,Lex Luthor,2012,484,17
        30165-1,Hawkeye with Equipment,2012,487,24
        30166-1,Robin and Redbird Cycle,2013,484,40
        30167-1,Iron Man vs. Fighting Drone,2013,490,24
        30168-1,Gun Mounting System,2013,490,16
        30170-1,Ganrash,2012,502,56
        3017-1,Water Spider,1998,434,25
        30180-1,Twin Prop,2012,22,45
        3018-1,Go! LEGO Shogun,1998,434,25
        30181-1,Helicopter,2012,22,53
        30182-1,Santa,2012,228,57
        30183-1,Little Car,2013,30,50
        30184-1,Little Helicopter,2013,22,56
        30185-1,Little Eagle,2013,22,48
        30186-1,Christmas Tree,2013,228,51
        30187-1,Fast Car,2014,23,56
        30188-1,Cute Kitten,2014,22,54
        30189-1,Transport Plane,2014,22,49
        30190-1,Ferrari 150° Italia,2012,114,33
        3019-1,Big Bat,1998,434,23
        30191-1,Scuderia Ferrari Truck,2012,114,40
        30192-1,Ferrari F40,2012,114,47
        30193-1,250 GT Berlinetta,2012,114,24
        30194-1,458 Italia,2012,114,32
        30195-1,FXX,2012,114,52
        30196-1,Shell F1 Team,2012,114,47
        30197-1,Snowman,2014,22,60
        30-2,Small Ship Set,1973,433,26
        30200-1,Zombie Chauffeur Coffin Car,2012,558,32
        3020-1,Raft of Johnse,1998,297,18
        30201-1,Ghost,2012,558,33
        30202-1,Smoothie Stand,2015,494,37
        30203-1,Mini Golf,2015,494,26
        30204-1,Wish Fountain,2015,494,44
        30205-1,Pop Star,2015,494,33
        302-1,Straight Road Plates (without crosswalk),1983,84,2
        30210-1,Frodo with Cooking Corner,2012,566,35
        3021-1,King Pharaoh the Third,1998,297,17
        30211-1,Uruk Hai with Ballista,2012,566,21
        30212-1,Mirkwood Elf Guard,2012,563,27
        30213-1,Gandalf at Dol Guldur,2012,563,31
        30215-1,Legolas Greenleaf,2013,564,33
        30216-1,Lake-town Guard,2013,564,31
        30218-1,Snail,2015,504,6
        302-2,Straight Road Plates (with crosswalk),1978,84,2
        30220-1,Fire Speedboat,2013,58,40
        3022-1,Plane of Hurrykain,1998,297,23
        30221-1,Fire Car,2013,58,36
        30222-1,Police Helicopter,2013,61,33
        30224-1,Lawn Mower,2013,52,41
        30225-1,Seaplane,2013,55,37
        30226-1,Police Helicopter ,2014,61,48
        30227-1,Police Watercraft,2014,61,36
        30228-1,Police ATV,2014,61,42
        30229-1,Repair Lift,2014,56,40
        30230-1,Mini Mech,2013,146,28
        3023-1,Slyboot Car,1998,297,23
        30231-1,Space Insectoid,2013,146,27
        30240-1,Z-95 Headhunter,2013,160,54
        30241-1,Mandalorian Fighter,2013,160,49
        30242-1,Republic Frigate,2013,164,45
        30243-1,Umbaran MHC,2013,160,49
        30244-1,Anakin's Jedi Intercepter,2014,159,45
        30246-1,Imperial Shuttle,2014,158,57
        30247-1,ARC-170 Starfighter,2014,158,54
        30250-1,Ewar's Acro-Fighter,2013,571,33
        3025-1,25th Anniversary Silver Bucket,1998,469,601
        30251-1,Winzar's Pack Patrol,2013,571,38
        30252-1,Crug's Swamp Jet,2013,571,23
        30253-1,Leonidas' Jungle Dragster,2013,571,30
        30254-1,Razcal's Double-Crosser,2013,571,36
        30255-1,Crawley,2013,571,11
        30256-1,Ice Bear Mech,2015,571,39
        30259-1,Azari’s Magic Fire,2015,600,27
        30260-1,Lone Ranger’s Pump Car,2013,575,24
        3026-1,25th Anniversary Silver Tub,1998,469,1201
        30261-1,Tonto's Campfire,2013,575,20
        30262-1,Gorzan's Walker ,2014,571,34
        30263-1,Spider Crawler,2014,571,40
        30264-1,Frax' Phoenix Flyer,2014,571,32
        30265-1,Worriz' Fire Bike,2014,571,31
        30266-1,Sykor's Ice Cruiser,2014,571,25
        30270-1,Kraang's Turtle Target Practice,2013,570,36
        3027-1,25th Anniversary Silver Bucket,1998,399,418
        30271-1,Mikey's Mini-Shellraiser,2014,570,46
        30272-1,A-Wing Starfighter,2015,159,58
        30274-1,AT-DP,2015,159,65
        30275-1,TIE Advanced Prototype,2015,159,47
        30276-1,First Order Special Forces TIE Fighter Set,2015,158,41
        30277-1,First Order Star Destroyer,2016,184,56
        30278-1,Poe's X-wing Fighter,2015,159,64
        30279-1,Kylo Ren's Command Shuttle,2016,184,43
        30280-1,The Piece of Resistance,2014,578,33
        3028-1,25th Anniversary Silver Tub,1998,399,843
        30281-1,Micro Manager Battle,2014,578,27
        30282-1,Super Secret Police Enforcer,2014,578,40
        30283-1,Off-Road,2015,30,43
        30284-1,Tractor,2015,23,51
        30285-1,Tiger,2015,31,73
        30286-1,Christmas Tree,2015,227,65
        30291-1,Anacondrai Battle Mech,2015,435,43
        30292-1,Jay Nano Mech,2015,435,54
        30293-1,Kai Drifter,2015,435,43
        30294-1,The Cowler Dragon,2015,435,45
        30300-1,The Batman Tumbler,2014,484,57
        30301-1,Batwing,2014,484,45
        30302-1,Spider-Man,2014,488,45
        30303-1,The Joker Bumper Car,2015,484,47
        30304-1,The Avengers Quinjet,2015,487,56
        30305-1,Spider-Man Super Jumper,2015,488,38
        303-1,Basic Building Set,1987,467,33
        30310-1,Arctic Scout,2014,65,39
        30311-1,Swamp Police Helicopter,2015,61,51
        30312-1,Demolition Driller,2015,56,40
        30313-1,Garbage Truck,2015,63,48
        30314-1,Go-Kart Racer,2015,63,45
        30315-1,Space Utility Vehicle,2015,93,39
        303-2,Aeroplane,1964,374,46
        30320-1,Gallimimus Trap,2015,602,29
        3032-1,Medium Bucket,1999,469,600
        30321-1,Duck,2016,504,4
        3033-1,Basic Bulk Tub (American Version),1998,473,1200
        3033-2,Basic Bulk Tub (Overseas Version),2002,473,1200
        30338-1,Fire Car,2017,295,32
        30346-1,Prison Island Helicopter,2016,61,46
        30347-1,Fire Car,2016,58,53
        30348-1,Mini Dumper,2016,56,45
        30349-1,Sports Car,2016,52,47
        30350-1,Volcano Jackhammer,2016,52,53
        30351-1,Police Helicopter,2017,61,44
        30352-1,Police Car,2017,61,50
        30354-1,Hot Rod,2017,52,36
        30371-1,Knight's Cycle,2016,605,41
        30372-1,Robin's Mini Fortrex,2016,605,45
        30373-1,Knighton Hyper Cannon,2016,605,47
        30374-1,The Lava Slinger,2016,605,39
        30375-1,Sira's Adventurous Airglider,2016,600,24
        30376-1,Knighton Rider,2017,605,42
        30377-1,Motor Horse polybag,2017,605,52
        30378-1,Shrunken Headquarters,2017,605,48
        3038-1,Spider Slayer,1998,3,367
        3039-1,Adventurers Plane,1999,297,23
        30396-1,Cupcake Stall,2016,494,28
        30397-1,Olaf's Summertime Fun,2016,579,48
        30398-1,Adventure Camp Bridge,2016,494,35
        30399-1,Bowling Alley,2016,494,51
        30400-1,Gymnastic Bar,2017,494,26
        3040-1,Challenger Set 200,1998,470,155
        30401-1,Emma's Pool Slide,2017,494,45
        304-1,Basic Building Set,1985,467,31
        3041-1,Big Bucket of Fun,1998,470,468
        304-2,Tractor & Trailer,1964,375,82
        30421-1,Skybound Plane,2016,435,30
        30422-1,Kai's Mini Dragon,2016,435,40
        30423-1,Anchor-Jet,2016,435,37
        30424-1,WU-CRU Training Dojo,2016,435,43
        30446-1,The Batmobile,2016,484,63
        30447-1,Captain America's Motorcycle,2016,493,25
        30448-1,Spider-Man vs. The Venom Symbiote,2016,488,49
        30449-1,The Milano,2017,493,64
        3047-1,Halloween Bucket,1998,230,256
        30471-1,Helicopter,2016,22,47
        30472-1,Parrot,2016,22,43
        30473-1,Racer,2016,591,30
        30474-1,Reindeer,2016,227,77
        30476-1,Turtle,2017,31,33
        30496-1,U-Wing Fighter,2017,185,55
        3050-1,Shanghai Surprise,1999,434,108
        305-1,Two Crater Plates,1979,143,2
        3051-1,Blaze Attack,1999,434,144
        305-2,Fire Engine,1964,376,170
        3052-1,Ninja Fire Fortress,1999,434,173
        30521-1,The Mini Batmobile,2017,484,68
        30522-1,Batman in the Phantom Zone polybag,2016,484,59
        30523-1,The Joker Battle Training,2017,484,49
        30524-1,The Mini Batwing,2017,484,80
        3053-1,Emperor's Stronghold,1999,434,335
        3054-1,Kelloggs Promotional Set: TECHNIC Motorcycle,1998,13,30
        30546-1,Krypto Saves the Day,2017,482,55
        3055-1,Adventurers Car,1998,297,21
        3056-1,Go-Kart,1998,82,23
        3057-1,Create 'n' Race - Master Builders,2000,12,106
        3058-1,Busy City - Master Builders (Masterbuilders),2000,97,73
        3059-1,Mars Mission - Master Builders (Masterbuilders),2000,93,90
        30601-1,Scooby-Doo,2016,603,2
        30602-1,First Order Stormtrooper,2016,158,7
        30603-1,Batman Classic TV Series - Mr. Freeze,2016,484,16
        30604-1,Cosmic Boy,2016,482,7
        30605-1,Finn (FN-2187),2016,184,3
        30606-1,Nightwing,2016,482,6
        30607-1,Disco Batman - Tears of Batman,2017,484,13
        306-1,Two Lunar Landing Plates,1979,143,2
        3061-1,City Park Café,2012,494,244
        30611-1,R2-D2,2017,158,70
        306-2,VW Garage,1958,372,45
        3063-1,Heartlake Flying Club,2012,494,197
        3065-1,Olivia’s Tree House,2012,494,214
        3066-1,Cosmos Glider,1999,93,19
        3066-3,Circus Acrobat Polybag,2013,504,3
        3067-1,Test Shuttle,1999,93,21
        3068-1,Radar Buggy,1999,93,25
        3069-1,Cosmic Wing,1999,93,23
        3070-1,Mosquito,1999,134,21
        3071-1,Light Flyer,1999,134,19
        307-2,VW Auto Showroom,1958,372,51
        3072-1,Mega Tack,1999,134,23
        3073-1,Booster,1999,134,21
        3074-1,Red Ninja's Dragon Glider,1999,434,20
        3075-1,Ninja Master's Boat,1999,434,21
        3076-1,White Ninja's Attack Cart,1999,434,23
        3077-1,Ninja Shogun's Small Fort,1999,434,21
        3078-1,Kellogg's Promotional Set: Car,1998,468,17
        3079-1,Kellogg's Promotional Set: Duck,1998,468,14
        3080-1,Kellogg's Promotional Set: Plane,1998,468,16
        308-1,Bracelet Sympathy,1979,404,40
        3081-1,Kellogg's Promotional Set: Helicopter,1998,468,16
        308-2,Basic Building Set,1985,467,34
        308-3,Fire Station,1958,372,109
        309-1,Bracelet Spring,1979,404,38
        309-2,Church,1958,372,149
        3093-1,Fun Playground,2001,504,31
        309314-1,Lego City - Police on Alert!,2011,497,19
        31000-1,Mini Speeder,2013,22,65
        31001-1,Mini Skyfighter,2013,22,62
        31002-1,Super Racer,2013,22,121
        31003-1,Red Rotors,2013,42,145
        31004-1,Fierce Flyer,2013,22,166
        31005-1,Construction Hauler,2013,22,256
        31006-1,Highway Speedster,2013,39,286
        31007-1,Power Mech,2013,22,223
        31008-1,Thunder Wings,2013,22,235
        31009-1,Small Cottage,2013,43,271
        31010-1,Treehouse,2013,43,356
        31011-1,Aviation Adventures,2013,42,619
        31012-1,Family House,2013,43,755
        31013-1,Red Thunder,2014,22,66
        31014-1,Power Digger,2014,22,63
        31015-1,Emerald Express,2014,22,56
        31017-1,Sunset Speeder,2014,22,119
        31018-1,Highway Cruiser,2014,22,129
        31019-1,Forest Animals,2014,22,272
        31020-1,Twinblade Adventures,2014,22,216
        31021-1,Furry Creatures,2014,22,285
        31022-1,Turbo Quad,2014,39,186
        31023-1,Yellow Racers,2014,22,328
        31024-1,Roaring Power,2014,22,374
        31025-1,Mountain Hut,2014,22,550
        31026-1,Bike Shop & Cafe,2014,22,1022
        31027-1,Blue Racer,2015,23,67
        31028-1,Sea Plane,2015,23,53
        31029-1,Cargo Heli,2015,23,132
        310-3,Tug,1973,363,45
        31030-1,Red Go-Kart,2015,23,106
        31031-1,Rainforest Animals,2015,40,215
        31032-1,Red Creatures,2015,40,221
        31033-1,Vehicle Transporter,2015,23,264
        31034-1,Future Flyer,2015,32,237
        31035-1,Beach Hut,2015,43,286
        31036-1,Toy & Grocery Shop,2015,43,465
        31037-1,Adventure Vehicles,2015,22,282
        31038-1,Changing Seasons,2015,22,535
        31039-1,Blue Power Jet,2015,22,607
        310-4,Basic Building Set,1985,467,46
        31040-1,Desert Racers,2016,22,65
        31041-1,Construction Vehicles,2016,22,64
        31042-1,Super Soarer,2016,22,100
        31043-1,Chopper transporter,2016,22,124
        31044-1,Park Animals,2016,22,202
        31045-1,Ocean Explorer,2016,22,213
        31046-1,Fast Car,2016,22,222
        31047-1,Propeller Plane,2016,22,230
        31048-1,Lakeside Lodge,2016,22,371
        31049-1,Twin Spin Helicopter,2016,22,326
        310-5,ESSO Filling Station,1958,372,96
        31050-1,Corner Deli,2016,22,467
        31051-1,Lighthouse Point,2016,22,527
        31052-1,Vacation Getaways,2016,22,791
        31053-1,Treehouse Adventures,2016,22,387
        31054-1,Blue Express,2017,22,71
        31055-1,Red Racer,2017,22,72
        31056-1,Green Cruiser,2016,22,122
        31057-1,Air Blazer,2016,22,102
        31058-1,Mighty Dinosaurs,2017,22,174
        31059-1,Sunset Street Bike,2016,22,185
        31060-1,Airshow Aces,2016,22,246
        31062-1,Robo Explorer 1,2017,22,205
        31063-1,Beachside Vacation,2017,22,275
        31064-1,Seaplane Adventures,2017,22,359
        31065-1,Park Street Townhouse,2017,22,565
        31066-1,Space Shuttle Explorer,2017,22,285
        31067-1,Modular Poolside Holiday,2017,22,352
        31068-1,Modular Modern Home,2017,22,386
        31069-1,Modular Family Villa,2017,22,728
        31070-1,Turbo Track Racer,2017,22,664
        311-1,Ferry,1973,363,82
        311-3,Basic Set,1984,469,34
        311-4,Airplanes,1961,374,79
        31-2,Medium Ship Set,1973,453,21
        312-3,Tanker,1973,363,111
        312-4,Boats,1961,377,107
        313-1,London Bus,1966,378,140
        31313-1,Mindstorms EV3,2013,262,600
        314-1,Police Boat,1976,363,52
        314-2,Large & Small Wheels & Turn-Table,1963,379,35
        3146-1,Carry and Shopping Accessories,1999,451,12
        315-1,Basic Building Set,1990,467,62
        315-2,Container Transport,1976,363,84
        315-3,European Taxie,1963,378,48
        316-1,Fire Fighter Ship,1978,363,141
        316-2,Farm Tractor,1963,375,49
        317-1,Truck,1963,378,125
        317-2,Basic Building Set,1987,467,68
        3177-1,Small Car,2010,63,43
        3178-1,Seaplane,2010,59,101
        3179-1,Repair Truck,2010,63,122
        3180-1,Tank Truck,2010,50,221
        318-1,Windmill Set,1963,367,153
        3181-1,Passenger Plane,2010,53,308
        3181-2,Passenger Plane - ANA Version,2010,53,296
        3182-1,Airport,2010,53,704
        3183-1,Stephanie’s Cool Convertible,2012,494,148
        3184-1,Adventure Camper,2012,494,324
        3185-1,Summer Riding Camp,2012,494,1158
        3186-1,Emma's  Horse Trailer,2012,494,232
        3187-1,Butterfly Beauty Shop,2012,494,240
        3188-1,Heartlake Vet,2012,494,371
        3189-1,Heartlake Stables,2012,494,424
        319-1,Truck with Trailer,1965,378,74
        3194-1,Clikits Bracelet Heart,2004,500,9
        3195-1,Clikits Bracelet Daisy,2004,500,9
        3196-1,Clikits Bracelet Star,2004,500,9
        3197-1,Small Aircraft,2001,466,15
        320-1,Basic Building Set,1985,467,78
        320-2,Airplane,1965,374,120
        321-1,Clowns,1965,366,223
        3219-1,TIE Fighter - Mini,2003,159,12
        32-2,Large Ship Set,1973,433,57
        322-1,Basic Set,1981,469,82
        3221-1,LEGO® City Truck,2010,63,277
        322-2,Town House,1964,367,171
        3222-1,Helicopter and Limousine,2010,53,250
        322-3,Basic Building Set + Storage Case,1983,469,2
        3223-1,Orange Fish,2003,204,43
        3225-1,Classic Train,1998,236,281
        3226-1,Cars and Planes,1998,399,311
        323-1,Train,1964,380,253
        3233-1,Fantasy Bird,1998,399,28
        3234-1,Fantasy Boat,1998,399,27
        324-1,Ricky Racoon on his Scooter,1979,390,2
        324-2,House with Garage,1964,367,174
        3243-1,Scala Kitchen,1997,301,13
        325-1,Basic Building Set,1990,467,109
        325-2,Percy Pig's Wheelbarrow,1979,390,4
        325-3,Shell Service Station,1966,367,101
        3259-1,Kanoka Launcher And Disc,2004,346,2
        326-1,Small Cottage,1965,367,63
        327-1,Basic Building Set,1987,467,107
        328-1,Moe Mouse's Roadster,1979,390,23
        328-2,Biplane,1967,374,44
        3287-1,Takutanuva,2004,347,2
        329-1,Antique Car,1967,378,111
        329-2,Bernard Bear and Pickup Truck,1979,390,27
        3300001-1,Brickley,2011,22,197
        3300002-1,Holiday Set 2 of 2,2011,227,117
        3300003-1,Lego Brand Retail Store,2012,408,279
        3300006-1,"The Routemaster Bus (LEGO Store Grand Opening Set, Westfield, London, UK)",2011,408,117
        3300014-1,Holiday Set 2012,2012,227,109
        3300020-1,Holiday Set 1 of 2,2011,227,98
        3300-1,Harold the Helicopter,2006,504,6
        330-1,Basic Building Set,1985,467,158
        330-2,Gas Station,1978,364,211
        3302-1,Soccer Field,1998,462,2
        330-3,Jeep,1968,378,65
        3303-1,Field Accessories,1998,462,50
        3304-1,Dutch National Player,1998,462,4
        3305-1,World Team Player,1998,462,4
        3305-2,World Team Player - Limited Edition (England),1998,462,4
        3305-3,World Team Player - Limited Edition (Netherlands),1998,462,4
        3306-1,Soccer Goalies,1998,462,8
        3308-1,Tribune,1998,462,85
        3309-1,Head Tribune,1998,462,95
        3310-1,Commentator and Press Box,1998,462,94
        331-1,Dump Truck,1967,381,45
        3311-1,Camera Tower,1998,462,100
        3312-1,Medic's Station,1998,462,78
        3313-1,Light Poles,1998,462,101
        3314-1,Stadium Security,1998,462,143
        3315-1,Olivia’s House,2012,494,733
        3316-10,"Advent Calendar 2012, Friends (Day 9) - Breakfast",2012,226,8
        3316-12,"Advent Calendar 2012, Friends (Day 11) - Present for Dog",2012,226,8
        3316-14,"Advent Calendar 2012, Friends (Day 13) - Stool and Plate with Candies",2012,226,9
        3316-16,"Advent Calendar 2012, Friends (Day 15) - Sled Trailer #2",2012,226,8
        3316-18,"Advent Calendar 2012, Friends (Day 17) - Mailbox with Letter",2012,226,8
        3316-2,"Advent Calendar 2012, Friends (Day 1) - Olivia, Long Sleeve Chrismas Top",2012,226,4
        3316-21,"Advent Calendar 2012, Friends (Day 20) - Flower Arrangement",2012,226,8
        3316-23,"Advent Calendar 2012, Friends (Day 22) - Christmas Tree",2012,226,18
        3316-25,"Advent Calendar 2012, Friends (Day 24) - Corner Table with Beauty Accessories",2012,226,11
        3316-4,"Advent Calendar 2012, Friends (Day 3) - Street Light with Garland",2012,226,12
        3316-6,"Advent Calendar 2012, Friends (Day 5) - Snowman",2012,226,7
        3316-8,"Advent Calendar 2012, Friends (Day 7) - Friends Accessories",2012,226,20
        3317-1,German National Player,1998,462,4
        3318-1,English Player,1998,462,4
        3320-1,Austrian Player,1998,462,4
        332-1,Tow Truck,1967,378,56
        3323-1,Kaufhof Promotional Set: German National Player and Ball,1998,462,5
        3324-1,Kaufhof Promotional Set: World Team Player and Ball,1998,462,5
        3330-1,Racing Car,1998,468,17
        333-1,Basic Set,1981,469,100
        3331-1,Bird,1998,468,14
        333-2,Delivery Truck,1967,382,68
        3332-1,Plane,1998,468,18
        3333-1,Helicopter,1998,468,17
        3340-1,Star Wars #1 - Sith Minifig Pack,2000,166,30
        334-1,Truck with Flatbed,1967,382,72
        3341-1,Star Wars #2 - Luke/Han/Boba Minifig Pack,2000,169,25
        3342-1,Star Wars #3 - Troopers/Chewie Minifig Pack,2000,169,25
        3343-1,Star Wars #4 - Battle Droid Minifig Pack,2000,166,33
        3344-1,One Minifig Pack - Ninja #1,2000,434,10
        3345-1,Three Minifig Pack - Ninja #2,2000,434,24
        3346-1,Three Minifig Pack - Ninja #3,2000,434,26
        3347-1,One Minifig Pack - Rock Raiders #1,2000,442,8
        3348-1,Three Minifig Pack - Rock Raiders #2,2000,442,23
        3349-1,Three Minifig Pack - Rock Raiders #3,2000,442,29
        3350-1,City #1,2000,50,27
        335-1,Basic Building Set,1990,467,245
        3351-1,Three Minifig Pack - City #2,2000,50,24
        335-2,Transport Truck,1967,382,99
        336-1,Fire Engine,1968,376,76
        3365-1,Moon Buggy,2011,52,37
        3366-1,Satellite Launcher,2011,52,164
        3367-1,Space Shuttle,2011,52,230
        3368-1,Rocket Launch Center,2011,52,498
        337-1,Basic Building Set,1987,467,225
        337-2,Truck with Crane and Caterpillar Track,1969,381,92
        3380-1,Johnny Thunder Chupa Chups Promotional,2003,300,5
        338-1,Ambulance,1970,420,74
        3381-1,Lord Sam Sinister Chupa Chups Promotional,2003,300,5
        338-2,Blondi the Pig and Taxi Station,1979,390,33
        3382-1,Jing Lee the Wanderer Chupa Chups Promotional,2003,300,4
        3383-1,Chef,2003,109,6
        3384-1,Train Worker Chupa Chups Promotional,2003,239,4
        3385-1,Conductor Charlie,2003,239,6
        3386-1,Xtreme Stunts Pepper Roni Chupa Chups Promotional,2003,407,4
        3387-1,Xtreme Stunts Brickster Chupa Chups Promotional,2003,407,4
        3388-1,Xtreme Stunts Snap Lockitt Chupa Chups Promotional,2003,407,4
        3389-1,Skateboarder Bill Chupa Chups Promotional,2003,460,7
        3390-1,Basketball Street Player Chupa Chups Promotional,2003,459,5
        3-4,Basic Set,1973,469,191
        340-1,Basic Building Set,1985,467,220
        3401-1,Shoot 'n' Score - without ZIDANE / Adidas Minifig,2000,462,24
        3401-2,Shoot 'n' Score - with ZIDANE / Adidas Minifig,2000,462,24
        340-2,Fire Trucks,1978,364,277
        3402-1,Grandstand with Lights,2000,462,60
        340-3,Railroad Control Tower,1968,367,74
        3403-1,Fans' Grandstand with Scoreboard,2000,462,80
        3404-1,Black Bus,2000,462,130
        3405-1,Blue Bus,2000,462,130
        3406-1,Americas Bus,2000,462,130
        3407-1,Red Bus,2000,462,130
        3408-1,Super Sports Coverage,2000,462,224
        3409-1,Championship Challenge,2000,462,293
        3409-2,Championship Challenge - Special Edition with Orange Players,2000,462,1
        3409-3,Championship Challenge,2000,462,295
        3410-1,Field Expander,2000,462,52
        341-1,Warehouse,1968,367,123
        3411-1,Team Transport Bus,2000,462,131
        341-2,Cathy Cat's & Morty Mouse's Cottage,1979,390,115
        3412-1,Point Shooting,2000,462,24
        3413-1,Goal Keeper,2000,462,27
        3414-1,Precision Shooting,2000,462,22
        3416-1,Women's Team,2001,462,67
        3418-1,Point Shooting,2001,462,24
        3419-1,Precision Shooting,2001,462,23
        3420-1,Championship Challenge II,2002,462,387
        3420-2,Championship Challenge II - FC Bayern Promo Edition,2003,462,387
        3420-3,Championship Challenge II - L'Equipe de France Promo Edition,2002,462,387
        3420-4,Championship Challenge II - Sports Edition,2004,462,387
        342-1,Station,1968,367,191
        3421-1,3 v 3 Shootout,2002,462,224
        3422-1,Shoot 'N Save (non-promo),2002,462,110
        3422-2,Shoot 'N Save (FC Bayern Promo Edition),2003,462,114
        3423-1,Freekick Frenzy,2002,462,52
        3424-1,Target Practice,2002,462,36
        3425-1,Grand Championship Cup - U.S. Men's Team Cup Edition,2002,462,568
        3425-2,Grand Championship Cup,2002,462,568
        3426-1,Team Transport Bus Adidas Edition,2002,462,131
        3427-1,NBA Slam Dunk,2003,459,55
        3428-1,One vs One Action,2003,459,39
        3429-1,Ultimate Defense,2003,459,82
        3430-1,Spin & Shoot,2002,459,70
        343-1,Train Ferry,1968,377,147
        3431-1,Streetball 2 vs 2,2003,459,186
        3432-1,NBA Challenge,2003,459,450
        3433-1,NBA Ultimate Arena,2003,459,490
        3438-1,McDonald's Restaurant,1999,75,93
        3439-1,Spy Runner,2000,68,105
        3440-1,NBA Jam Session Co-Pack,2003,459,71
        344-1,Bungalow,1969,413,77
        344-2,Service Station,1979,390,84
        3444-1,2 x 4 Ridge Roof Tiles Steep Sloped Black,2000,254,25
        3445-1,2 x 4 Ridge Roof Tiles Steep Sloped Red,2000,254,25
        3446-1,2 x 2 Window White,2000,254,25
        3447-1,1 x 3 x 4 Wall Element Transparent Blue (Train Window),2000,254,25
        3448-1,1 x 4 x 5 Black Window Frames with Clear Panes,2000,254,20
        3449-1,1 x 4 x 6 Black Door Frame with Transparent Blue Panes,2000,254,10
        3450-1,Statue of Liberty,2000,276,2899
        345-1,House with Mini Wheel Car,1969,413,132
        3451-1,Sopwith Camel,2001,276,575
        345-2,Small Bucket for Her,1993,467,135
        3453-1,2 x 2 Black Bricks,2000,254,100
        3454-1,2 x 2 Light Gray Bricks,2003,254,100
        3455-1,2 x 2 White Bricks,2003,254,100
        3456-1,2 x 2 Dark Green Bricks,2000,254,100
        3457-1,2 x 2 Red Bricks,2000,254,100
        3458-1,2 x 4 Black Bricks,2000,254,50
        3459-1,2 x 4 Light Gray Bricks,2003,254,50
        3460-1,2 x 4 White Bricks,2003,254,50
        346-1,Jumbo Jet,1970,412,117
        3461-1,2 x 4 Dark Green Bricks,2000,254,50
        346-2,House with Car,1969,413,167
        3462-1,2 x 4 Red Bricks,2000,254,50
        3463-1,2 x 8 Black Bricks,2000,254,25
        3464-1,2 x 8 Light Gray Bricks,2003,254,25
        3465-1,2 x 8 White Bricks,2003,254,25
        3466-1,2 x 8 Dark Green Bricks,2000,254,25
        3467-1,2 x 8 Red Bricks,2000,254,25
        3468-1,1 x 4 Black Bricks,2000,254,50
        3469-1,1 x 4 Light Gray Bricks,2003,254,50
        3470-1,1 x 4 White Bricks,2003,254,50
        347-1,Fire Station with Mini Cars,1970,417,205
        3471-1,1 x 4 Dark Green Bricks,2000,254,50
        347-2,Basic Building Set,1987,467,330
        3472-1,1 x 4 Red Bricks,2000,254,50
        347-3,Doc David's Hospital,1979,391,100
        3473-1,1 x 6 Black Bricks,2000,254,50
        3474-1,1 x 6 Light Gray Bricks,2000,254,50
        3475-1,1 x 6 White Bricks,2000,254,50
        3476-1,1 x 6 Dark Green Bricks,2000,254,50
        3477-1,1 x 6 Red Bricks,2000,254,50
        3478-1,1 x 8 Black Bricks,2000,254,25
        3479-1,1 x 8 Light Grey Bricks,2000,254,25
        3480-1,1 x 8 White Bricks,2003,254,25
        348-1,Garage with Automatic Doors,1971,413,38
        3481-1,1 x 8 Dark Green Bricks,2000,254,25
        3482-1,1 x 8 Red Bricks,2000,254,25
        3483-1,2 x 4 Black Plates,2000,254,100
        3484-1,2 x 4 White Plates,2000,254,100
        3485-1,2 x 4 Red Plates,2000,254,100
        3486-1,1 x 6 Black Plates,2000,254,50
        3487-1,1 x 6 White Plates,2000,254,50
        3488-1,1 x 6 Red Plates,2000,254,50
        3489-1,2 x 8 Black Plates,2000,254,25
        3490-1,2 x 8 White Plates,2000,254,25
        349-1,Swiss Chalet,1971,413,81
        3491-1,2 x 8 Red Plates,2000,254,25
        3492-1,2 x 2 Black Smooth Tiles,2000,254,100
        3493-1,2 x 2 White Smooth Tiles,2000,254,100
        3494-1,2 x 2 Red Smooth Tiles,2000,254,100
        3495-1,2 x 2 Roof Tiles Steep Sloped Black,2003,254,100
        3496-1,2 x 2 Roof Tiles Steep Sloped Red,2003,254,100
        3497-1,2 x 4 Roof Tile Black,2003,254,50
        3498-1,2 x 4 Roof Tile Red,2000,254,50
        3499-1,Small Spruce Trees,2000,254,25
        3500-1,Kobe Bryant,2003,459,4
        350-1,Spanish Villa,1971,413,126
        3501-1,Jet-Car,1998,480,26
        350-2,Basic Building Set,1985,467,315
        3502-1,Bi-Wing,1998,480,24
        350-3,Town Hall with Leonard Lion & Friends,1979,390,134
        3503-1,Mini-Sonic,1998,480,22
        3504-1,Hook-Truck,1998,480,30
        3505-1,Aeroplane,1999,480,23
        3506-1,Motorbike,1999,480,26
        3507-1,1 x 4 x 3 Wall Element Clear,2001,254,25
        3508-1,1 x 4 x 5 Black Window Frame with Blue Pane,2001,254,20
        35-1,Screws for Motor Case,1977,443,2
        3510-1,Polybag,1998,480,25
        351-1,Loader Hopper with Truck,1971,416,170
        3520-1,Forklift,1999,480,39
        352-1,Windmill and Lorry,1972,413,142
        3521-1,Racer,1999,480,35
        3529-1,Pau Gasol,2003,459,4
        3530-1,Tony Parker,2003,459,4
        353-1,Terrace House with Car and Garage,1972,413,153
        3531-1,Tri-Bike,1998,480,29
        3532-1,Jet-Ski,1998,480,27
        3535-1,Skateboard Street Park,2003,460,68
        3536-1,Snowboard Big Air Comp,2003,460,81
        3537-1,Skateboard Vert Park Challenge,2003,460,91
        3538-1,Snowboard Boarder Cross Race,2003,460,196
        3540-1,Puck Passer,2003,461,45
        354-1,Police Heliport,1972,421,173
        3541-1,Slap Shot,2003,461,46
        3542-1,Flip Shot,2003,461,47
        3543-1,Slammer Goalie,2003,461,46
        3544-1,Hockey Game Set,2003,461,153
        3545-1,Hockey Puck Feeder,2003,461,151
        3548-1,Slam Dunk Trainer,2003,459,19
        3548-2,Slam Dunk Trainer (Kabaya Promotional),2003,459,19
        3549-1,Practice Shooting,2003,459,17
        3549-2,Practice Shooting (Kabaya Promotional),2003,459,17
        3550-1,Jump and Shoot,2003,459,17
        3550-2,Jump and Shoot (Kabaya Promotional),2003,459,17
        355-1,Town Center Set with Roadways,1972,413,332
        3551-1,Dino-Jet,1998,480,80
        355-2,Basic Set,1981,469,160
        3552-1,Hover Sub with motor,1998,480,126
        3554-1,Helicopter,1999,480,79
        3555-1,Jeep,1999,480,262
        3557-1,Blue Player & Goal,2004,461,33
        3558-1,Red Player & Goal,2004,461,33
        3559-1,Red & Blue Player,2004,461,40
        3560-1,NBA Collectors #1,2003,459,15
        356-1,Swiss Villa,1973,413,150
        3561-1,NBA Collectors #2,2003,459,15
        356-2,Basic Building Set with Storage Case,1987,467,331
        3562-1,NBA Collectors #3,2003,459,16
        3563-1,NBA Collectors #4,2003,459,15
        3564-1,NBA Collectors #5,2003,459,15
        3565-1,NBA Collectors #6,2003,459,15
        3566-1,NBA Collectors #7,2003,459,15
        3567-1,NBA Collectors #8,2003,459,15
        3568-1,Soccer Target Practice,2006,462,24
        3569-1,Grand Soccer Stadium,2006,462,382
        3570-1,Street Soccer,2006,462,199
        357-1,Fire Station,1973,417,236
        3571-1,Blackmobile with motor,1998,480,143
        3573-1,Superstar Figure ,2007,462,9
        3578-1,NHL Championship Challenge,2004,461,395
        3579-1,Street Hockey,2004,461,119
        358-1,Rocket Base,1973,422,276
        3581-1,Formula Z Car in Storage Case,1998,480,172
        3582-1,Ant,1999,480,258
        3584-1,Rapid Return,2003,459,47
        3585-1,Snowboard Super Pipe,2003,460,224
        359-1,Environment Plate,1972,473,1
        3591-1,Heli-Transport (Rota-Beast),1998,480,265
        3594-1,Bob's Workshop,2009,504,14
        3598-1,XXL 2000 Canister,2005,37,2000
        3599-1,XXL 250 Canister,2005,505,250
        3-6,Medium House Set,1970,433,158
        3600-1,Build Your Own House Tub,2005,37,1201
        360-1,Gravel Quarry,1974,416,211
        3601-1,Elton Elephant,1981,390,7
        3602-1,Bianca Lamb and Stroller,1980,390,4
        3603-1,Boris Bulldog and Mailbox,1981,392,4
        3604-1,Marc Monkey and Wheelbarrow,1980,390,4
        3605-1,Ricky Racoon and his Scooter,1980,390,2
        361-1,Tea Garden Cafe with Baker's Van,1974,413,214
        361-2,Garage,1979,85,79
        3612-1,Wild Animals,2002,504,32
        3615-1,Percy Pig's Wheelbarrow,1981,390,4
        362-1,Windmill,1975,413,211
        3622-1,Rowboat,1988,393,14
        3623-1,Beauty Salon,1988,390,25
        3624-1,Flower Car,1985,390,27
        3625-1,Aeroplane,1985,394,9
        3626-1,Roger Raccoon's Sports Car,1983,390,17
        3627-1,Bonnie Rabbit's Flower Truck,1983,390,24
        3628-1,Perry Panda & Chester Chimp,1981,390,5
        3629-1,Barney Bear,1981,390,17
        3630-1,Sports Airplane,1984,394,9
        363-1,Hospital with Figures,1975,420,229
        3631-1,Orchestra,1985,390,27
        3633-1,Motor Boat,1986,393,14
        3634-1,Charlie Crow's Carry-All,1980,390,18
        3635-1,Bonnie Bunny's Camper,1981,390,31
        3636-1,Bedroom,1987,390,21
        3637-1,Gertrude Goat's Painter's Truck,1983,390,15
        3638-1,Buster Bulldog's Fire Engine,1983,395,17
        3639-1,Police Car,1984,396,12
        364-1,Harbour Scene,1975,419,515
        3641-1,Car & Camper,1985,390,25
        3642-1,Fire Engine,1985,395,18
        3643-1,Police Car,1985,396,12
        3644-1,Mayor's Car,1986,390,11
        3645-1,Classroom,1987,390,26
        3646-1,Kitchen,1988,390,54
        3647-1,School Room,1989,390,44
        3648-1,Police Chase,2011,61,172
        365-1,Wild West Scene,1975,397,591
        365-2,Build-N-Store Chest,1990,467,337
        3654-1,Country Cottage,1982,390,44
        3658-1,Police Helicopter,2011,61,236
        3659-1,Play Ground,1987,390,17
        3660-1,Fisherman's Cottage,1985,390,28
        366-1,Basic Set,1981,469,184
        3661-1,Bank & Money Transfer,2011,61,408
        3662-1,Bus,1987,390,33
        3663-1,Max Mouse's Carousel,1989,390,22
        3664-1,Police Station,1984,396,63
        3665-1,Ice Cream with Scooter,1980,390,38
        3666-1,Petrol Station,1982,390,29
        3667-1,Bakery,1982,390,63
        3668-1,Merry-Go-Round,1986,390,48
        3669-1,Fire & Police Station,1982,390,32
        3670-1,Service Station,1984,390,54
        367-1,Moon Landing,1975,422,363
        3671-1,Airport,1984,394,55
        3672-1,Hotel / Restaurant,1982,390,60
        3673-1,Steamboat,1985,393,64
        3674-1,Bonnie Bunny's New House,1987,390,41
        3675-1,General Store,1987,390,106
        3676-1,Catherine Cat's Fun Park,1989,390,42
        3677-1,Red Cargo Train,2011,240,826
        3678-1,The Fabuland House,1982,390,114
        3679-1,Mill with Shop,1986,390,80
        3680-1,Camping Caravan,1988,390,24
        368-1,Taxi Station,1976,413,157
        3681-1,Amusement Park,1985,390,104
        3682-1,Fire Station,1987,395,153
        3683-1,Amusement Park,1988,390,91
        369-1,Coast Guard Station,1976,415,273
        370-1,Police Headquarters,1976,421,300
        3701-1,Fisherman Cornelius Cat,1982,390,3
        3703-1,Peter Pig the Cook,1982,390,3
        3704-1,Marjorie Mouse,1982,390,3
        3706-1,Elmer Elephant,1982,390,3
        3707-1,Clover Cow,1982,390,3
        3708-1,Rufus Rabbit,1982,390,4
        3710-1,Peter Panda Takes a Bath,1983,390,3
        371-1,Tipper Truck,1971,416,47
        3711-1,Pierre Pig and His Tuba,1984,390,5
        371-2,Motorized Truck Set,1967,301,314
        3712-1,Robby Rabbit and Accordion,1984,390,5
        371-3,Seaplane,1977,412,115
        3713-1,Drummer Gabriel Monkey,1984,390,8
        3714-1,Bricklayer Oscar Orangutan,1985,390,7
        3715-1,Flower Stand,1985,390,20
        3716-1,Office,1985,390,9
        3717-1,Fisherman,1985,390,10
        3718-1,Small Cafe,1986,390,5
        3719-1,Bus Stop,1987,390,5
        372-1,Texas Rangers,1977,397,248
        3721-1,Clive Crocodile on Skateboard,1988,390,11
        372-2,Tow Truck,1971,397,53
        3723-1,Lego Minifigure,2000,276,1849
        3724-1,Lego Dragon,2001,276,1538
        3725-1,1 x 2 Brick Light Gray,2003,254,100
        3726-1,1 x 2 Brick Dark Gray,2003,254,100
        3727-1,1 x 2 Brick Tan,2000,254,100
        3729-1,2 x 4 Dark Gray Bricks,2000,254,50
        3730-1,2 x 4 Tan Bricks,2000,254,50
        373-1,Offshore Rig with Fuel Tanker,1977,418,459
        3731-1,Pumpkin Pack,2000,230,87
        373-2,Ambulance,1971,420,65
        3732-1,Castle Expander Pack,2000,255,24
        3733-1,Gray Windows with Clear Panes,2000,254,20
        3734-1,Train Windows with Panes Blue,2000,254,20
        3735-1,Grey Train Doors with Panes,2000,257,20
        3736-1,Blue Train Doors with Panes,2000,257,20
        3737-1,Train Accessories,2000,257,15
        3738-1,Large Spruce Trees,2000,254,10
        3739-1,Blacksmith Shop,2002,200,629
        3740-1,Small Locomotive,2001,238,66
        374-1,Fire Station,1978,74,334
        3741-1,Large Locomotive (base unit without color trim elements),2001,238,91
        374-2,Fire Engine,1971,417,73
        3742-1,Tender Basis (without color trim elements),2001,238,41
        3743-1,Locomotive Blue Bricks,2001,238,106
        3744-1,Locomotive Green Bricks,2001,238,106
        3745-1,Locomotive Black Bricks,2001,238,106
        3746-1,Locomotive Brown Bricks,2001,238,106
        3747-1,Locomotive Gray Bricks,2001,238,106
        3748-1,Light Unit for Train,2001,456,4
        3750-1,Life on Mars Accessories,2001,452,48
        3751-1,1 x 2 Brown Bricks,2003,254,100
        375-2,Castle,1978,189,776
        3752-1,1 x 6 Brown Bricks,2002,254,50
        375-3,Refrigerator Truck and Trailer,1971,397,127
        3753-1,2 x 2 Brown Bricks,2003,254,100
        3754-1,2 x 4 Brown Bricks,2003,254,50
        3755-1,2 x 4 Roof Tile Brown,2003,254,50
        3756-1,2 x 4 Brown Ridge Roof Tiles Steep Sloped,2003,254,25
        3758-1,35th Anniversary Bucket,1998,469,600
        3759-1,35th Anniversary Tub,1998,469,1200
        3760-1,35th Anniversary Bucket,1998,399,417
        376-1,Low-Loader with Excavator,1971,416,91
        3761-1,35th Anniversary Tub,1998,399,842
        376-2,Town House with Garden,1978,69,244
        377-1,Shell Service Station,1978,76,190
        377-2,Crane with Float Truck,1971,416,90
        3774-1,Bridge,2005,388,26
        3775-1,Points,2005,504,2
        378-1,Tractor,1972,397,36
        3781-1,Maximillian Mouse,1982,390,5
        3782-1,Photographer Patrick Parrot,1982,390,5
        3784-1,Hugo Hog the Tinker,1982,390,5
        3786-1,Buzzy Bulldog the Postman,1982,392,7
        3788-1,Paulette Poodle's Living Room,1983,390,15
        3789-1,Police Motorcycle,1984,396,7
        379-1,Bus Station,1979,85,177
        3791-1,William Walrus,1984,390,7
        379-2,Car and Caravan,1972,397,93
        3792-1,Bedroom,1985,390,16
        3793-1,Buzzy Bulldog's Mailbox,1985,392,11
        3794-1,Police Motorcycle,1985,396,16
        3795-1,Kitchen,1985,390,26
        3796-1,Small Bakery,1986,390,31
        3797-1,Fire Chief Barty Bulldog,1987,395,9
        3798-1,Hanna's Garden,1988,390,25
        3-8,Mini-Wheel Model Maker No. 3,1971,423,65
        3800-1,Ultimate Builders Set,2001,260,322
        380-1,Village Set,1971,413,7
        3801-1,Ultimate Accessories,2000,260,45
        3803-1,Robotics Invention System Upgrade Kit (1.5),1999,260,69
        3805-1,Robotics Invention System Upgrade Kit (2.0),2002,260,1
        3806-1,Gigamesh G60,2002,463,286
        3807-1,Snaptrax S45,2002,463,203
        3808-1,Shadowstrike S70,2002,463,236
        3809-1,Technojaw T55,2002,463,262
        381-1,Lorry and Fork Lift Truck,1973,416,86
        381-2,Police Headquarters,1979,80,372
        3815-1,Heroic Heroes of the Deep,2011,272,95
        3816-1,Glove World,2011,272,168
        3817-1,The Flying Dutchman,2012,272,242
        3818-1,Bikini Bottom Undersea Party,2012,272,469
        382-1,Breakdown Truck and Car,1973,397,91
        3825-1,Krusty Krab,2006,272,297
        3826-1,Build-A-Bob,2006,272,445
        3827-1,Adventures in Bikini Bottom,2006,272,576
        3828-1,Air Temple,2006,317,400
        3829-1,Fire Nation Ship,2006,317,724
        3830-1,The Bikini Bottom Express,2008,272,209
        383-1,Truck with Excavator,1973,416,102
        3831-1,Rocket Ride,2008,272,276
        383-2,Knight's Tournament,1979,189,210
        3832-1,The Emergency Room,2008,272,235
        3833-1,Krusty Krab Adventures,2009,272,208
        3834-1,Good Neighbors at Bikini Bottom,2009,272,423
        3835-1,Robo Champ,2009,502,119
        3836-1,Magikus,2009,502,109
        3837-1,Monster 4,2009,502,142
        3838-1,Lava Dragon,2009,502,136
        3839-1,Race 3000,2009,502,167
        3840-1,Pirate Code,2009,502,278
        384-1,London Bus,1973,397,110
        3841-1,Minotaurus,2009,502,223
        3842-1,Lunar Command,2009,502,277
        3843-1,Ramses Pyramid,2009,502,231
        3844-1,Creationary,2009,502,341
        3845-1,Shave a Sheep,2010,502,118
        3846-1,UFO Attack,2010,502,88
        3847-1,Magma Monster,2010,502,95
        3848-1,Pirate Plank,2010,502,122
        3849-1,Orient Bazaar,2010,502,204
        3850031-1,Puffin,2017,410,50
        3850-1,Meteor Strike,2010,502,185
        385-1,Jeep CJ-5,1976,397,58
        3851-1,Atlantis Treasure,2010,502,280
        385-2,Build-N-Store Chest,1990,467,450
        3852-1,Sunblock,2011,502,80
        3853-1,Banana Balance,2011,502,49
        3854-1,Frog Rush,2011,502,107
        3855-1,Ramses Return,2011,502,99
        3856-1,Ninjago,2011,502,247
        3857-1,Draida Bay,2011,502,101
        3858-1,Waldurk Forest,2011,502,231
        3859-1,Caverns of Nathuz,2011,502,223
        3860-1,Castle Fortaan,2011,502,312
        386-1,Helicopter and Ambulance,1976,420,142
        3861-1,LEGO Champion,2011,502,216
        3862-1,Hogwarts,2010,502,332
        3863-1,Kokoriko,2012,502,115
        3864-1,Mini Taurus,2012,502,165
        3865-1,City Alarm,2012,502,246
        3866-1,Star Wars Battle of Hoth,2012,502,305
        3870-1,Takeshi Walker 1,2007,389,29
        387-1,Excavator and Dumper,1976,416,159
        3871-1,Ha-Ya-To Walker,2007,389,21
        3872-1,Robo Chopper,2007,389,29
        3874-1,Ilrion,2012,502,245
        3885-1,Hikaru Little Flyer,2007,389,22
        3885-2,Hikaru Little Flyer - Boxed Version,2007,389,22
        3885-3,Hikaru Little Flyer - Duracell 12 pack AA Battery Promotion,2007,389,1
        3886-1,Ryo Walker,2007,389,19
        3886-2,Ryo Walker - Boxed Version,2007,389,19
        3886-3,Ryo Walker - Duracell 12 pack AA Battery Promotion,2007,389,1
        3888-1,Three Eights,1998,399,182
        3900-1,Bracelet,2000,451,20
        390-1,Helicopter,1986,467,24
        390-2,1913 Cadillac,1975,404,199
        39-1,Motor Gearbox,1977,443,1
        391-1,1926 Renault,1975,404,236
        3911-1,Astronaut Key Chain,2000,503,0
        391-2,Police Car,1986,467,22
        3913-1,Darth Vader Key Chain,2000,503,0
        391407-1,Fire Spinner,2014,571,21
        3914-1,Luke Skywalker Key Chain,2000,503,0
        3915-1,Race Car Driver Key Chain,2000,503,0
        3916-1,Rock Raider Key Chain,2000,503,0
        3917-1,2 x 4 Brick - Red Key Chain,2001,503,0
        3918-1,Coast Guard Female Key Chain,2002,503,0
        3920-1,The Hobbit,2012,502,394
        392-1,Formula 1,1975,404,196
        392-2,Fire Engine,1986,467,30
        3922-1,Darth Maul Key Chain,2000,503,0
        3923-1,King Leo Key Chain,2000,503,0
        3924-1,Director Key Chain,2001,503,0
        3925-1,Brickster Key Chain,2002,503,0
        3926-1,Life on Mars Martian Key Chain,2002,503,0
        3928-1,Sandy Moondust Mars Rover Mission Astrobot Female,2002,126,5
        3929-1,Biff Starling Mars Rover Mission Astrobot Male,2002,126,5
        3930-1,Stephanie's Outdoor Bakery,2012,494,45
        393-1,Norton Motorcycle,1976,404,133
        3931-1,Emma's Splash Pool,2012,494,43
        393-2,Tow Truck,1986,467,29
        3932-1,Andrea’s Stage,2012,494,83
        3933-1,Olivia's Invention Workshop,2012,494,86
        3934-1,Mia’s Puppy House,2012,494,83
        3935-1,Stephanie’s Pet Patrol,2012,494,73
        3936-1,Emma’s Fashion Design Studio,2012,494,77
        3937-1,Olivia's Speedboat,2012,494,64
        3938-1,Andrea's Bunny House,2012,494,64
        3939-1,Mia's Bedroom,2012,494,86
        394-1,Harley-Davidson 1000cc,1976,404,142
        3942-1,Heartlake Dog Show,2012,494,202
        3948-1,Stormtrooper Key Chain,2001,503,0
        395-1,1909 Rolls-Royce,1976,404,283
        396-1,Thatcher Perkins Locomotive,1976,404,433
        3961-1,Johnny Thunder Key Chain,1998,503,0
        398-1,U.S.S. Constellation,1978,404,973
        3983-1,Captain Roger Key Chain,2002,503,0
        4000001-1,Moulding Machines,2011,408,794
        4000002-1,LOM Moulding 2011,2011,301,174
        4000005-1,Kornmarken Factory 2012,2012,301,315
        4000006-1,Production Kladno Campus 2012,2012,301,278
        4000007-1,Ole Kirk's House,2012,301,909
        4000008-1,LEGO Inside Tour Exclusive 2013 Edition – Villy Thomsen Truck,2013,301,366
        4000009-1,HMV 2013 Production,2013,408,285
        40000-1,Santa Claus in the Snow,2009,227,159
        4000010-1,LEGO House,2014,408,250
        4000011-1,Nyiregyhaza Factory,2014,408,327
        4000012-1,LEGO Inside Tour (LIT) Exclusive 2012 Edition - Piper Airplane,2012,301,618
        4000013-1,A LEGO Christmas Tale,2013,408,394
        4000014-1,The LEGOLAND Train,2014,408,545
        4000015-1,LOM Building B,2014,408,215
        4000016-1,Billund Airport,2014,408,281
        40001-1,Santa Claus,2009,227,42
        40002-1,Christmas Tree,2009,227,61
        40003-1,Snowman,2009,227,44
        40004-1,Heart 2010,2010,232,26
        40005-1,Bunny,2010,229,81
        40008-1,Snowman Building Set,2010,227,64
        40009-1,Holiday Building Set,2010,227,85
        400-1,Universal Building Set,1977,469,317
        40010-1,Santa with Sleigh Building Set,2010,227,71
        40011-1,Thanksgiving Turkey,2010,231,52
        40012-1,Halloween Pumpkin,2010,230,18
        40013-1,Halloween Ghost,2010,230,18
        40014-1,Halloween Bat,2010,230,25
        40015-1,Heart Book,2011,206,51
        40016-1,Valentine Letter Set,2011,232,41
        40017-1,Easter Basket,2011,229,86
        40018-1,Easter Bunny with Eggs,2011,229,95
        40019-1,Brickley,2011,22,59
        40020-1,Halloween Set,2011,230,71
        4002014-1,LEGO HUB Birds,2015,301,466
        4002015-1,Borkum Riffgrund 1,2015,598,558
        4002016-1,50 Years On Track,2016,301,1142
        4002-1,Riptide Racer,1996,363,53
        40021-1,Spiders Set,2011,230,54
        40022-1,Mini Santa Set,2011,227,72
        40023-1,Holiday Stocking,2011,227,76
        40024-1,Christmas Tree,2011,227,77
        40025-1,{Yellow Cab},2012,22,44
        40028-1,Mini Hogwarts Express,2011,246,64
        40029-1,Heart 2012,2012,206,51
        400-3,Small Wheels with Axles (The Building Toy),1966,371,12
        40030-1,Duck with Ducklings,2012,229,51
        40031-1,Bunny and Chick,2012,229,52
        40032-1,Witch,2012,230,71
        40033-1,Turkey,2012,231,52
        40034-1,Christmas Train,2012,227,82
        40035-1,Rocking Horse,2012,227,49
        40036-1,Monthly Mini Model Build January 2012 - Cobra,2012,409,37
        40037-1,Monthly Mini Model Build February 2012 - Hockey Player,2012,409,43
        40038-1,Monthly Mini Model Build March 2012 - Garden and Earthworm,2012,409,33
        40039-1,Monthly Mini Model Build May 2012 - Tulip,2012,409,16
        400-4,Small Wheels with Axles (System),1963,371,12
        40040-1,Monthly Mini Model Build July 2012 - Olympic Flame,2012,409,15
        40041-1,Monthly Mini Model Build December 2012 - Moose,2012,409,27
        40042-1,Monthly Mini Model Build October 2012 - Cat,2012,409,25
        40043-1,Monthly Mini Model Build April 2012 - Duck,2012,409,24
        40044-1,Monthly Mini Model Build June 2012 - Lawnmower,2012,409,25
        40045-1,Monthly Mini Model Build August 2012 - Shark,2012,409,27
        40047-1,Monthly Mini Model Build September 2012 - Owl,2012,409,41
        40048-1,Birthday Cake,2012,206,24
        40049-1,Mini Sopwith Camel,2012,22,65
        4005-1,Tug Boat,1982,363,65
        40051-1,Valentine’s Day Heart Box,2013,232,54
        40052-1,Springtime Scene,2013,206,88
        40053-1,Easter Bunny with Basket,2013,229,96
        40054-1,Summer Scene,2013,206,40
        40055-1,Pumpkin,2013,230,52
        40056-1,Thanksgiving Feast,2013,206,46
        40057-1,Fall Scene,2013,206,72
        40058-1,Decorating The Tree,2013,228,110
        40059-1,Santa's Sleigh,2013,228,77
        40061-1,Monthly Mini Model Build January 2013 - Igloo,2013,409,40
        40062-1,Monthly Mini Model Build Set February 2013 - Log Cabin,2013,409,59
        40063-1,Monthly Mini Model Build March 2013 - Turtle,2013,409,33
        40064-1,Monthly Mini Model Build Set April 2013 - Lamb and Sheep,2013,409,32
        40065-1,Monthly Mini Model Build May 2013 - Kingfisher,2013,409,21
        40066-1,Monthly Mini Model Build June 2013 - Fisherman,2013,409,38
        40067-1,Monthly Mini Model Build July 2013 - Crab,2013,409,37
        40068-1,Monthly Mini Model Build August 2013 - Flamingo,2013,409,31
        40069-1,Monthly Mini Model Build September 2013 - Pirate,2013,409,44
        40070-1,Monthly Mini Model Build October 2013 - Witch,2013,409,22
        40071-1,Monthly Mini Model Build November 2013 - Tractor,2013,409,44
        40072,Monthly Mini Model Build December 2013 - Rocking Horse,2013,409,32
        40073-1,Panda,2013,31,70
        40076-1,Zombie Car,2012,558,60
        40077-1,Geoffrey,2013,22,90
        40078-1,Hot Dog Cart,2013,22,39
        40079-1,Mini VW T1 Camper Van,2013,22,75
        40080-1,Friends Pencil Holder,2013,501,142
        40081-1,LEGOLAND Picture Frame - Florida Edition,2013,411,121
        40081-2,LEGOLAND Picture Frame - Deutschland Edition,2013,411,121
        40081-3,LEGOLAND Picture Frame - Billund Edition,2013,411,121
        40081-4,LEGOLAND Picture Frame - Malaysia Edition,2013,411,121
        40081-5,LEGOLAND Picture Frame - Windsor Edition,2013,411,121
        40082-1,Christmas Tree Stand,2013,228,115
        40083-1,Christmas Tree Truck,2013,228,118
        40084-1,Hero Factory Weapon Pack,2013,400,6
        40085-1,LEGO Valentine,2014,232,127
        40086-1,LEGO Easter Bunny,2014,229,106
        40090-1,Halloween Bat,2014,230,155
        40091-1,Turkey,2014,231,125
        40092-1,Reindeer,2014,227,139
        40093-1,Snowman,2014,227,140
        40094-1,Monthly Mini Model Build January 2014 - Snowplough,2014,409,44
        40095-1,Monthly Mini Model Build February 2014 - Micro Manager,2014,409,50
        40096-1,Monthly Mini Model Build March 2014 - Spring Tree,2014,409,62
        40097-1,Monthly Mini Model Build April 2014 - Helicopter,2014,409,44
        40098-1,Monthly Mini Model Build May 2014 - Dragon,2014,409,43
        40099-1,Monthly Mini Model Build June 2014 - Jet-Ski,2014,409,33
        40-1,Universal Building Set,1976,469,293
        40100-1,Monthly Mini Model Build July 2014 - Surf Van,2014,409,46
        4010-1,Police Rescue Boat,1987,363,82
        40101-1,Monthly Mini Model Build August 2014 - Monkey,2014,409,46
        40102-1,Monthly Mini Model Build September 2014 - Aircraft,2014,409,37
        40103-1,Monthly Mini Model Build November 2014 - Rocket,2014,409,48
        40104-1,Monthly Mini Model October 2014 - Monster,2014,409,36
        40105-1,Monthly Mini Model Build December 2014 - Gingerbread House,2014,409,54
        40106-1,Elves' Workshop,2014,227,115
        40107-1,Ice Skating,2014,228,129
        40108-1,Balloon Cart,2014,22,66
        40109-1,MINI Cooper Mini Model,2014,22,59
        40110-1,Coin Bank,2014,61,121
        4011-1,Cabin Cruiser,1991,363,90
        40112-1,Model Catwalk,2014,494,143
        40114-1,LEGO Friends Buildable Jewelry Box,2014,494,201
        40115-1,LEGOLAND Entrance with Family,2014,425,271
        40116-1,Hero Factory Promo,2014,400,31
        40117-1,Hero Factory Villain Promo,2014,403,28
        40118-1,Buildable Brick Box 2x2,2014,408,204
        401-2,Large Wheels with Axles (The Building Toy),1966,371,7
        40120-1,Valentine's Day Dinner,2015,232,114
        4012-1,Wave Cops,1996,363,99
        40121-1,Painting Easter Eggs,2015,229,157
        40122-1,Trick or Treat,2015,230,133
        40123-1,Thanksgiving Feast,2015,231,158
        40124-1,Winter Fun,2015,227,107
        40125-1,Santa's Visit,2015,227,167
        40126-1,Monthly Mini Model Build January 2015 - Alien and Space Dog,2015,409,55
        40127-1,Monthly Mini Model Build February 2015 - Space Shuttle,2015,409,39
        40128-1,Monthly Mini Model Build March 2015 - Robot,2015,409,50
        40129-1,Monthly Mini Model Build April 2015 – UFO,2015,409,39
        401-3,Large Wheels with Axles (System),1964,371,7
        40130-1,Monthly Mini Model Build May 2015 - Koala,2015,409,65
        4013-1,Create and Imagine,2003,37,1000
        40131-1,Monthly Mini Model Build June 2015 - Parrot,2015,409,55
        40132-1,Whale July 2015,2015,409,31
        40133-1,Monthly Mini Model Build August 2015 - Kangaroo,2015,409,49
        40134-1,Monthly Mini Model Build September 2015 - Scuba Diver,2015,409,45
        40135-1,Monthly Mini Model Build October 2015 - Angler Fish,2015,409,29
        40136-1,Monthly Mini Model Build November 2015 - Shark,2015,409,31
        40137,Monthly Mini Model Build December 2015 - Submarine,2015,409,28
        40138-1,Christmas Train,2015,227,233
        40139-1,Gingerbread House,2015,26,277
        40140-1,Flower Cart,2015,23,75
        4014-1,Creator Exclusive,2003,37,500
        40141-1,Bricktober Hotel,2015,157,203
        40142-1,Bricktober Train Station,2015,157,180
        40143-1,Bricktober Bakery,2015,157,234
        40144-1,Bricktober Toys R Us Store,2015,157,164
        40145-1,LEGO Brand Store Opening Set,2015,408,412
        40146-1,Lufthansa Plane,2015,598,65
        40148-1,Year Of The Sheep,2015,31,99
        4015-1,Freighter,1982,363,80
        40153-1,Birthday Cake,2015,301,120
        40154-1,Pencil Holder,2015,301,176
        40155-1,Piggy Coin Bank,2015,301,148
        40156-1,Organiser,2015,494,171
        40158-1,Pirates Chess Set,2015,154,855
        4016-1,Racer,2001,22,21
        40161-1,What Am I?,2016,301,536
        40165-1,Minifigure Wedding Favor Set,2016,408,90
        40166-1,LEGOLAND Train,2016,425,210
        4017-1,Sea Helicopter,2001,22,13
        40171-1,Hedgehog Storage,2017,494,232
        40172-1,Brick Calendar,2017,501,278
        40174-1,Iconic Chess Set,2017,502,1450
        40179-1,Personalised Mosaic Portrait,2016,277,4501
        40180-1,Bricktober Theater,2014,157,164
        4018-1,Ship,2001,22,12
        40181-1,Bricktober Pizza Place,2014,157,139
        40182-1,Bricktober Fire Station,2014,157,175
        40183-1,Bricktober Town Hall,2014,157,186
        40190-1,Ferrari F138,2014,598,41
        4019-1,Aeroplane,2001,24,17
        40191-1,Ferrari F12 Berlinetta,2014,598,44
        40192-1,Ferrari 250 GTO,2014,598,46
        40193-1,Ferrari 512 S,2014,598,49
        40194-1,Finish Line & Podium,2014,598,63
        40195-1,Shell Station,2014,598,79
        40196-1,Shell Tanker,2014,598,93
        4020-1,Fire Fighting Boat,1987,363,206
        40201-1,Valentines Cupid Dog,2016,232,150
        40202-1,Easter Chick,2016,229,111
        40203-1,Vampire and Bat,2016,230,150
        40204-1,Pilgrim's Feast,2016,231,163
        40205-1,Elves' Workshop,2016,206,238
        40206-1,Santa,2016,227,155
        40207-1,Year Of The Monkey,2016,22,165
        40208-1,Monthly Mini Model Build January 2016 - Polar Bear,2016,409,40
        40209-1,Monthly Mini Model Build February 2016 - Snow Scooter,2016,409,26
        402-1,Universal Building Set,1977,469,401
        40210-1,Monthly Mini Model Build March 2016 - Bunny,2016,409,49
        4021-1,Police Patrol,1991,363,195
        40211-1,Monthly Mini Model Build April 2016 - Bee,2016,409,34
        40212-1,Monthly Mini Model Build May 2016 - Hedgehog,2016,409,39
        40213-1,Monthly Mini Model Build June 2016 - Sea Plane,2016,409,24
        40214-1,Monthly Mini Model Build July 2016 - Frog,2016,409,60
        40215-1,Monthly Mini Model Build August 2016 - Apple,2016,409,58
        40216-1,Monthly Mini Build September 2016 - School Bus,2016,409,65
        40217-1,Monthly Mini Build October 2016 - Werewolf,2016,409,52
        40218-1,Monthly Mini Model Build November 2016 - Fox,2016,409,39
        40219-1,Monthly Mini Model Build December 2016 - Christmas Present,2016,409,55
        402-2,White Turntables,1964,371,5
        40220-1,London Bus,2016,22,117
        4022-1,C26 Sea Cutter,1996,363,193
        40221-1,Fountain,2016,22,105
        40222-1,24-in-1 Holiday Countdown,2016,207,250
        40223-1,Christmas Ornament,2016,206,215
        40225-1,RIO 2016 MASCOTS,2016,598,196
        40226-1,Birthday Buddy,2016,22,133
        40227-1,MSC Ship,2016,598,181
        40228-1,Geoffrey & Friends,2016,598,133
        402-3,White Turntables,1966,371,5
        4023-1,Fun and Adventure,2003,37,55
        40236-1,Romantic Valentine Picnic,2017,232,126
        40237-1,Easter Egg Hunt -2017,2017,229,145
        40239-1,Monthly Mini Model Build January 2017 - Narwhal,2017,409,45
        40240-1,Monthly Mini Model Build February 2017 - Raccoon,2017,409,47
        4024-1,Advent Calendar 2003 Creator,2003,214,24
        4024-10,Advent Calendar 2003 Creator (Day  9) Airplane,2003,223,13
        4024-11,Advent Calendar 2003 Creator (Day 10) Sailboat,2003,223,16
        40241-1,Monthly Mini Model Build March 2017 - Platypus,2017,409,36
        4024-12,Advent Calendar 2003 Creator (Day 11) Snowplow,2003,223,21
        4024-13,Advent Calendar 2003 Creator (Day 12) Snail,2003,223,9
        4024-14,Advent Calendar 2003 Creator (Day 13) Robot,2003,223,14
        4024-15,Advent Calendar 2003 Creator (Day 14) Heart,2003,223,11
        4024-16,Advent Calendar 2003 Creator (Day 15) Truck,2003,223,21
        4024-17,Advent Calendar 2003 Creator (Day 16) Reindeer,2003,223,13
        4024-18,Advent Calendar 2003 Creator (Day 17) Bird,2003,223,10
        4024-19,Advent Calendar 2003 Creator (Day 18) Present,2003,223,9
        4024-2,Advent Calendar 2003 Creator (Day  1) Snowman,2003,223,19
        4024-20,Advent Calendar 2003 Creator (Day 19) Fireplace,2003,223,17
        4024-21,Advent Calendar 2003 Creator (Day 20) Santa,2003,223,13
        40242-1,Monthly Mini Model Build April 2017 - Chick,2017,409,54
        4024-22,Advent Calendar 2003 Creator (Day 21) Robot,2003,223,16
        4024-23,Advent Calendar 2003 Creator (Day 22) Race Car,2003,223,17
        4024-24,Advent Calendar 2003 Creator (Day 23) Helicopter,2003,223,16
        4024-25,Advent Calendar 2003 Creator (Day 24) Tree,2003,223,13
        4024-3,Advent Calendar 2003 Creator (Day  2) Little Girl,2003,223,9
        40243-1,Monthly Mini Model Build May 2017 - Racecar,2017,409,52
        4024-4,Advent Calendar 2003 Creator (Day  3) Penguin,2003,223,12
        40244-1,Monthly Mini Model Build June 2017 - Dragonfly,2017,409,37
        4024-5,Advent Calendar 2003 Creator (Day  4) Sheep,2003,223,13
        4024-6,Advent Calendar 2003 Creator (Day  5) Little Boy,2003,223,9
        4024-7,Advent Calendar 2003 Creator (Day  6) Stocking,2003,223,8
        4024-8,Advent Calendar 2003 Creator (Day  7) Spaceship,2003,223,10
        4024-9,Advent Calendar 2003 Creator (Day  8) Parrot,2003,223,9
        4025-1,Fire Boat,1982,363,150
        40252-1,Mini VW Beetle,2017,22,141
        40265-1,Friends Tic-Tac-Toe,2017,494,58
        4028-1,World of Bricks {Blue Bucket},2003,37,500
        4029-1,Build with Bricks Bucket {Red Bucket},2003,37,500
        4030-1,Cargo Carrier,1987,363,323
        4031-1,Fire Rescue,1991,363,363
        403-2,Train Couplers and Wheels (The Building Toy),1967,371,12
        4032-1,Passenger Plane,2003,106,161
        4032-10,Passenger Plane - Austrian Air Version,2004,106,137
        4032-11,Passenger Plane - KLM Version,2006,106,137
        4032-12,Passenger Plane - Malaysian Air Version,2005,106,137
        4032-13,Passenger Plane - Aeroflot Version,2006,106,161
        4032-2,Passenger Plane - SAS Version,2003,106,140
        4032-3,Passenger Plane - EL AL Version,2004,106,137
        4032-4,Passenger Plane - Iberia Version,2004,106,139
        4032-5,Passenger Plane - JAL Version,2004,106,137
        4032-6,Passenger Plane - Lauda Air Version,2004,106,137
        4032-7,Passenger Plane - ANA Air Version,2004,106,138
        4032-8,Passenger Plane - SWISS Version,2005,106,161
        4032-9,Passenger Plane - Snowflake Version,2004,106,137
        403-3,Train Couplers and Wheels (System),1966,371,12
        4037-1,Helicopter,2004,23,9
        4038-1,Airplane,2003,466,33
        404-1,Universal Building Set,1977,469,471
        404-3,Wheels for Motor (The Building Toy),1967,371,12
        404-4,Wheels for the Motor (System),1967,371,12
        4047-1,Ultimate Wheels (Kohl's Exclusive),2003,204,517
        4048-1,Mech Lab (Kohl's Exclusive),2003,204,2
        4051-1,Quicky the Bunny (Nesquik Promotional),2001,273,4
        4052-1,Director (Nesquik Promotional),2001,273,4
        4053-1,Cameraman (Nesquik Promotional),2001,273,5
        4055-1,Medium Bucket,1997,399,329
        4056-1,Color Light,2001,273,13
        4057-1,Spot Light,2001,273,10
        4058-1,Cameraman 1,2001,273,4
        4059-1,Director,2001,273,4
        4060-1,Grip,2001,273,4
        4061-1,Assistant,2001,273,4
        4062-1,Actress,2001,273,4
        4063-1,Cameraman 2,2001,273,4
        4064-1,Actor 2,2001,273,4
        4065-1,Actor 3,2001,273,4
        4066-1,Actor 1,2001,273,4
        4067-1,Buggy,2001,273,15
        4068-1,Handy Camera,2001,273,6
        4069-1,Katinco & Megaphone,2001,273,4
        4070-1,Stand Camera,2001,273,7
        4071-1,Bottles,2001,273,7
        4072-1,Skeleton,2001,273,6
        4073-1,Tree 1,2001,273,6
        4074-1,Tree 3,2001,273,14
        4075-1,Tree 2,2001,273,13
        4076-1,Pteranodon,2001,273,17
        4077-1,Plesiosaur,2001,273,13
        4078-1,T-Rex,2001,273,18
        4079-1,Mini Rex,2001,273,4
        4090-1,Motion Madness,2003,406,244
        409-1,38 Slimbricks Assorted Sizes (The Building Toy),1965,371,114
        4093-1,Wild Windup,2003,406,319
        4094-1,Motor Movers,2003,406,256
        4095-1,Record and Play,2003,406,345
        4096-1,Micro Wheels,2003,204,216
        4097-1,Mini Robots,2003,204,229
        4098-1,High Flyers,2003,204,197
        4099-1,Robobots,2003,204,326
        41000-1,Water Scooter Fun,2013,494,28
        4100-1,Maximum Wheels,2003,204,293
        41001-1,Mia's Magic Tricks,2013,494,92
        41002-1,Emma's Karate Course,2013,494,92
        41003-1,Olivia's Newborn Foal,2013,494,85
        41004-1,Rehearsal Stage,2013,494,199
        41005-1,Heartlake High,2013,494,490
        41006-1,Downtown Bakery,2013,494,268
        41007-1,Heartlake Pet Salon,2013,494,264
        41008-1,Heartlake City Pool,2013,494,441
        41009-1,Andrea's Bedroom,2013,494,94
        410-1,Payloader,1973,416,28
        41010-1,Olivia’s Beach Buggy,2013,494,94
        4101-1,Wild Collection,2003,204,487
        41011-1,Stephanie's Soccer Practice,2013,494,82
        41013-1,Emma's Sports Car,2013,494,163
        41015-1,Dolphin Cruiser,2013,494,631
        41016-10,"Advent Calendar 2013, Friends (Day  9) - Basket",2013,226,19
        41016-12,"Advent Calendar 2013, Friends (Day 11) - Basket with Money",2013,226,3
        41016-14,"Advent Calendar 2013, Friends (Day 13) - Sled",2013,226,8
        41016-16,"Advent Calendar 2013, Friends (Day 15) - Bench",2013,226,11
        41016-18,"Advent Calendar 2013, Friends (Day 17) - Cell Phone /Music Player Docking Station",2013,226,8
        41016-2,"Advent Calendar 2013, Friends (Day  1) - Stephanie",2013,226,4
        41016-21,"Advent Calendar 2013, Friends (Day 20) - Christmas Tree",2013,226,18
        41016-23,"Advent Calendar 2013, Friends (Day 22) - Basket with Leaf",2013,226,8
        41016-25,"Advent Calendar 2013, Friends (Day 24) - Present with Letter",2013,226,12
        41016-4,"Advent Calendar 2013, Friends (Day  3) - Lamp Post",2013,226,10
        41016-6,"Advent Calendar 2013, Friends (Day  5) - Stand #1",2013,226,17
        41016-8,"Advent Calendar 2013, Friends (Day  7) - Stand #2",2013,226,14
        41017-1,Squirrel's Tree House,2013,496,41
        41018-1,Cat's Playground,2013,496,31
        41019-1,Turtle's Little Oasis,2013,496,33
        41020-1,Hedgehog's Hideaway,2013,496,34
        41021-1,Poodle's Little Palace,2013,496,46
        41022-1,Bunny's Hutch,2013,496,37
        41023-1,Fawn's Forest,2013,496,35
        41024-1,Parrot's Perch,2013,496,32
        41025-1,Puppy's Playhouse,2013,496,39
        41026-1,Sunshine Harvest,2014,494,236
        41027-1,Mia's Lemonade Stand,2014,494,114
        41028-1,Emma's Lifeguard Post,2014,494,78
        41029-1,Stephanie's New Born Lamb,2014,494,93
        41030-1,Olivia's Ice Cream Bike,2014,494,98
        4103-1,Fun with Bricks {small red bucket},2002,37,200
        41031-1,Andrea's Mountain Hut,2014,494,119
        4103-2,Fun with Bricks (4293364) - with Minifigs,2006,37,204
        41032-1,First Aid Jungle Bike,2014,495,156
        41033-1,Jungle Falls Rescue,2014,495,186
        41034-1,Summer Caravan,2014,494,311
        41035-1,Heartlake Juice Bar,2014,494,276
        41036-1,Jungle Bridge Rescue,2014,495,365
        41037-1,Stephanie's Beach House,2014,494,387
        41038-1,Jungle Rescue Base,2014,495,498
        41039-1,Sunshine Ranch,2014,494,753
        41040-1,Advent Calendar 2014 Friends,2014,216,24
        41040-11,"Advent Calendar 2014, Friends (Day 10) - Friends Kitchen Accessories",2014,226,17
        41040-13,"Advent Calendar 2014, Friends (Day 12) - Sweets and Saucepan",2014,226,7
        41040-15,"Advent Calendar 2014, Friends (Day 14) - Goblets and Food",2014,226,12
        41040-17,"Advent Calendar 2014, Friends (Day 16) - Cake and Cups",2014,226,6
        41040-19,"Advent Calendar 2014, Friends (Day 18) - End Table and Book",2014,226,11
        41040-20,"Advent Calendar 2014, Friends (Day 19) - Sofa",2014,226,10
        41040-22,"Advent Calendar 2014, Friends (Day 21) - Radio and Cell Phone",2014,226,8
        41040-24,"Advent Calendar 2014, Friends (Day 23) - Christmas Tree",2014,226,18
        41040-3,"Advent Calendar 2014, Friends (Day 2) - Sled",2014,226,11
        41040-5,"Advent Calendar 2014, Friends (Day 4) - Deer and Tree",2014,226,4
        41040-7,"Advent Calendar 2014, Friends (Day 6) - Ewa, Christmas Outfit",2014,226,4
        41040-9,"Advent Calendar 2014, Friends (Day 8) - Chairs",2014,226,14
        4104-1,Small Creator Bucket,2002,37,200
        41041-1,Turtle's Little Paradise,2014,496,43
        41042-1,Tiger's Beautiful Temple,2014,496,42
        41043-1,Penguin's Playground,2014,496,46
        41044-1,Macaw's Fountain,2014,496,39
        41045-1,Orangutan's Banana Tree,2014,496,37
        41046-1,Brown Bear's River,2014,496,37
        41047-1,Seal's Little Rock,2014,496,37
        41048-1,Lion Cub's Savannah,2014,496,43
        41049-1,Panda's Bamboo,2014,496,47
        41050-1,Ariel’s Amazing Treasures,2014,579,77
        4105-1,Imagine and Build,2002,37,500
        41051-1,Merida’s Highland Games,2014,579,144
        4105-2,50th Anniversary Bucket,2005,37,500
        41052-1,Ariel’s Magical Kiss,2014,579,249
        4105-3,Red Bucket,2005,37,483
        41053-1,Cinderella’s Dream Carriage,2014,579,274
        41054-1,Rapunzel’s Creativity Tower,2014,579,297
        41055-1,Cinderella’s Romantic Castle,2014,579,643
        41056-1,Heartlake News Van,2014,494,276
        41057-1,Heartlake Horse Show,2014,494,373
        41058-1,Heartlake Shopping Mall,2014,494,1165
        41059-1,Jungle Tree Sanctuary,2014,495,319
        41060-1,Sleeping Beauty's Royal Bedroom,2015,579,95
        4106-1,Large red bucket,2002,37,500
        41061-1,Jasmine's Exotic Palace,2015,579,142
        41062-1,Elsa's Sparkling Ice Castle,2015,579,291
        41063-1,Ariel’s Undersea Palace,2015,579,376
        41065-1,Rapunzel's Best Day Ever,2016,579,144
        41066-1,Anna & Kristoff's Sleigh Adventure,2016,579,173
        41067-1,Belle’s Enchanted Castle,2016,579,371
        41068-1,Arendelle Castle Celebration,2016,579,475
        41069-1,Treasure's Day at the Pool,2016,579,70
        4107-1,Build Your Dreams,2002,37,1000
        41071-1,Aira's Creative Workshop,2015,600,98
        41072-1,Naida's Spa Secret,2015,600,248
        41073-1,Naida's Epic Adventure Ship,2015,600,312
        41074-1,Azari and the Magical Bakery,2015,600,324
        41075-1,The Elves’ Treetop Hideaway,2015,600,516
        41076-1,Farran and the Crystal Hollow,2015,600,178
        41077-1,Aira's Pegasus Sleigh,2015,600,319
        41078-1,Skyra’s Mysterious Sky Castle,2015,600,813
        4108-1,T-Junction Road Plates,2002,289,2
        41085-1,Vet Clinic,2015,494,200
        41086-1,Vet Ambulance,2015,494,88
        41087-1,Bunny and Babies,2015,494,47
        41088-1,Puppy Training,2015,494,65
        41089-1,Little Foal,2015,494,43
        41090-1,Olivia's Garden Pool,2015,494,82
        4109-1,Curved Road Plates,2002,289,2
        41091-1,Mia's Roadster,2015,494,194
        41092-1,Stephanie's Pizzeria,2015,494,87
        41093-1,Heartlake Hair Salon,2015,494,334
        41094-1,Heartlake Lighthouse,2015,494,471
        41095-1,Emma’s House,2015,494,727
        41097-1,Heartlake Hot Air Balloon,2015,494,254
        41098-1,Emma's Tourist Kiosk,2015,494,98
        41099-1,Heartlake Skate Park,2015,494,198
        41-1,Train Wagon Wheels in Red,1977,456,4
        41100-1,Heartlake Private Jet,2015,494,229
        4110-1,Straight Road Plates,2002,289,2
        41101-1,Heartlake Grand Hotel ,2015,494,1573
        41102-1,Advent Calendar 2015 Friends,2015,216,249
        41103-1,Pop Star Recording Studio,2015,494,171
        41104-1,Pop Star Dressing Room,2015,494,297
        41105-1,Pop Star Show Stage,2015,494,446
        41106-1,Pop Star Tour Bus,2015,494,680
        41107-1,Pop Star Limousine,2015,494,263
        41108-1,Heartlake Food Market,2015,494,391
        41109-1,Heartlake City Airport,2015,494,691
        41110-1,Birthday Party,2016,494,191
        4111-1,Cross Road Plates,2002,289,2
        41111-1,Party Train,2016,494,109
        41112-1,Party Cakes,2016,494,50
        41113-1,Party Gift Shop,2016,494,52
        41114-1,Party Styling,2016,494,53
        41115-1,Emma's Creative Workshop,2016,494,107
        41116-1,Olivia's Exploration Car,2016,494,184
        41117-1,Pop Star TV Studio,2016,494,195
        41118-1,Heartlake Supermarket,2016,494,316
        41119-1,Heartlake Cupcake Cafe,2016,494,444
        41120-1,Adventure Camp Archery,2016,494,114
        41121-1,Adventure Camp Rafting,2016,494,320
        41122-1,Adventure Camp Tree House,2016,494,724
        41123-1,Foal's Washing Station,2016,494,85
        41124-1,Heartlake Puppy Daycare,2016,494,285
        41125-1,Horse Vet Trailer,2016,494,378
        41126-1,Heartlake Riding Club,2016,494,582
        41127-1,Amusement Park Arcade,2016,494,173
        41128-1,Amusement Park Space Ride,2016,494,193
        41129-1,Amusement Park Hot Dog Van,2016,494,243
        41130-1,Amusement Park Roller Coaster,2016,494,1122
        4113-1,Brick Adventures Small Bucket,2002,37,124
        41131-1,Advent Calendar 2016 Friends,2016,216,218
        41132-1,Heartlake Party Shop,2016,494,175
        41133-1,Amusement Park Bumper Cars,2016,494,423
        41134-1,Heartlake Performance School,2016,494,772
        41135-1,Livi’s Pop Star House,2016,494,596
        41140-1,Daisy’s Beauty Salon,2016,579,97
        41141-1,Pumpkin’s Royal Carriage,2016,579,79
        41142-1,Palace Pets Royal Castle,2016,579,185
        41143-1,Berry's Kitchen,2017,579,43
        41144-1,Petite's Royal Stable,2017,579,74
        41147-1,Anna's Snow Adventure,2017,579,153
        41148-1,Elsa's Magical Ice Palace,2017,579,700
        41149-1,Moana's Island Adventure,2016,579,205
        41150-1,Moana's Ocean Voyage,2016,579,307
        4115-1,All That Drives Bucket,2001,37,166
        4116-1,Animal Adventures Bucket,2001,37,211
        4117-1,Fantastic Flyers & Cool Cars Bucket,2001,37,266
        41171-1,Emily Jones & the Baby Wind Dragon,2016,600,80
        41172-1,The Water Dragon Adventure,2016,600,212
        41173-1,Elvendale School of Dragons,2016,600,230
        41174-1,The Starlight Inn,2016,600,347
        4117463-1,Cyber Saucer TRU 50 Years Forever Fun Bundle,1997,144,2
        41175-1,Fire Dragon's Lava Cave,2016,600,441
        41176-1,The Secret Market Place,2016,600,700
        41177-1,The Precious Crystal Mine,2016,600,272
        41178-1,The Dragon Sanctuary,2016,600,585
        41179-1,Queen Dragon’s Rescue,2016,600,832
        41180-1,Ragana’s Magic Shadow Castle,2016,600,1013
        41181-1,Naida's Gondola & the Goblin Thief,2017,600,67
        41182-1,The Capture of Sophie Jones,2017,600,226
        41183-1,The Goblin King's Evil Dragon,2017,600,338
        41184-1,Aira's Airship & the Amulet Chase,2017,600,343
        41185-1,Magic Rescue from the Goblin Village,2017,600,637
        4119-1,Regular & Transparent Bricks Bucket,2001,37,234
        4120-1,Fun and Cool Transportation,2001,37,608
        4121-1,All Kinds of Animals / Lap Table,2001,37,174
        4122-1,Basic Building Set,2000,470,201
        41230-1,Batgirl Batjet Chase,2017,482,206
        41231-1,Harley Quinn to the rescue,2016,482,217
        41232-1,Super Hero High School,2017,482,711
        41234-1,Bumblebee Helicopter,2017,482,141
        41235-1,Wonder Woman Dorm,2017,482,186
        4124-10,"Advent Calendar 2001, Creator (Day  9) Space Buggy",2001,217,18
        4124-12,"Advent Calendar 2001, Creator (Day 11) Speedboat",2001,217,10
        4124-14,"Advent Calendar 2001, Creator (Day 13) Snowman",2001,217,15
        4124-16,"Advent Calendar 2001, Creator (Day 15) Dog",2001,217,10
        4124-18,"Advent Calendar 2001, Creator (Day 17) Whale",2001,217,9
        4124-2,"Advent Calendar 2001, Creator (Day  1) Cat",2001,217,10
        4124-21,"Advent Calendar 2001, Creator (Day 20) Steamship",2001,217,10
        4124-23,"Advent Calendar 2001, Creator (Day 22) Helicopter",2001,217,11
        4124-25,"Advent Calendar 2001, Creator (Day 24) Present",2001,217,8
        4124-4,"Advent Calendar 2001, Creator (Day  3) Fireplace",2001,217,11
        4124-6,"Advent Calendar 2001, Creator (Day  5) Ambulance",2001,217,15
        4124-8,"Advent Calendar 2001, Creator (Day  7) Tina",2001,217,1
        4128-1,XL Freestyle Bucket,1997,399,657
        41300-1,Puppy Championship,2017,494,185
        4130-1,Freestyle Building Set,1995,399,37
        41301-1,Puppy Parade,2017,494,145
        41302-1,Puppy Pampering,2017,496,45
        41303-1,Puppy Playground,2017,496,62
        41304-1,Puppy Treats & Tricks,2017,496,45
        41305-1,Emma's Photo Studio,2017,494,95
        41306-1,Mia's Beach Scooter,2017,494,79
        41307-1,Olivia's Creative Lab,2017,494,99
        41308-1,Stephanie's Friendship Cakes,2017,494,94
        41309-1,Andrea's Musical Duet,2017,494,86
        41310-1,Heartlake Gift Delivery,2017,494,185
        4131-1,Freestyle Building Set,1995,399,71
        41311-1,Heartlake Pizzeria,2017,494,287
        41312-1,Heartlake Sports Center,2017,494,327
        41313-1,Heartlake Summer Pool,2017,494,588
        41314-1,Stephanie's House,2017,494,623
        4132-1,Freestyle Building Set,1995,399,122
        4133-1,Small Freestyle Bucket,1995,399,135
        4134-1,Large Freestyle Bucket,1995,399,252
        4135-1,Freestyle Garden Friends,1996,399,121
        4137-1,Small Freestyle Clearpack,1997,399,127
        4139-1,Freestyle Bucket,1997,399,249
        4142-1,Freestyle Building Set,1995,399,98
        4143-1,Freestyle Building Set,1995,399,196
        4144-1,Freestyle Brick Vac Bus,1995,399,142
        4145-1,Freestyle Playcase,1995,399,254
        4146-1,Extra Large Freestyle Bucket,1995,399,410
        4147-1,Freestyle Elefant Villa,1996,399,191
        41492-1,Iron Man & Cpt. America,2016,610,174
        41493-1,Black Panther & Dr. Strange,2016,610,167
        41500-1,Flain,2014,581,58
        4150-1,Freestyle Building Set,1995,399,91
        41501-1,Vulk,2014,581,69
        41502-1,Zorch,2014,581,45
        41503-1,Krader,2014,581,66
        41504-1,Siesmo,2014,581,50
        41505-1,Shuff,2014,581,51
        41506-1,Teslo,2014,581,54
        41507-1,Zaptor,2014,581,61
        41508-1,Volectro,2014,581,70
        41509-1,Slumbo,2014,582,61
        415-1,5 Sixteens and 4 Twenties (System),1966,371,27
        41510-1,Lunk,2014,582,51
        4151-1,Girl's Freestyle Set,1995,399,274
        41511-1,Flurr,2014,582,46
        41512-1,Chomly,2014,582,68
        4151270-1,Star Wars Co-Pack of 7121 and 7111,2000,166,2
        41513-1,Gobba,2014,582,57
        41514-1,Jawg,2014,582,61
        41515-1,Kraw,2014,582,70
        41516-1,Tentro,2014,582,69
        41517-1,Balk,2014,582,68
        41518-1,Glomp,2014,583,64
        41519-1,Glurt,2014,583,62
        41520-1,Torts,2014,583,48
        4152-1,Large Freestyle Bucket,1995,399,409
        41521-1,Footi,2014,583,72
        41522-1,Scorpi,2014,583,70
        41523-1,Hoogi,2014,583,69
        41524-1,Mesmo,2014,583,64
        41525-1,Magnifo,2014,583,61
        41526-1,Wizwuz,2014,583,70
        41527-1,Rokit,2015,584,66
        41528-1,Niksput,2015,584,62
        41529-1,Nurp-Naut,2015,584,52
        41530-1,Meltus,2015,584,66
        4153-1,Large Freestyle Playcase,1995,399,698
        41531-1,Flamzer,2015,584,60
        41532-1,Burnard,2015,584,59
        41533-1,Globert,2015,584,45
        41534-1,Vampos,2015,584,59
        41535-1,Boogly,2015,584,52
        41536-1,Gox,2015,585,62
        41537-1,Jinky,2015,585,59
        41538-1,Kamzo,2015,585,58
        41539-1,Krog,2015,585,60
        41540-1,Chilbo,2015,585,65
        41541-1,Snoof,2015,585,54
        41542-1,Spugg,2015,585,51
        41543-1,Turg,2015,585,56
        41544-1,Tungster,2015,585,60
        41545-1,Kramm,2015,586,68
        41546-1,Forx,2015,586,65
        41547-1,Wuzzo,2015,586,74
        41548-1,Dribbal,2015,586,52
        41549-1,Gurggle,2015,586,66
        41550-1,Slusho,2015,586,53
        41551-1,Snax,2015,586,51
        41552-1,Berp,2015,586,68
        41553-1,Vaka-Waka,2015,586,69
        41554-1,Kuffs,2016,587,63
        41555-1,Busto,2016,587,69
        41556-1,Tiketz,2016,587,62
        41557-1,Camillot,2016,587,64
        41558-1,Mixadel,2016,587,63
        41559-1,Paladum,2016,587,64
        41560-1,Jamzy,2016,587,70
        41561-1,Tapsy,2016,587,57
        41562-1,Trumpsy,2016,587,54
        41563-1,Splasho,2016,588,67
        41564-1,Aquad,2016,588,70
        41565-1,Hydro,2016,588,70
        41566-1,Sharx,2016,588,55
        41567-1,Skulzy,2016,588,66
        41568-1,Lewt,2016,588,62
        41569-1,Surgeo,2016,588,63
        41570-1,Skrubz,2016,588,68
        4157-1,Freestyle Trial Size,1997,399,36
        41571-1,Tuth,2016,588,67
        41572-1,Gobbol,2016,589,62
        41573-1,Sweepz,2016,589,61
        41574-1,Compax,2016,589,66
        41575-1,Cobrax,2016,589,64
        41576-1,Spinza,2016,589,60
        41577-1,Mysto,2016,589,64
        41578-1,Screeno,2016,589,73
        41579-1,Camsta,2016,589,62
        41580-1,Myke,2016,589,63
        4158-1,Small Freestyle Box,1997,399,132
        41585-1,Batman,2017,610,91
        41586-1,Batgirl,2017,610,99
        41587-1,Robin,2017,610,101
        41588-1,The Joker,2017,610,151
        41589-1,Captain America,2017,610,79
        41590-1,Iron Man,2017,610,96
        41591-1,Black Widow,2017,610,143
        41592-1,The Hulk,2017,610,93
        41593-1,Captain Jack Sparrow,2017,610,109
        41594-1,Captain Armando Salazar,2017,610,118
        41595-1,Belle,2017,610,139
        41596-1,Beast,2017,610,116
        416-1,4 Sixteens 2 Twenties (The Building Toy),1966,371,18
        4161-1,Girl's Freestyle Suitcase,1995,399,293
        4162-1,Freestyle Multibox,1995,399,600
        4163-1,Electric Freestyle Set,1995,399,350
        4164-1,Mickey's Fire Engine,2000,388,27
        4165-1,Minnie's Birthday Party,2000,388,85
        4166-1,Mickey's Car Garage,2000,388,90
        4167-1,Mickey's Mansion,2000,388,123
        4169306a-1,Christmas Tree Ornament,2005,227,46
        4169306b-1,Snowman Ornament,2005,227,36
        4169306c-1,Santa Claus Ornament,2005,227,36
        4171-1,Spot & Friends,2001,37,53
        4172-1,Tina's House,2001,37,44
        417-3,Cornerbricks (The Building Toy),1966,371,10
        4173-1,Max's Pitstop,2001,37,59
        417-4,Cornerbricks (System),1966,371,20
        4174-1,Max Goes Flying,2001,37,173
        4175-1,Adventures with Max & Tina,2001,37,219
        4176-1,The Race of the Year,2001,37,326
        4177-1,Building Stories w/NaNa Bird,2001,37,382
        4178-1,Mickey's Fishing Adventure,2000,388,107
        4179-1,Large Creator Box,2002,37,500
        4181-1,Isla De Muerta,2011,263,160
        418-2,2 x 4 Bricks (The Building Toy),1966,371,65
        4182-1,The Cannibal Escape,2011,263,279
        418-3,2 x 4 Bricks (System),1966,371,126
        4183-1,The Mill,2011,263,366
        4184-1,Black Pearl,2011,263,808
        4184912-1,Black Bus with Ball (Mannschaftsbus + Ball),2002,462,2
        4186870-1,Open Freight Wagon (White Box),2002,238,121
        4186872-1,Passenger Wagon Green (White Box),2002,238,194
        4186874-1,Caboose (White Box),2002,238,170
        4186875-1,9V Platform and Mini-Figures,2002,238,47
        4186876-1,Passenger Wagon Blue (White Box),2002,238,192
        4191-1,The Captain’s Cabin,2011,263,94
        419-2,2 x 3 Bricks (The Building Toy),1966,371,75
        4192-1,Fountain of Youth,2011,263,127
        419-3,2 x 3 Bricks (System),1966,371,150
        4193-1,The London Escape,2011,263,466
        4194-1,Whitecap Bay,2011,263,748
        4195-1,Queen Anne’s Revenge,2011,263,1094
        4195641-1,Star Wars Co-Pack of 7142 and 7152,2002,169,2
        42000-1,Grand Prix Racer,2013,12,1139
        4200-1,Mining 4 x 4,2012,56,101
        42001-1,Mini Off-Roader,2013,1,100
        42002-1,Hovercraft,2013,1,169
        42004-1,Mini Backhoe Loader,2013,7,246
        42005-1,Monster Truck,2013,1,328
        42006-1,Excavator,2013,1,719
        42007-1,Moto Cross Bike,2013,1,253
        42008-1,Service Truck,2013,1,1275
        42009-1,Mobile Crane MK II,2013,7,2606
        420-1,Police Car,1973,421,19
        42010-1,Off-Road Racer,2013,1,159
        4201-1,Loader and Tipper,2012,56,138
        42011-1,Race Car,2013,1,157
        42020-1,Twin Rotor Helicopter,2014,1,145
        4202-1,Mining Truck,2012,52,269
        42021-1,Snowmobile,2014,1,185
        42022-1,Hot Rod,2014,1,413
        42023-1,Construction Crew,2014,1,833
        42024-1,Container Truck,2014,1,947
        42025-1,Cargo Plane,2014,6,1295
        42026-1,Black Champion Racer,2014,1,136
        42026-2,Black Champion Racer,2014,1,137
        42027-1,Desert Racer,2014,1,148
        42028-1,Bulldozer,2014,7,614
        42029-1,Customized Pick up Truck,2014,1,1062
        420-3,2 x 2 Bricks (The Building Toy),1966,371,100
        42030-1,Remote-Controlled Volvo L350F Wheel Loader,2014,7,1634
        4203-1,Excavator Transporter,2012,56,304
        42031-1,Cherry Picker,2015,15,155
        42032-1,Compact Tracked Loader,2015,7,251
        42033-1,Record Breaker,2015,12,124
        42034-1,Quad Bike,2015,11,148
        42035-1,Mining Truck,2015,7,361
        42036-1,Street Motorcycle,2015,13,374
        42037-1,Formula Off-Roader,2015,11,493
        42038-1,Arctic Truck,2015,11,912
        42039-1,24 Hours Race Car,2015,12,1218
        420-4,2 x 2 Bricks (System),1966,371,198
        42040-1,Fire Plane,2015,9,577
        4204-1,The Mine,2012,56,751
        42041-1,Race Truck,2015,12,608
        42042-1,Crawler Crane,2015,1,1399
        42043-1,Mercedes Benz Arocs 3245,2015,1,2792
        42044-1,Display Team Jet,2016,1,113
        42045-1,Hydroplane Racer,2016,1,179
        42046-1,Getaway Racer,2016,1,170
        42047-1,Police Interceptor,2016,1,185
        42048-1,Race Kart,2016,1,344
        42049-1,Mine Loader,2016,1,475
        42050-1,Drag Racer,2016,1,646
        4205-1,Off Road Command Center,2012,61,388
        42052-1,Heavy Lift Helicopter,2016,1,1041
        42053-1,Volvo EW 160E,2016,1,1166
        42054-1,Claas Xerion 5000 Trac VC,2016,1,1975
        42055-1,Bucket Wheel Excavator,2016,7,3928
        42056-1,Porsche 911 GT3 RS,2016,1,2704
        42057-1,Ultralight Helicopter,2017,1,199
        42058-1,Stunt Bike,2017,1,140
        42059-1,Stunt Truck,2017,1,141
        42060-1,Roadwork Crew,2017,1,364
        4206-1,9V Train Switching Track Collection,2006,244,28
        42061-1,Telehandler,2017,1,259
        4206-2,Recycling Truck,2012,63,296
        42062-1,Container Yard,2017,1,630
        42063-1,BMW R 1200 GS Adventure,2017,1,593
        42063-40,Technic 40 year anniversary model (42057 + 42061 + 42063),2017,1,568
        42064-1,Ocean Explorer,2017,1,1326
        42065-1,RC Tracked Racer,2017,1,369
        42066-1,Air Race Jet,2017,1,1150
        4207-1,City Garage,2012,63,932
        4207901-1,Star Wars MINI Bonus Pack,2003,159,4
        4208-1,4 × 4 Fire Truck,2012,58,242
        4209-1,Fire Plane,2012,58,507
        42-1,Motor Case / Lower Part,1977,443,1
        4210-1,Coast Guard Platform,2008,55,450
        421-1,1 x 2 Bricks,1966,371,176
        4211-1,Starter Set 100,1998,470,53
        421-2,2 eights 2 sixes 2 fours 8 twos 6 ones (The Building Toy),1966,371,20
        4212-1,Starter Set 200,1998,470,95
        4212838-1,LEGO Stores Easter Chick for 2004,2004,229,62
        4212847-1,LEGO Stores Easter Chick in egg for 2004,2004,229,99
        4212852-1,LEGO Stores Easter Opening Egg for 2004 - Blue,2004,229,178
        4213-1,Super Set 200,1998,470,519
        4214-1,Medium Bucket,1998,470,264
        4215-1,Starter Set 300,1998,470,264
        4216-1,Super Set 100,1998,470,509
        4217-1,Playdesk and Bricks,1998,470,215
        4219-1,Brick Pack 100,1998,470,288
        4220-1,Large Box of Bricks,1998,470,428
        4221-1,Challenger Set 100,1998,470,65
        4222-1,Challenger Set 300,1998,470,363
        4223-1,Challenger Set 400 with Motor,1999,470,548
        4224-1,Medium Bucket,1998,470,363
        4225-1,Challenger Set 350,1998,470,244
        4228383-1,Vakama Promotional Set (Woolworth's Exclusive),2003,356,3
        4229-1,Brick Pack 300,1998,470,812
        4232-1,Freestyle Set,1998,399,30
        423-3,Curved and Round Bricks (The Building Toy),1966,371,84
        4239-1,Freestyle Set,1998,399,38
        4243532-1,Stunt Pack,2004,119,35
        4243534-1,Racers Hazard Kit,2004,119,35
        4244-1,Large Bulk Bucket,1998,399,420
        425-1,Fork Lift,1976,416,21
        4254-1,Freestyle Playdesk,1998,399,309
        4258-1,Big Box Play Scape,1998,399,1009
        426-1,7 Named Beams (The Building Toy),1966,371,7
        4267-1,Large Bucket,1998,399,468
        427-1,8 Plates 2 x 8 (The Building Toy),1966,371,8
        4271-1,FreeStyle Box,1998,399,180
        4274-1,Freestyle Playdesk,1998,399,508
        4277206-1,Letters and Keyring,2005,500,72
        4277678-1,LEGO Games Knights Kingdom Chess,2005,502,184
        4278-1,Blue Tub,2003,37,1000
        4279-1,CREATOR Strata Red {Red Tub},2003,37,1002
        4280-1,Freestyle Trial Size,1998,399,39
        428-1,5 Plates 4 x 8 (The Building Toy),1966,371,5
        4281-1,Classic Trial Size,1999,470,25
        4282-1,Classic Trial Size,1999,470,37
        4283-1,Classic Trial Box,2000,470,53
        4284-1,Classic Trial Size,1999,470,123
        4285-1,Small Bucket,1999,470,256
        4285968-1,Transformation Kit Dirt Crusher (Red),2005,119,47
        4285969-1,Transformation Kit Dirt Crusher (Blue),2005,119,47
        4285970-1,Transformation Kit Dirt Crusher (Green),2005,119,47
        4286013-1,Big Wheels Pack Dirt Crusher (Red),2005,119,10
        4286024-1,Big Wheels Pack Dirt Crusher (Blue),2005,119,10
        4286025-1,Big Wheels Pack Dirt Crusher (Green),2005,119,10
        4286784-1,Dirt Crusher Gearbox with Light,2005,119,6
        4287082-1,Antenna Pack for Dirt Crusher,2005,119,10
        4287744-1,City Value Pack - 7241 7246 - shrinkwrapped Target Country in Australia,2005,52,0
        4288-1,Large Bucket,1999,470,404
        429-1,4 Plates 6 x 8 (The Building Toy),1966,371,4
        4291-1,Classic Build & Store Tub,1999,470,770
        4293-1,Classic Value Pack,1999,470,817
        4294-1,Helicopter ANA Promotional Set,2002,466,16
        4297-1,Lightning Streak,2002,113,19
        4298-1,Blue Power,2002,113,22
        4299-1,Nesquik Quicky Racer,2002,113,17
        4-3,Basic Set,1973,469,234
        4300-1,Green Racer,2003,113,21
        430-1,Biplane,1975,412,18
        4301-1,Blue Racer,2003,113,24
        430-2,Six Trees and Bushes (The Building Toy),1966,371,6
        4304-1,Chopper Cop,1998,100,24
        4305-1,Xcyber,1997,144,36
        4306-1,Rings,1980,404,15
        4308-1,Racing Car,2004,113,28
        4309-1,Blue Racer,2004,113,31
        4310-1,Orange Racer,2004,113,24
        431-1,Gas Station (The Building Toy),1966,371,13
        432-1,Road Signs (The Building Toy),1966,371,8
        433-1,6 Street Lamps with Curved Top (The Building Toy),1966,371,6
        4335-1,Black Robots Pod,2004,478,50
        4336-1,Picture Frame and Mirror,1980,279,48
        4337-1,Dragon Pod,2005,478,52
        4338-1,Monster Pod,2005,478,49
        4339-1,Aqua Pod,2005,478,56
        434-1,50 lettered bricks (The Building Toy),1966,371,50
        4346-1,Robo Pod,2004,478,50
        4346-2,Robo Pod (Polybag),2004,478,47
        4346-3,Robo Pod (Toy Fair Nuernberg Promotion),2004,478,50
        4347-1,Auto Pod,2004,478,40
        4347-2,Auto Pod (Polybag),2004,478,37
        4347-3,Auto Pod (Toy Fair Nuernberg Promotion),2004,478,40
        4348-1,Aero Pod,2004,478,36
        4348-2,Aero Pod (Polybag),2004,478,33
        4348-3,Aero Pod (Toy Fair Nuernberg Promotion),2004,478,36
        4349-1,Wild Pod,2004,478,44
        4349-2,Wild Pod (polybag),2004,478,41
        4349-3,Wild Pod (Toy Fair Nuernberg Promotion),2004,478,44
        435-1,Tipper Truck,1976,416,23
        435-2,Garage Plate and Door (The Building Toy),1966,371,3
        437-1,50 numbered bricks (The Building Toy),1966,371,50
        4-4,Large House Set,1970,433,218
        44000-1,Furno XL,2013,401,103
        4400-1,Creations and Bricks {Red Tub},2003,37,705
        44001-1,Pyrox,2013,403,50
        44002-1,Rocka,2013,401,43
        44003-1,Scarox,2013,403,46
        44004-1,Bulk,2013,401,50
        44005-1,Bruizer,2013,403,62
        44006-1,Breez,2013,401,49
        44007-1,Ogrum,2013,403,59
        44008-1,Surge,2013,401,66
        44009-1,Dragon Bolt,2013,403,151
        44010-1,Stormer,2013,401,69
        4401-1,Little Creations,2003,204,110
        44011-1,Frost Beast,2013,403,60
        44012-1,Evo,2013,401,51
        44013-1,Aquagon,2013,403,43
        44014-1,Jet Rocka,2013,401,289
        44015-1,EVO Walker,2014,400,50
        44016-1,JAW Beast vs. STORMER,2014,400,49
        44017-1,STORMER Freeze Machine,2014,400,87
        44018-1,FURNO Jet Machine,2014,400,78
        44019-1,ROCKA Stealth Machine,2014,400,88
        44020-1,FLYER Beast vs. BREEZ,2014,400,91
        4402-1,Sea Riders,2003,204,549
        44021-1,SPLITTER Beast vs. FURNO & EVO,2014,400,108
        44022-1,EVO XL Machine,2014,400,192
        44023-1,ROCKA Crawler,2014,401,49
        44024-1,TUNNELER Beast vs. SURGE,2014,400,59
        44025-1,BULK Drill Machine,2014,401,111
        44026-1,CRYSTAL Beast vs. BULK,2014,400,83
        44027-1,BREEZ Flea Machine,2014,401,101
        44028-1,SURGE & ROCKA Combat Machine,2014,401,187
        4403-1,Air Blazers,2003,204,705
        4404-1,Land Busters,2003,204,769
        4405-1,Large Creator Bucket,2003,37,1305
        4406-1,Buildings,2004,22,506
        4407-1,Transportation,2004,22,302
        4408-1,Animals,2004,22,202
        4410-1,Build and Create,2004,37,500
        4411-1,Blue Strata XXL,2004,37,1200
        4412-1,Einfallsreiches Bauen [Imaginative Building],2004,37,200
        4413-1,Arachno Pod,2005,478,57
        4414-1,LEGO Creator Bucket,2004,37,500
        4415-1,Auto Pod,2006,479,56
        4416-1,Robo Pod,2006,479,64
        4417-1,Aero Pod,2006,479,60
        4418-1,Dino Pod,2006,479,55
        442-1,Space Shuttle,1979,130,39
        4421-1,Box of Bricks,2005,48,1000
        4423-1,LEGO Creator Handy Box,2005,48,800
        4425-1,Better Building More Fun,2004,37,2000
        4427-1,Fire ATV,2012,58,50
        4428-10,"Advent Calendar 2012, City (Day  9) Mechanic with Wrench",2012,217,5
        4428-12,"Advent Calendar 2012, City (Day 11) Firefighter's ATV without Wheels",2012,217,13
        4428-14,"Advent Calendar 2012, City (Day 13) Desk with Computer and Chair",2012,217,8
        4428-16,"Advent Calendar 2012, City (Day 15) Wall with Safety Equipment",2012,217,16
        4428-18,"Advent Calendar 2012, City (Day 17) Catapult",2012,217,15
        4428-2,"Advent Calendar 2012, City (Day  1) Fireman with Loudhailer",2012,217,5
        4428-21,"Advent Calendar 2012, City (Day 20) Wheelbarrow with Spade and Snow",2012,217,7
        4428-23,"Advent Calendar 2012, City (Day 22) Santa's Sled",2012,217,8
        4428-25,"Advent Calendar 2012, City (Day 24) Santa on Snowmobile",2012,217,13
        4428-4,"Advent Calendar 2012, City (Day 3) Christmas Tree",2012,217,16
        4428-6,"Advent Calendar 2012, City (Day 5) Wall with Fireman Equipment",2012,217,17
        4428-8,"Advent Calendar 2012, City (Day 7) Toy Fire Engine with Remote",2012,217,17
        4429-1,Helicopter Rescue,2012,60,425
        442A-1,6 International Flags (The Building Toy),1971,371,6
        442B-1,6 International Flags (The Building Toy),1971,371,6
        4430-1,Mobile Fire Command Center,2012,58,520
        4431-1,Ambulance,2012,60,198
        4432-1,Garbage Truck,2012,63,207
        4433-1,Dirt Bike Transporter,2012,64,205
        4434-1,Tipper Truck,2012,56,221
        4435-1,Car and Caravan,2012,63,217
        4436-1,Patrol Car,2012,61,96
        4437-1,Police Pursuit,2012,61,129
        4438-1,Robbers' Hideout,2012,61,316
        4439-1,Heavy-Duty Helicopter,2012,61,392
        4440-1,Forest Police Station,2012,61,632
        4441-1,Police Dog Van,2012,61,312
        4442-1,Glider,2012,53,101
        4443-1,Coca-Cola Defender 1,2002,462,4
        4444-1,Coca-Cola Defender 2,2002,462,4
        4445-1,Coca-Cola Middle Fielder 1,2002,462,4
        4446-1,Coca-Cola Forward 1,2002,462,4
        4447-1,Coca-Cola Forward 2,2002,462,4
        4448-1,Coca-Cola Defender 3,2002,462,4
        4449-1,Coca-Cola Defender 4,2002,462,4
        4450-1,Coca-Cola Middle Fielder 2,2002,462,4
        445062-1,Star Wars Co-Pack of 4500 and 4504,2004,169,2
        445-1,Police Units,1976,421,49
        4451-1,Coca-Cola Forward 3,2002,462,4
        445-2,Lighting Device Pack (The Building Toy),1966,371,3
        4452-1,Coca-Cola Forward 4,2002,462,4
        4453-1,Coca-Cola Goal Keeper,2002,462,4
        4454-1,Coca-Cola Referee,2002,462,6
        4455-1,Coca-Cola Hotdog Girl,2002,462,6
        4456-1,Coca-Cola Doctor,2002,462,5
        4457-1,Coca-Cola TV Cameraman,2002,462,4
        4458-1,Coca-Cola TV Camera,2002,462,11
        4459-1,Coca-Cola PK Kicker,2002,462,4
        445A-1,Lighting Device Pack with Improved Plugs (The Building Toy),1970,371,8
        4460-1,Coca-Cola Goal,2002,462,7
        4461-1,Coca-Cola Bench,2002,462,7
        4462-1,Coca-Cola Hotdog Trolley,2002,462,18
        4463-1,Coca-Cola Light,2002,462,16
        4464-1,Coca-Cola Bottle Case,2002,462,7
        4465-1,Coca-Cola Vending Machine,2002,462,6
        4466-1,Coca-Cola Sign Board,2002,462,3
        4467-1,Coca-Cola Stretcher,2002,462,3
        4468-1,Coca-Cola Stand,2002,462,9
        4469-1,Coca-Cola Drink Stand,2002,462,8
        4470-1,Coca-Cola Ball,2002,462,2
        4471-1,Coca-Cola Secret A,2002,462,4
        4472-1,Coca-Cola Secret B,2002,462,4
        4473-1,Police Helicopter,2013,61,106
        4475-1,Jabba's Message,2003,169,46
        4476-1,Jabba's Prize,2003,169,40
        4477-1,T-16 Skyhopper,2003,169,98
        4478-2,Geonosian Fighter Blue Box,2004,167,153
        4479-1,TIE Bomber,2003,169,229
        4480-1,Jabba's Palace,2003,169,234
        4481-1,Hailfire Droid,2003,158,680
        4482-1,AT-TE,2003,167,650
        4483-2,"AT-AT, blue box",2004,169,1070
        4484-1,X-wing Fighter & TIE Advanced - Mini,2003,159,72
        4485-1,Sebulba's Podracer & Anakin's Podracer - Mini,2003,159,72
        4486-1,AT-ST & Snowspeeder - Mini,2003,159,76
        4487-1,Jedi Starfighter & Slave I - Mini,2003,159,53
        4488-1,Millennium Falcon - Mini,2003,159,87
        4489-1,AT-AT - Mini,2003,159,98
        4490-1,Republic Gunship - Mini,2003,159,102
        4491-1,Trade Federation MTT - Mini,2003,159,99
        4492-1,Imperial Star Destroyer - Mini,2004,159,87
        4493-1,Sith Infiltrator - Mini,2004,159,55
        4494-1,Imperial Shuttle - Mini,2004,159,82
        4495-1,AT-TE - Mini,2004,159,63
        4495173-1,LEGO Creative Building Set,2006,37,705
        4496-1,Fun with Building Tub,2004,37,1000
        4496-2,50th Anniversary Tub,2005,37,1000
        4496-3,Fun with Building Tub - Reissue,2006,37,798
        4497-1,Pretend and Create,2004,37,1000
        4499536-1,Offre Speciale 4 Boites (7236 7238 7235 7241),2007,52,0
        45000-1,Creative Builder,2013,507,120
        4500-1,Rebel Snowspeeder [Redesign] - Blue box,2003,169,216
        45001-1,Playground,2013,507,104
        45002-1,Tech Machines Set,2013,507,92
        45003-1,LEGO Soft Bricks Set,2013,526,84
        45007-1,Large Farm,2014,504,152
        450-1,Fork Lift,1973,416,42
        45011-1,Duplo World People,2015,504,16
        45020-1,Creative Lego Brick Set,2016,507,998
        4502-2,"X-wing Fighter (Dagobah), Original Trilogy Edition box",2004,169,565
        4504-2,"Millennium Falcon (Redesign), Original Trilogy Edition box",2003,169,979
        4505-1,Sea Machines,2004,204,168
        4506-1,Deep Sea Predators,2004,204,353
        4507-1,Prehistoric Creatures,2004,204,726
        4508-1,Titan XP,2004,204,784
        45100-1,Story Starter Core Set,2013,507,1145
        45103-1,StoryStarter Expansion Pack: Community,2015,507,200
        45110-1,BuildToExpress Set,2013,507,204
        4511-1,High Speed Train,2003,239,335
        45120-1,LearnToLearn Core set,2014,528,2016
        4512-1,Cargo Train,2003,239,546
        4513-1,Grand Central Station,2003,239,350
        4514-1,Cargo Crane,2003,239,176
        4515-1,Straight Rails,1991,244,8
        4518-1,Creator Set,2004,37,805
        4519-1,Rail Crossing,1999,244,1
        4520-1,Curved Rails,1991,244,8
        452-1,Mobile Ground Tracking Station,1979,130,79
        4521221-1,Gold chrome plated C-3PO,2007,501,3
        4524081-1,Mindstorms NXT CD,2007,258,0
        4524-1,Advent Calendar 2002 Creator,2002,214,24
        4524-10,Advent Calendar 2002 Creator (Day  9) Space Buggy,2002,223,18
        4524-11,Advent Calendar 2002 Creator (Day 10) Dinosaur,2002,223,8
        4524-12,Advent Calendar 2002 Creator (Day 11) Speedboat,2002,223,10
        4524-13,Advent Calendar 2002 Creator (Day 12) Reindeer,2002,223,10
        4524-14,Advent Calendar 2002 Creator (Day 13) Snowman,2002,223,15
        4524-15,Advent Calendar 2002 Creator (Day 14) Jet Ski,2002,223,11
        4524-16,Advent Calendar 2002 Creator (Day 15) Duck,2002,223,10
        4524-17,Advent Calendar 2002 Creator (Day 16) Police Boat,2002,223,9
        4524-18,Advent Calendar 2002 Creator (Day 17) Whale,2002,223,9
        4524-19,Advent Calendar 2002 Creator (Day 18) Space Shuttle,2002,223,11
        4524-2,Advent Calendar 2002 Creator (Day  1) Squirrel,2002,223,10
        4524-20,Advent Calendar 2002 Creator (Day 19) Parrot,2002,223,9
        4524-21,Advent Calendar 2002 Creator (Day 20) Steamship,2002,223,10
        4524-22,Advent Calendar 2002 Creator (Day 21) Building,2002,223,10
        4524-23,Advent Calendar 2002 Creator (Day 22) Helicopter,2002,223,11
        4524-24,Advent Calendar 2002 Creator (Day 23) Tree,2002,223,11
        4524-25,Advent Calendar 2002 Creator (Day 24) Present,2002,223,8
        4524-3,Advent Calendar 2002 Creator (Day  2) Boy,2002,223,1
        4524-4,Advent Calendar 2002 Creator (Day  3) Fireplace,2002,223,11
        4524-5,Advent Calendar 2002 Creator (Day  4) Santa,2002,223,10
        4524-6,Advent Calendar 2002 Creator (Day  5) Car,2002,223,15
        4524-7,Advent Calendar 2002 Creator (Day  6) Penguin,2002,223,10
        4524-8,Advent Calendar 2002 Creator (Day  7) Girl,2002,223,1
        4524-9,Advent Calendar 2002 Creator (Day  8) Dog with hat,2002,223,11
        4525-1,Road and Rail Repair,1994,236,84
        4526-1,Batman,2012,492,40
        4527-1,The Joker,2012,492,57
        4528-1,Green Lantern,2012,492,38
        4529-1,Iron Man,2012,492,44
        45300-1,WeDo Core Set,2016,521,279
        4530-1,The Hulk,2012,492,39
        45301-1,WeDo 2.0 Smart Hub,2016,521,1
        45302-1,WeDo 2.0 Smarthub Rechargeable Battery,2016,521,1
        45303-1,WeDo 2.0 Medium Motor,2016,521,1
        45304-1,WeDo 2.0 Motion Sensor,2016,521,1
        45305-1,WeDo 2.0 Tilt Sensor,2016,521,1
        453-1,Two Crater Plates,1979,143,2
        4531-1,Manual Points,1991,244,6
        4532-1,Manual Level Crossing,1996,236,135
        4533-1,Train Track Snow Remover,1999,236,57
        4534-1,LEGO Express,2002,238,34
        4535-1,LEGO Express Deluxe,2002,238,754
        4536-1,Blue Hopper Car,1991,236,165
        4537-1,Octan Twin Tank Rail Tanker,1993,236,173
        4538-1,Special Edition,2004,37,200
        4539-1,Manual Level Crossing,1991,236,115
        4540315-1,LEGO Creative Bucket (TRU Exclusive),2009,37,480
        454-1,Two Lunar Landing Plates,1979,143,2
        4541-1,Rail and Road Service Truck,1999,236,126
        4543-1,Railroad Tractor Flatbed,1991,236,179
        4544-1,Car Transport Wagon with Car,1994,236,142
        4546-1,Road and Rail Maintenance,1991,236,76
        4547-1,Club Car,1993,236,292
        4547551-1,Darth Vader 10 Year Anniversary Promotional Minifigure,2009,158,7
        4548-1,Transformer and Speed Regulator,1991,244,3
        4548431-1,Brick Tub 'Die Lego Show' - Limited Edition,2008,37,701
        4549-1,Container Double Stack,1993,236,450
        45500-1,EV3 Intelligent Brick,2013,262,1
        45501-1,EV3 Rechargeable DC Battery,2013,262,1
        45502-1,EV3 Large Servo Motor,2013,262,1
        45503-1,EV3 Medium Servo Motor,2013,262,1
        45504-1,EV3 Ultrasonic Sensor,2013,262,1
        45505-1,EV3 Gyro Sensor,2013,262,1
        45506-1,EV3 Color Sensor,2013,262,1
        45507-1,EV3 Touch Sensor,2013,262,1
        45508-1,EV3 Infrared Beacon,2013,262,1
        45509-1,EV3 Infrared Sensor,2013,262,1
        455-1,Lear Jet,1976,412,45
        4551-1,Crocodile Locomotive,1991,236,313
        45514-1,EV3 Cable Pack,2013,262,7
        45517-1,Transformer 10V DC,2016,518,1
        4552-1,Cargo Crane,1995,236,281
        4553-1,Train Wash,1999,236,189
        4554-1,Metro Station,1991,236,605
        45544-1,EV3 Core Set,2013,262,546
        4555-1,Cargo Station,1995,236,393
        45560-1,EV3 Expansion Set,2013,262,853
        4556-1,Train Station,1999,236,232
        45570-1,Space Challenge Set,2014,518,1368
        4557-1,Freight Loading Station,1999,236,215
        4558-1,Metroliner,1991,236,786
        4559-1,Cargo Railway,1996,236,845
        4559288-1,Power Miners Promotional Polybag,2009,439,4
        4559385-1,{Power Miners Promotional Polybag},2009,439,4
        4559387-1,{Power Miners Promotional Polybag},2009,439,4
        4560-1,Railway Express,1999,236,690
        456-1,Spirit of St. Louis,1977,412,49
        4561-1,Railway Express with Transformer and Speed Regulator,1999,236,673
        4562-1,Creator Box,2004,37,200
        4563-1,Load and Haul Railroad,1991,236,479
        4564-1,Freight Rail Runner,1994,236,590
        4565-1,Freight and Crane Railway,1996,236,915
        4566-1,Gear,2001,125,7
        4567-1,Surfer,2001,125,7
        4568-1,Loopin,2001,125,7
        4569-1,Warrior,2001,125,8
        4570-1,Shredd,2001,125,7
        4571-1,Spiky,2001,125,7
        4572-1,Scratch,2001,125,7
        4573-1,Lightor,2001,125,7
        4574-1,Rip,2001,125,7
        4575-1,Pulse,2001,125,7
        4576-1,Duster,2001,125,7
        4577-1,Snake,2001,125,7
        4578-1,Ghost,2001,125,7
        4579-1,Ice Ramp Racers,2001,125,112
        45800-1,FIRST LEGO League Challenge 2014 - World Class,2014,398,2098
        45801-1,Trash Trek  (FLL),2015,398,1992
        45802-1,Animal Allies,2016,398,2165
        4582-1,Red Bullet,2002,113,29
        4583-1,Maverick Storm,2002,113,31
        4584-1,Hot Scorcher,2002,113,58
        4585-1,Nitro Pulverizer,2002,113,61
        4586-1,Stunt Race Track,2002,121,168
        4586940-1,Basic Set Limited Edition,2010,37,480
        4587-1,Duel Racers,2002,113,193
        4588-1,Off Road Race Track,2002,121,364
        4589-1,RC-Nitro Flash,2002,117,135
        4590-1,Flash Turbo,2002,113,28
        4591-1,Star Burst/Star Strike,2002,113,28
        4591715-1,Golden Die [TRU Exclusive],2009,502,7
        4591726-1,Stormtrooper,2009,169,1
        4592-1,Red Monster,2002,113,25
        4593-1,Zero Hurricane & Red Blizzard,2002,113,74
        4594-1,Maverick Sprinter & Hot Arrow,2002,113,66
        4595-1,Zero Tornado & Hot Rock,2002,113,71
        4595400-1,Rocket Kit,2010,124,26
        4596-1,Storming Cobra,2002,113,76
        4597068-1,Boba Fett,2010,170,1
        4597-1,Captain America,2012,492,44
        4599605-1,Easter Chicks,2010,229,15
        4600-1,Police Cruiser,2001,281,23
        460-1,Rescue Units,1973,420,36
        4601-1,Fire Cruiser,2001,283,22
        4603-1,Res-Q Wrecker,2001,284,30
        4604-1,Police Copter,2001,281,16
        4605-1,Fire Response SUV,2001,283,30
        4606-1,Aqua Res-Q Transport,2001,284,40
        4607-1,Copter Transport,2001,284,66
        4608-1,Bank Breakout,2001,281,68
        4609-1,Fire Attack Team,2001,283,95
        4610-1,Aqua Res-Q Super Station,2001,284,92
        4611-1,Police HQ,2001,281,137
        4612-1,Super Glider,2002,282,7
        4613-1,Turbo Chopper,2002,282,13
        4613985-1,Build a Bullseye Target Gift Card Promotional,2010,227,32
        4614-1,Ultralight Flyer,2002,282,16
        4615-1,Red Recon Flyer,2002,282,21
        4616-1,Rapid Response Tanker,2002,285,35
        4617-1,Dual Turbo Prop,2002,282,32
        4618-1,Twin Rotor Cargo,2002,282,44
        4619-1,A.I.R. Patrol Jet,2002,282,65
        4620-1,A.I.R. Operations HQ,2002,282,174
        462-1,Mobile Rocket Launcher,1979,130,77
        4621-1,Jack Stone Red Flash Station,2002,283,32
        4622-1,Res-Q Digger,2002,284,67
        4623-1,DUPLO Pink Brick Box,2012,504,30
        4624-1,DUPLO Brick Box,2012,504,31
        4625-1,LEGO Pink Brick Box,2012,23,219
        4626-1,Farm Brick Box,2012,37,231
        4627-1,Fun With Bricks,2012,504,85
        4628-1,Fun with Bricks,2012,22,600
        4629-1,Build and Play Box,2012,504,149
        4630-1,Build and Play Box,2012,37,1000
        4631-1,My First Build,2012,504,61
        4632-1,Building Plates,2012,504,3
        4635-1,Fun with Vehicles,2012,22,525
        4636-1,Police Building Set,2012,22,130
        4636204-1,Ninjago Promotional Giveaway,2011,435,11
        4637-1,Safari Building Set,2012,22,152
        4641-1,Speed Boat,2011,59,34
        4642-1,Fishing Boat,2011,59,63
        4643-1,Power Boat Transporter,2011,59,245
        4644-1,Marina,2011,59,272
        4645-1,Harbor,2011,59,550
        4648933-1,Hero Factory Accessories,2011,400,6
        4648939-1,Golden Die with 1-6 dot tiles,2011,502,8
        4649858-1,Shadow ARF Trooper Promotional Polybag,2011,165,5
        4651-1,Police Motorcycle,2003,291,12
        4652-1,Tow Truck,2003,292,26
        4653-1,Dump Truck,2003,293,28
        4654-1,Tanker Truck,2003,294,43
        4655-1,Quick Fix Station,2003,294,103
        4657-1,Fire Squad HQ,2003,295,147
        4659018-1,Master Builder Academy: Kits 2-6 Subscription,2011,432,5
        4659-1,Duplo Garbage Truck,2005,504,13
        4659597-1,Friends - Bracelets,2012,501,4
        4659602-1,Display Stand,2012,494,17
        4659607-1,Hero Factory Booster Pack,2012,400,6
        4659612-1,Spinner Ring,2012,435,1
        4659758-1,Build a Bullseye 3 in 1 Target Gift Card Promotional,2011,227,50
        4660865-1,Target Lego Gift Card 2011 3 in 1 Set,2011,227,51
        4662-1,Duplo Post Office,2005,504,17
        4665-1,Big Farm,2005,504,69
        4666-1,Speedy Police Car,2003,291,25
        4667-1,Loadin' Digger,2003,293,30
        4668-1,Outrigger Construction Crane,2003,293,67
        4669-1,Turbo-Charged Police Boat,2003,291,54
        4677-1,Name Letter Pack,2004,301,67
        4679-1,Bricks and Creations Tub,2004,37,2
        4679-2,Bricks and Creations Tub - (TRU Exclusive),2005,37,2
        4679a-1,Bricks and Creations Tub (Bottom Tub and its contents only),2004,37,1000
        4679a-2,Bricks and Creations Tub - (TRU Exclusive) (Bottom Tub and its contents only),2005,37,1000
        4679b-2,Free 500 LEGO Bricks (Bonus box and its contents only),2005,48,500
        4695-1,Knight Bus - Mini,2004,246,58
        4696-1,Blue Bucket,2004,37,200
        4701-1,Sorting Hat,2001,251,50
        4702-1,The Final Challenge,2001,251,61
        4704-1,The Chamber of the Winged Keys,2001,251,180
        4705-1,Snape's Class,2001,251,167
        4706-1,Forbidden Corridor,2001,251,239
        4707-1,Hagrid's Hut,2001,251,298
        4708-1,Hogwarts Express,2001,246,412
        4709-1,Hogwarts Castle,2001,251,696
        471-1,Tiles (System),1966,371,156
        4711-1,Flying Lesson,2002,251,24
        4712-1,Troll on the Loose,2002,251,69
        4714-1,Gringott's Bank,2002,251,263
        471518-1,Happy The Cute Dolphin,2015,494,17
        471602-1,Pony Grooming Kit,2016,494,28
        4719-1,Quality Quidditch Supplies,2003,247,121
        4720-1,Knockturn Alley,2003,247,211
        4721-1,Hogwarts Classroom,2001,251,75
        4722-1,Gryffindor,2001,251,70
        4723-1,Diagon Alley Shops,2001,251,85
        4726-1,Quidditch Practice,2002,247,131
        4727-1,Aragog in the Dark Forest,2002,247,183
        4728-1,Escape from Privet Drive,2002,247,282
        4729-1,Dumbledore's Office,2002,247,451
        4730-1,Chamber of Secrets,2002,247,597
        4731-1,Dobby's Release,2002,247,71
        4733-1,The Dueling Club,2002,247,133
        4735-1,Slytherin,2002,247,93
        4736-1,Freeing Dobby,2010,246,73
        4737-1,Quidditch Match,2010,246,153
        4738-1,Hagrid's Hut (3rd edition),2010,246,442
        4741-1,Blacktron Super Vehicle (Value 3-Pack),1993,129,4
        4742-1,Chill Speeder,2004,306,57
        4743-1,Ice Blade,2004,306,103
        4744-1,Tundra Tracker,2004,306,140
        4745-1,Blue Eagle vs. Snow Crawler,2004,306,257
        4746-1,Mobile Command Center,2004,306,425
        4748-1,Ogel's Mountain Fortress,2004,306,413
        4750-1,Draco's Encounter with Buckbeak,2004,250,37
        4751-1,Harry and the Marauder's Map,2004,250,108
        4752-1,Professor Lupin's Classroom,2004,250,158
        4753-1,Sirius Black's Escape,2004,250,192
        4754-1,Hagrid's Hut (2nd edition),2004,250,296
        4755-1,Knight Bus,2004,250,244
        4756-1,Shrieking Shack,2004,250,450
        4757-1,Hogwarts Castle (2nd edition),2004,250,902
        4758-1,Hogwarts Express (2nd edition),2004,246,368
        4759-1,Three Christmas Decorations - Santa Tree and Snowman,2004,227,3
        4762-1,Rescue from the Merpeople,2005,248,177
        4766-1,Graveyard Duel,2005,248,551
        4767-1,Harry and the Hungarian Horntail,2005,248,265
        4768-1,The Durmstrang Ship,2005,248,552
        4768-2,The Durmstrang Ship with Bonus Mini - Figures (Target exclusive),2005,248,544
        4770-1,Blizzard Blaster,2004,306,303
        4774-1,Scorpion Orb Launcher,2004,306,223
        4778-1,Desert Biplane,2005,106,108
        4780-1,Box of Bricks,2005,48,500
        4781-1,Box of Bricks,2005,48,300
        4782-1,Box of Bricks,2005,48,200
        4782-2,Creator 200 Piece Box of Bricks - Individual Retail Version,2005,48,200
        4788-1,Ogel Mutant Ray,2002,305,68
        4789-1,Alpha Team Aquatic Mech,2002,305,166
        4790-1,Alpha Team Robot Diver,2002,305,32
        4791-1,Alpha Team Sub-Surface Scooter,2002,305,42
        4792-1,Alpha Team Navigator and ROV,2002,305,93
        4793-1,Ogel Sub Shark,2002,305,114
        4794-1,Alpha Team Command Sub,2002,305,188
        4795-1,Ogel Underwater Base and AT Sub,2002,305,478
        4796-1,Ogel Mutant Squid,2002,305,62
        4797-1,Ogel Mutant Killer Whale,2002,305,61
        4798-1,Evil Ogel Attack,2002,305,21
        4799-1,Ogel Drone Octopus,2002,305,18
        4800-1,Jet Sub,2002,305,23
        480-1,Rescue Helicopter,1975,417,62
        4801-1,Defense Archer,2000,197,15
        480-5,"Slopes and Slopes Double 2 x 4, Blue (The Building Toy)",1966,371,14
        4805-1,Ninja Knights,1999,434,31
        4806-1,Axe Cart,2000,197,28
        4807-1,Fire Attack,2000,197,24
        4810-1,Blue Creator Bucket,2001,37,256
        4811-1,Defense Archer,2000,197,15
        481-4,"Slopes and Slopes Double 2 x 3 an 2 x 1, Blue (The Building Toy)",1966,371,21
        481-6,"Slopes Regular, Double, Angle, Valley and Corner, Blue (System)",1966,371,34
        4816-1,Knight's Catapult,2000,197,50
        4817-1,Dungeon,2000,197,39
        4818-1,Dragon Rider,2000,197,15
        4819-1,Rebel Chariot,2000,197,49
        4820-1,Princess' Palace,2005,504,71
        482-4,"Slopes and Slopes Double 2 x 2, Blue (The Building Toy)",1966,371,22
        4828-1,LEGO Princess Royal Stables,2007,504,45
        483-1,Alpha-1 Rocket Base,1979,130,187
        483-5,"Angle, Valley and Corner Slopes, Blue (The Building Toy)",1966,371,20
        4837-1,Mini Trains,2008,22,73
        4838-1,Mini Vehicles,2008,22,79
        4840-1,The Burrow,2010,246,572
        4841-1,Hogwarts Express (3rd edition),2010,246,646
        4842-1,Hogwarts Castle [Fourth Edition],2010,246,1290
        4850-1,Spider-Man's First Chase,2003,488,190
        485-1,Fire Truck,1976,417,60
        4851-1,The Origins,2003,488,219
        485-2,Lighting Brick (System),1966,371,4
        4852-1,The Final Showdown,2003,488,359
        4853-1,Spider-Man's Street Chase,2004,488,81
        4854-1,Doc Ock's Bank Robbery,2004,488,173
        4855-1,Spider-Man's Train Rescue,2004,488,298
        4856-1,Doc Ock's Hideout,2004,488,485
        4857-1,Doc Ock's Fusion Lab,2004,488,237
        4858-1,Doc Ock's Crime Spree,2004,288,57
        4860-1,Doc Ock's Cafe Attack,2004,288,132
        4865-1,The Forbidden Forest,2011,246,64
        4866-1,The Knight Bus,2011,246,281
        4867-1,Hogwarts,2011,246,465
        4868-1,Rahaga Gaaki,2005,342,28
        4869-1,Rahaga Pouks,2005,342,28
        4870-1,Rahaga Kualus,2005,342,28
        487-1,Space Cruiser,1979,130,172
        487-2,1 x 1 Bricks with Numbers (System),1966,371,44
        4875-1,Groovy Friends Gems,2005,500,13
        4876-1,Fun Friends Hair Bands,2005,500,22
        4877-1,Rahaga Norik,2005,342,28
        4878-1,Rahaga Bomonga,2005,342,28
        4879-1,Rahaga Iruini,2005,342,28
        488-1,1 x 1 Bricks with Letters (System),1966,371,44
        4881-1,Robo Platoon,2005,204,219
        4882-1,Speed Wings,2004,204,162
        4882-2,Speed Wings - ANA version,2004,204,163
        4883-1,Gear Grinders,2005,204,279
        4884-1,Wild Hunters,2005,204,630
        4886-1,Building Bonanza,2004,205,667
        4888-1,Ocean Odyssey,2005,204,623
        489-1,Traffic Signs,1966,371,14
        4891-1,Highway Haulers,2006,38,210
        4892-1,Prehistoric Power,2006,40,380
        4893-1,Revvin' Riders,2006,41,362
        4894-1,Mythical Creatures,2006,40,588
        4895-1,Motion Power,2006,42,613
        4896-1,Roaring Roadsters,2006,38,931
        4897-1,Police Trike,2008,61,24
        4898-1,Coast Guard Boat,2008,55,35
        4899-1,Farmer & Tractor,2009,57,28
        4900-1,Fire Helicopter,2008,58,30
        490-1,Mobile Crane,1975,416,46
        490-2,Trees and Bushes,1966,371,9
        4903-1,Lion,2005,204,42
        4904-1,Elephant (Life cereal promotion),2005,204,34
        4905-1,Giraffe,2005,204,37
        4906-1,Helicopter,2005,24,16
        4910-1,Hover Scout,1999,442,40
        491-1,Formula 1 Racer,1977,397,67
        4911-1,Designer Set,2005,22,37
        4912-1,Police Jet Ski,2005,61,22
        4914-1,Fire Chief's Car,2005,58,31
        4915-1,Mini Construction,2007,26,68
        4915-1-b1,Loader Trailer,2007,26,0
        4915-1-b2,Fork Lift,2007,26,0
        4916-1,Mini Animals,2007,31,77
        4917-1,Mini Robots,2007,32,77
        4918-1,Mini Flyers,2007,24,76
        4919-1,Blue Tub,2005,37,1500
        4920-1,Rapid Rider,1999,442,39
        492-1,Truck & Payloader,1977,416,59
        492-2,Nordic and American Flags,1966,371,8
        4924-1,Advent Calendar 2004 Creator,2004,214,24
        4924-10,Advent Calendar 2004 Creator (Day  9) Skiing Elf,2004,223,16
        4924-11,Advent Calendar 2004 Creator (Day 10) Sledding Santa,2004,223,14
        4924-12,Advent Calendar 2004 Creator (Day 11) Goose,2004,223,14
        4924-13,Advent Calendar 2004 Creator (Day 12) Green Present,2004,223,7
        4924-14,Advent Calendar 2004 Creator (Day 13) Santa Ornament,2004,223,12
        4924-15,Advent Calendar 2004 Creator (Day 14) Helicopter,2004,223,13
        4924-16,Advent Calendar 2004 Creator (Day 15) Reindeer,2004,223,9
        4924-17,Advent Calendar 2004 Creator (Day 16) Elf Girl,2004,223,14
        4924-18,Advent Calendar 2004 Creator (Day 17) Speedboat,2004,223,13
        4924-19,Advent Calendar 2004 Creator (Day 18) Racing Car,2004,223,23
        4924-2,Advent Calendar 2004 Creator (Day 1) Elf Ornament,2004,223,15
        4924-20,Advent Calendar 2004 Creator (Day 19) Snowman,2004,223,13
        4924-21,Advent Calendar 2004 Creator (Day 20) Leaf Ornament,2004,223,18
        4924-22,Advent Calendar 2004 Creator (Day 21) Santa,2004,223,13
        4924-23,Advent Calendar 2004 Creator (Day 22) Sailing Ship,2004,223,16
        4924-24,Advent Calendar 2004 Creator (Day 23) Tree,2004,223,12
        4924-25,Advent Calendar 2004 Creator (Day 24) Air Boat,2004,223,9
        4924-3,Advent Calendar 2004 Creator (Day  2) Plane,2004,223,13
        4924-4,Advent Calendar 2004 Creator (Day  3) Parrot,2004,223,13
        4924-5,Advent Calendar 2004 Creator (Day  4) Robot,2004,223,19
        4924-6,Advent Calendar 2004 Creator (Day  5) Blue Present,2004,223,7
        4924-7,Advent Calendar 2004 Creator (Day  6) Ship,2004,223,19
        4924-8,Advent Calendar 2004 Creator (Day 7) Angel Ornament,2004,223,17
        4924-9,Advent Calendar 2004 Creator (Day  8) Van,2004,223,16
        4930-1,Rock Raiders,1999,442,48
        493-1,Space Command Center (Flatplate version),1979,130,193
        493-2,European Flags,1966,371,8
        493-3,Space Command Center (Craterplate version),1979,130,177
        4933-1,Street Sweeper,2007,63,14
        4936-1,Medic and Patient,2007,60,18
        4937-1,Life Guard - Quick Magic Box Promotional,2007,55,38
        4938-1,Fireman's Car,2007,58,28
        4939-1,Cool Cars,2007,38,206
        4940-1,Granite Grinder,1999,442,109
        4941-1,Plastic Figure - RASCUS (Nestle Promotional),2005,198,3
        4942-1,Plastic Figure - Dark Knight (Nestle Promotional),2005,198,3
        4943-1,Plastic Figure - Lord VLADEK (Nestle Promotional),2005,198,3
        4944-1,Plastic Figure - Sir JAYKO (Nestle Promotional),2005,198,3
        4945-1,Plastic Figure - Sir SANTIS (Nestle Promotional),2005,198,3
        4946-1,Plastic Figure - Sir DANJU (Nestle Promotional),2005,198,3
        4947-1,Yellow and Black Racer,2006,120,28
        4948-1,Black and Red Racer,2006,120,22
        4949-1,Blue and Yellow Racer,2006,120,24
        4950-1,Loader - Dozer,1999,442,90
        4953-1,Fast Flyers,2007,42,305
        4954-1,Model Town House,2007,43,1174
        4955-1,Big Rig,2007,39,550
        4956-1,House,2007,43,731
        4957-1,Ferris Wheel,2007,44,1066
        4958-1,Monster Dino,2007,40,792
        4959-1,The Loader-Dozer,1999,442,90
        4962-1,Baby Zoo,2006,504,21
        4963-1,Police Patrol,2006,504,5
        4966-1,Doll's House,2006,504,90
        4970-1,Chrome Crusher,1999,442,168
        497-1,Galaxy Explorer,1979,130,342
        4980-1,Tunnel Transport,1999,442,351
        4981-1,The Chum Bucket,2007,272,336
        4982-1,Mrs. Puff's Boating School,2007,272,394
        4986-1,Duplo Digger,2007,504,19
        4987-1,Gravel Pit,2007,504,40
        4990-1,Rock Raiders HQ,1999,442,414
        4991-1,Police Helicopter,2007,61,26
        4992-1,Fire Boat,2007,58,23
        4993-1,Cool Convertible,2008,39,648
        4994-1,Fierce Creatures,2008,40,193
        4995-1,Cargo Copter,2008,45,272
        4996-1,Beach House,2008,43,522
        4997-1,Transport Ferry,2008,46,1279
        4998-1,Stegosaurus,2008,40,730
        4999-1,Vestas Windmill,2008,50,809
        5000021-1,Pirates of the Caribbean Classic Collection,2011,263,2
        5000022-1,Hulk,2012,487,4
        5000027-1,Pirates of the Caribbean 4 Collection,2011,263,2
        5000030-1,Booster Pack Kendo Jay,2012,435,31
        5000062-1,Darth Maul,2012,178,3
        5000063-1,TC-14,2012,178,3
        5000067-1,Star Wars Sith Kit,2011,158,2
        5000068-1,Harry Potter Classic Kit,2011,246,3
        5000-1,Replacement 4.5V Motor,1987,443,1
        5000143-1,Star Wars with Boba Fett Minifigure Watch,2011,501,0
        5000196304-1,The Hobbit - The Battle of the Five Armies (Blu-ray with Minifigures),2015,565,7
        5000202-1,Elrond,2012,566,6
        5000214-1,Star Wars Character Encyclopedia,2011,497,4
        5000215-1,Harry Potter: Building the Magical World,2011,497,4
        5000245-1,Stephanie,2012,494,5
        5000249-1,LEGO® Star Wars™ Boba Fett™ Minifigure Clock,2012,501,0
        5000281-1,Chase McCain,2012,61,4
        50003-1,Batman,2013,502,252
        50004-1,Story Mixer,2013,502,425
        5000437-1,Vintage Minifigure Collection Vol. 1 - 2012 Edition,2012,535,21
        5000438-1,Vintage Minifigure Collection Vol. 2 - 2012 Edition,2012,535,22
        5000439-1,Vintage Minifigure Collection Vol. 3 - 2012 Edition,2012,535,19
        5000440-1,Vintage Minifigure Collection Vol. 4 - 2012 Edition,2012,535,25
        5000463-1,8 stud Red Storage Brick,2014,501,0
        50006-1,Legends Of Chima,2013,502,211
        5000642-1,Star Wars poster,2012,501,0
        5000644-1,Monster Fighters Promotional Pack,2012,558,11
        5000646-1,City poster,2012,501,0
        5000672-1,The LEGO® Ideas Book,2011,497,0
        5000728-1,DC Universe Super Heroes Collection,2012,492,3
        5001096-1,Batman™ 2: DC Super Heroes - Xbox 360,2012,501,0
        5001-1,Wheel Bushes for 4.5V Basic Motor,1987,443,4
        50011-1,The Battle for Helms Deep,2013,502,338
        5001121-1,BR LEGO Minifigure,2013,301,5
        5001130-1,The Battle of Helm's Deep Collection,2012,568,2
        5001132-1,The Lord of the Rings Collection,2012,566,7
        5001133-1,Monster Fighters Collection,2012,558,7
        5001134-1,Mining Collection,2012,56,5
        5001136-1,Buildable Galaxy Collection,2012,176,3
        5001137-1,Battle Pack Collection,2012,158,2
        5001159-1,Darth Vader Light Key Chain,2012,503,0
        5001160-1,Stormtrooper Light Key Chain,2012,503,0
        5001252-1,2013 Calendar,2012,501,0
        5001266-1,8 stud Blue Storage Brick,2014,501,0
        5001267-1,8 stud Yellow Storage Brick,2014,501,0
        5001270-1,MBA Kits 2 - 3,2012,432,2
        5001273-1,MBA Kits 4 - 6,2012,432,3
        5001307-1,Buildable Galaxy Collection II,2012,177,3
        5001308-1,The Old Republic Collection,2012,158,2
        5001309-1,Return of the Jedi Collection,2012,158,2
        5001357-1,Ninjago Kendo Cole Kids' Watch,2012,501,0
        5001370-1,LEGO® Time-Teacher Minifigure Watch & Clock,2012,501,0
        5001371-1,LEGO® Time-Teacher Girl Minifigure Watch & Clock,2012,501,0
        5001377-1,Lunch Box,2012,501,0
        5001380-1,Mini box pink,2012,501,0
        5001382-1,Mini box red,2012,501,0
        5001383-1,4-stud Blue Storage Brick,2012,501,0
        5001384-1,4-stud Green Storage Brick,2012,501,0
        5001385-1,4-stud Red Storage Brick,2012,501,0
        5001386-1,8-stud Blue Storage Brick,2012,501,0
        5001387-1,8-stud Green Storage Brick,2012,501,0
        5001388-1,Red Storage Brick,2012,501,0
        5001621-1,Han Solo (Hoth),2013,158,2
        5001622-1,LEGO Store Employee,2013,408,5
        5001623-1,Jor-El,2013,489,5
        5001709-1,Clone Trooper Lieutenant,2013,165,4
        5001925-1,Horizon Express Kit,2013,240,7
        5002041-1,The LEGO Movie Accessory Pack,2014,578,50
        5002045-1,Pyjamas Emmet,2014,578,4
        5002-1,Rubber Chain Tracks,1987,443,2
        5002112-1,Bracelets,2014,494,18
        5002113-1,Beach Hammock,2014,494,23
        5002122-1,TC-4,2014,178,3
        5002123-1,Darth Revan,2014,158,7
        5002125-1,Electro,2015,488,5
        5002126-1,Martian Manhunter,2014,486,4
        5002127-1,Flashback Shredder,2014,570,6
        5002136-1,Arctic Accessory Set,2014,65,25
        5002145-1,Rocket Raccoon,2014,483,12
        5002146-1,Minifigure Collection 2013 Vol 1 of 3,2013,535,6
        5002201-1,Friends Brick Light (Pink),2013,501,0
        5002203-1,Radio DJ Robot,2014,578,4
        5002204-1,Western Emmet,2014,578,6
        5002207-1,LEGO® Classic Minifigure Link Watch,2013,501,0
        5002210-1,C-3PO and R2-D2 Minifigure Watch,2013,501,0
        5002212-1,LEGO® Star Wars™ Chewbacca™ Minifigure Watch,2013,501,0
        5002422-1,The Joker Minifigure Clock,2013,501,0
        5002423-1,LEGO® DC Universe Super Heroes Batman™ Minifigure Clock,2013,501,0
        5002424-1,LEGO® DC Universe Super Heroes Superman™ Minifigure Clock,2013,501,0
        5002467-1,Friends 2x4 Key Light,2013,503,0
        5002506-1,LEGO® Minifigures: Character Encyclopedia,2013,497,0
        5002518-1,LEGO® Belkin Brand iPhone 5 Case Pink/Violet,2013,501,0
        5002773-1,Lego Brickmaster - The Quest for CHI,2013,497,187
        5002780-1,LEGO® Play Book,2013,497,0
        5002792-1,LEGO® Marvel Super Heroes PC DVD Video Game,2013,502,0
        5002793-1,LEGO® Marvel Super Heroes PS VITA Video Game,2013,502,0
        5002812-1,D2C Minifigure Retro Set 2014,2014,126,18
        5002813-1,Train Ornament,2014,228,25
        5002887-1,The LEGO® Book,2009,497,0
        5002888-1,The LEGO® Minifigure: Year by Year,2013,497,0
        5002914-1,THE LEGO® MOVIE™ Emmet Key Light,2014,503,0
        5002915-1,Batman Key Light,2014,503,0
        5002916-1,THE LEGO® MOVIE™ Unikitty Key Light,2014,503,0
        5002919-1, Scenery and Dagger Trap polybag,2015,435,25
        5002928-1,Party Polybag,2015,494,11
        5002929-1,Friends Interior Design Kit,2015,494,28
        5002930-1,Hair Accessories,2015,494,6
        5002931-1,Disco Dance Floor,2015,494,26
        5002938-1,Stormtrooper Sergeant,2015,158,6
        5002939-1,The Phantom,2015,182,23
        5002941-1,Bionicle Hero Pack,2015,324,6
        5002942-1,Bionicle Villain Pack,2015,324,10
        5002943-1,Winter Soldier,2015,487,1
        5002946-1,Silver Centurion,2016,487,0
        5002947-1,Admiral Yularen,2015,158,4
        5003022-1,THE LEGO® MOVIE™ Bad Cop Minifigure Alarm Clock,2014,501,0
        5003023-1,THE LEGO® MOVIE™ Bad Cop Minifigure Link Watch,2014,501,0
        5003024-1,THE LEGO® MOVIE™ Lucy/Wyldstyle Minifigure Link Watch,2014,501,0
        5003025-1,THE LEGO® MOVIE™ Emmet Minifigure Link Watch,2014,501,0
        5003026-1,THE LEGO® MOVIE™ Lucy/Wyldstyle Minifigure Alarm Clock,2014,501,0
        5003027-1,THE LEGO® MOVIE™ Emmet Minifigure Alarm Clock,2014,501,0
        5003082-1,Pirates Adventure,2015,154,28
        5003083-1,Christmas Tree Ornament,2015,598,31
        5003084-1,The Hulk,2015,487,14
        5003096-1,LEGO® City Fire Collection: 60004 and 850618,2014,58,2
        5003246-1,EV3 Track Rubber Elements,2015,507,30
        5003545-1,THE LEGO® MOVIE™ PS4 Video Game,2014,502,0
        5003559-1,THE LEGO® MOVIE™ Xbox One Video Game,2014,502,0
        5003561-1,Legends of Chima Lunch Set,2014,501,0
        5003562-1,Legends of Chima Sorting System,2014,501,0
        5003563-1,Friends Lunch Set,2014,501,0
        5003564-1,Friends Sorting System,2014,501,0
        5003565-1, 1 stud Blue Storage Brick,2014,501,0
        5003566-1,1 stud Red Storage Brick,2014,501,0
        5003568-1,2 stud Blue Storage Brick,2014,501,0
        5003569-1,2 stud Red Storage Brick,2014,501,0
        5003570-1,2 stud Yellow Storage Brick,2014,501,0
        5003574-1,4 stud Blue Storage Brick,2014,501,0
        5003575-1,4 stud Red Storage Brick,2014,501,0
        5003576-1,4 stud Yellow Storage Brick,2014,501,0
        5003578-1,Legends of Chima The Lion the Crocodile and the Power of CHI!,2014,501,0
        5003579-1,Batman Head Lamp,2014,501,0
        5003580-1,Catwoman Key Light,2014,503,0
        5003582-1,Superman Head Lamp,2014,501,0
        5003583-1,LEGO® Star Wars™ Darth Vader™ Head Lamp,2014,501,0
        5003584-1,Bad Cop Key Light,2014,503,0
        5003586-1,THE LEGO MOVIE President Business Key Light,2014,503,0
        5004064-1,LEGO® Super Heroes DC Universe™ Batman™ Minifigure Link Watch,2014,501,0
        5004065-1,LEGO® Super Heroes DC Universe™ Superman™ Minifigure Link Watch,2014,501,0
        5004066-1,The LEGO Movie The Original Motion Picture Soundtrack,2014,501,0
        5004067-1,The LEGO Movie Lunch Set,2014,501,0
        5004076-1,Minifigure Gift Set (Target Exclusive),2014,598,20
        5004077-1,2015 Target Minifigure Gift Set,2015,598,5
        5004-1,Keys for Windup Motor,1987,443,2
        5004102-1,THE LEGO® MOVIE™ The Essential Guide,2014,497,0
        5004103-1,LEGO® Brickmaster: Star Wars™ Crystal,2013,497,1
        5004115-1,LEGO® Brick Black Adult Watch,2014,501,0
        5004116-1,LEGO® Friends Stephanie Watch with Mini-Doll,2014,501,0
        5004117-1,LEGO® Multi-stud Red Adult Tachymeter Watch,2014,501,0
        5004118-1,LEGO® NINJAGO™ Kai Minifigure Clock,2014,501,0
        5004119-1,LEGO® Brick White Adult Watch,2014,501,0
        5004120-1,LEGO® Star Wars™: The Yoda Chronicles,2014,501,4
        5004127-1,LEGO® NINJAGO™ Kai Minifigure Link Watch,2014,501,0
        5004128-1,LEGO® Happiness Yellow Adult Watch,2014,501,0
        5004129-1,LEGO® NINJAGO™ Zane Minifigure Clock,2014,501,0
        5004130-1,LEGO® Friends Olivia Watch with Mini-Doll,2014,501,0
        5004131-1,LEGO® NINJAGO™ Zane Minifigure Link Watch,2014,501,0
        5004195-1,LEGO® Star Wars™: The Visual Dictionary (Updated and Expanded),2014,497,4
        5004196-1,LEGO® Star Wars™: Choose Your Side! Ultimate Sticker Collection,2014,501,0
        5004197-1,Friends Character Encyclopedia,2014,497,6
        5004237-1,THE LEGO® MOVIE™: Blu-ray Combo Pack (Blu-ray + DVD + UltraViolet Digital HD),2014,501,0
        5004238-1,THE LEGO MOVIE Everything Is Awesome Edition,2014,501,6
        5004248-1,LEGO® Friends Andrea Key Light,2014,503,0
        5004249-1,LEGO® Friends Emma Key Light,2014,503,0
        5004250-1,LEGO® Friends Mia Key Light,2014,503,0
        5004251-1,LEGO® Friends Olivia Key Light,2014,503,0
        5004252-1,LEGO® Friends Stephanie Key Light,2014,503,0
        5004259-1,Holiday Ornament Collection,2014,228,6
        5004261-1,"The Hobbit Ultimate Kit (79015, 79016, 79017, 79018)",2014,565,4
        5004262-1,LEGO 1x2 Brick Key Light (Blue),2014,503,0
        5004263-1,LEGO 1x2 Brick Key Light (Green),2014,503,0
        5004264-1,LEGO 1x2 Brick Key Light (Red),2014,503,0
        5004266-1,LEGO Mini Box (Yellow),2014,501,0
        5004267-1,LEGO 1 stud Red Storage Brick,2014,501,0
        5004268-1,LEGO 1 stud Blue Storage Brick,2014,501,0
        5004273-1,LEGO Friends Storage Brick 2 Bright Purple,2014,501,0
        5004274-1,LEGO Friends Storage Brick 1 - Medium Lilac,2014,501,0
        5004279-1,LEGO® 2-stud Red Storage Brick,2015,501,0
        5004280-1,LEGO 2 stud Blue Storage Brick,2014,501,0
        5004281-1,Angry Kitty Key Light,2014,503,0
        5004282-1,THE LEGO MOVIE Astro Kitty Key Light,2014,503,0
        5004283-1,Bizniz Kitty Key Light,2014,503,0
        5004284-1,THE LEGO® MOVIE™ Queasy Kitty Key Light,2014,503,0
        5004363-1,Brick USB Flash Drive,2015,501,0
        5004388-1,Nexo Knights Intro Pack,2016,605,6
        5004389-1,Battle Station,2016,605,8
        5004404-1,Police Chase,2016,52,36
        5004406-1,First Order General,2016,184,4
        5004408-1,Rebel A-wing Pilot,2016,182,5
        5004409-1,Bionicle 2016 Accessory Pack,2016,324,5
        5004419-1,Classic Knights Minifigure,2016,409,45
        5004420-1,Toy Soldier,2016,227,34
        5004468-1,Easter Minifigure,2016,229,4
        5004549-1,LEGO MIXEL COLLECTION 4,2015,584,9
        5004550-1,Speed Champions Collection,2015,601,4
        5004551-1,LEGO® MIXELS™ Glowkies,2015,584,3
        5004552-1,Super Heroes Avengers Collection,2015,487,6
        5004553-1,LEGO MIXELS INFERNITES,2015,584,3
        5004554-1,Ultra Agents Collection,2015,303,2
        5004556-1,LEGO® MIXELS™ Orbitons,2015,584,3
        5004557-1,Pirates Collection,2015,154,2
        5004558-1,Pirates Collection 2,2015,154,2
        5004559-1,Speed Champions Collection 2,2015,601,2
        5004590-1,Bat Pod,2015,484,338
        5004600-1,Wonder Woman Minifigure Alarm,2015,501,0
        5004601-1,Wonder Woman Watch,2015,501,0
        5004602-1,Batman Minifigure Link Watch,2015,501,0
        5004603-1,Superman Minifigure Link Watch,2015,501,0
        5004604-1,Classic Minifigure Link Watch,2015,501,0
        5004605-1,Boba Fett Minifigure Watch,2015,501,0
        5004606-1,Darth Maul Watch,2015,501,0
        5004607-1,Darth Vader Watch,2015,501,0
        5004608-1,Luke Skywalker Watch,2015,501,0
        5004609-1,Stormtrooper Watch,2015,501,0
        5004610-1,Yoda Watch,2015,501,0
        5004611-1,Emmet Minifigure Watch,2015,501,0
        5004612-1,Lucy Wyldstyle Minifigure Link Watch,2016,501,0
        5004750-1,Kai Key Light,2015,503,0
        5004751-1,Wonder Woman Key Light,2015,503,0
        5004752-1,Boba Fett Key Light,2015,503,0
        5004796-1,Jay Key Light,2015,503,0
        5004798-1,LEGO Star Wars: The Dark Side,2014,497,4
        5004799-1,LEGO® Architecture: The Visual Guide,2014,497,0
        5004838-1,WeDo 2.0 Add-On Power Pack,2016,521,2
        5004853-1,LEGO Star Wars Character Encyclopedia: Updated and Expanded,2015,497,6
        5004854-1,LEGO® Star Wars in 100 scenes,2015,497,0
        5004868-1,LEGO® Mixels™ Munchos,2015,586,3
        5004869-1,LEGO® Mixels™ Glorp Corp,2015,586,3
        5004870-1,LEGO® Mixels™ Weldos,2015,586,4
        5004932,LEGO My Travel Companion,2017,599,36
        5005-1,Battery Box 4.5V,1987,443,1
        5006-1,Replacement 2-Piece Battery Motor Housing,1987,443,2
        5007-1,Basic Motor 4.5V,1987,443,1
        5008-1,Brick Separator,1990,443,1
        50-1,Universal Building Set,1976,469,390
        5011-1,9V Basic Motor,1992,443,1
        5012-1,Soccer Player with Goal,2003,462,11
        501-3,JUMBO Pull Toy,1966,369,9
        5013-1,Basketball,2003,459,25
        5014-1,Slammer,2003,461,28
        5015-1,Skateboard Bill,2003,460,17
        5016-1,Basketball Promotional Set,2003,459,17
        5017-1,Hockey Promotional Set,2003,461,36
        5018-1,Gravity Games Promotional Set,2003,460,17
        502-2,Pre-School Medium Set,1968,369,8
        5030-1,Signs for Use with Lighting Bricks 9V,1992,443,16
        503-1,Basic Building Set,1987,467,39
        503-2,Pre-School Large Set,1968,369,16
        5032-1,Jack,1987,443,1
        5033-1,1x4 Lighing Brick and 4 Colour Globes,1987,443,5
        5034-1,1x2 Lighting Brick and 4 Colour Globes,1987,443,5
        5036-1,"Space Siren, 2 x 2",1987,443,1
        5037-1,Current Carrying Plates,1988,443,9
        5038-1,9V Battery Box,1988,443,1
        5039-1,Monorail Stop / Reverse Switch,1987,443,3
        5040-1,Monorail 9V Motor,1988,443,1
        504-1,Basic Building Set,1985,467,41
        5041-1,Wire for 9V (9cm),1988,453,1
        5043-1,"Mini Antennas, Control Sticks and Antennas",1991,443,26
        5045-1,"Magnets, Magnet Holders",1991,443,12
        5047-1,"Hinges, Couplings, Turntables",1993,443,30
        5048-1,Town Accessories,1993,454,36
        5049-1,Transparent Windows and Bricks,1993,443,8
        5050-1,Plane Accessories,1993,443,27
        5052-1,"Antennas, Control Sticks",1993,443,39
        5054-1,Decorated Elements,1993,443,28
        5055-1,Magnets and Magnet Holders,1993,443,12
        5056-1,Space Elements,1993,452,37
        5057-1,Space Accessories,1993,452,27
        5058-1,Pirate Accessories,1993,449,32
        5059-1,Castle Equipment,1993,447,34
        5060-1,Cannons,1993,443,16
        5062-1,Shunting Trip Posts and Signal,1987,456,4
        5063-1,Power Supply Rail,1987,456,1
        5064-1,Locomotive Wheels,1987,456,8
        5065-1,3m Wiring and Two-Way Plug,1987,443,11
        5066-1,Magnetic Train Coupler,1987,456,6
        5068-1,Motor Frame and Coupling,1987,456,5
        5069-1,12V Lighting Bricks,1987,443,2
        507-1,Basic Building Set,1987,467,60
        5072-1,"Wagonplate, 6 x 28 Studs",1987,456,1
        5073-1,Light Transmitting Elements for Train Sets,1987,456,7
        5075-1,"Battery Tender, Red",1987,456,2
        5076-1,Plates 2 x 8,1989,443,8
        5077-1,Sliding Gates and Rails,1987,443,6
        5078-1,Crane Accessories,1993,443,15
        5079-1,Change-Over Unit,1989,456,1
        50799-1,Knights' Kingdom Adventure Box,2005,198,3
        5080-1,Remote Control for Switch,1989,456,1
        508-1,Basic Building Set,1985,467,66
        5081-1,Remote Control for Signal,1989,456,1
        5082-1,Flash Light Unit,1989,456,1
        5083-1,Remote Control for Crossing,1989,456,1
        5084-1,12V Light Brick,1989,443,1
        5085-1,Power Supply Rail with Socket,1989,456,1
        5086-1,12V Motor (old),1993,443,1
        509-1,38 Slimbricks Assorted Sizes,1965,371,228
        5099-1,Pneumatic Valves,1991,453,1
        5100-1,TECHNIC Battery Box,1987,453,1
        510-1,Basic Building Set,1985,467,102
        5101-1,4.5v TECHNIC Motor,1987,453,1
        510-2,Tiles,1965,371,156
        5103-1,"Pneumatic Spring Cylinder, 48 mm",1987,453,1
        5105-1,"Pneumatic Cylinder, 64 mm",1987,453,1
        5106-1,Two-Way Valve and Non-Return Valve,1987,453,2
        5107-1,Pneumatic Pump 2 Cylinder,1991,453,1
        5108-1,Pneumatic Piston 2 Cylinder,1989,453,1
        5109-1,Pneumatic Tubes and Pieces,1989,453,6
        5110-1,Pneumatic Value Pack,1990,453,4
        5111-1,"9V Motor Wire, 128cm",1990,453,1
        5113-1,TECHNIC Airscrew,1987,453,1
        5114-1,Extra 9 Volt Motor,1991,453,1
        5115-1,9V Battery Box,1992,453,1
        5116-1,Pneumatic Cylinder 1.25,1997,453,1
        5117-1,Compressor Pump,1997,453,7
        5118-1,TECHNIC Cables,1995,453,35
        5119-1,Micro Motor,1996,453,4
        5120-1,Polarity Switch,1993,453,2
        5121-1,Decorated Elements,1994,443,30
        5122-1,Pirate Accessories,1994,449,29
        5124-1,Wheels and Bearings,1994,443,28
        5125-1,Spaceport Accessories,1995,454,35
        5126-1,Crane and Digger Accessories,1995,443,18
        5127-1,Antennas and Control Sticks,1995,443,37
        5129-1,Space Accessories,1996,452,22
        5131-1,"Hinges, Couplings, Turntables",1996,443,30
        5133-1,Town Accessories,1996,454,47
        5134-1,Cannons and Wheels,1995,443,28
        5135-1,Castle Accessories,1995,447,34
        5136-1,Belville Accessories,1995,446,10
        5137-1,Town Accessories,1994,454,44
        5138-1,Castle Accessories,1994,447,39
        5139-1,Cannons with Wheels,1994,443,28
        5141-1,"Bricks, Blue",1987,443,62
        5143-1,"Bricks, Yellow",1987,443,62
        5145-1,"Bricks, Gray",1987,443,62
        5147-1,"Plates, Red",1987,443,42
        5148-1,Wheels,1987,443,40
        5149-1,Doors and Windows,1987,443,38
        5150-1,Pirate Elements,1990,449,35
        515-1,Basic Building Set,1990,467,115
        5152-1,"Roof Bricks, Red, 25 Degrees",1987,443,60
        5153-1,Plane Accessories,1991,443,23
        5154-1,Decorated Elements,1991,443,26
        5155-1,Space Jets and Wings,1991,443,19
        5156-1,Transparent Bricks,1991,443,17
        5157-1,Town and Space Equipment,1991,443,32
        5159-1,Straight Runways,1990,454,2
        5160-1,Aquazone Accessories,1995,445,21
        5161-1,Inverted Slope Bricks,1987,443,16
        5162-1,Fences and Gates,1987,443,10
        5164-1,"Hinges, Turntables and Couplings",1991,443,20
        5166-1,"Lampholders, Plates with Holder",1991,443,18
        5168-1,Digger Bucket Assembly,1987,443,4
        5169-1,Crane Set Assembly,1987,443,7
        517-1,Basic Building Set,1987,467,123
        5171-1,Decorated Elements,1987,443,28
        5172-1,Rocket Stages,1987,443,30
        5173-1,Space Jet & Wings,1987,452,19
        5174-1,Wheels and Bearings,1987,443,28
        5175-1,Space Elements,1987,452,26
        5176-1,Transparent Bricks,1987,443,19
        5177-1,Town and Space Accessories,1987,443,35
        5178-1,Plane Accessories,1987,443,23
        5179-1,Hinges and Couplings,1987,443,26
        518-1,2 x 4 Plates (cardboard box version),1962,371,192
        518-10,2 x 4 Plates - Blue (architectural hobby und modelbau version),1962,252,26
        518-11,2 x 4 Plates - Light Gray (architectural hobby und modelbau version),1962,252,26
        518-12,2 x 4 Plates - Red (architectural hobby und modelbau version),1962,252,26
        518-13,2 x 4 Plates - Trans-Clear (architectural hobby und modelbau version),1962,252,26
        518-14,2 x 4 Plates - White (architectural hobby und modelbau version),1962,252,26
        518-15,2 x 4 Plates - Yellow (architectural hobby und modelbau version),1962,252,26
        5182-1,Hinges and Couplings,1989,443,19
        5183-1,Hinges and Couplings,1989,443,32
        5184-1,Castle Equipment,1989,447,38
        5185-1,Dustbins with Lids,1989,443,8
        5186-1,Fence,1989,443,10
        5187-1,Bricks with Groove and Garage Panels,1989,443,26
        518-9,2 x 4 Plates - Black (architectural hobby und modelbau version),1962,252,26
        5189-1,Ladder (Black and Grey),1989,443,16
        5190-1,Seats and Windscreens,1989,443,7
        519-1,2 x 3 Plates (cardboard box version),1962,371,240
        519-10,2 x 3 Plates - Blue (architectural hobby und modelbau version),1962,252,32
        519-11,2 x 3 Plates - Light Gray (architectural hobby und modelbau version),1962,252,32
        5191-1,Balloon Tires,1989,443,4
        519-12,2 x 3 Plates - Red (architectural hobby und modelbau version),1962,252,32
        519-13,2 x 3 Plates - Trans-Clear (architectural hobby und modelbau version),1962,252,32
        519-14,2 x 3 Plates - White (architectural hobby und modelbau version),1962,252,32
        519-15,2 x 3 Plates - Yellow (architectural hobby und modelbau version),1962,252,32
        5192-1,Cypress Trees,1989,443,2
        5193-1,Sloping Frames,1989,443,6
        5195-1,Assorted Arches,1989,443,6
        5197-1,"Lampholders, Plate with Holders",1989,443,24
        519-9,2 x 3 Plates - Black (architectural hobby und modelbau version),1962,252,32
        5199-1,Mini Antennas and Stick,1989,443,32
        5200-1,Signal Masts and Feet,1987,456,8
        520-1,2 x 2 Plates - Black (cardboard box version),1962,371,40
        520-10,2 x 2 Plates - Blue (architectural hobby und modelbau version),1962,252,42
        520-11,2 x 2 Plates - Light Gray (architectural hobby und modelbau version),1962,252,42
        5201-1,Angle Pieces,1997,453,20
        520-12,2 x 2 Plates - Red (architectural hobby und modelbau version),1962,252,42
        520-13,2 x 2 Plates - Trans-Clear (architectural hobby und modelbau version),1962,252,42
        520-14,2 x 2 Plates - White (architectural hobby und modelbau version),1962,252,42
        520-15,2 x 2 Plates - Yellow (architectural hobby und modelbau version),1962,252,42
        520-16,Basic Building Set,1985,467,173
        520-2,2 x 2 Plates - Blue (cardboard box version),1962,371,40
        5202-1,Angle Beams,1997,453,8
        520-3,2 x 2 Plates - Green (cardboard box version),1962,371,40
        5203-1,Silver Wheels,1999,453,4
        520-4,2 x 2 Plates - Light Gray (cardboard box version),1963,371,40
        5204-1,Cyber Slam Accessories,1999,453,11
        520-5,2 x 2 Plates - Red (cardboard box version),1963,371,40
        5205-1,Pulleys and Rubber Belts,1999,453,14
        520-6,2 x 2 Plates - Trans-Clear (cardboard box version),1963,371,40
        5206-1,Speed Computer,2000,19,19
        520-7,2 x 2 Plates - White (cardboard box version),1963,371,40
        520-8,2 x 2 Plates - Yellow (cardboard box version),1962,371,40
        520-9,2 x 2 Plates - Black (architectural hobby und modelbau version),1962,252,42
        5210-1,Elastic Bands,1997,453,1
        521-1,1 x 1 and 1 x 2 Plates (cardboard box version),1962,371,640
        521-10,1 x 1 and 1 x 2 Plates - Blue (architectural hobby und modelbau version),1962,252,82
        521-11,1 x 1 and 1 x 2 Plates - Light Gray (architectural hobby und modelbau version),1962,252,82
        521-12,1 x 1 and 1 x 2 Plates - Red (architectural hobby und modelbau version),1962,252,82
        521-13,1 x 1 and 1 x 2 Plates - Trans-Clear (architectural hobby und modelbau version),1962,252,82
        521-14,1 x 1 and 1 x 2 Plates - White (architectural hobby und modelbau version),1962,252,82
        521-15,1 x 1 and 1 x 2 Plates - Yellow (architectural hobby und modelbau version),1962,252,82
        5216-1,"Roof Bricks Assorted, Black",1999,443,57
        5217-1,Black Plates Assorted,1999,443,42
        5218-1,Pneumatic Pack,2000,19,152
        521-9,1 x 1 and 1 x 2 Plates - Black (architectural hobby und modelbau version),1962,252,82
        5219-1,Wheel Pack,2000,19,28
        5220-1,Styling Pack,2000,19,220
        522-1,Police Station,1977,504,26
        5221-1,Motor Pack,2000,19,55
        5222-1,Chassis Pack,2000,19,137
        5223-1,Wind-up Motor,2001,19,41
        5225-1,9v Motor with gear reduction,1998,453,1
        5226-1,Cross Axles,1998,453,18
        5227-1,Fiber Optic Cables,2000,453,8
        5228-1,Small Beams and Plates,1997,453,26
        5229-1,Gears & Differentials,1997,453,23
        5231-1,TECHNIC Beams and Plates [Yellow],1987,453,20
        5232-1,TECHNIC Beams and Plates [Blue],1987,453,18
        5233-1,Bedroom,1980,405,163
        5233-2,Small Beams and Plates with holes,1993,453,26
        5234-1,TECHNIC Beams and Plates {black},1987,453,20
        5235-1,Large Beams with Holes,1993,453,10
        5235-2,Schoolroom,1982,405,232
        5236-1,TECHNIC Beams [Blue],1987,453,8
        5237-1,TECHNIC Beams {black},1987,453,8
        5238-1,TECHNIC Beams {red},1987,453,8
        5239-1,Cross Axles,1987,453,34
        5240-1,TECHNIC Wheels with 43 mm + 24 mm tyres,1987,453,12
        5241-1,Gear Wheel Assortment,1987,453,20
        5242-1,Differential Gear Housing,1987,453,19
        5243-1,TECHNIC Chainlinks,1987,453,70
        5244-1,TECHNIC Bulldozer Chainlinks,1987,453,54
        5246-1,X-Large Tires / 81 mm Tyres and Hubs,1987,453,4
        5247-1,Toggle Joints,1987,453,66
        5248-1,62 mm Tires and Hubs / 62 mm Tyres and Hubs,1987,453,4
        5249-1,TECHNIC Beams and Plates [Red],1987,453,20
        5250-1,TECHNIC Beams {yellow},1987,453,8
        525-1,Basic Building Set,1990,467,185
        5251-1,Shock Absorbers,1989,453,4
        5252-1,Large Shock Absorbers,1993,453,2
        5254-1,"Cross Axles (Sizes 8, 10, 12)",1987,453,9
        5255-1,Connector Pegs / Connectorpegs,1987,453,30
        5256-1,Suspension Pack,1987,453,12
        5258-1,"Crown Wheels, Gear Racks, Point Wheels, Worm Gears",1987,453,10
        5260-1,Connecting Rods and Stop Bushes,1987,453,32
        5262-1,Gear Wheels,1987,453,9
        5264-1,Rotors and Bush/Cross Axles,1987,453,24
        5265-1,Large Tires and Wheels / TECHNIC Wheels with 43 mm + 24 mm Tyres,1989,453,16
        5267-1,Cross Axles & Extensions,1993,453,16
        5268-1,Small Tires,1995,453,8
        5270-1,43 mm Tires and Hubs / 43 mm Tyres and Hubs,1987,453,4
        527-1,Basic Building Set,1987,467,196
        5271-1,White Hubs & Tires / 49.6 mm Tyres & Hubs,1991,453,4
        5272-1,Cylinder Motor,1991,453,9
        5273-1,Tires,1992,453,4
        5275-1,Toggle Joints and Connectors,1993,453,48
        5277-1,Pulleys & V-Belts,1993,453,12
        5278-1,TECHNIC Chainlinks,1994,453,35
        5280-1,"Liftarms & Triangles / Liftarms, Triangles",1995,453,10
        5281-1,Balloon Tires Medium,1994,453,4
        5282-1,Balloon Tires Large,1994,453,4
        5283-1,Balloon Tires Small,1994,453,4
        5284-1,Loading Grabs,1996,453,3
        5285-1,2 Large Shock Absorbers / Large Shock Absorbers,1994,453,2
        5286-1,Toggle Joints & Connectors,1994,453,64
        5288-1,Worm Gear Boxes,1995,453,12
        5289-1,Toggle Joints & Connectors,1996,453,64
        5290-1,Plates & Gear Racks,1996,453,16
        5291-1,Liftarms & Triangles,1996,453,12
        5292-1,LEGO TECHNIC Storage Case,1996,453,1
        5293-1,9V Battery Box,1996,453,1
        5295-1,Racks & Pivots,1998,453,12
        5-3,Basic Set,1973,469,330
        5300-1,Electric Train Motor,1991,456,3
        530-1,Basic Building Set,1985,467,273
        5301-1,Wagon Plate 6 x 28,1992,456,1
        5303-1,"Buffers, Magnets & Couplers",1992,456,6
        5304-1,Wheelsets,1992,456,2
        5305-1,Connection Wire,1992,456,1
        5306-1,Plates 2x2 with Wire 9 V 26 cm,1992,453,1
        5307-1,Head Light Brick,1992,456,3
        5308-1,Head Light Brick,1994,456,3
        5310-1,Lighting Brick,1996,456,4
        5311-1,9V Wires (25.6 cm),1996,1,1
        5313-1,Space Port Accessories,1999,454,16
        5314-1,RES-Q Equipment (Tools),1999,454,31
        5315-1,Connectors,1999,443,60
        5316-1,Transparent Elements,1999,443,60
        5317-1,Wild West Accessories,1999,457,48
        5318-1,Head Wear,1999,443,26
        5319-1,Decorated Elements,1999,454,19
        5321-1,Large Plates,1999,443,10
        533-1,Basic Set,1984,469,93
        535-1,Basic Building Set,1990,467,349
        5369-1,Creator Tub,2005,37,700
        5370-1,Large Make and Create Bucket with Special LEGO Bonus Bricks,2005,37,2
        5370a-1,Large Make and Create Bucket with Special LEGO Bonus Bricks (Bucket and its contents only),2005,37,500
        5370b-1,Large Make and Create Bucket with Special LEGO Bonus Bricks (Bonus box and its contents only),2005,48,201
        537-1,Basic Building Set,1987,467,271
        5372-1,Skeleton Chariot,2008,193,25
        5373-1,Knight & Catapult,2008,193,24
        5378-1,Hogwarts Castle (3rd edition),2007,249,904
        5380-1,Duplo Large Brick Box,2007,504,71
        5380-2,Duplo Large Brick Box - Green Plate,2008,505,71
        5381-1,Adventurer's Accessories,1998,444,27
        5382-1,Aquazone Accessories,1998,445,19
        5383-1,Castle Accessories,1998,447,36
        5384-1,Space Accessories,1998,452,19
        53850001-1,Crocodile,2015,410,30
        53850002-1,Car,2015,410,40
        53850003-1,Giraffes,2015,410,36
        53850004-1,Biplane,2015,410,24
        53850005-1,Panda,2015,410,35
        53850006-1,Jeep,2015,410,29
        53850007-1,Elephant,2016,410,27
        53850008-1,Jet,2016,410,18
        53850009-1,Aircraft,2016,410,37
        53850012-1,Truck,2016,410,66
        53850013-1,Turtle,2016,410,50
        53850015-1,Penguin,2016,410,39
        53850016-1,Animal - Beaver,2017,410,52
        53850017-1,Digger,2017,410,56
        5386-1,Antennas and Control Sticks,1998,443,38
        5387-1,Belville Beach Accessories,1998,446,11
        5389-1,Divers' Accessories,1998,454,37
        5390-1,Crane and Digger Accessories,1998,454,14
        5391-1,9V Battery Box,1997,443,1
        5392-1,Wild West Accessories,1997,457,37
        5393-1,Headgear (Hats and Hair),1997,454,31
        5394-1,Horses and Saddles,1997,443,12
        5395-1,Belville Hospital Accessories,1996,446,4
        5396-1,Transparent Windows and Bricks,1996,443,8
        5397-1,Magnets and Magnet Holders,1996,443,12
        5398-1,Decorated Elements,1996,443,43
        5399-1,Fairy Tale Accessories,1999,446,25
        5-4,Large House Set,1971,433,307
        5400-1,Bathroom Accessories,1997,451,13
        540-1,Basic Building Set,1985,467,619
        5401-1,Kitchen Accessories,1997,451,14
        540-2,Police Units,1979,80,44
        5402-1,Floor Plate 1/2,1997,451,1
        540-3,Swiss Villa,1973,413,150
        5403-1,Floor Plate 1/1,1997,451,1
        5404-1,House,1997,451,28
        5405-1,Floor Plate,1998,451,1
        54-1,UFO Action Pack,1997,144,3
        5410-1,Emma,2011,451,9
        5413-1,Beauty Set,1999,451,25
        5414-1,Kitchen Set,1999,451,24
        5415-1,Garden Set,1999,451,18
        5416-1,Brick Box,2007,504,34
        5416-2,Brick Box,2009,505,33
        5417-1,Duplo Deluxe Brick Box,2007,505,95
        542-1,Street Crew,1979,72,44
        5421-1,Andrea,1997,451,1
        544-1,Basic Set,1981,469,147
        545-1,Build-N-Store Chest,1990,467,423
        545-2,Conveyor Station,1973,416,170
        547-1,Basic Building Set,1987,467,624
        5475-1,Girls Fantasy Bucket,2006,37,191
        5477-1,LEGO® Classic House Building,2006,37,233
        5482-1,Ultimate LEGO House Building Set,2006,37,674
        5487-1,Fun with LEGO Bricks,2009,37,700
        5489-1,Ultimate LEGO Vehicle Building Set,2009,37,676
        5490-1,XXL 250 Canister,2006,505,250
        5491-1,XXL 2000,2006,37,2000
        5493-1,Emergency Rescue Box,2006,37,705
        55001-1,LEGO Universe Rocket,2010,560,56
        550-1,Basic Building Set,1985,467,578
        550-2,Windmill,1976,413,211
        5506-1,LEGO Duplo Building Set-71 pieces,2010,505,71
        5507-1,Duplo Deluxe Brick Box,2010,504,102
        5508-1,Deluxe Brick Box,2010,37,704
        5509-1,Duplo Basic Bricks,2010,505,45
        5510-1,Off-Road 4x4,1986,278,284
        551-1,T Road Plates,1979,84,2
        5512-1,LEGO XXL Box,2010,22,1600
        5515-1,Fun Building with LEGO Bricks,2007,37,240
        5517-1,XXL 1800,2007,37,1800
        5519-1,Creator Bucket,2007,37,485
        552-1,Curved Road Plates,1979,84,2
        5521-1,Sea Jet,1993,278,400
        5522-1,LEGO Golden Anniversary Set,2008,37,700
        5524-1,Airport,2005,397,606
        5525-1,Amusement Park,2005,397,1339
        5526-1,Skyline,2005,397,2792
        5528-1,Red Cannister,2007,37,700
        5529-1,LEGO Basic Bricks,2010,37,326
        553-1,Straight Road Plates,1979,84,2
        5531-1,Police Motorcycle,2005,61,18
        5532-1,Fire Car,2005,58,32
        5533-1,Red Fury,1999,278,394
        5537-1,Limited Edition [Blue Tub],2007,37,683
        5538-1,Creative Bucket,2009,505,75
        5539-1,Creative Bucket,2009,37,480
        5540-1,Formula 1 Racer,1986,278,446
        554-1,Exxon Fuel Tanker,1979,76,75
        5541-1,Blue Fury,1995,278,420
        5542-1,Black Thunder,1998,278,482
        5549-1,LEGO Building Fun,2010,37,651
        5550-1,Custom Rally Van,1991,278,524
        555-1,Hospital,1976,420,229
        555-2,Basic Set,1981,469,206
        5560-1,Large Pink Brick Box,2009,37,398
        556-1,Fire Emergency Van,1979,74,66
        5561-1,Big Foot 4x4,1997,278,760
        5563-1,Racing Truck,1999,278,788
        557-1,Basic Building Set,1987,467,721
        5571-1,Giant Truck,1996,278,1746
        5573-1,LEGO Build & Play [Blue Tub],2008,37,646
        5573-2,LEGO Build & Play (Red Tub),2009,37,644
        5574-1,Lego Box,2008,48,280
        5576-1,Basic Bricks -- Medium,2008,48,378
        5578-1,Basic Bricks -- Large,2008,48,500
        5580-1,Highway Rig,1986,278,667
        558-1,Road Crane,1979,72,55
        5581-1,Magic Flash,1993,278,786
        5582-1,Ultimate Town Building Set,2008,37,697
        5584-1,Fun with Wheels,2008,37,648
        5585-1,Pink Brick Box,2008,37,216
        5587-1,Basic Bricks with Fun Figures,2009,48,390
        5589-1,Giant Box,2009,37,1600
        5590-1,Whirl and Wheel Super Truck,1990,278,1063
        5591-1,Mach II Red Bird Rig,1994,278,1172
        5595-1,DUPLO Town Airport,2009,504,57
        5599-1,Radio Control Racer,1998,117,294
        5600-1,Radio Control Racer,1998,117,297
        560-1,Town House with Garden,1979,69,244
        560-2,Police Heliport,1973,421,170
        5606-1,My First Train,2008,504,10
        5609-1,Deluxe Train Set,2008,504,118
        5610-1,Builder,2008,56,23
        5611-1,Public Works,2008,63,31
        5612-1,Police Officer,2008,61,21
        5613-1,Firefighter,2008,58,25
        561407-1,Charlie The Puppy,2014,494,13
        561408-1,Summer Beach,2014,494,27
        561409-1,Cookie Kitchen,2014,494,28
        5614-1,The Good Wizard,2008,193,16
        561410-1,Halloween Toy Shop,2014,494,29
        561411-1,Cute Kitten,2014,496,24
        561412-1,Christmas Tree,2014,494,35
        561501-1,Penguin Ice Slide,2015,494,10
        561502-1,Dressing Table,2015,494,22
        561503-1,Bunny And Garden,2015,494,18
        561504-1,Party And Cake,2015,494,23
        561505-1,Picnic Set,2015,494,21
        561506-1,Sweet Garden And Kitchen,2015,494,23
        561507-1,Garden And Wheelbarrow,2015,494,20
        561508-1,Turtle’s island,2015,494,19
        561509-1,Guitar And Stage,2015,494,21
        5615-1,The Knight,2008,193,21
        561510-1,Trick Or Treat,2015,494,19
        561511-1,Hedgehog In The Woods,2015,494,20
        561512-1,Winter Fun,2015,494,24
        5616-1,Mini Robot,2008,137,23
        5617-1,Alien Jet,2008,137,21
        5618-1,Troll Warrior,2008,193,19
        5619-1,Crystal Hawk,2008,137,26
        5620-1,Street Cleaner,2008,63,22
        5621-1,Coast Guard Kayak,2008,55,21
        5622-1,Duplo Basic Bricks - Large,2010,505,60
        5623-1,Basic Bricks - Large,2010,48,450
        5625-1,Police 4 x 4,2008,61,28
        5626-1,Coast Guard Bike,2008,55,12
        5627-1,Mini Bulldozer,2008,56,23
        5638-1,Postman,2009,504,9
        5639-1,Family House,2009,504,71
        5642-1,Tipper Truck,2009,56,23
        5643-1,Little Piggy,2010,504,4
        5644-1,Chicken Coop,2010,504,12
        5645-1,Farm Bike,2010,504,9
        5646-1,Farm Nursery,2010,504,9
        5649-1,Big Farm,2010,504,68
        565-1,Moon Landing,1976,422,366
        565-2,Build-N-Store Chest,1990,467,695
        5657-1,Jessie's Round-Up,2010,504,18
        5658-1,Pizza Planet Truck,2010,504,13
        5659-1,The Great Train Chase,2010,504,39
        566-1,Basic Set,1981,469,285
        5679-1,Police Bike,2011,504,8
        5680-1,Police Truck,2011,504,14
        5681-1,Police Station,2011,504,60
        5682-1,Fire Truck,2011,504,20
        5685-1,Vet,2011,504,4
        5700-1,LEGO Creator,1998,501,0
        570-1,Fire House,1973,417,236
        5701-1,LEGO Loco,1998,501,0
        5706-1,LEGOLAND,1999,501,0
        5714-1,LEGO Alpha Team,2000,501,0
        5748-1,Duplo Creative Building Kit,2011,505,85
        5749-1,Creative Building Kit,2011,37,650
        575-1,Coast Guard Station,1978,71,301
        575-2,Coast Guard Station (Canadian Edition),1978,71,284
        5761-1,Mini Digger,2011,23,57
        5761-1-b1,Off-Roader,2011,26,0
        5762-1,Mini Plane,2011,23,52
        5763-1,Dune Hopper,2011,23,137
        5764-1,Rescue Robot,2011,23,150
        5765-1,Transport Truck,2011,22,276
        5766-1,Log Cabin,2011,38,355
        5767-1,Cool Cruiser,2011,22,621
        5770-1,Lighthouse Island,2011,22,518
        577-1,Basic Set,1981,469,391
        5771-1,Hillside House,2011,22,710
        5785-1,Soccer Mania,2002,501,0
        5793-1,Nurse's Car,2011,504,11
        5795-1,Duplo Big City Hospital,2011,504,107
        580-1,Brick Yard,1975,416,216
        5801-1,Millimy the Fairy,1999,319,12
        5802-1,Princess Rosaline,1999,319,6
        5803-1,Iris,1999,319,5
        5804-1,Witch's Cottage,1999,319,42
        5805-1,Princess Rosaline's Room,1999,319,67
        5807-1,The Royal Stable,1999,319,54
        5808-1,The Enchanted Palace,1999,319,216
        5810-1,Vanity Fun,1995,322,22
        5811-1,Prince Justin,1999,319,4
        5812-1,King,1999,319,8
        5813-1,Lightning McQueen,2010,504,11
        5814-1,Mater's Yard,2010,506,16
        5817-1,Agent Mater,2011,504,11
        5820-1,Garden Fun,1996,322,33
        5821-1,Pamela's Picnic Time,1997,323,8
        5822-1,Jennifer and Foal,1997,323,5
        5823-1,The Good Fairy's Bedroom,2000,319,33
        5824-1,The Good Fairy's House,2000,319,66
        5825-1,Stella and the Fairy,2000,319,48
        5826-1,The Queen's Room,2000,319,78
        5827-1,Royal Coach,2000,319,85
        5830-1,Fun-Day Sundaes,1995,323,32
        5831-1,Adventurous Puppies,2001,319,16
        5832-1,Vanilla's Magic Tea Party,2001,319,11
        5833-1,Rosita's Wonderful Stable,2001,319,38
        5834-1,The Enchanted Garden,2001,319,98
        5835-1,Dance Studio,1996,322,37
        5836-1,Beautiful Baby Princess,2002,319,23
        5837-1,Flora's Bubbling Bath,2002,319,27
        5838-1,The Wicked Madam Frost,2002,319,36
        5840-1,Garden Playmates,1995,322,92
        5841-1,Beach Fun,1998,323,42
        5842-1,Vanilla's Frosty Sleighride,2002,319,33
        5843-1,Queen Rose and the Little Prince Charming,2002,319,68
        5844-1,Dolphin Windsurfer,1998,323,17
        5845-1,Dolphin Show,1998,323,51
        5846-1,Desert Island,1998,323,94
        5847-1,Surfers' Paradise,1998,323,135
        5848-1,Family Yacht / Luxury Cruiser,1998,323,226
        5850-1,The Royal Crystal Palace,2002,319,153
        585-1,Police Headquarters,1976,421,300
        5853-1,Lucinda and Cressida,1997,323,5
        5854-1,Pony Trekking,1997,323,53
        5855-1,Riding Stables,1997,323,159
        5856-1,Paprika and the Mischievous Monkey,2003,320,47
        5857-1,Safran's Amazing Bazaar,2003,320,96
        5858-2,"The Golden Palace, Purple/Silver Box",2004,320,174
        5859-1,Little Garden Fairy,2003,319,49
        5860-1,Love 'N' Lullabies,1994,322,49
        5861-1,Fairy Island,2003,319,105
        5862-1,Flower Fairy Party [Blue Box],2003,319,151
        5862-2,Flower Fairy Party [Purple/Silver Box],2004,319,153
        5864-1,Mini Helicopter,2010,24,52
        5865-1,Mini Dumper,2010,22,60
        5866-1,Rotor Rescue,2010,38,149
        5867-1,Super Speedster,2010,38,278
        5868-1,Ferocious Creatures,2010,38,416
        5870-1,Pretty Playland,1994,322,101
        5871-1,Riding Stables,2002,323,159
        5872-1,Golden Land Promo (Polybag),2003,320,32
        5873-1,Fairyland Promo (Polybag),2003,319,19
        5874-1,Nursery,1997,321,61
        5875-1,Hospital Ward,1996,321,108
        5876-1,Hospital Ward,1996,321,105
        5877-1,Wedding Coach,2004,319,73
        5880-1,Prize Pony Stables,1994,323,124
        588-1,Police Headquarters,1979,80,376
        5882-1,Ambush Attack,2012,481,80
        5883-1,Tower Takedown,2012,481,136
        5884-1,Raptor Chase,2012,481,258
        5885-1,Triceratops Trapper,2012,481,270
        5886-1,T-Rex Hunter,2012,481,474
        5887-1,Dino Defense HQ,2012,481,785
        5888-1,Ocean Interceptor,2012,481,221
        5890-1,Pretty Wishes Playhouse,1994,322,229
        5891-1,Apple Tree House,2010,38,539
        5892-1,Sonic Boom,2010,38,539
        5893-1,Offroad Power,2010,38,1061
        5895-1,Villa Belville,1996,322,328
        5898-1,Car Building Set,2010,37,135
        5899-1,House Building Set,2010,37,126
        5900-1,Adventurer - Johnny Thunder,1998,297,13
        590-1,Engine Co. No. 9,1978,74,337
        5901-1,River Raft,1999,299,19
        5902-1,River Raft,1999,299,19
        5903-1,Johnny Thunder and Baby T,2000,298,23
        5904-1,Microcopter,2000,298,28
        5905-1,Hidden Treasure,1999,299,33
        5906-1,Ruler of the Jungle,1999,299,23
        5909-1,Treasure Raiders set with Mummy Storage Container,1998,297,196
        5911-1,Johnny Thunder's Plane,2000,298,22
        5912-1,Hydrofoil,2000,298,19
        5913-1,Dr. Lightning's Car,2000,298,21
        5914-1,Baby T-Rex Trap,2000,298,21
        5918-1,Scorpion Tracker,1998,297,35
        5919-1,The Valley of the Kings,1998,297,164
        5920-1,Island Racer,2000,298,50
        5921-1,Research Glider,2000,298,57
        5923-1,Western Picture Frame,2002,477,144
        5924-1,Castle Picture Frame,2002,408,116
        5925-1,Pontoon Plane,1999,299,72
        5928-1,Bi-Wing Baron,1998,297,70
        5929-1,Knight and Castle Building Set,2011,25,145
        5930-1,Road Construction Building Set,2011,26,121
        5932-1,My First LEGO Set,2011,22,227
        5933-1,Airport Building Set,2011,24,309
        5934-1,Dino Explorer,2000,298,90
        5935-1,Island Hopper,2000,298,205
        5936-1,Spider's Secret,1999,299,129
        5938-1,Oasis Ambush,1998,297,82
        5940-1,Doll House,2004,322,207
        5941-1,Riding School,2004,323,176
        5942-1,Pop Studio,2004,322,102
        5943-1,Interior Designer,2004,322,94
        5944-1,Cat Show,2004,322,32
        5945-1,Winnie the Pooh's Picnic,2011,504,13
        5946-1,Tigger's Expedition,2011,504,26
        5948-1,Desert Expedition,1998,297,195
        5950-1,Baby Ankylosaurus (Polybag),2001,386,37
        5951-1,Baby Iguanodon (Polybag),2001,386,23
        5952-1,Baby Brachiosaurus (Polybag),2001,386,31
        5953-1,Baby Dimetrodon (Polybag),2001,386,20
        5955-1,All Terrain Trapper,2000,298,191
        5956-1,Expedition Balloon,1999,299,173
        5958-1,Mummy's Tomb,1998,297,258
        5960-1,The Mermaid Castle,2005,319,231
        5961-1,Snow Queen,2005,319,55
        5962-1,The Tinderbox,2005,319,84
        5963-1,The Princess and the Pea,2005,319,50
        5964-1,Thumbelina,2005,319,45
        5965-1,Exo-Suit Robot,2006,389,24
        5966-1,Glider,2006,389,22
        5967-1,Takeshi Walker 2,2006,389,22
        5969-1,Squidman Escape,2009,141,41
        5970-1,Freeze Ray Frenzy,2009,141,79
        5971-1,Gold Heist,2009,141,204
        5972-1,Space Truck Getaway [Container Heist],2009,141,270
        5973-1,Hyperspeed Pursuit,2009,141,455
        5974-1,Galactic Enforcer,2009,141,824
        5975-1,T-Rex Transport,2000,298,323
        5976-1,River Expedition,1999,299,318
        5977-1,Bears on the Beach,2001,323,17
        5978-1,Sphinx Secret Surprise,1998,297,353
        5979-1,Max Security Transport,2009,141,315
        5980-1,Squidman's Pitstop - Limited Edition,2009,141,375
        5981-1,Raid VPR,2010,141,68
        5982-1,Smash 'n' Grab,2010,141,187
        5983-1,SP Undercover Cruiser,2010,141,308
        5984-1,Lunar Limo,2010,141,378
        5985-1,Space Police Central,2010,141,629
        5986-1,Amazon Ancient Ruins,1999,299,463
        5987-1,Dino Research Compound,2000,298,618
        5988-1,Pharaoh's Forbidden Ruins,1998,297,720
        599-1,Super Basic Set,1982,469,744
        5994-1,Catapult,2005,198,27
        5998-1,Vladek,2005,198,6
        5999-1,Jayko,2005,198,6
        60000-1,Fire Motorcycle,2013,58,39
        6000-1,Idea Book 6000,1980,497,2
        60001-1,Fire Rescue,2013,58,79
        60002-1,Fire Truck,2013,58,208
        60003-1,Fire Emergency,2013,58,300
        60004-1,Fire Station,2013,58,750
        60005-1,Fire Boat,2013,58,221
        60006-1,Police ATV,2013,61,51
        60007-1,High Speed Chase,2013,61,283
        60008-1,Museum Break-in,2013,61,562
        60009-1,Helicopter Arrest,2013,61,349
        600-1,Ambulance,1970,420,21
        60010-1,Fire Helicopter,2013,58,224
        6001095-1,Hulk,2012,487,4
        60011-1,Surfer Rescue,2013,55,31
        60012-1,Coast Guard 4 x 4,2013,55,127
        60013-1,Coast Guard Helicopter,2013,55,232
        60014-1,Coast Guard Patrol,2013,55,455
        60015-1,Coast Guard Plane,2013,55,279
        60016-1,Tanker Truck,2013,63,190
        60017-1,Flatbed Truck,2013,63,211
        60018-1,Cement Mixer,2013,56,220
        60019-1,Stunt Plane,2013,53,139
        600-2,Police Patrol,1978,80,23
        60020-1,Cargo Truck,2013,54,319
        6002-1,Town Figures,1983,84,20
        60021-1,Cargo Heliplane,2013,53,388
        6002-2,Castle Figures,1983,189,22
        60022-1,Cargo Terminal,2013,53,649
        60023-1,City Starter Set,2013,52,267
        60024-10,"Advent Calendar 2013, City (Day  9)",2013,220,4
        60024-12,"Advent Calendar 2013, City (Day 11)",2013,220,15
        60024-14,"60024 Advent Calendar 2013, City (Day 13)",2013,220,6
        60024-16,"60024 Advent Calendar 2013, City (Day 15)",2013,220,12
        60024-18,"60024 Advent Calendar 2013, City (Day 17)",2013,220,8
        60024-2,"Advent Calendar 2013, City (Day  1)",2013,220,5
        60024-21,"60024 Advent Calendar 2013, City (Day 20)",2013,220,10
        60024-23,"60024 Advent Calendar 2013, City (Day 22)",2013,220,15
        60024-25,"60024 Advent Calendar 2013, City (Day 24) Santa",2013,220,6
        60024-4,"Advent Calendar 2013, City (Day  3)",2013,220,3
        60024-6,"Advent Calendar 2013, City (Day  5)",2013,220,8
        60024-8,"Advent Calendar 2013, City (Day  7)",2013,220,9
        60025-1,Grand Prix Truck,2013,52,322
        60026-1,Town Square,2013,63,916
        60027-1,Monster Truck Transporter,2013,52,306
        60031-1,City Corner {re-issue from set 7641-1},2013,63,478
        60032-1,Arctic Snowmobile,2014,65,44
        60033-1,Arctic Ice Crawler,2014,65,112
        60034-1,Arctic Helicrane,2014,65,262
        60035-1,Arctic Outpost,2014,65,373
        60036-1,Arctic Base Camp,2014,65,731
        6004-1,Crossbow Cart,1997,195,21
        60041-1,Crook Pursuit,2014,61,38
        60042-1,High Speed Police Chase,2014,61,109
        60043-1,Prisoner Transporter,2014,61,196
        60044-1,Mobile Police Unit,2014,61,374
        60045-1,Police Patrol,2014,61,407
        60046-1,Helicopter Surveillance,2014,61,526
        60047-1,Police Station,2014,61,852
        60048-1,Police Dog Unit,2014,61,248
        60049-1,Helicopter Transporter,2014,61,381
        60050-1,Train Station,2014,66,422
        60051-1,High-Speed Passenger Train,2014,66,608
        6005188-1,Darth Maul,2012,166,8
        60052-1,Cargo Train,2014,66,887
        60053-1,Race Car,2014,52,99
        60054-1,Light Repair Truck,2014,52,94
        60055-1,Monster Truck,2014,52,77
        60056-1,Tow Truck,2014,52,226
        60057-1,Camper Van,2014,52,194
        60058-1,SUV with Watercraft,2014,52,218
        60059-1,Logging Truck,2014,52,227
        60060-1,Auto Transporter,2014,52,350
        60061-1,Airport Fire Truck,2014,52,325
        6006139-1,Best Friends Promotional Brick Set,2012,494,2
        60062-1,Arctic Icebreaker,2014,65,712
        60063-1,Advent Calendar 2014 City,2014,208,24
        60063-10,Advent Calendar 2014 City (Day 9) Handcart with Bread,2014,220,6
        60063-11,Advent Calendar 2014 City (Day 10) Small Catapult,2014,220,7
        60063-12,Advent Calendar 2014 City (Day 11) Policeman with Megaphone and Sheet Music,2014,220,6
        60063-13,Advent Calendar 2014 City (Day 12) Duck with Remote Control,2014,220,10
        60063-14,Advent Calendar 2014 City (Day 13) Burglar with Bag and Flashlight,2014,220,8
        60063-15,Advent Calendar 2014 City (Day 14) Sled,2014,220,7
        60063-16,Advent Calendar 2014 City (Day 15) Dog with Bone and Food Dish,2014,220,3
        60063-17,Advent Calendar 2014 City (Day 16) Santa's Snowmobile,2014,220,13
        60063-18,Advent Calendar 2014 City (Day 17) Santa's Sled with Box,2014,220,11
        60063-19,Advent Calendar 2014 City (Day 18) Policeman with Cup and Handcuffs,2014,220,6
        60063-2,Advent Calendar 2014 City (Day 1) Boy Posting Christmas Mail,2014,220,5
        60063-20,Advent Calendar 2014 City (Day 19) Turkey Dinner,2014,220,11
        60063-22,Advent Calendar 2014 City (Day 21) Christmas Present and Stocking,2014,220,14
        60063-23,Advent Calendar 2014 City (Day 22) Christmas Tree,2014,220,21
        60063-24,Advent Calendar 2014 City (Day 23) Tricycle,2014,220,14
        60063-25,Advent Calendar 2014 City (Day 24) Santa with Bag and Cookie,2014,220,7
        60063-3,Advent Calendar 2014 City (Day 2) Mailbox with Green Frog,2014,220,8
        60063-4,Advent Calendar 2014 City (Day 3) Snowman,2014,220,5
        60063-5,Advent Calendar 2014 City (Day 4) Pie Stall,2014,220,6
        60063-6,Advent Calendar 2014 City (Day 5) Girl with Croissant,2014,220,5
        60063-7,Advent Calendar 2014 City (Day 6) Fruit Stall,2014,220,16
        60063-8,Advent Calendar 2014 City (Day 7) Little Shop,2014,220,18
        60063-9,Advent Calendar 2014 City (Day 8) Girl on Ice Skates,2014,220,6
        60064-1,Arctic Supply Plane,2014,65,372
        60065-1,ATV Patrol,2015,61,57
        60066-1,Swamp Police Starter Set,2015,61,78
        60067-1,Helicopter Pursuit,2015,61,252
        60068-1,Crooks’ Hideout,2015,61,468
        60069-1,Swamp Police Station,2015,61,706
        60070-1,Water Plane Chase,2015,61,261
        6007-1,Bat Lord,1997,195,16
        60071-1,Hovercraft Arrest,2015,61,328
        60072-1,Demolition Starter Set,2015,56,85
        60073-1,Service Truck,2015,56,232
        60074-1,Bulldozer,2015,56,383
        60075-1,Excavator and Truck,2015,56,310
        60076-1,Demolition Site,2015,56,774
        60077-1,Space Starter Set,2015,93,107
        60078-1,Utility Shuttle,2015,93,154
        60079-1,Training Jet Transporter,2015,93,448
        60080-1,Spaceport,2015,93,584
        6008-1,Royal King,1995,201,12
        60081-1,Pickup Tow Truck,2015,63,209
        60082-1,Dune Buggy Trailer,2015,64,221
        60083-1,Snowplow Truck,2015,63,195
        60084-1,Racing Bike Transporter,2015,63,177
        60085-1,4x4 with Powerboat,2015,59,299
        60086-1,City Starter Set,2015,52,238
        60088-1,Fire Starter Set,2015,58,92
        60090-1,Deep Sea Scuba Scooter,2015,86,42
        6009-1,Black Knight,1992,188,24
        60091-1,Deep Sea Starter Set,2015,86,90
        60092-1,Deep Sea Submarine,2015,86,273
        60093-1,Deep Sea Helicopter,2015,86,386
        60095-1,Deep Sea Exploration Vessel,2015,86,715
        60096-1,Deep Sea Operation Base,2015,86,905
        60097-1,City Square,2015,63,1678
        60098-1,Heavy-Haul Train,2015,66,982
        60099-1,LEGO® City Advent Calendar 2015,2015,208,278
        60100-1,Airport Starter Set,2016,53,81
        6010-1,Supply Wagon,1984,199,36
        60101-1,Airport Cargo Plane,2016,53,156
        60102-1,Airport VIP Service,2016,53,364
        60103-1,Airport Air Show,2016,53,677
        60104-1,Airport Passenger Terminal,2016,53,692
        60105-1,Fire ATV,2016,58,64
        60106-1,Fire Starter Set,2016,58,90
        60107-1,Fire Ladder Truck,2016,58,213
        60108-1,Fire Response Unit,2016,58,256
        60109-1,Fire Boat,2016,58,411
        601-1,Shell Gas Pump,1978,76,12
        60110-1,Fire Station,2016,58,918
        6011-1,Black Knight's Treasure,1985,187,27
        60111-1,Fire Utility Truck,2016,58,367
        60112-1,Fire Engine,2016,58,375
        60113-1,Rally Car,2016,63,104
        60114-1,Race Boat,2016,52,94
        60115-1,4 x 4 Off Roader,2016,64,184
        60116-1,Ambulance Plane,2016,60,183
        60117-1,Van & Caravan,2016,63,250
        60118-1,Garbage Truck,2016,52,247
        60119-1,Ferry,2016,59,301
        601-2,Tow Truck,1970,397,21
        60120-1,Volcano Starter Set,2016,52,83
        6012-1,Siege Cart,1986,199,54
        60121-1,Volcano Exploration Truck,2016,52,174
        60122-1,Volcano Crawler,2016,52,323
        60123-1,Volcano Supply Helicopter,2016,52,329
        60124-1,Volcano Exploration Base,2016,52,823
        60125-1,Volcano Heavy-Lift Helicopter,2016,52,1273
        60126-1,Tire Escape,2016,61,47
        60127-1,Prison Island Starter Set,2016,61,92
        60128-1,Police Pursuit,2016,61,184
        60129-1,Police Patrol Boat,2016,61,200
        60130-1,Prison Island,2016,61,753
        6013-1,Samurai Swordsman,1998,434,13
        60131-1,Crooks Island,2016,61,243
        60132-1,Service Station,2016,63,513
        60133-1,City Advent Calendar 2016,2016,208,290
        60134-1,Fun in the park - City People Pack,2016,52,160
        60135-1,ATV Arrest,2017,61,47
        60136-1,Police Starter Set,2017,61,80
        60137-1,Tow Truck Trouble,2017,61,144
        60138-1,High-speed Chase,2017,61,297
        60139-1,Mobile Command Center,2017,61,373
        60140-1,Bulldozer Break-In,2017,61,558
        60141-1,Police Station,2017,80,893
        60142-1,Money Transporter,2017,61,137
        60143-1,Auto Transport Heist,2017,61,402
        60144-1,Race Plane,2017,53,88
        60145-1,Buggy,2017,63,80
        60146-1,Stunt Truck,2017,52,90
        60147-1,Fishing Boat,2017,52,125
        60148-1,ATV Race Team,2017,63,238
        60149-1,4x4 with Catamaran,2017,52,197
        60150-1,Pizza Van,2017,63,249
        60151-1,Dragster Transporter,2017,52,334
        60152-1,Sweeper & Excavator,2017,52,298
        60159-1,Jungle Halftrack Mission,2017,614,378
        60160-1,Jungle Mobile Lab,2017,614,423
        6016-1,Knights' Arsenal,1987,199,37
        6017-1,King's Oarsmen,1987,199,45
        6018031-1,Master Builder Academy: Kits 7-9 Subscription,2012,432,0
        6018-1,Battle Dragon,1990,188,54
        6020-1,Magic Shop,1993,186,47
        602-1,Fire Chief's Car,1978,74,24
        6021-1,Jousting Knights,1984,199,37
        602-2,Fire Truck,1970,417,30
        6022-1,Horse Cart,1984,199,43
        6023-1,Maiden's Cart,1986,199,45
        6024-1,Bandit Ambush,1996,191,60
        6026-1,King Leo,2000,197,21
        6027-1,Bat Lord's Catapult,1997,195,54
        6028-1,Treasure Cart,1998,195,23
        6029-1,Treasure Guard,1998,195,23
        6030-1,Catapult,1984,187,83
        603-1,Sidecar,1978,85,26
        6031-1,Fright Force,1998,195,28
        6032-1,Catapult Crusher,2000,197,56
        603-3,Vintage Car,1970,397,36
        6033-1,Treasure Transport,1998,434,59
        6034-1,Black Monarch's Ghost,1990,188,46
        6035-1,Castle Guard,1987,187,52
        6036-1,Skeleton Surprise,1995,201,74
        6037-1,Witch's Windship,1997,195,60
        6038-1,Wolfpack Renegades,1992,203,98
        6039-1,Twin-Arm Launcher,1988,199,77
        6040-1,Blacksmith Shop,1984,199,93
        604-1,Shell Service Car,1978,76,21
        6041-1,Armor Shop,1986,199,113
        604-2,Excavator,1971,416,28
        6042-1,Dungeon Hunters,1990,190,111
        6043-1,Dragon Defender,1993,186,156
        6043173-1,Friends Baking Set,2013,494,20
        6044-1,King's Carriage,1995,201,127
        6045-1,Ninja Surprise,1998,434,112
        6046-1,Hemlock Stronghold,1996,191,220
        6047-1,Traitor Transport,1997,195,145
        6048-1,Majisto's Magical Workshop,1993,186,188
        6049-1,Viking Voyager,1987,199,101
        605-1,Street Sweeper,1978,85,18
        6051-1,Play with Letters,2011,504,62
        605-2,Taxi,1971,397,18
        6053-1,My First LEGO Town,2011,37,709
        6054-1,Forestmen's Hideout,1988,194,201
        6055-1,Prisoner Convoy,1985,199,116
        6056-1,Dragon Wagon,1993,186,109
        6057-1,Sea Serpent,1992,188,128
        6058324-1,Canada 2013 Toys R Us Easter Egg Giveaway,2013,229,62
        6059-1,Knight's Stronghold,1990,188,227
        6060-1,Knight's Challenge,1989,199,168
        606-1,Ambulance,1978,78,25
        6061-1,Siege Tower,1984,199,216
        606-2,Tipper Lorry,1972,416,22
        6062-1,Battering Ram,1987,187,240
        6066-1,Camouflaged Outpost,1987,194,228
        6067-1,Guarded Inn,1986,199,256
        607-1,Mini Loader,1979,72,22
        6071-1,Forestmen's Crossing,1990,194,210
        6073-1,Knight's Castle,1984,187,416
        6074-1,Black Falcon's Fortress,1986,187,430
        6075-1,Wolfpack Tower,1992,203,239
        6075-2,Castle,1981,189,774
        6076-1,Dark Dragon's Den,1993,186,219
        6077-1,Knight's Procession,1981,189,49
        6077-2,Forestmen's River Fortress,1989,194,360
        6078-1,Royal Drawbridge,1995,201,259
        6079-1,Dark Forest Fortress,1996,191,469
        6080-1,King's Castle,1984,199,679
        608-1,Kiosk,1971,413,33
        6081-1,King's Mountain Fortress,1990,190,438
        608-2,Taxi,1979,85,25
        6082-1,Fire Breathing Fortress,1993,186,406
        6083-1,Knight's Tournament,1981,189,210
        6083-2,Samurai Stronghold,1998,434,198
        6085-1,Black Monarch's Castle,1988,188,688
        6086-1,Black Knight's Castle,1992,188,590
        6087-1,Witch's Magic Manor,1997,195,254
        6088-1,Robber's Retreat,1998,434,281
        6089-1,Stone Tower Bridge,1998,434,410
        6090-1,Royal Knight's Castle,1995,201,764
        609-1,Aeroplane,1972,412,28
        6091-1,King Leo's Castle,2000,197,539
        6092-1,50 Jahre In Deutschland,2006,37,706
        6092-2,LEGO Special Edition Creative Building Tub,2006,37,706
        6093-1,Flying Ninja Fortress,1998,434,698
        6094-1,Guarded Treasury,2000,197,103
        6095-1,Royal Joust,2000,197,103
        6096-1,Bull's Attack,2000,197,315
        6097-1,Night Lord's Castle,1997,195,607
        6098-1,King Leo's Castle,2000,197,538
        6099-1,Traitor Transport (with Cave),1997,195,145
        6100-1,Aquashark Dart,1998,311,24
        610-1,Vintage Car,1973,397,39
        610-2,Rescue Helicopter,1987,466,35
        6102-1,Castle Mini Figures,1985,202,36
        6103-1,Castle Mini Figures,1988,202,38
        6103-2,Knights,1984,202,25
        6104-1,Aquacessories,1996,314,27
        6105-1,Medieval Knights,1993,202,37
        6107-1,Recon Ray,1998,313,20
        6110-1,Solo Sub,1998,312,25
        611-1,Police Car,1973,421,19
        6111-1,Street Chase,2006,120,193
        611-2,Air Canada Jet Plane,1988,466,89
        6112-1,World of Bricks,2006,48,1004
        6114-1,200 + 40 Special Elements,2007,48,242
        6115-1,Shark Scout,1995,311,28
        6116-1,Box of Bricks,2007,48,604
        6117-1,Doors and Windows,2008,48,100
        6118-1,Wheels,2008,48,106
        6119-1,Roof Tiles,2008,48,150
        612-1,Tipper Truck,1974,416,23
        6125-1,Sea Sprint 9,1995,308,32
        6126-1,Good Guy 2008,2008,324,26
        6127-1,Bad Guy 2008,2008,324,29
        6128-1,Function 2008,2008,324,22
        6130-1,DUPLO Build and Play,2011,504,100
        613-1,Biplane,1974,412,18
        6131-1,Build and Play,2011,37,646
        6132-1,Red,2012,506,15
        6133-1,Race Day,2012,506,30
        6134-1,Siddeley Saves the Day,2012,506,38
        6135-1,Spy Shark,1996,311,60
        6136-1,My First Zoo,2011,504,60
        6137-1,My First LEGO Duplo Supermarket,2011,504,38
        6138-1,My First Fire Station,2011,504,60
        6140-1,Crab,1998,313,78
        614-1,Excavator,1974,416,31
        6143-1,Race Team,2012,504,34
        6144-1,Zoo Train,2012,504,12
        6145-1,Crystal Crawler,1996,308,96
        6146-1,Pick-up Truck,2012,504,17
        6150-1,Crystal Detector,1998,312,105
        6151-1,Sleeping Beauty's Chamber,2012,504,16
        615-2,Fork Lift with Driver,1975,416,21
        6152-1,Snow White's Cottage,2012,504,28
        6153-1,Cinderella's Carriage,2012,504,20
        6154-1,Cinderella's Castle,2012,504,77
        6155-1,Deep Sea Predator,1995,311,104
        6156-1,Photo Safari,2012,504,68
        6157-1,The Big Zoo,2012,504,147
        6158-1,Duplo Animal Clinic,2012,504,62
        6159-1,Crystal Detector,1998,312,105
        6160-1,Sea Scorpion,1998,313,305
        616-1,Cargo Ship,1976,419,31
        6161-1,Brick Box,2007,37,221
        6162-1,A World of LEGO Mosaic 4 in 1,2007,277,286
        6163-1,A World of LEGO Mosaic 9 in 1,2007,277,598
        6164-1,LEGO Rescue Building Set,2007,37,519
        6166-1,Large Brick Box,2007,37,406
        6167-1,Deluxe Brick Box,2006,37,693
        6168-1,Fire Station,2012,504,64
        6169-1,Fire Chief,2012,504,6
        617-1,Cowboys,1976,397,41
        6171-1,My First Gas Station,2012,504,47
        6173-1,Panda,2012,504,7
        6175-1,Crystal Explorer Sub,1995,308,167
        6176-1,Basic Bricks - Deluxe,2008,505,80
        6176782-1,Escape the Space Slug,2016,598,161
        6177-1,LEGO Basic Bricks Deluxe,2008,48,650
        6180-1,Hydro Search Sub,1998,312,297
        618-1,Police Helicopter,1977,421,38
        6186-1,Build Your Own LEGO Harbor,2008,37,252
        6187-1,Road Construction Set,2008,22,296
        6190-1,Shark's Crystal Cave,1996,311,259
        619-1,Rally Car,1977,397,22
        6191-1,Fire Fighter Building Set,2009,37,117
        6192-1,Pirates Building Set,2009,37,150
        6193-1,Castle Building Set,2009,37,137
        6194-1,My Own LEGO Town,2009,37,515
        6195-1,Neptune Discovery Lab,1995,308,509
        6198-1,Stingray Stormer,1998,313,413
        6199-1,Hydro Crystalization Station,1998,312,485
        6200-1,Pirates Double Pack,1989,148,2
        6200-2,Evo,2012,401,36
        620-1,Fireman's Car,1978,74,32
        6201-1,Toxic Reapa,2012,403,42
        620-2,Fire Truck,1970,417,40
        6202-2,Rocka,2012,401,55
        620-3,Blue Building Plate 32 x 32,2010,48,1
        6203-1,Black Phantom,2012,403,124
        6204-1,Buccaneers,1997,148,42
        6205-1,V-wing Fighter,2006,168,118
        6206-1,TIE Interceptor,2006,169,212
        6207-1,A-wing Fighter,2006,169,193
        6208-1,B-wing Fighter,2006,169,439
        6209-1,Slave I (2nd edition),2006,169,537
        6210-1,Jabba's Sail Barge,2006,169,781
        621-1,Police Car,1978,80,34
        6211-1,Imperial Star Destroyer,2006,169,1388
        621-2,Shell Tanker Truck,1970,418,43
        6212-1,X-wing Fighter,2006,169,437
        6213-1,Replacement Gearbox for Electric Motor,1985,456,1
        6216-1,Jawblade,2012,403,45
        6217-1,Surge,2012,401,39
        6218-1,Splitface,2012,403,50
        622-1,Tipper Truck,1978,72,32
        6221-1,Nex,2012,401,39
        622-2,Baggage Carts,1970,412,45
        6222-1,Core Hunter,2012,403,51
        6223-1,Bulk,2012,401,61
        6227-1,Breez,2012,401,55
        6228-1,Thornraxx,2012,403,44
        6229-1,XT4,2012,403,39
        6230-1,Stormer XL,2012,401,89
        623-1,Medic's Car,1978,78,33
        6231-1,Speeda Demon,2012,403,192
        623-2,White Car and Camper,1970,397,38
        6232-1,Skeleton Crew,1996,148,31
        6234-1,Renegade's Raft,1991,148,39
        6235-1,Buried Treasure,1989,148,27
        6236-1,King Kahuka,1994,152,49
        6237-1,Pirates' Plunder,1993,148,28
        6239-1,Cannon Battle,2009,153,45
        6240-1,Kraken Attackin',2009,153,78
        6241-1,Loot Island,2009,153,144
        6242-1,Soldiers' Fort,2009,153,370
        6243-1,Brickbeard's Bounty,2009,153,595
        6244-1,Armada Sentry,1996,149,74
        6245-1,Harbor Sentry,1989,151,26
        6246-1,Crocodile Cage,1994,152,61
        6247-1,Bounty Boat,1992,148,40
        6248-1,Volcano Island,1996,148,123
        6249-1,Pirates Ambush,1997,148,159
        6250-1,Cross Bone Clipper,1997,148,157
        625-1,Tractor,1978,72,31
        6251-1,Pirate Mini Figures,1989,148,40
        6252-1,Sea Mates,1993,148,36
        6253-1,Shipwreck Hideout,2009,153,313
        6254-1,Rocky Reef,1995,148,108
        6255-1,Pirate Comic,1989,148,12
        6256-1,Islander Catamaran,1994,152,64
        6257-1,Castaway's Raft,1989,148,54
        6258-1,Smuggler's Shanty,1992,148,75
        6259-1,Broadside's Brig,1991,151,68
        6260-1,Shipwreck Island,1989,148,78
        6261-1,Raft Raiders,1992,148,86
        626-2,Red Cross Helicopter,1978,78,36
        6262-1,King Kahuka's Throne,1994,152,155
        6263-1,Imperial Outpost,1995,147,219
        6264-1,Forbidden Cove,1994,152,222
        6265-1,Sabre Island,1989,151,97
        6266-1,Cannon Cove,1993,147,106
        6267-1,Lagoon Lock-Up,1991,151,194
        6268-1,Renegade Runner,1993,148,187
        6270-1,Forbidden Island,1989,148,190
        6271-1,Imperial Flagship,1992,147,320
        6271-2,Imperial Flagship with Free Storage Case,1992,150,1
        6273-1,Rock Island Refuge,1991,148,388
        6274-1,Caribbean Clipper,1989,151,386
        6276-1,Eldorado Fortress,1989,151,515
        6277-1,Imperial Trading Post,1992,147,622
        6278-1,Enchanted Island,1994,152,439
        6279-1,Skull Island,1995,148,386
        6280-1,Armada Flagship,1996,149,292
        628-1,X-Large Building Plate (Light Gray),1996,473,1
        6281-1,Pirates Perilous Pitfall,1997,148,404
        628-2,Police Helicopter,1977,421,38
        6282-1,Stringer,2012,401,42
        628-3,X-Large Gray Baseplate (Lt Bluish Gray),2003,48,1
        6283-1,Voltix,2012,403,61
        6285-1,Black Seas Barracuda,1989,148,915
        6286-1,Skull's Eye Schooner,1993,148,921
        6289-1,Red Beard Runner,1996,148,711
        6290-1,Red Beard Runner,2001,148,712
        629-1,Three Building Plates,1996,473,3
        6291-1,Armada Flagship,2001,149,291
        6292-1,Enchanted Island,2001,152,445
        6293-1,Furno,2012,401,56
        6296-1,Shipwreck Island,1996,148,226
        6299-1,Advent Calendar 2009 Pirates,2009,215,24
        6299-10,Advent Calendar 2009 Pirates (Day  9) - Plants and Crab,2009,224,7
        6299-11,Advent Calendar 2009 Pirates (Day 10) - Barrel with Tools,2009,224,3
        6299-12,Advent Calendar 2009 Pirates (Day 11) - Castaway,2009,224,7
        6299-13,Advent Calendar 2009 Pirates (Day 12) - Fish over Fire,2009,224,9
        6299-14,Advent Calendar 2009 Pirates (Day 13) - Monkey,2009,224,2
        6299-15,Advent Calendar 2009 Pirates (Day 14) - Mermaid,2009,224,4
        6299-16,Advent Calendar 2009 Pirates (Day 15) - Clam and Plant,2009,224,6
        6299-17,Advent Calendar 2009 Pirates (Day 16) - Table with Food and Rat,2009,224,8
        6299-18,Advent Calendar 2009 Pirates (Day 17) - Imperial Soldier II,2009,224,6
        6299-19,Advent Calendar 2009 Pirates (Day 18) - Weapon Stand,2009,224,9
        6299-2,Advent Calendar 2009 Pirates (Day  1) - Captain Brickbeard,2009,224,6
        6299-20,Advent Calendar 2009 Pirates (Day 19) - Pirate,2009,224,4
        6299-21,Advent Calendar 2009 Pirates (Day 20) - Barrel and Paddle,2009,224,2
        6299-22,Advent Calendar 2009 Pirates (Day 21) - Sawfish,2009,224,2
        6299-23,Advent Calendar 2009 Pirates (Day 22) - Skeleton and Snake,2009,224,7
        6299-24,Advent Calendar 2009 Pirates (Day 23) - Brick Arch with Fire and Skull,2009,224,12
        6299-25,Advent Calendar 2009 Pirates (Day 24) - Treasure Chest with Gems,2009,224,8
        6299-3,Advent Calendar 2009 Pirates (Day  2) - Table with Lamp and Map,2009,224,9
        6299-4,Advent Calendar 2009 Pirates (Day  3) - Parrot on Perch,2009,224,7
        6299-5,Advent Calendar 2009 Pirates (Day  4) - Imperial Soldier II Officer,2009,224,6
        6299-6,Advent Calendar 2009 Pirates (Day  5) - Cannon,2009,224,8
        6299-7,Advent Calendar 2009 Pirates (Day  6) - Crocodile,2009,224,3
        6299-8,Advent Calendar 2009 Pirates (Day  7) - Pirate Female,2009,224,5
        6299-9,Advent Calendar 2009 Pirates (Day  8) - Raft with Flagpole,2009,224,8
        6-3,Basic Set,1973,469,338
        630-1,Brick Separator,1996,443,1
        6301-1,Town Mini-Figures,1986,84,34
        6302-1,Mini-Figure Set,1982,84,31
        630-3,Brick Separator Orange,2012,443,1
        6304-1,Cross Roads Plates,1980,84,2
        6305-1,Trees and Flowers,1980,84,24
        6306-1,Road Signs,1980,84,12
        6307-1,Firemen,1983,84,22
        6308-1,Policemen,1982,84,20
        6309-1,Town Mini-Figures,1988,84,41
        6310-1,T-Road Plates,1986,84,2
        631-1,Doors and Windows,1996,473,52
        6311-1,Curved Road Plates,1986,84,2
        6312-1,Straight Road Plates,1986,84,2
        6313-1,Cross-Road Plates,1986,84,2
        6314-1,City People,1992,84,36
        6315-1,Road Signs,1988,84,11
        6316-1,Flags and Fences,1988,84,38
        6317-1,Trees and Flowers,1988,84,48
        6319-1,Trees and Fences,1993,84,45
        6320-1,T-Road Plates,1997,102,2
        632-1,Wheels and Tires,1996,473,60
        6321-1,Curved Road Plates,1997,102,2
        6322-1,Straight Road Plates,1997,102,2
        6323-1,Cross Road Plates,1997,102,2
        6324-1,Chopper Cop,1998,100,24
        6325-1,Package Pick-Up,1998,95,29
        6326-1,Town Folks,1998,102,40
        6327-1,Turbo Champs,1998,101,48
        6328-1,Helicopter Transport,1998,100,102
        6329-1,Truck Stop,1998,103,139
        6330-1,Cargo Center,1998,95,246
        633-1,Roof Tiles,1996,473,50
        6331-1,Patriot Jet,1996,68,166
        6332-1,Command Post Central,1998,100,277
        6333-1,Race and Chase,1998,101,50
        6334-1,Wave Jump Racers,1996,82,180
        6335-1,Indy Transport,1996,82,402
        6336-1,Launch Response Unit,1995,88,181
        6337-1,Fast Track Finish,1996,82,339
        6338-1,Hurricane Harbor,1995,71,364
        6339-1,Shuttle Launch Pad,1995,88,564
        6340-1,Hook & Ladder,1994,74,177
        634-1,Extra Bricks in Red,1996,473,62
        6341-1,Gas N' Go Flyer,1994,68,106
        6342-1,Beach Rescue Chopper,1993,71,149
        6344-1,Jet Speed Justice,1993,80,158
        6345-1,Aerial Acrobats,1993,68,350
        6346-1,Shuttle Launching Crew,1992,68,413
        6347-1,Monorail Accessory Track,1991,84,54
        6348-1,Surveillance Squad,1994,80,318
        6349-1,Vacation House,1988,69,215
        6350-1,Pizza To Go,1994,75,150
        635-1,Extra Bricks in White,1996,473,62
        6351-1,Surf N' Sail Camper,1992,83,190
        6352-1,Cargomaster Crane,1991,72,141
        6353-1,Coastal Cutter,1991,71,184
        6354-1,Pursuit Squad,1990,80,175
        6355-1,Derby Trotter,1989,83,142
        6356-1,Med-Star Rescue Plane,1988,78,160
        6357-1,Stunt 'Copter N' Truck,1988,85,177
        6358-1,Snorkel Squad,1987,74,154
        6359-1,Horse Trailer,1986,73,144
        6360-1,Weekend Cottage,1986,69,117
        636-1,Pullback Motor,1996,473,14
        6361-1,Mobile Crane,1986,72,163
        6362-1,Post Office,1982,81,135
        6363-1,Auto Service Station,1980,85,140
        6364-1,Paramedic Unit,1980,78,139
        6365-1,Summer Cottage,1981,69,152
        6366-1,Fire & Rescue Squad,1984,74,117
        6367-1,Truck,1984,70,154
        6368-1,Jet Airliner,1985,68,137
        6369-1,Garage,1985,85,134
        6370-1,Weekend Home,1985,69,186
        637-1,Plastic Playtable,1996,473,3
        6371-1,Shell Service Station,1983,76,266
        6372-1,Town House,1982,69,234
        6373-1,Motorcycle Shop,1984,85,186
        6374-1,Holiday Home,1983,69,265
        6375-1,Trans Air Carrier,1990,70,213
        6375-2,Exxon Gas Station,1980,76,270
        6376-1,Breezeway Cafe (Breezeway Café),1990,75,194
        6377-1,Delivery Center,1985,70,305
        6378-1,Shell Service Station,1986,76,290
        6379-1,Riding Stable,1986,69,281
        6380-1,Emergency Treatment Center,1987,78,312
        6381-1,Motor Speedway,1987,82,206
        6382-1,Fire Station,1981,74,394
        6383-1,Public Works Center,1981,72,420
        6384-1,Police Station,1983,80,398
        6385-1,Fire House-I,1985,74,416
        6386-1,Police Command Base,1986,80,401
        6387-1,Coastal Rescue Base,1989,71,375
        6388-1,Holiday Home with Caravan,1989,69,363
        6389-1,Fire Control Center,1990,74,542
        6390-1,Main Street,1980,85,607
        6391-1,Cargo Center,1984,70,565
        6392-1,Airport,1985,68,539
        6393-1,Big Rig Truck Stop,1987,85,634
        6394-1,Metro Park & Service Tower,1988,76,628
        6395-1,Victory Lap Raceway,1988,82,613
        6396-1,International Jetport,1990,68,550
        6397-1,Gas N' Wash Express,1992,76,473
        6398-1,Central Precinct HQ,1993,80,633
        6399-1,Airport Shuttle,1990,68,787
        6-4,4.5V Battery Train Wagon,1977,456,2
        6400-1,Go-Kart,1997,82,23
        640-1,Fire Truck,1971,417,45
        6401-1,Seaside Cabana,1992,90,45
        640-2,Fire Truck and Trailer,1978,74,47
        6402-1,Sidewalk Cafe,1994,90,48
        6403-1,Paradise Playground,1993,90,97
        6404-1,Carriage Ride,1996,90,66
        6405-1,Sunset Stables,1992,90,132
        6406-1,Go-Kart,1997,82,23
        6407-1,Fire Chief,1997,98,26
        6409-1,Island Arcade,1993,90,149
        6410-1,Cabana Beach,1994,90,153
        641-1,Excavator,1978,72,38
        6411-1,Sand Dollar Cafe,1992,90,172
        6414-1,Dolphin Point,1995,90,209
        6415-1,Res-Q Jet-Ski,1998,92,18
        6416-1,Poolside Paradise,1992,90,237
        6417-1,Show Jumping Event,1997,90,41
        6418-1,Country Club,1996,90,292
        6419-1,Rolling Acres Ranch,1992,90,364
        6420-1,Mail Carrier,1998,81,14
        642-1,Tow Truck and Car,1978,85,43
        642-2,Double Excavator,1971,416,33
        6422-1,Telephone Repair,1998,103,48
        6423-1,Mini Tow Truck,2000,103,35
        6424-1,Rig Racers,1998,101,107
        6425-1,TV Chopper,1999,103,37
        6426-1,Super Cycle Center,1998,103,145
        6427-1,Road Signs,1999,102,43
        6428-1,Wave Saver,1998,92,18
        6429-1,Blaze Responder,1999,98,46
        6430-1,Night Patroller,1991,80,140
        643-1,Flatbed Truck,1978,85,39
        6431-1,Road Rescue,1998,92,48
        643-2,Mobile Crane,1971,416,35
        6432-1,Speedway Transport,1999,101,139
        6433-1,Coastwatch,1999,100,89
        6434-1,Roadside Repair,1999,103,213
        6435-1,Coast Guard HQ,1999,96,217
        6436-1,Go-Kart,1999,82,22
        6437-1,Beach Buggy,1999,96,28
        6439-1,Mini-Dumper,1999,97,30
        6440-1,Jetport Fire Squad,1991,68,159
        644-1,Double Tanker,1971,418,61
        6441-1,Deep Reef Refuge,1997,86,451
        644-2,Police Mobile Patrol,1978,80,44
        6442-1,Sting Ray Explorer,1997,86,150
        6444-1,Outback Airstrip,1997,89,167
        6445-1,Emergency Evac,1998,92,99
        6446-1,Crane Truck,1999,103,26
        6447-1,Dumper,1999,97,49
        6450-1,Mobile Police Truck,1986,80,83
        645-1,Police Helicopter,1979,80,56
        6451-1,River Response,1998,92,152
        645-2,Milk Float & Trailer,1971,397,57
        6452-1,Mini Rocket Launcher,1999,93,31
        6453-1,Com-Link Cruiser,1999,93,60
        6454-1,Countdown Corner,1999,93,131
        6455-1,Space Simulation Station,1999,93,251
        6456-1,Mission Control,1999,93,499
        6457-1,Astronaut Figure,1999,93,18
        6458-1,Satellite with Astronaut,1999,93,30
        6459-1,Fuel Truck,1999,93,119
        646-1,Auto Service Truck,1979,85,42
        6461-1,Surveillance Chopper,1999,93,30
        646-2,Mobile Site Office,1971,397,51
        6462-1,Aerial Recovery,1998,92,197
        6463-1,Lunar Rover,1999,93,36
        6464-1,Super Rescue Complex,1999,103,360
        6465-1,Space Port Jet,1999,93,65
        6467-1,Power Pitstop,1999,101,71
        6468-1,Tow-n-Go Value Pack,1999,103,50
        6469-1,Space Port Value Pack,1999,93,3
        6470-1,Mini Dump Truck,2000,97,25
        647-1,Truck with Girders,1971,416,51
        6471-1,4WD Police Patrol,2000,100,30
        6472-1,Gas N' Wash Express,2001,76,473
        6473-1,Res-Q Cruiser,1998,92,305
        6474-1,Wheeled Front Shovel,2000,97,49
        6477-1,Firefighter's Lift Truck,2000,98,103
        6478-1,Fire Station,2000,98,224
        6479-1,Emergency Response Center,1998,92,425
        6480-1,Hook and Ladder Truck,1986,74,118
        648-1,Shell Service Station,1971,418,42
        6481-1,Construction Crew,1989,72,170
        6482-1,Rescue Helicopter,1989,78,198
        6483-1,Coastal Patrol,1994,77,245
        6484-1,F1 Hauler,1995,82,280
        6486-1,Fire Engine,1997,98,67
        6487-1,Mountain Rescue,1997,89,68
        6489-1,Seaside Holiday Cottage,1997,90,88
        6490-1,Amazon Crossing,1997,89,120
        649-1,Low-Loader with Excavator,1972,416,36
        6491-1,Rocket Racer,1996,464,58
        6492-1,Hypno Cruiser,1996,464,157
        6493-1,Flying Time Vessel,1996,464,241
        6494-1,Mystic Mountain Time Lab,1996,464,510
        6495-1,Time Tunnelator,1997,464,81
        6496-1,Whirling Time Warper,1997,464,158
        6497-1,Twisted Time Train,1997,464,300
        6498-1,Go-Kart,1999,82,22
        6499-1,Time Tunnelator,1997,464,82
        650-1,Car with Trailer and Racing Car,1972,397,40
        6501-1,Sport Convertible,1987,85,30
        6502-1,Turbo Racer,1987,82,24
        65028-1,Star Wars Co-Pack of 7115 7124 and 7141,2001,166,3
        65030-1,Star Wars Co-Pack of 7104 and 7144,2001,169,2
        6503-1,Sprint Racer,1988,82,32
        65034-1,Star Wars Co-Pack of 7121 and 7161,2001,166,2
        6504-1,Tractor,1988,72,25
        6505-1,Fire Chief's Car,1988,74,29
        6506-1,Precinct Cruiser,1989,80,32
        65062-1,Racers Turbo Pack,2002,113,2
        6507-1,Mini Dumper,1989,72,30
        65071-1,Dual Pack: Lehvak & Pahrak,2002,328,3
        6508-1,Wave Racer,1990,77,37
        65081-1,R2-D2 8009 / C-3PO 8007 Droid Collectors Set,2002,18,3
        6509-1,Red Devil Racer,1991,82,39
        6510-1,Mud Runner,1991,82,34
        65106-1,Episode II Co-Pack (contains 7103 7113),2002,167,2
        65109-1,Pahrak Nuhvok Gahlok Co-Pack,2002,328,3
        651-1,Tow Truck and Car,1972,397,41
        65110-1,Kohrak Lehvak Tahnok Co-Pack,2002,328,3
        6511-1,Rescue Runabout,1992,74,38
        6512-1,Landscape Loader,1992,72,37
        65127-1,Bohrok Co-Pack (contains 8560 8561 8563),2002,328,3
        65128-1,Bohrok Co-Pack (contains 8562 8564 8565),2002,328,3
        6513-1,Glade Runner,1993,77,31
        6514-1,Trail Ranger,1994,83,36
        65145-1,X-wing Fighter / TIE Fighter & Y-wing Collectors Set,2002,169,2
        6515-1,Stunt Copter,1994,68,34
        65153-1,Jango Fett's Slave I (Set 7153) with Carrying Case,2002,167,1
        6516-1,Moon Walker,1995,88,34
        6517-1,Water Jet,1996,77,28
        6518-1,Baja Buggy,1996,71,37
        65182-1,Slammer Stadium,2003,461,25
        65186-1,Bohrok 3-pack (contains 8560 8561 8564),2002,328,3
        6519-1,Turbo Tiger,2000,91,46
        6520-1,Mobile Outpost,2000,51,218
        6521-1,Emergency Repair Truck,1987,85,58
        652-2,Fork Lift Truck and Trailer,1972,416,42
        6522-1,Highway Patrol,1987,80,38
        65221-1,Streetball 2 vs 2 (box with mini basketball),2003,459,2
        65229-1,Rahkshi Co-Pack 1,2003,344,3
        65230-1,Rahkshi Co-Pack 2,2003,344,3
        6523-1,Red Cross,1987,78,51
        6524-1,Blizzard Blazer,1988,85,50
        6525-1,Blaze Commander,1995,74,49
        65258-1,Power Chamber with Gahlok Tahnok Va Pahrak Va and Gahlok Va,2003,324,4
        6526-1,Red Line Racer,1989,82,47
        6527-1,Tipper Truck,1989,72,43
        65277-1,Rahkshi Kaita Za Pack (Includes Turahk Lerahk Kurahk and Tahnok Va),2003,324,4
        6528-1,Sand Storm Racer,1989,82,39
        6529-1,Ultra Light I,1990,68,35
        65295-1,Matoro and Kopeke Twin Pack with Gold Avohkii,2003,335,3
        65296-1,Hewkii and Hahli Twin Pack with Gold Avohkii,2003,335,3
        65297-1,Hafu and Macku Twin Pack with Gold Avohkii,2003,335,3
        6530-1,Sport Coupe,1990,85,43
        653-1,Ambulance and Helicopter,1973,420,36
        6531-1,Flame Chaser,1991,74,56
        6532-1,Diesel Dumper,1991,72,47
        6533-1,Police 4x4,1992,80,62
        65340-1,Dumper and Front End Loader Co-Pack (contains 8451 and 8453),2004,7,2
        6534-1,Beach Bandit,1992,83,44
        6535-1,Dumper,1995,72,42
        6536-1,Aero Hawk,1993,68,48
        65362-1,Jewels-n-Rings Click-N-Store Jewelry Set Co-Pack (7507 with jewelry box),2004,500,2
        65363-1,Jewels-n-Bands Click-N-Store Jewelry Set Co-Pack (7508 with jewelry box),2004,500,2
        65364-1,Jewels-n-Clips Click-N-Store Jewelry Set Co-Pack (7509 with jewelry box),2004,500,2
        6537-1,Hydro Racer,1994,77,50
        6538-1,Rebel Roadster,1994,85,57
        6539-1,Victory Cup Racers,1993,82,459
        6540-1,Pier Police,1991,77,358
        654-1,Crane Lorry,1973,416,33
        6541-1,Intercoastal Seaport,1991,77,552
        6542-1,Launch & Load Seaport,1991,77,1078
        6543-1,Sail N' Fly Marina,1994,77,709
        6544-1,Shuttle Transcon 2,1995,88,346
        6545-1,Search N' Rescue,1996,80,290
        6546-1,Slick Racer,1996,82,39
        65468-1,Toa Metru Twin Pack with Kanoka and Poster,2004,353,3
        6547-1,Fun Fair,1997,90,204
        6548-1,Octan Gas Station,1997,99,127
        6549-1,Roadblock Runners,1997,103,181
        6550-1,Outback Racer,1997,89,48
        655-1,Mobile Hydraulic Lift,1973,416,33
        6551-1,Checkered Flag 500,1992,82,192
        65514-1,Matoran / Vahki Co-Pack 1 (contains 8607 8611 8614 8616 8618),2004,324,5
        65515-1,Matoran / Vahki Co-Pack 2 (contains 8610 8612 8615 8617 8619),2004,324,5
        6552-1,Rocky River Retreat,1993,83,241
        65524-1,Hogwarts Express (2nd edition) Co-Pack (contains 10132 4515 4520),2004,250,3
        65527-1,Vladek's Attack,2004,198,2
        6553-1,Crisis News Crew,1997,89,135
        65535-1,X-Pod Play Off Game Pack,2004,478,7
        65537-1,Classic Freight Train,2004,238,0
        6554-1,Blaze Brigade,1997,98,261
        65542-1,Click-N-Store Jewelry Set Co-Pack (7514 with jewelry box),2004,500,2
        65545-1,Ta-Metru Collector's Pack,2004,324,3
        65549-1,Bionicle Bonus Pack (8615 8617 8619 plus three Bionicle Comic books),2004,357,3
        6555-1,Sea Hunter,1997,86,32
        6556-1,Scuba Squad,1997,86,76
        6557-1,Treasure Hunters,1997,86,143
        65572-1,Spider-Man Co-Pack,2005,488,3
        65573-1,Rumble Racers,2005,116,4
        65579-1,Knights' Kingdom Value Pack 8770 and 8771 with Foam Helmet,2004,198,3
        65580-1,Knights' Kingdom Value Pack 8772 and 8774 with Foam Helmet,2004,198,3
        6558-1,Shark Cage Cove,1997,86,196
        6559-1,Deep Sea Bounty,1997,86,359
        6560-1,Diving Expedition Explorer,1997,86,478
        656-1,Car and Caravan,1974,411,49
        6561-1,Hot Rod Club,1994,82,240
        6562-1,Gas Stop Shop,1995,76,225
        6563-1,Gator Landing,1996,83,237
        6564-1,Recycle Truck,1997,103,35
        65642-1,The Grand Tournament Limited Edition Value Pack,2004,198,3
        6565-1,Construction Crew,1997,97,78
        6566-1,Bank,1997,103,106
        6567-1,Speed Splash,1998,87,28
        6568-1,Drag Race Rally,1998,87,291
        6569-1,Polar Scout,2000,51,2
        6570-1,Snowmobile,1998,51,43
        657-1,Executive Jet,1974,412,36
        6571-1,Flame Fighters,1994,74,433
        65716-1,Limited Edition Collector Pack with Vohtarak Sidorak and Life-Size Toa Hordika Mask (8742 8756),2004,324,3
        6572-1,Wind Runners,1998,87,52
        6573-1,Arctic Expedition,2000,51,120
        65743-1,City Construction Value Pack (7246 7242 7248),2005,56,0
        6575-1,Polar Base,2000,51,440
        65757-1,Special Edition Guardian Toa (8762/8763),2005,349,2
        6576-1,Sledge,1998,51,24
        65767-1,Attack from the Sea,2005,198,2
        65768-1,Jayko Value Pack 8783 and 8772 with Sword and Helmet,2005,198,4
        65769-1,Vladek Value Pack,2005,198,4
        6577-1,Snow Scooter,2000,51,20
        65771-1,Episode III Collectors' Set,2005,168,5
        65777-1,City Fire Value Pack (7238 7239 7240 7241),2005,58,0
        6578-1,Polar Explorer,2000,51,22
        6579-1,Ice Surfer,2000,51,42
        65799-1,City Fire Station Value Pack,2005,58,0
        65800-1,City Construction Set Value Pack,2005,56,0
        6580-1,Land Jet 7,1998,87,114
        65801-1,Trains Value Pack,2005,239,0
        65808-1,Toa Hordika Value Pack,2005,324,4
        658-1,Fire Engine,1974,417,38
        6581-1,Dig 'N' Dump,1996,72,128
        65813-1,Special Edition Co-Pack with Sidorak and Toa Iruini (8756 8762),2005,324,2
        6582-1,Daredevil Flight Squad,1998,87,287
        6584-1,Extreme Team Challenge,1998,87,357
        65844-1,Star Wars Co-Pack of 7255 4492 and 4494,2005,168,3
        65845-1,Star Wars Co-Pack of 7256 4492 and 4494,2005,168,3
        65849-1,Bionicle Co-Pack (contains 8758 and 851097),2005,341,2
        6585-1,Hang-Glider,1998,87,19
        65851-1,Knights Kingdom II Co-Pack (contains 8876 and life size sword),2005,198,2
        6586-1,Polar Scout,2000,51,55
        6589-1,Radical Racer,1998,87,83
        6590-1,Vacation Camper,1988,85,116
        659-1,Police Patrol with Policemen,1975,421,49
        6591-1,Nitro Dragsters,1989,82,144
        6592-1,Vacation Hideaway,1990,69,116
        6593-1,Blaze Battler,1991,74,126
        6594-1,Gas Transit,1992,76,123
        6595-1,Surf Shack,1993,83,93
        6596-1,Wave Master,1995,77,133
        6597-1,Century Skyway,1994,68,905
        6598-1,Metro PD Station,1996,80,567
        6599-1,Shark Attack,1997,86,58
        6600-1,Police Patrol,1981,80,23
        6600-2,Highway Construction,2000,97,316
        660-1,Car with Plane Transporter,1975,397,41
        6601-1,Ice Cream Cart,1985,75,30
        6602-1,Fire Chief's Car,1981,74,24
        6602-2,Scorpion Buggy,2000,91,78
        6603-1,Shovel Truck,1985,72,27
        6604-1,Formula-I Racer,1985,82,31
        6605-1,Road Racer,1984,82,20
        6606-1,Road Repair Set,1983,85,25
        6607-1,Service Truck,1982,85,25
        6608-1,Tractor,1982,73,21
        6609-1,Race Car,1980,82,17
        6610-1,Gas Pumps,1981,76,28
        661-1,Spirit of St. Louis,1976,412,49
        6611-1,Fire Chief's Car,1981,74,20
        66116-1,City Emergency Services Vehicles (Multipack),2006,52,0
        66117-1,Offre Speciale (7235 7236 7238 7241),2007,52,0
        6612-1,Fire Chief's Car,1986,74,29
        6613-1,Telephone Booth,1986,85,26
        66138-1,Toa Hordika Collection,2005,350,6
        6614-1,Launch Evac 1,1995,88,122
        6615-1,Eagle Stunt Flyer,1996,68,75
        66156-1,Airport Value Pack (TRU Exclusive),2006,53,4
        6616-1,Rocket Dragster,2000,91,146
        6617-1,Tough Truck Rally,2000,91,387
        66174-1,Lego Firemen Bundle,2006,58,0
        66175-1,City Rescue Pack,2007,52,0
        66177-1,City Rescue Pack,2007,52,0
        6618-1,Blue Racer,2000,91,23
        66188-1,Creative Building Set,2007,37,2
        6619-1,Red Four Wheel Driver,2000,91,20
        66193-1,City Super Pack (7890 7892 7902 7903),2007,60,0
        66194-1,City Super Pack (7246 7248 7905 7990),2007,56,0
        66195-1,City Super Pack (7238 7239 7241 7942 7945),2007,58,0
        6620-1,Ultimate Accessory Set 500,2006,346,507
        66207-1,Gift Set,2006,351,2
        66208-1,Mr. Magoriums big book (Mr. Magorium's Wonder Emporium),2007,23,9
        662-1,Dumper Lorry,1976,416,27
        6621-1,Fire Truck,1984,74,39
        6622-1,Mailman on Motorcycle,1984,81,30
        66221-1,X-wing Fighter and Luke Pilot Maquette Co-Pack (TRU Exclusive),2007,169,1
        66225-1,Gift Set,2007,389,2
        6623-1,Police Car,1983,80,40
        66237-1,Build & Play Value Pack,2008,37,2
        66239-1,City Super Pack 4 in 1 (7898 7997 7895 7896),2007,240,4
        6624-1,Delivery Van,1983,70,40
        66246-1,City Super Pack (7235 7245 7743),2008,61,3
        66247-1,City Super Pack (7741 7890 7942),2008,52,0
        6625-1,Speed Trackers,1996,80,65
        66255-1,City Super Pack 6 in 1 (7235 7236 7741 7890 7942 7945),2008,52,0
        66256-1,City Super Pack (7242 7733 7990 7991),2008,52,0
        66257-1,City Super Pack 4 in 1 (7235 7236 7741 7744),2008,61,4
        66258-1,City Super Pack (7990 7991 7993),2008,52,3
        66260-1,City Super Pack (7733 7734 7992),2008,54,3
        6626-1,Rescue Helicopter,1981,78,36
        6626-2,Snow Scooter,2000,51,20
        6627-1,Convertible,1980,85,37
        6628-1,Shell Tow Truck,1981,76,38
        6628-2,Construction Workers,1984,84,20
        66282-1,City Police Co-Pack,2008,61,2
        66284-1,LEGO Build and Play Value Pack,2009,37,2
        66290-1,City Super Pack 4 in 1 (4210 7736 7737 7738),2008,55,4
        6629-1,Ambulance,1981,78,39
        6630-1,Bucket Loader,1981,72,34
        66305-1,City Super Pack 3 in 1 (7235 7245 7743),2009,61,3
        66306-1,City Super Pack 3 in 1 (7736 7737 7738),2009,55,3
        66307-1,City Super Pack (7245 7732 8401),2009,52,3
        66308-1,Star Wars Super Pack 3 in 1 (7667 7668 8017),2009,169,3
        663-1,Hovercraft,1977,419,60
        6631-1,Steam Shovel,1985,72,48
        66311-1,LEGO Creative Value Pack (TRU Exclusive),2010,37,2
        66318-1,Technic Super Pack 4 in 1 (8259 8290 8293 8294),2009,7,4
        66319-1,Power Miners Super Pack 3 in 1 (8709 8958 8959),2009,439,3
        6632-1,Tactical Patrol Truck,1985,80,44
        66325-1,City Super Pack 4 in 1 (7898 7997 7895 7896),2009,240,4
        66326-1,City Super Pack 4 in 1 (7239 7245 8401 7638),2009,52,0
        66328-1,City Super Pack 6 in 1 (7630 5610 5612 5613 7942 7236),2009,52,0
        66329-1,City Super Pack 3 in 1 (7236 7741 7942),2009,52,3
        66330-1,City Super Pack 5 in 1 (7632 7746 7990 8401 5620),2009,52,5
        6633-1,Family Car,1985,85,46
        66331-1,City Super Pack 3 in 1 (7630 7633 7990),2009,56,3
        6634-1,Stock Car,1986,82,46
        66341-1,Star Wars Super Pack 3 in 1 (8014 8015 8091),2010,165,3
        66342-1,City Super Pack 3 in 1 (7213 7241 7942),2010,58,0
        66345-1,City Super Pack 4 in 1 (3177 7241 7634 7638),2010,52,0
        66357-1,City Super Pack 4 in 1 (7208 7239 7241 7942),2010,58,0
        66358-1,City Super Pack 3 in 1 (7634 7635 7684),2010,57,3
        66359-1,Technic Super Pack 4 in 1 (8049 8259 8260 8293),2010,1,4
        66360-1,City Super Pack 4 in 1 (7207 7213 7241 7942),2010,58,0
        6636-1,Police Headquarters,2002,100,291
        66362-1,City Super Pack 4 in 1 (3177 3179 8401 8402),2010,52,4
        66363-1,City Super Pack 4 in 1 (7235 7236 7245 7741),2010,61,4
        66364-1,Star Wars Super Pack 3 in 1 (7749 8083 8084),2010,169,3
        66365-1,Atlantis Super Pack 4 in 1 (8057 8058 8059 8080),2010,315,4
        66366-1,Star Wars Super Pack  3 in 1 (8089 8083 7749),2010,169,3
        66368-1,Star Wars Super Pack 3 in 1 (8083 8084 8092),2010,169,3
        6637-1,Ultimate Battle Set,2005,346,5
        66373-1,Fun Favor Pack,2010,22,0
        66374-1,City Super Pack 4 in 1 (7895 7896 7937 7939),2010,233,4
        66375-1,City Super Pack 4 in 1 (7235 7286 7279 7741),2011,61,4
        66377-1,Star Wars Super Pack 3 in 1 (7869 7913 7914),2011,165,3
        66378-1,Star Wars Super Pack 3 in 1 (8085 7913 7914),2011,165,3
        66380-1,LEGO Creative Value Pack (TRU UK Exclusive),2011,37,2
        6638-1,Ultimate Creatures Accessory Set (Special Edition) 300+ Pieces,2006,346,287
        66383-1,Ninjago Super Pack 3 in 1 (2258 2259 2519),2011,435,3
        66386-1,Cars 2 Super Pack 3 in 1 (8206 8426 8487),2011,269,3
        66387-1,Cars 2 Super Pack 3 in 1 (8200 8201 8206),2011,269,3
        66388-1,City Super Pack 4 in 1 (7498 7235 7279 7285),2011,61,4
        66389-1,City Super Pack 5 in 1 (7288 7279 7285 7286 7741),2011,61,5
        6639-1,Raven Racer,1995,82,70
        66394-1,Ninjago Super Pack 3 in 1 (2506 2259 2260),2011,435,3
        66395-1,Star Wars Super Pack 3 in 1 (7957 7913 7914),2011,158,3
        66396-1,Star Wars Super Pack 3 in 1 (7877 7929 7913),2011,166,3
        66397-1,Technic Super Pack 4 in 1 (8047 8065 8067 8069),2011,1,4
        66405-1,City Super Pack 4 in 1 (7939 7937 7499 7895),2010,233,4
        66409-1,Cars Super Pack 3 in 1 (9478 8201 9485),2012,269,3
        664-1,TV Crew,1977,397,47
        6641-1,4-Wheelin' Truck,1987,79,81
        66411-1,Star Wars Super Pack 3 in 1 (9488 9489 9495),2012,158,3
        66414-1,"Hero Factory Super Pack 2 in 1 (2143, 2145)",2012,401,2
        6642-1,Police Helicopter,1988,80,65
        66427-1,"City Super Pack 4 in 1 (4436, 4437, 4439, 4441)",2012,61,4
        6643-1,Fire Truck,1988,74,74
        66432-1,"Star Wars Super Pack 3 in 1 (9490, 9492, 9496)",2012,158,3
        66434-1,"Friends Super Pack 3 in 1 (3187, 3934, 3935)",2012,494,3
        66436-1,"City Super Pack 2 in 1 (4436, 4437)",2012,61,2
        6644-1,Road Rebel,1990,85,72
        66448-1,"City Super Pack 3 in 1 (60000, 60001, 60002)",2013,58,3
        66450-1,"Legends of Chima Super Pack 3 in 1 (70000, 70001, 70003)",2013,571,3
        6645-1,Street Sweeper,1991,85,65
        66452-1,"Hero Factory Super Pack 2 in 1 (6282, 6283)",2012,400,2
        6646-1,Screaming Patriot,1991,82,65
        6647-1,Highway Repair,1980,85,54
        6648-1,Mag Racer,1992,82,61
        6648-2,Dump Truck,1980,72,42
        6649-1,Street Sweeper,1995,85,63
        66492-1,"City Super Pack 3 in 1 (60041, 60042, 60046)",2014,61,3
        66495-1,"Star Wars Super Pack 3 in 1 (75037, 75038, 75045)",2014,170,3
        6650-1,Fire and Rescue Van,1981,74,46
        6651-1,Post Office Van,1982,81,46
        66514-1,"Star Wars Microfighters Super Pack 3 in 1 (75028, 75029, 75030)",2014,159,3
        6652-1,Construction Truck,1983,72,44
        6653-1,Highway Emergency Van,1982,85,56
        6654-1,Motorcycle Transport,1983,85,54
        6655-1,Auto & Tire Repair,1984,85,58
        6656-1,Tow Truck,1985,85,53
        6657-1,Fire Patrol Copter,1985,74,66
        6658-1,Bulldozer,1986,72,65
        6659-1,TV Camera Crew,1986,79,66
        6660-1,Hook & Haul Wrecker,1989,79,52
        6661-1,Mobile TV Studio,1989,85,80
        6662-1,Backhoe,1992,72,87
        6663-1,Wave Rebel,1993,77,78
        6664-1,Chopper Cops,1993,80,71
        6665-1,River Runners,1994,83,77
        6666-1,Ambulance,1994,78,78
        6667-1,Pothole Patcher,1993,85,97
        6668-1,Recycle Truck,1992,85,108
        6669-1,Diesel Daredevil,1991,82,90
        6670-1,Rescue Rig,1993,85,114
        6671-1,Utility Repair Lift,1989,85,107
        6672-1,Safari Off-Road Vehicle,1990,79,67
        6673-1,Solo Trainer,1990,68,74
        6674-1,Crane Truck,1988,85,94
        6675-1,Road & Trail 4x4,1988,79,81
        6676-1,Mobile Command Unit,1986,80,99
        6677-1,Motocross Racing,1986,82,75
        6678-1,Pneumatic Crane,1980,72,61
        6679-1,Dark Shark,1991,77,82
        6679-2,Exxon Tow Truck,1980,85,78
        6680-1,Ambulance,1981,78,63
        6681-1,Police Van,1981,80,81
        6682-1,Cement Mixer,1985,72,90
        6683-1,Burger Stand,1983,75,68
        6684-1,Police Patrol Squad,1984,80,81
        6685-1,Fire Copter 1,1982,74,98
        6686-1,Backhoe,1984,72,88
        6687-1,Turbo Prop I,1987,68,78
        6688-1,Ambulance,1985,78,72
        6689-1,Post-Station,1985,81,54
        6690-1,Snorkel Pumper,1980,74,103
        6691-1,Red Cross Helicopter,1981,78,107
        6692-1,Tractor Trailer,1983,70,97
        6693-1,Refuse Collection Truck,1987,85,114
        6694-1,Car with Camper,1984,85,109
        6695-1,Shell Tanker,1984,76,106
        6696-1,Exxon Fuel Tanker,1984,76,106
        6697-1,Rescue-I Helicopter,1985,71,85
        6698-1,RV with Speedboat,1986,77,129
        6699-1,Cycle Fix-It Shop,1987,85,81
        670-1,Mobile Crane,1978,72,55
        6701-1,Minifig Pack,1983,143,36
        6702-1,Minifig Pack,1986,143,43
        6703-1,Minifig Pack,1988,143,42
        6704-1,Minifig Pack,1991,143,44
        6705-1,Space Explorers,1994,143,39
        6706-1,Frontier Patrol,1997,476,27
        6707-1,Green Buggy,2000,91,23
        6709-1,Tribal Chief,1997,477,16
        670F-1,Wheels Pack,2004,119,10
        6710-1,Space Landing Pads,1991,143,2
        671-1,Shell Fuel Tanker,1978,76,73
        6711-1,Space Mini-Figs,1983,143,24
        6712-1,Sheriff's Showdown,1996,476,28
        6713-1,Grip 'n' Go Challenge,2000,91,283
        6714-1,Speed Dragster,2000,91,80
        6716-1,Covered Wagon,1996,476,65
        6718-1,Raindance Ridge,1997,477,73
        6719-1,Brachiosaurus,2001,386,25
        671F-1,Antenna Pack,2004,119,13
        6720-1,Tyrannosaurus Rex,2001,386,23
        672-1,Fire Emergency Van,1978,74,65
        6721-1,Mosasaurus,2001,386,26
        6722-1,Styracosaurus,2001,386,19
        673-1,Rally Repair Crew,1978,85,60
        6731-1,Skateboarding Pepper,2002,407,13
        6732-1,Brickster's Trike,2002,407,17
        6733-1,Snap's Cruiser,2002,407,19
        6734-1,Beach Cruiser,2002,407,54
        6735-1,Air Chase,2002,407,85
        6736-1,Beach Lookout,2002,407,88
        6737-1,Wake Rider (Wave Catcher),2002,407,92
        6738-1,Skateboard Challenge,2002,407,116
        6739-1,Truck and Stunt Trikes,2002,407,198
        673F-1,Gearbox Pack,2004,119,6
        6740-1,Tower,2002,407,332
        674-1,Forklift & Truck,1978,72,55
        6741-1,Mini Jet,2009,24,63
        6742-1,Mini Off-Roader,2009,22,64
        6743-1,Street Speeder,2009,39,165
        6745-1,Propellor Power,2009,42,247
        6746-1,Chief's Tepee,1997,477,135
        6747-1,Race Rider,2009,41,266
        6748-1,Boulder Cliff Canyon,1997,477,256
        6750-1,Sonic Robot,1986,130,110
        675-1,Snack Bar,1979,75,64
        6751-1,Fiery Legend,2009,40,479
        6752-1,Fire Truck,2009,47,771
        6753-1,Highway Transport,2009,39,1294
        6754-1,Family Home,2009,43,978
        6755-1,Sheriff's Lock-Up,1996,476,177
        6758-1,Read & Build Grow Caterpillar Grow,2012,504,18
        6759-1,Read & Build Busy Farm,2012,504,16
        6760-1,Read & Build Let's Go Vroom,2012,504,13
        6761-1,Bandit's Secret Hide-Out,1996,476,249
        6762-1,Fort Legoredo,2002,476,687
        6763-1,Rapid River Village,2002,477,354
        6764-1,Sheriff's Lock-Up,2002,476,176
        6765-1,Gold City Junction,1996,476,351
        6766-1,Rapid River Village,1997,477,354
        6769-1,Fort Legoredo,1996,476,687
        6770-1,Lunar Transporter Patroller,1988,132,117
        677-1,Knight's Procession,1979,189,48
        6771-1,Ogel Command Striker,2001,304,29
        6772-1,Alpha Team Cruiser,2001,304,56
        6773-1,Alpha Team Helicopter,2001,304,78
        6774-1,Alpha Team ATV,2001,304,134
        6775-1,Alpha Team Bomb Squad,2001,304,191
        6776-1,Ogel Control Center,2001,304,414
        6780-1,XT Starship,1986,130,199
        6781-1,SP-Striker,1989,139,230
        6783-1,Sonar Transmitting Cruiser,1986,130,348
        6784-1,Creative Sorter,2012,504,26
        6785-1,Creative Cakes,2012,504,56
        6790-1,Bandit's Wheelgun (Boxed),1997,476,20
        6791-1,Bandit's Wheelgun,1997,476,20
        6799-1,Showdown Canyon,1997,476,74
        6800-1,Cyber Blaster,1997,144,20
        680-1,Low-Loader and Crane,1971,416,62
        6801-1,Moon Buggy,1981,130,22
        6802-1,Space Probe,1986,130,26
        6803-1,Space Patrol,1983,130,25
        6804-1,Surface Rover,1984,130,21
        6805-1,Astro Dasher,1985,130,29
        6806-1,Surface Hopper,1985,130,23
        6807-1,Space Sledge with Astronaut and Robot,1985,130,24
        6808-1,Galaxy Trekkor,1987,130,29
        6809-1,XT-5 and Droid,1988,130,37
        6810-1,Laser Ranger,1989,132,41
        681-1,Low-Loader with 4 Wheel Excavator,1971,416,63
        6811-1,Pulsar Charger,1990,136,26
        6812-1,Grid Trekkor,1991,129,25
        6813-1,Galactic Chief,1993,140,24
        6814-1,Ice Tunnelator,1993,133,25
        6815-1,Hovertron,1996,131,27
        6816-1,Cyber Blaster,1997,144,20
        6817-1,Beta Buzzer,1998,134,32
        6818-1,Cyborg Scout,1997,144,36
        6820-1,Starfire I,1986,130,34
        682-1,Low-Loader and Tractor,1971,416,57
        6821-1,Shovel Buggy,1980,130,28
        6822-1,Space Digger,1981,130,33
        6823-1,Surface Transport,1983,130,27
        6824-1,Space Dart I,1984,130,48
        6825-1,Cosmic Comet,1985,130,40
        6826-1,Crater Crawler,1985,130,32
        6827-1,Strata Scooter,1987,130,35
        6828-1,Twin-Winged Spoiler,1988,132,57
        6829-1,Radon Rover,1997,144,53
        6830-1,Space Patroller,1988,132,51
        683-1,Articulated Lorry,1971,397,58
        6831-1,Message Decoder,1989,139,34
        6832-1,Super Nova II,1991,129,42
        6833-1,Beacon Tracer,1990,136,40
        6834-1,Celestial Sled,1993,133,55
        6835-1,Saucer Scout,1994,142,47
        6836-1,V-Wing Fighter,1997,144,40
        6837-1,Cosmic Creeper,1998,134,57
        684-1,Low-Loader with Fork Lift Truck,1972,416,53
        6841-1,Mineral Detector,1980,130,44
        6842-1,Shuttle Craft,1981,130,46
        6844-1,Seismologic Vehicle (Sismobile),1983,130,46
        6845-1,Cosmic Charger,1986,130,51
        6846-1,Tri-Star Voyager,1984,130,69
        6847-1,Space Dozer,1985,130,49
        6848-1,Strategic Pursuer,1988,132,62
        6848-2,Interplanetary Shuttle,1985,130,54
        6848-3,Strategic Pursuer,1988,126,62
        6849-1,Satellite Patroller,1987,130,47
        6850-1,Auxiliary Patroller,1989,132,46
        685-1,Truck with Trailer,1972,397,50
        6851-1,Tri-Wheeled Tyrax,1991,129,38
        685-2,Truck with Trailer (without Stickers),1972,397,50
        6852-1,Sonar Security,1993,140,61
        6854-1,Alien Fossilizer,1996,131,51
        6856-1,Planetary Decoder,1996,131,78
        6857-1,The Dynamic Duo Funhouse Escape,2012,484,378
        6858-1,Catwoman Catcycle City Chase,2012,484,89
        6860-1,The Batcave,2012,484,689
        686-1,Tipper Trucks and Loader,1973,416,70
        6861-1,X1 Patrol Craft,1980,130,55
        6861-2,Super Model Building Instruction,1993,129,1
        6862-1,Secret Space Voyager,1991,136,254
        6862-2,Superman vs Power Armour Lex,2012,489,208
        6863-1,Batwing Battle Over Gotham City,2012,484,277
        6864-1,Batmobile and the Two-Face Chase,2012,484,541
        6865-1,Captain America's Avenging Cycle,2012,487,71
        6866-1,Wolverine's Chopper Showdown,2012,491,199
        6867-1,Loki's Cosmic Cube Escape,2012,487,180
        6868-1,Hulk’s Helicarrier Breakout,2012,487,385
        6869-1,Quinjet Aerial Battle,2012,487,748
        6870-1,Space Probe Launcher,1981,130,60
        687-1,Caravelle Plane,1973,412,48
        6871-1,Star Patrol Launcher,1984,130,71
        6872-1,Xenon X-Craft,1986,130,76
        6873-1,Spider-Man's Doc Ock Ambush,2012,488,295
        6874-1,Moon Rover,1986,130,66
        6875-1,Hovercraft,1988,132,93
        6876-1,Alienator,1988,128,92
        6877-1,Vector Detector,1990,136,62
        6878-1,Sub Orbital Guardian,1991,129,75
        6879-1,Blizzard Baron,1993,133,83
        6880-1,Surface Explorer,1982,130,83
        688-1,Shell Double Tanker,1973,418,63
        6881-1,Lunar Rocket Launcher,1984,130,98
        6882-1,Walking Astro Grappler,1985,130,102
        6883-1,Terrestrial Rover,1987,130,109
        6884-1,Aero Module,1987,132,107
        6885-1,Saturn Base Main Team (Crater Crawler),1988,132,101
        6886-1,Galactic Peace Keeper,1989,139,121
        6887-1,Allied Avenger,1991,129,100
        6889-1,Recon Robot,1994,142,136
        6890-1,Cosmic Cruiser,1982,130,115
        689-1,Mobile Crane,1974,416,46
        6891-1,Gamma V Laser Craft,1985,130,135
        6892-1,Modular Space Transport,1986,130,150
        6893-1,Orion II Hyperspace,1987,132,162
        6894-1,Invader,1987,128,159
        6895-1,Spy-Trak 1,1989,139,152
        6896-1,Celestial Forager,1990,136,92
        6897-1,Rebel Hunter,1992,140,146
        6898-1,Ice-Sat V,1993,133,136
        6899-1,Nebula Outpost,1996,131,156
        6900-1,Cyber Saucer,1997,144,112
        690-1,Shell Station,1974,418,73
        6901-1,Mobile Lab,1980,130,139
        6901-2,Space Plane,1998,144,20
        6902-1,Space Plane,1998,144,20
        6903-1,Bug Blaster,1998,134,24
        6905-1,Bi-Wing Blaster,1998,134,112
        6907-1,Sonic Stinger,1998,134,95
        6909-1,Sonic Stinger with Promotional Mask,1998,134,96
        6910-1,Mini Sports Car,2012,22,70
        691-1,Rescue Helicopter,1974,417,62
        6911-1,Mini Fire Truck,2012,22,69
        6912-1,Super Soarer,2012,22,130
        6913-1,Blue Roadster,2012,22,152
        6914-1,T-Rex,2012,22,191
        6915-1,Warp Wing Fighter,1997,144,234
        6918-1,Blacksmith Attack,2011,196,110
        6919-1,Planetary Prowler,1998,134,248
        692-1,Road Repair Crew,1975,416,59
        6921-1,Monorail Accessory Track,1988,132,46
        6923-1,Particle Ionizer,1990,136,192
        6925-1,Interplanetary Rover,1988,132,211
        6926-1,Mobile Recovery Vehicle,1986,130,150
        6927-1,All-Terrain Vehicle,1981,130,173
        6928-1,Uranium Search Vehicle,1984,130,201
        6929-1,Star Fleet Voyager,1981,130,246
        6930-1,Space Supply Station,1983,130,206
        693-1,Fire Engine with Firemen,1975,417,72
        6931-1,FX Star Patroller,1985,130,227
        6932-1,Stardefender 200,1987,132,251
        6933-1,Spectral Starguider,1991,129,212
        6934-1,BIONICLE Good Guy Polybag (Disney Promotional Sweden),2006,324,16
        6935-1,BIONICLE Bad Guy (Disney Promotional Sweden),2006,324,16
        6936-1,Piraka & Catapult,2007,324,20
        6937-1,Give Away,2006,324,2
        6938-1,Scorpion Detector,1996,131,196
        6939-1,Saucer Centurion,1994,142,222
        6940-1,Alien Moon Stalker,1986,130,268
        694-1,Transport Truck,1975,397,64
        6941-1,Battrax,1987,128,284
        6942-1,Zo Weevil,1999,134,20
        6943-1,Zo Weevil,1999,134,20
        6944-1,Good Guy 07,2007,324,20
        6945-1,Bad Guy,2007,324,25
        6946-1,Squid Launcher Function,2007,324,23
        6949-1,Robo-Guardian,1994,142,366
        6950-1,Mobile Rocket Transport,1982,130,210
        695-1,Racing Car,1976,397,67
        6951-1,Robot Command Center,1984,130,295
        6952-1,Solar Power Transporter,1985,130,305
        6953-1,Cosmic Laser Launcher,1987,132,211
        6954-1,Renegade,1987,128,315
        6955-1,Space Lock-Up Isolation Base,1989,139,253
        6956-1,Stellar Recon Voyager,1990,136,233
        6957-1,Solar Snooper,1992,140,253
        6958-1,Android Base,1996,131,268
        6959-1,Lunar Launch Site,1994,142,287
        696-1,Bus Stop,1976,397,80
        6963-1,X-wing Fighter - Mini (Kabaya Box),2004,159,41
        6963-2,X-wing Fighter - Mini (Polybag),2004,159,41
        6964-1,Boba Fett's Slave I - Mini (Kabaya Box),2004,159,25
        6964-2,Boba Fett's Slave I - Mini (Polybag),2004,159,25
        6965-1,TIE Interceptor - Mini (Kabaya Box),2004,159,32
        6965-2,TIE Interceptor - Mini (Polybag),2005,163,32
        6966-1,Jedi Starfighter - Mini,2005,159,38
        6966-2,Jedi Starfighter - Mini - Korean Duracell promo package with 8 AA batteries,2005,159,38
        6967-1,ARC-170 Starfighter - Mini,2005,159,42
        6967-2,ARC-170 Starfighter - Mini - Korean Duracell promo package with 8 AA batteries,2005,159,42
        6968-1,Mini Wookiee Attack,2005,159,48
        6969-1,Celestial Stinger,1998,134,253
        6970-1,Beta I Command Base,1980,130,270
        697-1,Stagecoach,1976,397,96
        6971-1,Inter-Galactic Command Base,1984,130,329
        697-2,Idea Book 697,1997,497,2
        6972-1,Polaris I Space Lab,1987,130,390
        6973-1,Deep Freeze Defender,1993,133,417
        6975-1,Alien Avenger,1997,144,370
        6977-1,Arachnoid Star Base,1998,134,434
        6979-1,Interstellar Starfighter,1997,144,291
        6980-1,Galaxy Commander,1983,130,443
        698-1,JAL Boeing 727,1977,412,45
        6981-1,Aerial Intruder,1991,129,267
        6982-1,Explorien Starship,1996,131,658
        6983-1,Ice Station Odyssey,1993,133,345
        6984-1,Galactic Mediator,1992,140,406
        6985-1,Cosmic Fleet Voyager,1986,130,413
        6986-1,Mission Commander,1989,139,478
        6987-1,Message Intercept Base,1988,128,577
        6987-2,Message Intercept Base,1988,128,575
        6988-1,Alpha Centauri Outpost,1991,129,406
        6989-1,Mega Core Magnetizer,1990,136,509
        6990-1,Monorail Transport System,1988,132,731
        699-1,Photo Safari,1977,397,129
        6991-1,Monorail Transport Base,1994,145,571
        6999-1,Cyber Saucer,1997,144,113
        70000-1,Razcal's Glider,2013,571,108
        7000-1,Baby Ankylosaurus,2001,386,37
        70001-1,Crawley’s Claw Ripper,2013,571,138
        70002-1,Lennox' Lion Attack,2013,571,229
        70003-1,Eris' Eagle Interceptor,2013,571,345
        70004-1,Wakz' Pack Tracker,2013,571,295
        70005-1,Laval's Royal Fighter,2013,571,416
        70006-1,Cragger’s Command Ship,2013,571,607
        70007-1,Eglor's Twin Bike,2013,571,224
        70008-1,Gorzan’s Gorilla Striker,2013,571,503
        70009-1,Worriz’s Combat Lair,2013,571,657
        700-1,10 x 20 Brickplate,1966,371,6
        70010-1,The Lion CHI Temple,2013,571,1257
        7001-1,Baby Iguanodon,2001,386,23
        700.1.1-1,Individual 2 x 4 Bricks,1950,371,10
        70011-1,Eagles’ Castle,2013,572,372
        700.1-2,Gift Package,1957,366,0
        700.1.2-1,Individual 2 x 2 Bricks,1950,371,9
        70012-1,Rubber Bands,1985,453,20
        70012-2,Razar’s CHI Raider,2013,571,412
        70013-1,Equila's Ultra Striker,2013,571,340
        700.1.4-1,Individual 1 x 2 Bricks,1953,371,1
        70014-1,The Croc Swamp Hideout,2013,571,645
        700.16-1,Individual 2 x 8 Bricks,1954,371,5
        700.20-1,Individual 2 x 10 Bricks,1954,371,5
        7002-1,Baby Brachiosaurus,2001,386,31
        700.2-2,Gift Package,1957,366,0
        700.24-1,Individual 2 x 12 Bricks,1954,371,5
        700.28-1,Individual 2 x 14 Bricks,1954,371,5
        7003-1,Baby Dimetrodon,2001,386,20
        700.3.4-1,Individual 2 x 3 Bricks,1953,371,5
        700.3A-2,Gift Package,1957,372,0
        7009-1,The Final Joust,2007,193,62
        700.A-1,Automatic Binding Bricks Small Brick Set (Lego Mursten),1950,366,24
        700.B-1,Early LEGO Windows/Doors (without Glass),1953,371,12
        700.B.1-1,Individual 1 x 4 x 2 Window (without glass),1950,371,7
        700.B.2-1,Individual 1 x 2 x 3 Window (without glass),1950,371,7
        700.B.3-1,Individual 1 x 2 x 2 Window (without glass),1950,371,7
        700.B.4-1,Individual 1 x 2 x 4 Door (without glass),1950,371,7
        700.C-1,Tall Classic Windows/Door (with Glass),1954,371,24
        700.C.1-1,Individual 1 x 6 x 4 Panorama Window (with glass),1954,371,4
        700.C.2-1,Individual 1 x 6 x 3 3-Pane Window (with glass),1954,371,4
        700.C.3-1,Individual 1 x 6 x 3 Shutter Window (with glass),1954,371,4
        700.C.4-1,Individual 1 x 4 x 3 Window (with glass),1954,371,4
        700.C.5-1,Individual 1 x 3 x 3 Window (with glass),1954,371,4
        700.C.6-1,Individual 1 x 2 x 4 Door (with glass),1954,371,4
        700.F-1,Automatic Binding Bricks - Small Brick Set (Lego Mursten),1953,371,48
        700GP0-1,Gift Package,1957,372,244
        700GP5-1,Gift Package (Lego Mursten),1954,372,54
        700GP6-1,Gift Package (Lego Mursten),1954,372,46
        700GP6-2,Gift Package,1957,372,46
        700.H-1,Individual 4 x 4 Corner Bricks,1954,371,5
        700K-1,Kindergarten LEGO Set,1960,513,476
        700L-1,Empty Kindergarten LEGO Box,1961,513,1
        70100-1,Ring of Fire,2013,572,78
        70101-1,Target Practice,2013,572,101
        70102-1,CHI Waterfall,2013,572,106
        70103-1,Boulder Bowling,2013,572,93
        70104-1,Jungle Gates,2013,572,81
        70105-1,Nest Dive,2013,572,97
        70106-1,Ice Tower,2013,572,101
        70107-1,Skunk Attack,2013,572,97
        70108-1,Royal Roost,2013,572,100
        70109-1,Whirling Vines,2013,572,77
        701-1,Hinges,1984,443,3
        70110-1,Tower Target,2013,572,86
        70111-1,Swamp Jump,2013,572,86
        70112-1,Croc Chomp,2013,572,100
        70113-1,CHI Battles,2013,572,92
        70114-1,Sky Joust,2013,572,117
        70115-1,Ultimate Speedor Tournament,2013,572,236
        70123-1,Lion Legend Beast,2014,574,119
        70124-1,Eagle Legend Beast,2014,574,103
        70125-1,Gorilla Legend Beast,2014,574,107
        70126-1,Crocodile Legend Beast,2014,574,120
        70127-1,Wolf Legend Beast,2014,574,109
        70128-1,Braptor's Wing Striker,2014,571,145
        70129-1,Lavertus' Twin Blade,2014,571,181
        701-3,Hinges,1986,443,6
        70130-1,Sparratus' Spider Stalker,2014,571,291
        70131-1,Rogon's Rock Flinger,2014,571,256
        70132-1,Scorm's Scorpion Stinger,2014,571,433
        70133-1,Spinlyn's Cavern,2014,571,406
        70134-1,Lavertus’ Outland Base,2014,571,681
        70135-1,Cragger's Fire Striker,2014,571,379
        70136-1,Banana Bash,2014,572,115
        70137-1,Bat Strike,2014,572,91
        70138-1,Web Dash,2014,571,69
        70139-1,Sky Launch,2014,572,106
        70140-1,Stinger Duel,2014,572,75
        70141-1,Vardy's Ice Vulture Glider,2014,571,216
        70142-1,Eris' Fire Eagle Flyer,2014,571,329
        70143-1,Sir Fangar's Sabre-Tooth Walker,2014,571,414
        70144-1,Laval's Fire Lion,2014,571,448
        70145-1,Maula’s Ice Mammoth Stomper,2014,571,598
        70146-1,Flying Phoenix Fire Temple,2014,571,1299
        70147-1,Sir Fangar’s Ice Fortress,2014,571,670
        70149-1,Scorching Blades,2014,572,72
        70150-1,Flaming Claws,2014,572,69
        7015-1,Viking Warrior challenges the Fenris Wolf,2005,474,76
        70151-1,Frozen Spikes,2014,572,72
        70155-1,Inferno Pit,2014,572,69
        70156-1,Fire vs. Ice,2014,572,92
        70160-1,Riverside Raid,2014,303,88
        7016-1,Viking Boat against the Wyvern Dragon,2005,474,111
        70161-1,Tremor Track Infiltration,2014,303,240
        70162-1,Infearno Interception,2014,303,311
        70163-1,Toxikita's Toxic Meltdown,2014,303,428
        70164-1,Hurricane Heist,2014,303,586
        70165-1,Ultra Agents Mission HQ,2014,303,1056
        70166-1,Spyclops Infiltration,2015,303,108
        70167-1,Invizable Gold Getaway,2015,303,236
        70168-1,Drillex Diamond Job,2015,303,311
        70169-1,4x4 Agent Patrol,2015,303,473
        70170-1,UltraCopter vs. AntiMatter,2015,303,611
        7017-1,Viking Catapult versus the Nidhogg Dragon,2005,474,224
        70171-1,Ultrasonic Showdown,2015,303,184
        70172-1,AntiMatter’s Portal Hideout,2015,303,472
        70173-1,Ultra Agents Ocean HQ,2015,303,1201
        7018-1,Viking Ship challenges the Midgard Serpent,2005,474,581
        7019-1,Viking Fortress against the Fafnir Dragon,2005,474,1040
        70200-1,CHI Laval,2013,573,55
        7020-1,Army of Vikings with Heavy Artillery Wagon,2006,474,270
        70201-1,CHI Eris,2013,573,67
        70202-1,CHI Gorzan,2013,573,58
        70203-1,CHI Cragger,2013,573,65
        70204-1,CHI Worriz,2013,573,55
        70205-1,CHI Razar,2013,573,68
        70206-1,CHI Laval,2014,573,49
        70207-1,CHI Cragger,2014,573,58
        70208-1,CHI Panthar,2014,573,59
        70209-1,CHI Mungus,2014,573,64
        702-1,12V Motor with Accessories Pack,1969,242,25
        70210-1,CHI Vardy,2014,573,68
        7021-1,Viking Double Catapult versus the Armored Ofnir Dragon,2006,474,486
        70211-1,CHI Fluminox,2014,573,91
        70212-1,CHI Sir Fangar,2014,573,97
        70220-1,Strainor's Saber Cycle,2015,571,160
        70221-1,Flinx's Ultimate Phoenix,2015,571,172
        70222-1,Tormak's Shadow Blazer,2015,571,310
        70223-1,Icebite's Claw Driller,2015,571,628
        70224-1,Tiger’s Mobile Command,2015,571,710
        70225-1,Bladvic's Rumble Bear,2015,571,414
        70226-1,Mammoth’s Frozen Stronghold,2015,571,619
        70227-1,King Crominus’ Rescue,2015,571,861
        70228-1,Vultrix's Sky Scavenger,2015,571,479
        70229-1,Lion Tribe Pack,2015,571,78
        702-3,Motor Wires,1984,443,2
        70230-1,Ice Bear Tribe Pack,2015,571,75
        70231-1,Crocodile Tribe Pack,2015,571,72
        70232-1,Sabre Tooth Tiger Pack,2015,571,74
        7029-1,Skeleton Ship Attack,2007,193,629
        7030-1,Squad Car,2003,111,51
        703-1,12V Replacement Electric Motor,1969,242,1
        70310-1,Knighton Battle Blaster,2016,605,76
        7031-1,Helicopter,2003,111,87
        70311-1,Chaos Catapult,2016,605,93
        70312-1,Lance's Mecha Horse,2016,605,237
        70313-1,Moltor's Lava Smasher,2016,605,187
        70314-1,Beast Master's Chaos Chariot,2016,605,311
        70315-1,Clay's Rumble Blade,2016,605,366
        70316-1,Jestro’s Evil Mobile,2016,605,658
        70317-1,The Fortrex,2016,605,1134
        70318-1,The Glob Lobber,2016,605,95
        70319-1,Macy's Thunder Mace,2016,605,201
        70320-1,Aaron Fox's Aero-Striker V2,2016,605,301
        7032-1,Highway Patrol & Undercover Van,2003,111,153
        70321-1,General Magmar's Siege Machine of Doom,2016,605,514
        70322-1,Axl’s Tower Carrier,2016,605,668
        70323-1,Jestro’s Volcano Lair,2016,605,1184
        70324-1,Merlok's Library 2.0,2016,605,257
        70325-1,Infernox captures the Queen,2016,605,251
        70326-1,The Black Knight Mech,2016,605,529
        70327-1,The King's Mech,2016,605,354
        703-3,Battery Box,1984,443,1
        70330-1,ULTIMATE Clay,2016,605,72
        7033-1,Armored Car Action,2003,111,179
        70331-1,Ultimate Macy,2016,605,101
        70332-1,Ultimate Aaron,2016,605,82
        70333-1,Ultimate Robin,2016,605,75
        70334-1,Ultimate Beast Master,2016,605,64
        70335-1,Ultimate Lavaria,2016,605,69
        70336-1,Ultimate Axl,2016,605,69
        70337-1,Ultimate Lance,2016,605,75
        70338-1,Ultimate General Magmar,2016,605,64
        70339-1,Ultimate Flama,2016,605,68
        7034-1,Surveillance Truck,2003,111,260
        70347-1,King's Guard Artillery,2017,605,98
        70348-1,Lance's Twin Jouster,2017,605,215
        70349-1,Ruina's Lock & Roller,2017,605,200
        70350-1,The Three Brothers,2017,605,266
        7035-1,Police HQ,2003,111,422
        70351-1,Clay's Falcon Fighter Blaster,2017,605,520
        70352-1,Jestro's Headquarters,2017,605,816
        70358-1,Aaron's Stone Destroyer,2017,605,245
        70359-1,Lance vs. lightning,2017,605,252
        7036-1,Dwarves' Mine,2008,193,569
        70362-1,Battle Suit Clay,2017,605,79
        70363-1,Battle Suit Macy,2017,605,66
        70364-1,Battle Suit Aaron,2017,605,80
        70365-1,Battle Suit Axl,2017,605,87
        70366-1,Battle Suit Lance,2017,605,83
        7037-1,Tower Raid,2008,193,364
        70372-1,Combo NEXO Powers Wave 1,2017,605,5
        7038-1,Troll Assault Wagon,2008,193,161
        70400-1,Forest Ambush,2013,186,90
        7040-1,Dwarves' Mine Defender,2008,193,86
        70401-1,Gold Getaway,2013,186,200
        70402-1,The Gatehouse Raid,2013,186,247
        70403-1,Dragon Mountain,2013,186,380
        70404-1,King’s Castle,2013,186,999
        70409-1,Shipwreck Defense,2015,154,84
        704-1,12V Sleeper (Track) Contacts for Old Motor Type I and II,1969,242,2
        70410-1,Soldiers Outpost,2015,154,164
        7041-1,Troll Battle Wheel,2008,193,505
        70411-1,Treasure Island,2015,154,181
        70412-1,Soldiers Fort,2015,154,234
        70413-1,The Brick Bounty,2015,154,743
        7042-1,Dune Patrol,2004,107,37
        7043-1,Firefighter,2004,108,68
        704-4,Replacement Motor,1984,443,1
        7044-1,Rescue Chopper,2004,107,205
        7045-1,Hovercraft Hideout,2003,110,273
        7046-1,Fire Command Craft,2004,108,271
        7047-1,Coast Watch HQ,2003,107,366
        7048-1,Troll Warship,2008,193,490
        7049-1,Alien Striker,2011,127,42
        70500-1,Kai's Fire Mech,2013,435,101
        7050-1,Alien Defender,2011,127,104
        70501-1,Samurai Bike,2013,435,210
        70502-1,Cole's Power Drill,2013,435,170
        70503-1,Golden Dragon,2013,435,253
        70504-1,Garmatron,2013,435,327
        70505-1,Temple of Light,2013,435,563
        705-1,Motor Bushings,1969,242,4
        7051-1,Tripod Invader,2011,127,165
        7052-1,UFO Abduction,2011,127,210
        705-4,Digger Bucket,1984,443,3
        70588-1,Titanium Ninja Tumbler,2016,435,336
        70589-1,Rock Roader,2016,435,406
        70590-1,Airjitzu Battle Grounds,2016,436,652
        70591-1,Kryptarium Prison Breakout,2016,435,202
        70592-1,Salvage M.E.C.,2016,435,430
        70593-1,The Green NRG Dragon,2016,435,560
        70594-1,The Lighthouse Siege,2016,435,761
        70595-1,Ultra Stealth Raider,2016,435,1076
        70596-1,Samurai X Cave Chaos,2016,435,1233
        70599-1,Cole's Dragon,2016,435,94
        70600-1,Ninja Bike Chase,2016,435,231
        70601-1,Sky Shark,2016,435,221
        70602-1,Jay’s Elemental Dragon,2016,435,350
        70603-1,Raid Zeppelin,2016,435,293
        70604-1,Tiger Widow Island,2016,435,408
        70605-1,Misfortune’s Keep,2016,435,753
        706-1,12V Rail Contact Wire with Transformer Connector,1969,242,1
        70621-1,The Vermillion Attack,2017,435,75
        70622-1,Desert Lightning,2017,435,192
        70623-1,Destiny's Shadow,2017,435,344
        70624-1,Vermillion Invader,2017,435,304
        70625-1,Samurai VXL,2017,435,414
        70626-1,Dawn of Iron Doom,2017,435,680
        70627-1,Dragon's Forge,2017,435,1118
        706-3,12V Rail Contact Wire with Transformer Connector with Cap,1974,242,1
        706-4,Crane Grab Assembly,1984,443,3
        7065-1,Alien Mothership,2011,127,415
        7066-1,Earth Defense HQ,2011,127,877
        7067-1,Jet-Copter Encounter,2011,127,373
        70700-1,Space Swarmer,2013,146,86
        7070-1,Catapult Raft,2004,286,23
        70701-1,Swarm Interceptor,2013,146,217
        70702-1,Warp Stinger,2013,146,307
        70703-1,Star Slicer,2013,146,311
        70704-1,Vermin Vaporizer,2013,146,504
        70705-1,Bug Obliterator,2013,146,709
        70706-1,Crater Creeper,2013,146,172
        70707-1,CLS-89 Eradicator Mech,2013,146,439
        70708-1,Hive Crawler,2013,146,558
        70709-1,Galactic Titan,2013,146,1010
        707-1,Tile Brick Assortment,1984,443,50
        7071-1,Treasure Island,2004,286,30
        70720-1,Hover Hunter,2014,435,79
        7072-1,Captain Kragg's Pirate Boat,2004,286,41
        70721-1,Kai Fighter,2014,435,195
        70722-1,OverBorg Attack,2013,435,208
        70723-1,Thunder Raider,2014,435,333
        70724-1,NinjaCopter,2014,435,514
        70725-1,Nindroid MechDragon,2014,435,689
        70726-1,Destructoid,2014,435,252
        70727-1,X-1 Ninja Charger,2014,435,425
        70728-1,Battle for Ninjago City,2014,435,1216
        70730-1,Chain Cycle Ambush,2015,435,298
        7073-1,Pirate Dock,2004,286,63
        70731-1,Jay Walker One,2015,435,385
        70732-1,City of Stiix,2015,435,1067
        70733-1,Blaster Bike,2015,435,211
        70734-1,Master Wu Dragon,2015,435,575
        70735-1,Ronin R.E.X.,2015,435,545
        70736-1,Attack of the Morro Dragon,2015,435,655
        70737-1,Titan Mech Battle,2015,435,749
        70738-1,Final Flight of Destiny’s Bounty,2015,435,1256
        70739-1,Airjitzu Kai Flyer,2015,436,47
        70740-1,Airjitzu Jay Flyer,2015,436,46
        7074-1,Skull Island,2004,286,81
        70741-1,Airjitzu Cole Flyer,2015,436,46
        70742-1,Airjitzu Zane Flyer,2015,436,43
        70743-1,Airjitzu Morro Flyer,2015,436,47
        70744-1,Airjitzu Wrayth Flyer,2015,436,43
        70745-1,Anacondrai Crusher,2015,435,218
        70746-1,Condrai Copter Attack,2015,435,310
        70747-1,Boulder Blaster,2015,435,234
        70748-1,Titanium Dragon,2015,435,360
        70749-1,Enter the Serpent,2015,435,527
        70750-1,Ninja DB X,2015,435,754
        7075-1,Captain Redbeard's Pirate Ship,2004,286,139
        70751-1,Temple of Airjitzu,2015,435,2028
        7075-2,Captain Redbeard's Pirate Ship - Limited Edition with Motor,2004,286,2
        70752-1,Jungle Trap,2015,435,58
        70753-1,Lava Falls,2015,435,94
        70754-1,Jay's Electromech,2015,435,152
        70755-1,Jungle Raider,2015,435,187
        70756-1,Dojo Showdown,2015,435,214
        70778-1,Protector of Jungle,2015,360,70
        70779-1,Protector of Stone,2015,360,73
        70780-1,Protector of Water,2015,360,71
        7078-1,King's Battle Chariot,2009,193,103
        70781-1,Protector of Earth,2015,360,66
        70782-1,Protector of Ice,2015,360,68
        70783-1,Protector of Fire,2015,360,69
        70784-1,Lewa - Master of Jungle,2015,362,85
        70785-1,Pohatu - Master of Stone,2015,362,66
        70786-1,Gali - Master of Water,2015,362,87
        70787-1,Tahu - Master of Fire,2015,362,89
        70788-1,Kopaka - Master of Ice,2015,362,96
        70789-1,Onua - Master of Earth,2015,362,107
        70790-1,Lord of Skull Spiders,2015,361,145
        7079-1,Drawbridge Defense,2009,193,337
        70791-1,Skull Warrior,2015,324,99
        70792-1,Skull Slicer,2015,324,71
        70793-1,Skull Basher,2015,324,72
        70794-1,Skull Scorpio,2015,324,107
        70795-1,Mask Maker vs. Skull Grinder,2015,324,165
        70800-1,Escape Glider,2014,578,103
        7080-1,Scurvy Dog and Crocodile,2004,286,7
        70801-1,Melting Room,2014,578,122
        70802-1,Bad Cop's Pursuit,2014,578,313
        70803-1,Cloud Cuckoo Palace,2014,578,197
        70804-1,Ice Cream Machine,2014,578,343
        70805-1,Trash Chomper,2014,578,388
        70806-1,Castle Cavalry,2014,578,423
        70807-1,Metal Beard's Duel,2014,578,411
        70808-1,Super Cycle Chase,2014,578,513
        70809-1,Lord Business’ Hideout,2014,578,736
        708-1,12V Extension Cord Pack,1970,242,3
        70810-1,MetalBeard’s Sea Cow,2014,578,2741
        7081-1,Harry Hardtack and Monkey,2004,286,10
        70811-1,The Flying Flusher,2014,578,350
        70812-1,Creative Ambush,2014,578,473
        70813-1,Rescue Reinforcements,2014,578,857
        70814-1,Emmet’s Constructo-Mech,2014,578,705
        70815-1,Super Secret Police Dropship,2014,578,852
        70817-1,Batman & Super Angry Kitty Attack,2015,578,115
        70818-1,Double-Decker Couch,2015,578,197
        70819-1,Bad Cop Car Chase,2015,578,291
        7082-1,Cannonball Jimmy and Shark,2004,286,7
        708-3,Angle Brick / Landing Frame,1984,443,8
        70900-1,The Joker Balloon Escape,2017,484,123
        7090-1,Crossbow Attack,2007,193,54
        70901-1,Mr. Freeze Ice Attack,2017,484,195
        70902-1,Catwoman Catcycle Chase,2017,484,138
        70903-1,The Riddler Riddle Racer,2017,484,253
        70904,Clayface Splat Attack,2017,484,0
        70905-1,The Batmobile,2017,484,580
        70906,LEGO® Batman Movie - The Joker™ Notorious Lowrider,2017,484,0
        70907-1,Killer Croc Tail-Gator,2017,484,459
        70908-1,The Scuttler,2017,484,774
        70909-1,Batcave Break-in,2017,484,1042
        709-1,Police Boat,1978,363,48
        7091-1,Knights' Catapult Defense,2007,193,123
        70911-1,The Penguin™ Arctic Roller,2017,484,304
        70912-1,Arkham Asylum,2017,484,1621
        70914-1,"Bane"" Toxic Truck Attack",2017,484,365
        70916-1,The Batwing,2017,484,1052
        709-2,Axle Assortment,1984,453,36
        7092-1,Skeletons' Prison Carriage,2007,193,193
        7093-1,Skeleton Tower,2007,193,401
        7094-1,King's Castle Siege,2007,193,921
        7097-1,Trolls' Mountain Fortress,2009,193,843
        7099-1,Accessory Motor for Boats,2004,289,1
        71000-0,Minifigure Series 9 [Random Bag],2013,544,0
        71000-1,Waiter - Complete Set,2013,544,7
        71000-10,Judge - Complete Set,2013,544,7
        71000-11,Alien Avenger - Complete Set,2013,544,7
        71000-12,Mermaid - Complete Set,2013,544,6
        71000-13,Battle Mech - Complete Set,2013,544,6
        71000-14,Mr. Good and Evil - Complete Set,2013,544,6
        71000-15,Forest Maiden - Complete Set,2013,544,7
        71000-16,Plumber - Complete Set,2013,544,6
        71000-17,Minifigures Series 9 - Complete,2013,544,16
        71000-18,Minifigure Series 9 (Box of 60),2013,544,60
        71000-2,Cyclops - Complete Set,2013,544,6
        71000-3,Hollywood Starlet - Complete Set,2013,544,6
        71000-4,Heroic Knight - Complete Set,2013,544,10
        71000-5,Roman Emperor - Complete Set,2013,544,6
        71000-6,Policeman - Complete Set,2013,544,7
        71000-7,Chicken Suit Guy - Complete Set,2013,544,5
        71000-8,Roller Derby Girl - Complete Set,2013,544,7
        71000-9,Fortune Teller - Complete Set,2013,544,7
        7100-1,Samsonite Large Educational Set,1963,523,0
        71001-0,Minifigure Series 10 [Random Bag],2013,545,0
        71001-1,Librarian - Complete Set,2013,545,7
        71001-10,Sea Captain - Complete Set,2013,545,7
        71001-11,Sad Clown - Complete Set,2013,545,6
        71001-12,Revolutionary Soldier - Complete Set,2013,545,6
        71001-13,Baseball Fielder - Complete Set,2013,545,5
        71001-14,Trendsetter - Complete Set,2013,545,7
        71001-15,Painter - Complete Set,2013,545,9
        71001-16,Motorcycle Mechanic - Complete Set,2013,545,6
        71001-17,Minifigures Series 10 - Complete (except Mr. Gold),2013,545,16
        71001-18,Minifigure Series 10 (Box of 60),2013,545,60
        71001-19,Mr. Gold - Complete Set,2013,545,5
        71001-2,Medusa - Complete Set,2013,545,5
        71001-3,Roman Commander - Complete Set,2013,545,8
        71001-4,Warrior Woman - Complete Set,2013,545,7
        71001-5,Tomahawk Warrior - Complete Set,2013,545,6
        71001-6,Skydiver - Complete Set,2013,545,6
        71001-7,Bumblebee Girl - Complete Set,2013,545,7
        71001-8,Grandpa - Complete Set,2013,545,7
        71001-9,Paintball Player - Complete Set,2013,545,7
        71002-0,Minifigure Series 11 [Random Bag],2013,547,0
        71002-1,Barbarian - Complete Set,2013,547,7
        71002-10,Welder - Complete Set,2013,547,7
        71002-11,Scientist - Complete Set,2013,547,7
        71002-12,Saxophone Player - Complete Set,2013,547,6
        71002-13,Diner Waitress - Complete Set,2013,547,10
        71002-14,Grandma - Complete Set,2013,547,7
        71002-15,Constable - Complete Set,2013,547,6
        71002-16,Lady Robot - Complete Set,2013,547,6
        71002-17,LEGO Collectable Minifigures Series 11 - Complete,2014,547,16
        71002-18,Minifigure Series 11 (Box of 60),2013,547,60
        71002-2,Scarecrow - Complete Set,2013,547,7
        71002-3,Pretzel Girl - Complete Set,2013,547,7
        71002-4,Evil Mech - Complete Set,2013,547,8
        71002-5,Island Warrior - Complete set,2013,547,8
        71002-6,Gingerbread Man - Complete Set,2013,547,5
        71002-7,Holiday Elf - Complete Set,2013,547,8
        71002-8,Yeti - Complete Set,2013,547,5
        71002-9,Mountain Climber - Complete Set,2013,547,7
        71004-0,LEGO Minifigures - The LEGO Movie Series [Random Bag],2014,549,0
        71004-1,Calamity Drone,2014,549,7
        71004-10,Larry the Barista,2014,549,6
        71004-11,Velma Staplebot,2014,549,6
        71004-12,Taco Tuesday Man,2014,549,10
        71004-13,'Where Are My Pants?' Guy,2014,549,6
        71004-14,Wiley Fusebot,2014,549,8
        71004-15,Panda Guy,2014,549,6
        71004-16,Marsha Queen of the Mermaids,2014,549,7
        71004-17,LEGO Minifigures - The LEGO Movie Series - Complete,2014,549,16
        71004-18,LEGO Minifigures - The LEGO Movie Series - Sealed Box,2014,549,60
        71004-2,President Business - Complete Set,2014,549,6
        71004-3,Hard Hat Emmet,2014,549,6
        71004-4,Wild West Wyldstyle,2014,549,6
        71004-5,Abraham Lincoln,2014,549,6
        71004-6,Mrs Scratchen-Post,2014,549,6
        71004-7,Scribble-Face Bad Cop,2014,549,7
        71004-8,William Shakespeare,2014,549,7
        71004-9,Gail the Construction Worker,2014,549,6
        71005-0,LEGO Minifigures - The Simpsons Series [Random Bag],2014,550,0
        71005-1,Homer Simpson,2014,550,6
        71005-10,Ralph Wiggum,2014,550,5
        71005-11,Apu Nahasapeemapetilon,2014,550,5
        71005-12,Nelson Muntz,2014,550,5
        71005-13,Itchy,2014,550,5
        71005-14,Scratchy,2014,550,6
        71005-15,Chief Wiggum,2014,550,6
        71005-16,Mr. Burns,2014,550,6
        71005-17,LEGO Minifigures - The Simpsons Series - Complete,2014,550,16
        71005-18,LEGO Minifigures - The Simpsons Series - Sealed Box,2014,550,60
        71005-2,Bart Simpson,2014,550,7
        71005-3,Marge Simpson,2014,550,7
        71005-4,Lisa Simpson,2014,550,6
        71005-5,Maggie Simpson,2014,550,4
        71005-6,Grampa Simpson,2014,550,5
        71005-7,Ned Flanders,2014,550,6
        71005-8,Krusty the Clown,2014,550,5
        71005-9,Milhouse Van Houten,2014,550,5
        71006-1,The Simpsons House,2014,50,2530
        71007-0,LEGO Minifigures Series 12 [Random Bag],2014,548,0
        71007-1,Wizard,2014,548,11
        71007-10,Dino Tracker,2014,548,7
        71007-11,Pizza Delivery Man,2014,548,7
        71007-12,Rock Star,2014,548,6
        71007-13,Swashbuckler,2014,548,7
        71007-14,Piggy Guy,2014,548,6
        71007-15,Genie Girl,2014,548,6
        71007-16,Spooky Girl,2014,548,7
        71007-17,LEGO Minifigures Series 12 - Complete,2014,548,16
        71007-18,LEGO Minifigures Series 12 - Sealed Box,2014,548,60
        71007-2,Hun Warrior,2014,548,10
        71007-3,Fairytale Princess,2014,548,6
        71007-4,Video Game Guy,2014,548,6
        71007-5,Battle Goddess,2014,548,9
        71007-6,Space Miner,2014,548,9
        71007-7,Lifeguard,2014,548,7
        71007-8,Prospector,2014,548,7
        71007-9,Jester,2014,548,7
        71008-0,LEGO Minifigures - Series 13 [Random Bag],2015,551,0
        71008-1,Classic King,2015,551,9
        71008-10,Evil Wizard,2015,551,10
        71008-11,Fencer,2015,551,6
        71008-12,Samurai,2015,551,8
        71008-13,Disco Diva,2015,551,8
        71008-14,Hot Dog Man,2015,551,5
        71008-15,Lady Cyclops,2015,551,6
        71008-16,Galaxy Trooper,2015,551,8
        71008-17,LEGO Minifigures Series 13 - Complete,2015,551,16
        71008-18,LEGO Minifigures Series 13 - Sealed Box,2015,551,60
        71008-2,Sheriff,2015,551,8
        71008-3,Unicorn Girl,2015,551,7
        71008-4,Snake Charmer,2015,551,7
        71008-5,Goblin,2015,551,7
        71008-6,Paleontologist,2015,551,7
        71008-7,Alien Trooper,2015,551,6
        71008-8,Egyptian Warrior,2015,551,7
        71008-9,Carpenter,2015,551,7
        71009-0,The Simpsons Series 2 {Random bag},2015,550,0
        71009-1,Homer,2015,550,5
        71009-10,Hans Moleman,2015,550,5
        71009-11,Selma,2015,550,6
        71009-12,Patty,2015,550,6
        71009-13,Groundskeeper Willie,2015,550,5
        71009-14,Edna Krabappel,2015,550,7
        71009-15,Smithers,2015,550,6
        71009-16,Dr Hibbert,2015,550,5
        71009-17,The Simpsons Series 2 - Complete,2015,550,16
        71009-18,The Simpsons Series 2 - Sealed Box,2015,550,60
        71009-2,Marge,2015,550,10
        71009-3,Lisa,2015,550,6
        71009-4,Maggie,2015,550,4
        71009-5,Bart,2015,550,6
        71009-6,Milhouse,2015,550,6
        71009-7,Comic Book Guy,2015,550,6
        71009-8,Martin,2015,550,5
        71009-9,Professor Frink,2015,550,5
        710-1,Wrecker with Car,1973,397,91
        71010-0,LEGO Minifigures - Series 14 {Random bag},2015,552,0
        71010-1,Wolf Guy,2015,552,6
        71010-10,Gargoyle,2015,552,6
        71010-11,Skeleton Guy,2015,552,6
        71010-12,Monster Rocker,2015,552,6
        71010-13,Zombie Businessman,2015,552,7
        71010-14,Banshee,2015,552,5
        71010-15,Square Foot,2015,552,5
        71010-16,Spider Lady,2015,552,7
        71010-17,LEGO Minifigures - Series 14 - Complete,2015,552,0
        71010-18,LEGO Minifigures - Series 14 - Sealed Box,2015,552,0
        71010-2,Zombie Pirate,2015,552,7
        71010-3,Monster Scientist,2015,552,6
        71010-4,Wacky Witch,2015,552,8
        71010-5,Plant Monster,2015,552,7
        71010-6,Fly Monster,2015,552,5
        71010-7, Spectre,2015,552,7
        71010-8,Zombie Cheerleader,2015,552,7
        71010-9,Tiger Woman,2015,552,7
        7101-1,Lightsaber Duel,1999,166,52
        71011-0,LEGO Minifigures - Series 15 {Random bag},2016,554,0
        71011-1,Farmer,2016,554,7
        71011-10,Ballerina,2016,554,6
        71011-11,Laser Mech,2016,554,9
        71011-12,Kendo Fighter,2016,554,7
        71011-13,Shark Suit Guy,2016,554,5
        71011-14,Wrestling Champion,2016,554,6
        71011-15,Jewel Thief,2016,554,8
        71011-16,Queen,2016,554,8
        71011-17,LEGO Minifigures - Series 15 - Complete,2016,554,0
        71011-18,LEGO Minifigures - Series 15 - Sealed Box,2016,554,0
        71011-2,Astronaut,2016,554,9
        71011-3,Frightening Knight,2016,554,10
        71011-4,Clumsy Guy,2016,554,7
        71011-5,Tribal Woman,2016,554,8
        71011-6,Flying Warrior,2016,554,11
        71011-7,Faun,2016,554,6
        71011-8,Animal Control Officer,2016,554,7
        71011-9,Janitor,2016,554,7
        71012-1,Stitch,2016,555,4
        71012-10,Donald Duck,2016,555,6
        71012-11,Minnie Mouse,2016,555,6
        71012-12,Mickey Mouse,2016,555,4
        71012-13,Mr. Incredible,2016,555,6
        71012-14,Syndrome,2016,555,6
        71012-15,Peter Pan,2016,555,7
        71012-16,Captain Hook,2016,555,6
        71012-17,Ursula,2016,555,6
        71012-18,Ariel,2016,555,7
        71012-19,LEGO Minifigures - Disney Series - Complete,2016,535,0
        71012-2,Alien,2016,555,4
        71012-3,Buzz Lightyear,2016,555,8
        71012-4,Aladdin,2016,555,6
        71012-5,Genie,2016,555,7
        71012-6,Maleficent,2016,555,10
        71012-7,Alice,2016,555,8
        71012-8,Cheshire Cat,2016,555,5
        71012-9,Daisy Duck,2016,555,6
        71013-1,Ice Queen,2016,556,12
        71013-10,Penguin Boy,2016,556,7
        71013-11,Rogue,2016,556,7
        71013-12,Dog Show Winner,2016,556,7
        71013-13,Mariachi,2016,556,7
        71013-14,Spy,2016,556,9
        71013-15,Banana Guy,2016,556,5
        71013-16,Babysitter,2016,556,8
        71013-17,LEGO Minifigures - Series 16 - Complete,2016,556,0
        71013-2,Desert Warrior,2016,556,6
        71013-3,Cyborg,2016,556,8
        71013-4,Cute Little Devil Set,2016,556,10
        71013-5,Spooky Boy,2016,556,7
        71013-6,Hiker,2016,556,8
        71013-7,Wildlife Photographer,2016,556,8
        71013-8,Kickboxer,2016,556,6
        71013-9,Scallywag Pirate,2016,556,7
        71014-1,Joachim Löw,2016,557,6
        71014-10,Toni Kroos (18),2016,557,6
        71014-11,Sami Khedira (6),2016,557,6
        71014-12,André Schürrle (9),2016,557,6
        71014-13,Marco Reus (21),2016,557,6
        71014-14,Christoph Kramer (20),2016,557,6
        71014-15,Mario Götze (19),2016,557,6
        71014-16,Max Kruse (23),2016,557,6
        71014-17,DFB Series - Complete,2016,557,0
        71014-2,Manuel Neuer (1),2016,557,6
        71014-3,Jérôme Boateng (17),2016,557,6
        71014-4,Mats Hummels (5),2016,557,6
        71014-5,Benedikt Höwedes (4),2016,557,6
        71014-6,Shkodran Mustafi (2),2016,557,6
        71014-7,Bastian Schweinsteiger (7),2016,557,6
        71014-8,Mesut Özil (8),2016,557,6
        71014-9,Thomas Müller (13),2016,557,6
        71016-1,The Kwik-E-Mart,2015,50,2176
        71017-1,Lobster-Lovin’ Batman™,2017,484,7
        71017-10,Pink Power Batgirl™,2017,484,8
        71017-11,Red Hood™,2017,484,8
        71017-12,The Eraser™,2017,484,6
        71017-13,Nurse Harley Quinn™,2017,484,7
        71017-14,Orca™,2017,484,5
        71017-15,Zodiac Master™,2017,484,6
        71017-16,Catman™,2017,484,9
        71017-17,March Harriet™,2017,484,6
        71017-18,The Calculator™,2017,484,8
        71017-19,King Tut™,2017,484,7
        71017-2,Glam Metal Batman™,2017,484,8
        71017-20,The Mime™,2017,484,7
        71017-21,The LEGO Batman Movie Series - Complete,2017,535,0
        71017-3,Fairy Batman™,2017,484,8
        71017-4,Clan of the Cave Batman™,2017,484,7
        71017-5,Vacation Batman™,2017,484,8
        71017-6,Barbara Gordon™,2017,484,8
        71017-7,Commissioner Gordon™,2017,484,7
        71017-8,The Joker™ – Arkham Asylum,2017,484,6
        71017-9,Dick Grayson™,2017,484,7
        71018-1,Professional Surfer,2017,611,6
        71018-10,Battle Dwarf,2017,611,9
        71018-11,Retro Spaceman,2017,611,7
        71018-12,Yuppie,2017,611,8
        71018-13,Rocket Boy,2017,611,7
        71018-14,Dance Instructor,2017,611,7
        71018-15,Elf-Girl,2017,611,7
        71018-16,Highwayman,2017,611,9
        71018-17,Minifigures - Series 17 - Complete 16 Sets,2017,611,0
        71018-18,LEGO Minifigures Series 17 - All Parts,2017,611,116
        71018-2,Circus Strong Man,2017,611,6
        71018-3,Gourmet Chef,2017,611,7
        71018-4,Corn Cob Guy,2017,611,5
        71018-5,Veterinarian,2017,611,6
        71018-6,Hot Dog Man,2017,611,9
        71018-7,Butterfly Girl,2017,611,10
        71018-8,Roman Gladiator,2017,611,6
        71018-9,Connoisseur,2017,611,7
        710-2,Lockable Storage Case,1966,371,1
        710-3,Universal Building Set,1983,469,364
        7103-1,Jedi Duel,2002,167,82
        71040-1,The Disney Castle,2016,608,4060
        7104-1,Desert Skiff,2000,169,55
        71042-1,Silent Mary,2017,263,2286
        710-6,Baseplate Assortment,1984,443,10
        7106-1,Droid Escape,2001,169,45
        7110-1,Landspeeder,1999,169,49
        711-1,Jeep CJ-5,1977,397,58
        7111-1,Droid Fighter,1999,166,62
        7113-1,Tusken Raider Encounter,2002,167,93
        7115-1,Gungan Patrol,2000,166,79
        7116-1,Tahu,2010,345,19
        71170-1,Starter Pack: PS3,2015,604,265
        7117-1,Gresh,2010,345,19
        71171-1,LEGO® DIMENSIONS™ PLAYSTATION® 4 Starter Pack,2015,604,265
        71172-1,LEGO® DIMENSIONS™ Xbox One Starter Pack,2015,604,265
        71173-1,LEGO® DIMENSIONS™ Xbox 360 Starter Pack,2015,604,265
        71174-1,LEGO® DIMENSIONS™ Wii U™ Starter Pack,2015,604,265
        7119-1,Twin-Pod Cloud Car,2002,169,118
        71200-1,Dimensions Starter Pack,2015,604,265
        71201-1,LEGO® DIMENSIONS™ Back to the Future™ Level Pack,2015,604,94
        71202-1,LEGO® DIMENSIONS™ The Simpsons™ Level Pack,2015,604,96
        71203-1,LEGO® DIMENSIONS™ Portal® 2 Level Pack,2015,604,85
        71204-1,LEGO® DIMENSIONS™ Doctor Who Level Pack,2015,604,82
        71205-1,LEGO® DIMENSIONS™ Jurassic World™ Team Pack,2015,604,103
        71206-1,LEGO® DIMENSIONS™ Scooby-Doo™ Team Pack,2015,604,84
        71207-1,LEGO® DIMENSIONS® NINJAGO™ Team Pack,2015,604,98
        71209-1,LEGO® DIMENSIONS™ Wonder Woman Fun Pack,2015,604,41
        712-1,Sea Plane,1977,412,115
        71210-1,LEGO® DIMENSIONS™ Cyborg™ Fun Pack,2015,604,50
        7121-1,Naboo Swamp,1999,166,82
        71211-1,LEGO® DIMENSIONS™ Bart Fun Pack,2015,604,34
        71212-1,LEGO® DIMENSIONS™ Fun Pack Emmet,2015,604,55
        71213-1,LEGO® DIMENSIONS™ Bad Cop Fun Pack,2015,604,62
        71214-1,LEGO® DIMENSIONS™ Benny Fun Pack ,2015,604,46
        71215-1,LEGO® DIMENSIONS™ Jay Fun Pack,2015,604,48
        71216-1,LEGO® DIMENSIONS™ Nya Fun Pack,2015,604,59
        71217-1,LEGO® DIMENSIONS™ Zane Fun Pack,2015,604,46
        71218-1,LEGO® DIMENSIONS™ Gollum Fun Pack,2015,604,39
        71219-1,LEGO® DIMENSIONS™ Legolas Fun Pack,2015,604,36
        71220-1,LEGO® DIMENSIONS™ Gimli Fun Pack,2015,604,56
        71221-1,LEGO® DIMENSIONS™ Wicked Witch™ Fun Pack,2015,604,38
        71222-1,LEGO® DIMENSIONS™ Laval Fun Pack,2015,604,57
        71223-1,LEGO® DIMENSIONS™ Cragger Fun Pack,2015,604,45
        71227-1,LEGO® DIMENSIONS® Krusty Fun Pack,2015,604,38
        71228-1,The Ghostbusters Level Pack,2016,604,115
        71229-1,DC Comics Team Pack,2016,604,92
        71230-1,Doc Brown Fun Pack,2016,604,69
        71231-1,LEGO® DIMENSIONS™ Unikitty Fun Pack,2015,604,58
        71232-1,LEGO® DIMENSIONS™ Eris Fun Pack,2015,604,59
        71233-1,Stay Puft Fun Pack,2016,604,65
        71234-1,Sensei Wu Fun Pack,2016,604,58
        71235-1,Midway Arcade™ Level Pack,2016,604,96
        71236-1,Superman™ Fun Pack,2016,604,48
        71237-1,Aquaman and Aqua Watercraft,2016,604,43
        71238-1,Cyberman Fun Pack,2016,604,40
        71239-1,Lloyd Fun Pack,2016,604,56
        71240-1,Bane™ Fun Pack,2016,604,52
        7124-1,Flash Speeder,2000,166,107
        71241-1,Slimer Fun Pack,2016,604,33
        71242-1,Ghostbusters Story Pack,2016,604,258
        71244-1,Sonic the Hedgehog™ Level Pack,2016,604,101
        71245-1,Adventure Time Level Pack,2016,604,102
        71246-1,Adventure Time Team Pack,2016,604,96
        71247-1,Harry Potter Team Pack,2016,604,119
        71248-1,Mission: Impossible™ Level Pack,2016,604,76
        71251-1,A-Team Fun Pack,2016,604,73
        71253-1,Fantastic Beasts and Where to Find Them™ Story Pack,2016,604,261
        71256-1,Gremlins™ Team Pack,2016,604,94
        71257-1,Tina Goldstein Fun Pack,2016,604,51
        71258-1,E.T. the Extra-Terrestrial™ Fun Pack,2016,604,42
        7126-1,Battle Droid Carrier,2001,166,133
        7127-1,Imperial AT-ST,2001,169,107
        7128-1,Speeder Bikes,1999,169,93
        71285-1,Marceline the Vampire Queen,2016,604,60
        71286-1,Michael Knight and K.I.T.T. Knight Ryder Fun Pack,2017,604,54
        71300-1,Uxar Creature of Jungle,2016,324,87
        7130-1,Snowspeeder,1999,169,217
        71301-1,Ketar Creature of Stone,2016,324,78
        71302-1,Akida Creature of Water,2016,324,112
        71303-1,Ikir Creature of Fire,2016,324,72
        71304-1,Terak Creature of Earth,2016,324,55
        71305-1,Lewa Uniter of Jungle,2016,324,65
        71306-1,Pohatu Uniter of Stone,2016,324,85
        71307-1,Gali Uniter of Water,2016,324,72
        71308-1,Tahu Uniter of Fire,2016,324,132
        71309-1,Onua Uniter of Earth,2016,324,144
        71310-1,Umarak the Hunter,2016,324,150
        7131-1,Anakin's Podracer,1999,166,136
        71311-1,Kopaka and Melum - Unity set,2016,324,162
        71312-1,Ekimu the Mask Maker,2016,324,94
        71313-1,Lava Beast,2016,324,114
        71314-1,Storm Beast,2016,324,109
        71315-1,Quake Beast,2016,324,102
        71316-1,Umarak the Destroyer,2016,324,190
        7133-1,Bounty Hunter Pursuit,2002,167,254
        71340-1,Supergirl (DC Comics Playstation 4),2016,604,6
        7134-1,A-wing Fighter,2000,169,125
        71342-1,Green Arrow,2016,604,7
        7135-1,Takanuva,2010,345,21
        7136-1,Skrall,2010,345,21
        7137-1,Piraka,2010,345,15
        7138-1,Rahkshi,2010,345,18
        7139-1,Ewok Attack,2002,169,121
        7140-1,X-wing Fighter,1999,169,271
        7141-1,Naboo Fighter,1999,166,179
        7142-1,X-wing Fighter (re-release of 7140),2002,169,273
        7143-1,Jedi Starfighter,2002,167,139
        7144-1,Slave I,2000,169,166
        7145-1,Von Nebula,2010,403,156
        7146-1,TIE Fighter,2001,169,171
        7147-1,Xplode,2010,403,45
        7148-1,Meltdown,2010,403,49
        7150-1,TIE Fighter & Y-wing,1999,169,410
        715-1,Basic Building Set,1990,467,410
        7151-1,Sith Infiltrator,1999,166,244
        7152-1,TIE Fighter & Y-wing (re-release of 7150),2002,169,411
        7153-1,Jango Fett's Slave I,2002,167,360
        7155-1,Trade Federation AAT,2000,166,159
        7156-1,Corroder,2010,403,39
        7157-1,Thunder,2010,403,46
        7158-1,Furno Bike,2010,402,165
        7159-1,Star Wars Podracing Bucket,2000,166,292
        7160-1,Drop Ship,2010,402,393
        7161-1,Gungan Sub,1999,166,379
        7162-1,Rotor,2010,403,144
        7163-1,Republic Gunship,2002,167,697
        7164-1,Preston Stormer,2010,401,17
        7165-1,Natalie Breez,2010,401,19
        7166-1,Imperial Shuttle,2001,169,238
        7167-1,William Furno,2010,401,19
        7168-1,Dunkan Bulk,2010,401,17
        7169-1,Mark Surge,2010,401,19
        7170-2,Jimi Stringer,2010,401,17
        7171-1,Mos Espa Podrace,1999,166,913
        7172-1,Apple,2007,22,10
        7173-1,Pear,2007,22,10
        7174-1,Banana,2007,22,8
        7175-1,Grapes,2007,22,10
        7176-1,Watermelon - Capespan Promotional,2007,33,21
        7177-1,Orange,2007,22,8
        7178-1,Chef,2007,22,5
        7179-1,Dunkan Bulk and Vapor,2010,401,89
        7180-1,B-wing at Rebel Control Center,2000,169,346
        7181-1,TIE Interceptor - UCS,2000,174,702
        7184-1,Trade Federation MTT,2000,166,466
        7186-1,Watto's Junkyard,2001,166,449
        7187-1,Escape from Dragon's Prison,2011,196,185
        7188-1,King's Carriage Ambush,2011,196,286
        7189-1,Mill Village Raid,2011,196,667
        7190-1,Millennium Falcon,2000,169,671
        7191-1,X-wing Fighter - UCS,2000,174,1302
        7194-1,Yoda,2002,158,1076
        7195-1,Ambush in Cairo,2009,267,79
        7196-1,Chauchilla Cemetery Battle,2009,265,188
        7197-1,Venice Canal Chase,2009,266,420
        7198-1,Fighter Plane Attack,2009,266,383
        7199-1,Temple of Doom,2009,268,652
        7-2,Universal Building Set,1979,469,64
        7200-1,Final Duel I,2002,169,32
        720-1,Basic Building Set,1985,467,339
        7201-1,Final Duel II,2002,169,26
        720-2,Train with 12V Electric Motor,1969,234,357
        7203-1,Jedi Defense I,2002,166,59
        7204-1,Jedi Defense II,2002,166,53
        7206-1,Fire Helicopter,2010,58,341
        7207-1,Fire Boat,2010,58,305
        7208-1,Fire Station,2010,58,644
        7209-1,Pteranodon,2004,204,28
        7210-1,Apatosaurus,2004,204,33
        721-1,Steam Locomotive,1969,234,114
        7212-1,Sky Squad,2003,204,129
        7213-1,Off-Road Fire Truck & Fireboat,2010,58,387
        7214-1,Sea Plane,2004,110,119
        7216-1,Gold Good Guy - looking Right (Duracell 8 pack AA) {Turaga Lhikan},2006,324,22
        7216-2,Gold Good Guy - looking Left (Duracell 12 pack AA) {Turaga Lhikan},2006,324,22
        7216-3,Gold Good Guy - looking Right (Duracell 12 pack AA) {Turaga Lhikan},2006,324,22
        7217-1,Braca (Duracell 12 pack AA battery promotion),2006,324,16
        7217-2,Braca (Duracell 8 pack AA battery promotion),2006,324,16
        7218-1,Orange Speedboat,2004,204,26
        7219-1,Dinosaur,2004,204,34
        7220-1,Snowman,2004,227,19
        722-1,Universal Building Set,1980,469,302
        7221-1,Robots,2003,204,24
        7221-2,Robots - ANA Promotion,2003,204,23
        722-2,12V Electric Train with 2 Wagons,1970,234,151
        7222-1,Small Red Helicopter (Polybag),2003,204,28
        7223-1,Yellow Truck (Polybag),2003,204,34
        7223-2,Yellow Truck (Box version) - ANA Promotion,2003,204,36
        723-1,Diesel Locomotive,1970,234,95
        723-2,Diesel Locomotive with DB Sticker,1974,234,93
        7235-2,Police Motorcycle - Blue Sticker Version,2008,61,28
        7236-2,Police Car - Blue Sticker Version,2008,61,59
        7237-1,Police Station [Lighted Figure],2005,61,593
        7237-2,Police Station [No Lighted Figure],2006,61,606
        7238-1,Fire Helicopter,2005,58,75
        7239-1,Fire Truck,2005,58,215
        7240-1,Fire Station,2005,58,264
        724-1,12V Diesel Locomotive with Crane and Tipper Wagon,1972,234,150
        7241-1,Fire Car,2005,58,47
        7242-1,Street Sweeper,2005,63,64
        7243-1,Construction Site,2005,56,301
        7244-1,Speedboat,2005,50,107
        7245-2,Prisoner Transport - Blue Sticker Version,2008,61,99
        7246-1,Mini Digger,2005,56,37
        7248-1,Digger,2005,56,128
        7249-1,XXL Mobile Crane,2005,56,525
        7250-1,Clone Scout Walker,2005,168,109
        725-1,Basic Building Set,1990,467,440
        7251-1,Darth Vader Transformation,2005,168,60
        725-2,12V Freight Train and Track,1974,234,310
        7252-1,Droid Tri-Fighter,2005,168,147
        7255-1,General Grievous Chase,2005,168,112
        7256-1,Jedi Starfighter & Vulture Droid,2005,168,202
        7257-1,Ultimate Lightsaber Duel,2005,168,278
        7258-1,Wookiee Attack,2005,168,368
        7259-1,ARC-170 Starfighter,2005,168,401
        7260-1,Wookiee Catamaran,2005,168,381
        726-1,12V Western Train with 2 Wagons and Cowboys,1976,233,287
        7261-1,Clone Turbo Tank [Light-Up Mace Windu],2005,168,803
        7261-2,Clone Turbo Tank (with Non-Light-Up Mace Windu),2006,168,814
        7262-1,TIE Fighter and Y-wing (TRU exclusive re-release),2004,169,415
        7263-1,TIE Fighter,2005,169,159
        7264-1,Imperial Inspection,2005,169,378
        7266-1,Fireman,2005,58,19
        7267-1,Paramedic,2005,60,13
        7268-1,Crab,2005,204,32
        7269-1,Scorpion,2005,204,37
        7270-1,Bird,2005,204,28
        727-1,12V Locomotive,1977,234,133
        7271-1,Apple - Suntory Promotional,2005,33,8
        7272-1,Pear - Suntory Promotional,2005,33,10
        7274-1,Orange - Suntory Promotional,2005,33,7
        7275-1,Cherry - Suntory Promotional,2005,33,11
        7276-1,Mango - Suntory Promotional,2005,33,6
        7278-1,Melon - Suntory Promotional,2005,33,8
        7279-1,Police Minifigure Collection,2011,61,57
        7280-1,Straight & Crossroad Plates,2005,62,2
        7281-1,T-Junction & Curved Road Plates,2005,62,2
        7283-1,Ultimate Space Battle,2005,168,540
        7285-1,Police Dog Unit,2011,61,95
        7286-1,Prisoner Transport,2011,61,173
        7287-1,Police Boat,2011,61,173
        7288-1,Mobile Police Unit,2011,61,407
        7290-1,Pirates Polybag,2004,286,5
        7291-1,Street Rebel,2012,22,196
        7292-1,Propeller Adventures,2012,22,244
        7294-1,Dino Quad,2005,384,39
        7295-1,Dino Buggy Chaser,2005,384,78
        7296-1,Dino 4WD Trapper,2005,384,282
        7297-1,Dino Track Transport,2005,384,351
        7298-1,Dino Air Tracker,2005,384,710
        7-3,Basic Set,1973,469,412
        7300-1,Double Hover,2001,135,21
        730-1,Steam Shovel with Carrier,1973,416,102
        7301-1,Rover,2001,135,29
        730-2,Basic Building Set,1985,467,432
        7302-1,Worker Robot,2001,135,30
        7303-1,Jet Scooter,2001,135,24
        7305-1,Scarab Attack,2011,437,44
        7306-1,Golden Staff Guardians,2011,437,70
        7307-1,Flying Mummy Attack,2011,437,124
        7308-1,Double Hover,2001,135,21
        7309-1,Rover,2001,135,29
        7310-1,Mono Jet,2001,135,34
        7311-1,Red Planet Cruiser,2001,135,73
        7312-1,T3-Trike,2001,135,99
        73129-1,Four TECHNIC Shocks,1985,453,4
        7313-1,Red Planet Protector,2001,135,193
        7314-1,Recon-Mech RP,2001,135,189
        7315-1,Solar Explorer,2001,135,249
        7316-1,Excavation Searcher,2001,135,467
        7317-1,Aero Tube Hanger,2001,135,716
        7320-1,Vega,2001,135,5
        7321-1,Mizar,2001,135,5
        7322-1,Altair,2001,135,5
        7323-1,Guard,2001,135,5
        7324-1,Advent Calendar 2005 City,2005,208,24
        7324-10,Advent Calendar 2005 City (Day  9) Construction Worker,2005,220,5
        7324-11,Advent Calendar 2005 City (Day 10) Wheelbarrow,2005,220,11
        7324-12,Advent Calendar 2005 City (Day 11) Barricade,2005,220,9
        7324-13,Advent Calendar 2005 City (Day 12) Train Worker,2005,220,6
        7324-14,Advent Calendar 2005 City (Day 13) Crossing Gate,2005,220,13
        7324-15,Advent Calendar 2005 City (Day 14) Signal Post,2005,220,11
        7324-16,Advent Calendar 2005 City (Day 15) Mechanic,2005,220,5
        7324-17,Advent Calendar 2005 City (Day 16) Drill Press,2005,220,11
        7324-18,Advent Calendar 2005 City (Day 17) Oil Barrel & Hand Truck,2005,220,7
        7324-19,Advent Calendar 2005 City (Day 18) Man with Radio,2005,220,5
        7324-2,Advent Calendar 2005 City (Day  1) Fireman,2005,220,5
        7324-20,Advent Calendar 2005 City (Day 19) RC Car,2005,220,8
        7324-21,Advent Calendar 2005 City (Day 20) Skateboard & Helmet,2005,220,4
        7324-22,Advent Calendar 2005 City (Day 21) Pizza Chef,2005,220,5
        7324-23,Advent Calendar 2005 City (Day 22) Food Counter,2005,220,6
        7324-24,Advent Calendar 2005 City (Day 23) Pizza Oven,2005,220,11
        7324-25,Advent Calendar 2005 City (Day 24) Santa & Sled,2005,220,23
        7324-3,Advent Calendar 2005 City (Day  2) Fire Hydrant Hose Airtanks,2005,220,10
        7324-4,Advent Calendar 2005 City (Day  3) Rescue Bucket,2005,220,7
        7324-5,Advent Calendar 2005 City (Day  4) Policeman,2005,220,5
        7324-6,Advent Calendar 2005 City (Day  5) Police Dog & Barricade,2005,220,8
        7324-7,Advent Calendar 2005 City (Day  6) Criminal and Buzz Saw,2005,220,5
        7324-8,Advent Calendar 2005 City (Day  7) Safe,2005,220,12
        7324-9,Advent Calendar 2005 City (Day  8) Welding Tanks & Torch,2005,220,12
        7325-1,Cursed Cobra Statue,2011,437,212
        7326-1,Rise of the Sphinx,2011,437,526
        7327-1,Scorpion Pyramid,2011,437,797
        733-1,Universal Building Set,1980,469,504
        7335-1,Foundation Set - Blue Bucket,2006,37,460
        7336-1,Foundation Set - Red Bucket,2006,37,427
        7344-1,Dump Truck,2005,56,187
        7345-1,Transport Chopper,2012,42,383
        7346-1,Seaside House,2012,43,415
        7347-1,Highway Pickup,2012,39,812
        735-1,Basic Building Set,1990,467,538
        7383-1,Creator Watch,2002,501,0
        740-1,Basic Building Set,1985,467,530
        740-2,12V Transformer for 220V Pack,1969,242,1
        7409-1,Secret of the Tomb,2003,300,42
        7410-1,Jungle River,2003,300,66
        741-1,12V New Transformer for 220V Pack,1974,242,1
        7411-1,Tygurah's Roar,2003,300,94
        7412-1,Yeti's Hideout,2003,300,114
        7413-1,Passage of Jun-Chi,2003,300,101
        7414-1,Elephant Caravan,2003,300,104
        7415-1,Aero Nomad,2003,300,120
        7416-1,Emperor's Ship,2003,300,178
        7417-1,Temple of Mount Everest,2003,300,288
        7418-1,Scorpion Palace,2003,300,354
        7418-2,Scorpion Palace and Foam Scimitar,2003,300,2
        7419-1,Dragon Fortress,2003,300,741
        7420-1,Thunder Blazer,2003,300,69
        742-1,12V New Transformer for 110V Pack,1970,242,1
        7422-1,Airplane,2003,300,33
        7422-2,Red Eagle,2003,300,33
        7423-1,Mountain Sleigh,2003,300,30
        7423-2,Mountain Sleigh (Kabaya Promotional),2003,300,30
        7424-1,Black Cruiser,2003,300,28
        7424-2,Small Car,2003,300,28
        744-1,Universal Building Set,1980,469,540
        7452-1,Lime/Black Racer,2007,120,34
        7453-1,Yellow/Black Racer,2007,120,28
        7467-1,International Space Station,2003,387,162
        7468-1,Saturn V Moon Mission,2003,387,176
        7469-1,Mission to Mars,2003,387,416
        7470-1,Space Shuttle Discovery,2003,387,827
        7471-1,Mars Exploration Rover,2003,387,861
        7473-1,Street Sprinter vs. Mutant Lizard,2005,385,38
        7474-1,Urban Avenger vs. Raptor,2005,385,78
        7475-1,Fire Hammer vs. Mutant Lizards,2005,385,258
        7476-1,Iron Predator vs. T-Rex,2005,385,273
        7477-1,T-1 Typhoon vs. T-Rex,2005,385,579
        7498-1,Police Station,2011,61,785
        7499-1,Flexible Rails,2011,245,24
        75000-1,Clone Troopers vs. Droidekas,2013,167,124
        75001-1,Republic Troopers vs. Sith Troopers,2013,158,62
        75002-1,AT-RT,2013,165,222
        75003-1,A-wing Starfighter,2013,169,177
        75004-1,Z-95 Headhunter,2013,165,371
        75005-1,Rancor Pit,2013,169,380
        75006-1,LEGO Star Wars Jedi Starfighter and Kamino,2013,180,61
        75007-1,Republic Assault Ship & Coruscant,2013,158,74
        75008-1,LEGO Star Wars TIE Bomber and Asteroid Field,2013,180,60
        75009-1,Snowspeeder & Planet Hoth,2013,181,69
        750-1,8 Straight 12V Conducting Rails,1969,242,8
        75010-1,B-wing Starfighter & Planet Endor,2013,181,83
        7501-1,Bangle Minis,2003,500,32
        75011-1,Tantive IV & Planet Alderaan,2013,181,102
        75012-1,BARC Speeder with Sidecar,2013,165,225
        75013-1,Umbaran MHC (Mobile Heavy Cannon),2013,165,491
        75014-1,Battle Of Hoth,2013,169,415
        75015-1,Corporate Alliance Tank Droid,2013,168,271
        75016-1,Homing Spider Droid,2013,167,295
        75017-1,Duel on Geonosis,2013,167,391
        75018-1,JEK-14's Stealth Starfighter,2013,170,548
        75019-1,AT-TE,2013,167,792
        75020-1,Jabba’s Sail Barge,2013,169,848
        7502-1,Photo Minis,2003,500,30
        75021-1,Republic Gunship,2013,167,1173
        75022-1,Mandalorian Speeder,2013,170,210
        75023-10,"Advent Calendar 2013, Star Wars (Day  9) - Republic Assault Ship",2013,225,12
        75023-12,"Advent Calendar 2013, Star Wars (Day 11) - AT-TE Walker",2013,225,15
        75023-14,"Advent Calendar 2013, Star Wars (Day 13) - Battle Droid",2013,225,5
        75023-16,"Advent Calendar 2013, Star Wars (Day 15) - Geonosian Warrior",2013,225,3
        75023-18,"Advent Calendar 2013, Star Wars (Day 17) - Naboo Cruiser",2013,225,16
        75023-2,"Advent Calendar 2013, Star Wars (Day  1) - R5-F7",2013,225,4
        75023-21,"Advent Calendar 2013, Star Wars (Day 20) - Jedi Starfighter",2013,225,13
        75023-23,"Advent Calendar 2013, Star Wars (Day 22) - Young Boba Fett",2013,225,4
        75023-25,"Advent Calendar 2013, Star Wars (Day 24) - Holiday Jango Fett",2013,225,9
        75023-4,"Advent Calendar 2013, Star Wars (Day  3) - FA-4 Pilot Droid",2013,225,9
        75023-6,"Advent Calendar 2013, Star Wars (Day  5) - Twin-Pod Cloud Car",2013,225,16
        75023-8,"Advent Calendar 2013, Star Wars (Day  7) - Weapons Depot",2013,225,11
        75024-1,HH-87 Starhopper,2014,165,361
        75025-1,Jedi Defender-class Cruiser,2013,170,925
        75028-1,Clone Turbo Tank,2014,162,96
        75029-1,AAT,2014,158,95
        75030-1,Millennium Falcon,2014,159,94
        75031-1,TIE Interceptor,2014,159,92
        75032-1,X-Wing Fighter,2014,159,97
        75033-1,Star Destroyer,2014,159,97
        75034-1,Death Star Troopers,2014,158,100
        75035-1,Kashyyyk Troopers,2014,158,99
        75036-1,Utapau Troopers,2014,158,83
        75037-1,Battle on Saleucami,2014,158,179
        75038-1,Jedi Interceptor,2014,158,222
        75039-1,V-Wing Starfighter,2014,158,200
        75040-1,General Grievous' Wheel Bike,2014,158,261
        7504-1,Friendship Frame / Mirror,2004,500,15
        75041-1,Vulture Droid,2014,158,204
        75042-1,Droid Gunship,2014,158,438
        75043-1,AT-AP,2014,158,715
        75044-1,Droid Tri-Fighter,2014,158,261
        75045-1,Republic AV-7 Anti-Vehicle Cannon,2014,158,434
        75046-1,Coruscant Police Gunship,2014,158,479
        75048-1,The Phantom,2014,182,233
        75049-1,Snowspeeder,2014,158,278
        75050-1,B-Wing,2014,158,447
        7505-1,Flowered Hair Bands,2004,500,16
        75051-1,Jedi Scout Fighter,2014,158,488
        75052-1,Mos Eisley Cantina,2014,169,614
        75053-1,The Ghost,2014,182,927
        75054-1,AT-AT,2014,169,1136
        75055-1,Imperial Star Destroyer,2014,158,1357
        75056-1,Advent Calendar 2014 Star Wars,2014,209,24
        75056-10,Advent Calendar 2014 Star Wars (Day 9) - Anakin's Jedi Starfighter,2014,225,13
        75056-11,Advent Calendar 2014 Star Wars (Day 10) - TIE Fighter,2014,225,11
        75056-12,Advent Calendar 2014 Star Wars (Day 11) - TIE Fighter Pilot,2014,225,4
        75056-13,Advent Calendar 2014 Star Wars (Day 12) - Luke's Landspeeder,2014,225,15
        75056-14,Advent Calendar 2014 Star Wars (Day 13) - Luke Skywalker,2014,225,4
        75056-15,Advent Calendar 2014 Star Wars (Day 14) - Moisture Vaporator ,2014,225,14
        75056-16,Advent Calendar 2014 Star Wars (Day 15) - Snowspeeder,2014,225,19
        75056-17,Advent Calendar 2014 Star Wars (Day 16) - Snowspeeder Pilot,2014,225,4
        75056-18,Advent Calendar 2014 Star Wars (Day 17) - Hoth Command Center,2014,225,16
        75056-19,Advent Calendar 2014 Star Wars (Day 18) - General Rieekan,2014,225,4
        75056-2,Advent Calendar 2014 Star Wars (Day 1) - Armored Assault Tank (AAT),2014,225,14
        75056-20,Advent Calendar 2014 Star Wars (Day 19) - Holiday Speeder Bike,2014,225,19
        75056-21,Advent Calendar 2014 Star Wars (Day 20) - Imperial Shuttle,2014,225,11
        75056-22,Advent Calendar 2014 Star Wars (Day 21) - Anakin's Y-wing Starfighter,2014,225,20
        75056-23,Advent Calendar 2014 Star Wars (Day 22) - Festive Astromech,2014,225,7
        75056-24,Advent Calendar 2014 Star Wars (Day 23) - Holiday Fireplace,2014,225,26
        75056-25,Advent Calendar 2014 Star Wars (Day 24) - Santa Darth Vader,2014,225,6
        75056-3,Advent Calendar 2014 Star Wars (Day 2) - Super Battle Droid,2014,225,4
        75056-4,Advent Calendar 2014 Star Wars (Day 3) - Republic Cannon,2014,225,18
        75056-5,Advent Calendar 2014 Star Wars (Day 4) - Clone Trooper with Santa Hat,2014,225,5
        75056-6,Advent Calendar 2014 Star Wars (Day 5) - Clone Trooper Weapon Station,2014,225,11
        75056-7,Advent Calendar 2014 Star Wars (Day 6) - Vulture Droid,2014,225,9
        75056-8,Advent Calendar 2014 Star Wars (Day 7) - Snowball Missle Launcher,2014,225,16
        75056-9,Advent Calendar 2014 Star Wars (Day 8) - Snowtrooper ,2014,225,4
        75058-1,MTT,2014,166,951
        75059-1,Sandcrawler,2014,169,3294
        75060-1,Slave I,2015,174,1994
        7506-1,Starry Bangles and Rings,2004,500,9
        7507-1,Jewels-n-Rings,2003,500,80
        75072-1,ARC-170 Starfighter,2015,159,95
        75073-1,Vulture Droid,2015,159,77
        75074-1,Snowspeeder,2015,159,97
        75075-1,AT-AT,2015,159,88
        75076-1,Republic Gunship,2015,159,105
        75077-1,Homing Spider Droid,2015,159,102
        75078-1,Imperial Troop Transport,2015,182,141
        75079-1,Shadow Troopers,2015,183,95
        75080-1,AAT,2015,166,251
        7508-1,Jewels-n-Bands,2003,500,80
        75081-1,T-16 Skyhopper,2015,169,246
        75082-1,TIE Advanced Prototype,2015,182,354
        75083-1,AT-DP,2015,182,498
        75084-1,Wookiee Gunship,2015,182,568
        75085-1,Hailfire Droid,2015,167,163
        75086-1,Battle Droid Troop Carrier,2015,166,565
        75087-1,Anakin's Custom Jedi Starfighter,2015,165,369
        75088-1,Senate Commando Troopers,2015,183,106
        75089-1,Geonosis Troopers,2015,183,105
        75090-1,Ezra's Speeder Bike,2015,182,267
        75090-2,Ezra's Speeder Bike,2015,182,253
        7509-1,Jewels-n-Clips,2003,500,72
        75091-1,Flash Speeder,2015,166,311
        75092-1,Naboo Starfighter,2015,166,440
        75093-1,Death Star Final Duel,2015,169,722
        75094-1,Imperial Shuttle Tydirium,2015,158,935
        75095-1,UCS TIE Fighter,2015,158,1683
        75096-1,Sith Infiltrator,2015,166,659
        75097-1,LEGO® Star Wars™ Advent Calendar,2015,225,292
        75098-1,Assault on Hoth,2016,174,2139
        75099-1,Rey's Speeder™,2015,158,192
        75100-1,First Order Snowspeeder™,2015,158,443
        7510-1,Trendy Tote Hot Pink,2003,500,89
        75101-1,First Order Special Forces TIE fighter™,2015,158,519
        75102-1,Poe’s X-Wing Fighter™,2015,158,715
        75103-1,First Order Transporter™,2015,158,783
        75104-1,Kylo Ren’s Command Shuttle™,2015,158,1002
        75105-1,Millennium Falcon™,2015,158,1328
        75106-1,Imperial Assault Carrier,2015,182,1214
        75107-1,Jango Fett™,2015,158,85
        75108-1,Clone Commander Cody™,2015,158,82
        75109-1,Obi-Wan Kenobi™,2015,158,83
        751-1,8 Curved 12V Conducting Rails,1969,242,8
        75110-1,Luke Skywalker™,2015,158,83
        7511-1,Trendy Tote Tangerine,2003,500,94
        75111-1,Darth Vader™,2015,158,160
        75112-1,General Grievous™,2015,158,186
        75113-1,Rey,2016,184,84
        75114-1,First Order Stormtrooper,2016,184,81
        75115-1,Poe Dameron,2016,184,101
        75116-1,Finn,2016,184,98
        75117-1,Kylo Ren,2016,184,86
        75118-1,Captain Phasma,2016,184,82
        75119-1,Sergeant Jyn Erso,2016,185,104
        75120-1,K-2SO,2016,185,169
        7512-1,Trendy Tote Sky Blue,2003,500,94
        75121-1,Imperial Death Trooper,2016,185,105
        75125-1,Resistance X-Wing Fighter,2016,184,87
        75126-1,First Order Snowspeeder,2016,184,91
        75127-1,The Ghost,2016,159,104
        75128-1,TIE Advanced Prototype,2016,182,93
        75129-1,Wookiee Gunship,2016,182,84
        75130-1,AT-DP,2016,182,76
        75131-1,Resistance Trooper Battle Pack,2016,184,112
        75132-1,First Order Battle Pack,2016,184,88
        75133-1,Rebel Alliance Battle Pack,2016,158,99
        75134-1,Galactic Empire™ Battle Pack,2016,158,109
        75135-1,Obi-Wan's Jedi Interceptor,2016,168,212
        75136-1,Droid Escape Pod,2016,169,196
        75137-1,Carbon-Freezing Chamber,2016,169,231
        75138-1,Hoth Attack,2016,169,230
        75139-1,Battle on Takodana,2016,184,403
        75140-1,Resistance Troop Transporter,2016,184,644
        7514-1,Sweet Dreamy Jewels,2004,500,12
        75141-1,Kanan's Speeder Bike,2016,182,226
        75142-1,Homing Spider Droid,2016,167,309
        75144-1,Snowspeeder,2017,158,1702
        75145-1,Eclipse Fighter,2016,170,363
        75146-1,Advent Calendar 2016 Star Wars,2016,209,282
        75147-1,StarScavenger,2016,170,557
        75148-1,Encounter on Jakku,2016,184,529
        75149-1,Resistance X-Wing Fighter,2016,184,738
        75150-1,Vader’s TIE Advanced vs. A-Wing Starfighter,2016,182,700
        75151-1,Clone Turbo Tank,2016,168,902
        75152-1,Imperial Assault Hovertank,2016,185,385
        75153-1,AT-ST Walker,2016,185,448
        75154-1,TIE Striker,2016,185,541
        75155-1,Rebel U-Wing Fighter,2016,185,657
        75156-1,Krennic’s Imperial Shuttle,2016,185,861
        75157-1,Captain Rex’s AT-TE,2016,182,969
        75158-1,Rebel Combat Frigate,2016,182,934
        75159-1,Death Star,2016,158,4023
        75160,U-wing,2017,158,107
        75160-1,U-wing,2017,185,108
        7516-1,Cool Starry Jewels,2004,500,52
        75161-1,Tie Striker Microfighter,2017,159,87
        75162-1,Y-wing,2017,158,90
        75163-1,Krennics Imperial Shuttle Microfighter,2017,159,77
        75164-1,Rebel Trooper Battle Pack,2017,185,119
        75165-1,Imperial Trooper Battle Pack,2017,185,112
        75166-1,First Order Transport Speeder Battle Pack,2017,612,115
        75168-1,Yoda's Jedi Starfighter,2017,165,262
        75169-1,Duel on Naboo,2017,166,207
        75170-1,The Phantom,2017,182,267
        75171-1,Battle on Scarif,2017,185,419
        75172-1,Y-Wing Starfighter,2017,185,688
        75173-1,Luke's Landspeeder,2017,169,148
        75174-1,Desert Skiff Escape,2017,158,284
        75175-1,A-Wing Starfighter,2017,158,356
        75178-1,Jakku Quadjumper,2017,158,455
        7518-1,Cool Room Catchers,2003,500,113
        75182-1,Republic Fighter Tank,2017,168,302
        75185-1,Tracker I,2017,158,557
        75186-1,The Arrowhead,2017,158,773
        7522-1,Let's Party,2003,500,3
        7523-1,Hip Hair Set,2005,500,16
        7524-1,Glamour Girl Purse,2004,500,18
        7525-1,Sunshine Picture Stand,2004,500,22
        7526-1,My Starry Notes,2004,500,27
        7527-1,Pretty in Pink Beauty Set,2005,500,136
        7528-1,Designer Desk Set,2004,500,71
        7529-1,Stylin' Stationery Set,2004,500,75
        7530-1,Starry Decoration Set,2004,500,71
        753-1,Automatic Right Electric Switch,1969,242,5
        7531-1,The Ultimate Jewelry Collection,2004,500,152
        7533-1,Pretty in Pink Jewels-n-More,2005,500,66
        7534-1,Stylin' Citrus Jewels-n-More,2005,500,67
        7535-1,Groovy Grape Jewels-n-More,2005,500,67
        7537-1,Cool Carry-All Set,2005,500,72
        7540-1,Friends 4-Ever Jewels & More,2005,500,66
        754-1,Automatic Left Electric Switch,1969,242,5
        7545-1,Pink & Pearls Jewels 'n' More,2006,500,68
        7546-1,Tropical Breeze Jewels 'n' More,2006,500,73
        7548-1,Fun Flamingo Frames 'n' More,2006,500,79
        7549-1,Totally Tropical Decor Set,2006,500,132
        755-1,Left and Right Switches,1974,242,12
        75523-1,Scarif Stormtrooper,2017,158,89
        75524-1,Chirrut Îmwe,2017,158,87
        75525-1,Baze Malbus,2017,158,147
        7553-1,Advent Calendar 2011 City,2011,208,24
        7553-10,Advent Calendar 2011 City (Day  9) Ice Fisherman,2011,220,5
        7553-11,Advent Calendar 2011 City (Day 10) Camp Fire and Fishing Pole,2011,220,6
        7553-12,Advent Calendar 2011 City (Day 11) Wall with Doorway,2011,220,15
        7553-13,Advent Calendar 2011 City (Day 12) Wall with Small Window,2011,220,15
        7553-14,Advent Calendar 2011 City (Day 13) Police Officer with Radio,2011,220,5
        7553-15,Advent Calendar 2011 City (Day 14) Forensic Lab,2011,220,10
        7553-16,Advent Calendar 2011 City (Day 15) Police Car Base,2011,220,14
        7553-17,Advent Calendar 2011 City (Day 16) Police Car Middle Section,2011,220,11
        7553-18,Advent Calendar 2011 City (Day 17) Police Car Top Section,2011,220,7
        7553-19,Advent Calendar 2011 City (Day 18) Robber with Crowbar,2011,220,5
        7553-2,Advent Calendar 2011 City (Day  1) Robber with Snowball,2011,220,6
        7553-20,Advent Calendar 2011 City (Day 19) Safe with Gold Bars,2011,220,10
        7553-21,Advent Calendar 2011 City (Day 20) Orange Snowmobile,2011,220,8
        7553-22,Advent Calendar 2011 City (Day 21) Sled with Crate,2011,220,6
        7553-23,Advent Calendar 2011 City (Day 22) White Snowmobile,2011,220,8
        7553-24,Advent Calendar 2011 City (Day 23) Dog with Bone,2011,220,2
        7553-25,Advent Calendar 2011 City (Day 24) Santa and Fireplace,2011,220,18
        7553-3,Advent Calendar 2011 City (Day  2) Catapult,2011,220,8
        7553-4,Advent Calendar 2011 City (Day  3) Police Officer with Handcuffs,2011,220,5
        7553-5,Advent Calendar 2011 City (Day  4) Wall with Barred Window,2011,220,14
        7553-6,Advent Calendar 2011 City (Day  5) Wall with Large Window,2011,220,18
        7553-7,Advent Calendar 2011 City (Day  6) Christmas Tree,2011,220,18
        7553-8,Advent Calendar 2011 City (Day  7) Skateboard and Gifts,2011,220,13
        7553-9,Advent Calendar 2011 City (Day 8) Bed,2011,220,5
        7554-1,Pearly Pink Bracelet & Bands,2006,500,63
        7557-1,Blooms & Butterflies,2005,500,14
        7558-1,Shells & Starfish,2005,500,14
        7559-1,Sports & Stars,2005,500,14
        756-1,Electric Crossing,1974,242,5
        7566-1,Farmer,2010,57,16
        7567-1,Traveler,2010,63,21
        7569-1,Desert Attack,2010,271,57
        7570-1,The Ostrich Race,2010,271,169
        757-1,Storage Tray,1987,443,1
        7571-1,The Fight for the Dagger,2010,271,259
        7572-1,Quest Against Time,2010,271,506
        7573-1,Battle of Alamut,2010,271,821
        7574-1,Advent Calendar 2005 Clikits,2005,213,24
        7574-10,Advent Calendar 2005 Clikits  (Day 9) Hair Band,2005,222,4
        7574-11,Advent Calendar 2005 Clikits (Day 10) Paper Clip,2005,222,10
        7574-12,Advent Calendar 2005 Clikits (Day 11) Picture Frame,2005,222,6
        7574-13,Advent Calendar 2005 Clikits (Day 12) Gift Tag with Icons,2005,222,4
        7574-14,Advent Calendar 2005 Clikits (Day 13) Hair Band,2005,222,7
        7574-15,Advent Calendar 2005 Clikits (Day 14) Ring,2005,222,3
        7574-16,Advent Calendar 2005 Clikits (Day 15) Hair Band,2005,222,7
        7574-17,Advent Calendar 2005 Clikits (Day 16) Gift Tag with Icons,2005,222,4
        7574-18,Advent Calendar 2005 Clikits (Day 17) Icons,2005,222,8
        7574-19,Advent Calendar 2005 Clikits (Day 18) Bracelet,2005,222,9
        7574-2,Advent Calendar 2005 Clikits  (Day 1) Ring,2005,222,3
        7574-20,Advent Calendar 2005 Clikits (Day 19) Necklace,2005,222,4
        7574-21,Advent Calendar 2005 Clikits (Day 20) Paper Clip,2005,222,3
        7574-22,Advent Calendar 2005 Clikits (Day 21) Bangle,2005,222,2
        7574-23,Advent Calendar 2005 Clikits (Day 22) Hair Band,2005,222,4
        7574-24,Advent Calendar 2005 Clikits (Day 23) Gift Tag with Icons,2005,222,4
        7574-25,Advent Calendar 2005 Clikits (Day 24) Hair Grip,2005,222,3
        7574-3,Advent Calendar 2005 Clikits  (Day 2) Hair Band,2005,222,7
        7574-4,Advent Calendar 2005 Clikits  (Day 3) Necklace,2005,222,4
        7574-5,Advent Calendar 2005 Clikits  (Day 4) Icons,2005,222,8
        7574-6,Advent Calendar 2005 Clikits  (Day 5) Bangle,2005,222,3
        7574-7,Advent Calendar 2005 Clikits  (Day 6) Magnet,2005,222,3
        7574-8,Advent Calendar 2005 Clikits  (Day 7) Trinket Box,2005,222,3
        7574-9,Advent Calendar 2005 Clikits  (Day 8) Magnet,2005,222,3
        7575-1,Advent Calendar 2004 Clikits,2004,213,24
        7575-10,Advent Calendar 2004 Clikits (Day  9) Bracelet,2004,222,4
        7575-11,Advent Calendar 2004 Clikits (Day 10) Hair Band,2004,222,5
        7575-12,Advent Calendar 2004 Clikits (Day 11) Icons,2004,222,10
        7575-13,Advent Calendar 2004 Clikits (Day 12) Necklace,2004,222,8
        7575-14,Advent Calendar 2004 Clikits (Day 13) Hair Band,2004,222,4
        7575-15,Advent Calendar 2004 Clikits (Day 14) Gift Tag with Icons,2004,222,4
        7575-16,Advent Calendar 2004 Clikits (Day 15) Ring,2004,222,4
        7575-17,Advent Calendar 2004 Clikits (Day 16) Necklace,2004,222,4
        7575-18,Advent Calendar 2004 Clikits (Day 17) Bangle,2004,222,2
        7575-19,Advent Calendar 2004 Clikits (Day 18) Paper Clip / Hair Clip,2004,222,10
        7575-2,Advent Calendar 2004 Clikits (Day  1) Paper Clip / Hair Clip,2004,222,3
        7575-20,Advent Calendar 2004 Clikits (Day 19) Picture Frame,2004,222,8
        7575-21,Advent Calendar 2004 Clikits (Day 20) Hair Band,2004,222,4
        7575-22,Advent Calendar 2004 Clikits (Day 21) Gift Tag with Icons,2004,222,4
        7575-23,Advent Calendar 2004 Clikits (Day 22) Paper Clip / Hair Clip,2004,222,3
        7575-24,Advent Calendar 2004 Clikits (Day 23) Hair Band,2004,222,5
        7575-25,Advent Calendar 2004 Clikits (Day 24) Carry Case,2004,222,5
        7575-3,Advent Calendar 2004 Clikits (Day  2) Bracelet,2004,222,4
        7575-4,Advent Calendar 2004 Clikits (Day  3) Hair Band,2004,222,7
        7575-5,Advent Calendar 2004 Clikits (Day  4) Ring,2004,222,10
        7575-6,Advent Calendar 2004 Clikits (Day  5) Picture Frame,2004,222,6
        7575-7,Advent Calendar 2004 Clikits (Day  6) Bangle,2004,222,2
        7575-8,Advent Calendar 2004 Clikits (Day  7) Gift Tag with Icons,2004,222,4
        7575-9,Advent Calendar 2004 Clikits (Day  8) Hair Band,2004,222,4
        7577-1,Winter Wonder Palace,2006,319,163
        7578-1,Ultimate Princesses,2006,319,158
        7579-1,Blossom Fairy,2006,319,49
        7580-1,The Skating Princess,2007,319,22
        758-1,Storage Tray,1987,443,1
        7581-1,Winter Royal Stables,2007,319,82
        7582-1,Royal Summer Palace,2007,319,174
        75821-1,Piggy Car Escape,2016,606,74
        75822-1,Piggy Plane Attack,2016,606,168
        75823-1,Bird Island Egg Heist,2016,606,282
        75824-1,Pig City Teardown,2016,606,385
        75825-1,Piggy Pirate Ship,2016,606,610
        75826-1,King Pig’s Castle,2016,606,854
        75827-1,Firehouse Headquarters,2016,301,4640
        75828-1,Ecto1 & 2,2016,607,552
        7583-1,Playful Puppy,2008,322,83
        7585-1,Pony Stable,2008,323,215
        7586-1,Sunshine Home,2008,322,448
        75870-1,Chevrolet Corvette Z06,2016,601,176
        7587-1,Pony Jumping,2008,323,57
        75871-1,Ford Mustang GT,2016,601,188
        75872-1,Audi R18 e-tron quattro,2016,601,168
        75873-1,Audi R8 LMS ultra,2016,601,178
        75874-1,Chevrolet Camaro Drag Race,2016,601,448
        75875-1,Ford F-150 Raptor & Ford Model A Hot Rod,2016,601,671
        75876-1,Porsche 919 Hybrid and 917K Pit Lane,2016,601,742
        75877-1,Mercedes-AMG GT3,2017,601,203
        75878-1,Bugatti Chiron,2017,601,181
        75879-1,Scuderia Ferrari SF16-H,2017,601,184
        75880-1,McLaren 720S,2017,601,160
        75881-1,2016 Ford GT & 1966 Ford GT40,2017,601,366
        75882-1,Ferrari FXX K & Development Center,2017,601,493
        75899-1,LaFerrari,2015,601,167
        75900-1,Mummy Museum Mystery,2015,603,109
        7590-1,Woody and Buzz to the Rescue,2010,275,92
        75901-1,Mystery Plane Adventures,2015,603,127
        75902-1,The Mystery Machine,2015,603,300
        75903-1,Haunted Lighthouse,2015,603,435
        75904-1,Mystery Mansion,2015,603,856
        75908-1,458 Italia GT2,2015,601,156
        75909-1,McLaren P1,2015,601,171
        759-1,Storage Cabinet,1985,443,1
        75910-1,Porsche 918 Spyder,2015,601,154
        7591-1,Construct-a-Zurg,2010,275,118
        75911-1,McLaren Mercedes Pit Stop,2015,601,340
        75912-1,Porsche 911 GT Finish Line,2015,601,561
        75913-1,F14 T & Scuderia Ferrari Truck,2015,601,889
        75915-1,Pteranodon Capture,2015,602,173
        75916-1,Dilophosaurus Ambush,2015,602,246
        75917-1,Raptor Rampage,2015,602,320
        75918-1,T-Rex Tracker,2015,602,519
        75919-1,Indominus rex™ Breakout,2015,602,1154
        75920-1,Raptor Escape,2015,602,391
        7592-1,Construct-a-Buzz,2010,275,205
        7593-1,Buzz's Star Command Spaceship,2010,275,251
        7594-1,Woody's Roundup!,2010,275,502
        7595-1,Army Men on Patrol,2010,275,90
        7596-1,Trash Compactor Escape,2010,275,367
        7597-1,Western Train Chase,2010,275,584
        7598-1,Pizza Planet Truck Rescue,2010,275,225
        7599-1,Garbage Truck Getaway,2010,275,404
        76000-1,Arctic Batman vs. Mr. Freeze: Aquaman on Ice,2013,484,197
        7600-1,Advent Calendar 2007 Belville,2007,210,24
        7600-10,Advent Calendar 2007 Belville (Day  9) Sleigh,2007,218,9
        7600-11,Advent Calendar 2007 Belville (Day 10) Snowman,2007,218,9
        76001-1,The Bat vs. Bane: Tumbler Chase,2013,484,366
        7600-12,Advent Calendar 2007 Belville (Day 11) Turret,2007,218,4
        7600-13,Advent Calendar 2007 Belville (Day 12) Rabbit,2007,218,3
        7600-14,Advent Calendar 2007 Belville (Day 13) Fruit Cup and Bottles,2007,218,9
        7600-15,Advent Calendar 2007 Belville (Day 14) Flowers,2007,218,8
        7600-16,Advent Calendar 2007 Belville (Day 15) Vanity Case,2007,218,5
        7600-17,Advent Calendar 2007 Belville (Day 16) Fireplace,2007,218,20
        7600-18,Advent Calendar 2007 Belville (Day 17) Frog Book and Jewel Case,2007,218,6
        7600-19,Advent Calendar 2007 Belville (Day 18) Teddy Bear,2007,218,5
        7600-2,Advent Calendar 2007 Belville (Day  1) Fairy with Wand,2007,218,2
        7600-20,Advent Calendar 2007 Belville (Day 19) Jelly and Ice Cream,2007,218,10
        7600-21,Advent Calendar 2007 Belville (Day 20) Dog and Bowl,2007,218,3
        76002-1,Superman: Metropolis Showdown,2013,489,119
        7600-22,Advent Calendar 2007 Belville (Day 21) Toy Ball,2007,218,13
        7600-23,Advent Calendar 2007 Belville (Day 22) Festive Wreath,2007,218,12
        7600-24,Advent Calendar 2007 Belville (Day 23) Toy Castle,2007,218,17
        7600-25,Advent Calendar 2007 Belville (Day 24) Christmas Tree and Presents,2007,218,9
        7600-3,Advent Calendar 2007 Belville (Day  2) Bed,2007,218,13
        76003-1,Superman: Battle of Smallville,2013,489,417
        7600-4,Advent Calendar 2007 Belville (Day  3) Vanity Unit,2007,218,8
        76004-1,Spider-Man: Spider-Cycle Chase,2013,488,236
        7600-5,Advent Calendar 2007 Belville (Day  4) Jewel Chest,2007,218,11
        76005-1,Spider-Man: Daily Bugle Showdown,2013,488,473
        7600-6,Advent Calendar 2007 Belville (Day  5) Cat,2007,218,6
        76006-1,Iron Man: Extremis Sea Port Battle,2013,490,194
        7600-7,Advent Calendar 2007 Belville (Day  6) Tea Set,2007,218,9
        76007-1,Iron Man: Malibu Mansion Attack,2013,490,363
        7600-8,Advent Calendar 2007 Belville (Day  7) Chair and Desk Lamp,2007,218,15
        76008-1,Iron Man vs. The Mandarin: Ultimate Showdown,2013,490,91
        7600-9,Advent Calendar 2007 Belville (Day  8) Kitten,2007,218,12
        76009-1,Superman: Black Zero Escape,2013,489,166
        760-1,Storage Cabinet,1985,443,5
        76010-1,The Penguin Face Off,2014,484,136
        76011-1,Batman: Man-Bat Attack,2014,484,183
        76012-1,Batman: The Riddler Chase,2014,484,303
        76013-1,The Joker Steam Roller,2014,484,485
        76014-1,Spider-Trike vs. Electro,2014,488,69
        76015-1,Doc Ock Truck Heist,2014,488,236
        76016-1,Spider-Helicopter Rescue,2014,488,298
        76017-1,Captain America vs. Hydra,2014,487,179
        76018-1,Hulk Lab Smash,2014,487,396
        76019-1,Starblaster Showdown,2014,483,195
        760-2,London Bus,1975,397,110
        76020-1,Knowhere Escape Mission,2014,483,432
        7602-1,Jeep,2006,22,46
        76021-1,The Milano Spaceship Rescue,2014,483,664
        76022-1,X-Men vs. The Sentinel,2014,491,335
        76023-1,The Tumbler,2014,485,1866
        76025-1,Green Lantern vs. Sinestro,2015,486,174
        76026-1,Gorilla Grodd Goes Bananas,2015,486,346
        76027-1,Black Manta Deep Sea Strike,2015,486,386
        76028-1,Darkseid Invasion,2015,486,543
        76029-1,Iron Man vs. Ultron,2015,487,92
        76030-1,Avengers Hydra Showdown,2015,487,219
        76031-1,The Hulk Buster Smash,2015,487,247
        76032-1,The Avengers Quinjet Chase,2015,487,720
        76034-1,Batboat Harbor Pursuit,2015,484,263
        76035-1,Jokerland,2015,484,1034
        76036-1,Carnage's Shield Sky Attack,2015,493,96
        76037-1,Rhino and Sandman Supervillain Team-up,2015,493,385
        76038-1,Attack on Avengers Tower,2015,487,513
        76039-1,Ant-Man Final Battle,2015,493,194
        76040-1,Brainiac Attack,2015,486,178
        7604-1,Dinosaur,2006,22,34
        76041-1,The Hydra Fortress Smash,2015,487,404
        76042-1,The SHIELD Helicarrier,2015,487,2995
        76044-1,Clash of the Heroes,2016,482,91
        76045-1,Kryptonite Interception,2016,482,308
        76046-1,Heroes of Justice: Sky High Battle,2016,482,516
        76047-1,Black Panther Pursuit,2016,493,284
        76048-1,Iron Skull Sub Attack,2016,487,333
        76049-1,Avenjet Space Mission,2016,487,521
        76050-1,Crossbones’ Hazard Heist,2016,493,178
        76051-1,Super Hero Airport Battle,2016,482,814
        76052-1,Batman Classic TV Series - Batcave,2016,484,2470
        76053-1,Gotham City Cycle Chase,2016,484,224
        76054-1,Batman: Scarecrow Harvest of Fear,2016,484,561
        76055-1,Batman: Killer Croc Sewer Smash,2016,484,757
        76056-1,Batman: Rescue from Ra's al Ghul,2016,484,256
        76057-1,Spider-Man: Web Warriors Ultimate Bridge Battle,2016,488,1090
        76058-1,Spider-Man: Ghost Rider Team-up,2016,488,216
        76059-1,Spider-Man: Doc Ock's Tentacle Trap,2016,488,445
        76060-1,Doctor Strange's Sanctum Sanctorum,2016,493,357
        7606-1,Frog,2006,22,33
        76061-1,Mighty Micros: Batman™ vs. Catwoman™,2016,482,79
        76062-1,Mighty Micros: Robin™ vs. Bane™,2016,482,77
        76063-1,Mighty Micros: The Flash™ vs. Captain Cold™,2016,482,88
        76064-1,Mighty Micros: Spider-Man vs. Green Goblin,2016,482,85
        76065-1,Mighty Micros: Captain America vs. Red Skull,2016,482,95
        76066-1,Mighty Micros: Hulk vs. Ultron,2016,482,80
        76067-1,Tanker Truck Takedown,2016,493,329
        76068-1,Mighty Micros: Superman™ vs. Bizarro™,2017,489,93
        76069-1,Mighty Micros: Batman vs. Killer Moth,2017,484,83
        76070-1,Mighty Micros: Wonder Woman vs. Doomsday,2017,482,85
        7607-1,Butterfly,2006,22,29
        76071-1,Mighty Micros: Spider-Man vs. Scorpion ,2017,488,79
        76072-1,Mighty Micros: Iron Man vs. Thanos,2017,482,94
        76073-1,Mighty Micros: Wolverine vs. Magneto,2017,493,84
        76076-1,Captain America Jet Pursuit,2017,493,159
        76077-1,Iron Man: Detroit Steel Strikes,2017,493,376
        76078-1,Hulk vs. Red Hulk,2017,493,374
        76079-1,Ravager Attack,2017,483,196
        76080-1,Ayesha's Revenge,2017,483,304
        7608-1,Shark,2006,22,27
        76081-1,The Milano vs. The Abilisk,2017,483,456
        76082-1,ATM Heist Battle,2017,493,184
        76083-1,Beware the Vulture,2017,493,374
        7609-1,Helicopter,2006,24,28
        7610-1,Speedboat,2006,22,18
        7611-1,Police Car,2008,112,35
        7612-1,Muscle Car,2008,120,37
        7613-1,Track Racer,2008,120,34
        7615-1,Basic Blue Bucket,2009,37,471
        7616-1,Basic Red Bucket,2009,37,428
        7620-1,Motorcycle Chase,2008,266,79
        7621-1,Lost Tomb,2008,267,277
        7622-1,Race for the Stolen Treasure,2008,267,275
        7623-1,Temple Escape,2008,267,553
        7624-1,Jungle Duel,2008,265,91
        7625-1,River Chase,2008,265,233
        7626-1,Jungle Cutter,2008,265,515
        7627-1,Temple of the Crystal Skull,2008,265,929
        7628-1,Peril in Peru,2008,265,625
        7630-1,Front-End Loader,2009,56,107
        7631-1,Dump Truck,2009,56,184
        7632-1,Crawler Crane,2009,56,478
        7633-1,Construction Site,2009,56,897
        7634-1,Tractor,2009,57,77
        7635-1,4WD with Horse Trailer,2009,57,176
        7636-1,Combine Harvester,2009,57,364
        7637-1,Farm,2009,57,613
        7638-1,Tow Truck,2009,63,128
        7639-1,Camper,2009,63,164
        7641-1,City Corner,2009,63,484
        7642-1,Garage,2009,63,957
        7643-1,Air Show Plane,2009,53,114
        7644-1,MX-81 Hypersonic Operations Aircraft,2008,137,794
        7645-1,MT-61 Crystal Reaper,2008,137,598
        764521-1,Co-Pack,2008,52,0
        7646-1,ETX Alien Infiltrator,2008,137,328
        7647-1,MX-41 Switch Fighter,2008,137,234
        7648-1,MT-21 Mobile Mining Unit,2008,137,129
        7649-1,MT-201 Ultra-Drill Walker,2008,137,757
        7654-1,Droids Battle Pack,2007,168,102
        7655-1,Clone Troopers Battle Pack,2007,168,58
        7656-1,General Grievous Starfighter,2007,168,232
        7657-1,AT-ST,2007,169,243
        7658-1,Y-wing Fighter,2007,169,454
        7659-1,Imperial Landing Craft,2007,169,471
        7660-1,Naboo N-1 Starfighter and Vulture Droid,2007,166,279
        7661-1,Jedi Starfighter with Hyperdrive Booster Ring,2007,168,574
        7662-1,Trade Federation MTT,2007,166,1326
        7663-1,Sith Infiltrator,2007,166,310
        7664-1,TIE Crawler,2007,170,546
        7665-1,Republic Cruiser (Limited Edition - with R2-R7),2007,166,920
        7666-1,Hoth Rebel Base [Limited Edition - with K-3PO],2007,169,557
        7667-1,Imperial Dropship,2008,170,80
        7668-1,Rebel Scout Speeder,2008,170,81
        7669-1,Anakin's Jedi Starfighter,2008,165,152
        7669-2,Anakin's Jedi Starfighter Clone Wars White Box,2008,165,144
        7670-1,Hailfire Droid & Spider Droid,2008,167,249
        7670-2,Hailfire Droid & Spider Droid Clone Wars White Box,2008,165,249
        7671-1,AT-AP Walker,2008,168,392
        7672-1,Rogue Shadow,2008,170,481
        7673-1,Magna Guard Starfighter,2008,165,430
        7674-1,V-19 Torrent,2008,165,470
        7675-1,AT-TE Walker,2008,165,809
        7676-1,Republic Attack Gunship,2008,165,1033
        7678-1,Droid Gunship,2008,168,323
        7679-1,Republic Fighter Tank,2008,165,595
        7680-1,The Twilight - Limited Edition,2008,165,887
        7681-1,Separatist Spider Droid,2008,165,214
        7682-1,Shanghai Chase,2009,268,244
        7683-1,Fight on the Flying Wing,2009,267,375
        7684-1,Pig Farm & Tractor,2010,57,256
        7685-1,Dozer,2009,56,351
        7686-1,Helicopter Transporter,2009,63,381
        7687-1,Advent Calendar 2009 City,2009,208,24
        7687-10,Advent Calendar 2009 City (Day  9) Traffic Light,2009,220,7
        7687-11,Advent Calendar 2009 City (Day 10) Letter Carrier,2009,220,5
        7687-12,Advent Calendar 2009 City (Day 11) ATV,2009,220,17
        7687-13,Advent Calendar 2009 City (Day 12) Crate and Present,2009,220,9
        7687-14,Advent Calendar 2009 City (Day 13) Chef and Cup,2009,220,5
        7687-15,Advent Calendar 2009 City (Day 14) Coffee Stand,2009,220,17
        7687-16,Advent Calendar 2009 City (Day 15) Park Bench,2009,220,9
        7687-17,Advent Calendar 2009 City (Day 16) Street Cleaner,2009,220,5
        7687-18,Advent Calendar 2009 City (Day 17) Wheelbarrow and Snowballs,2009,220,14
        7687-19,Advent Calendar 2009 City (Day 18) Fountain,2009,220,9
        7687-2,Advent Calendar 2009 City (Day  1) Minifigure and Snowballs,2009,220,7
        7687-20,Advent Calendar 2009 City (Day 19) Child and RC Car,2009,220,12
        7687-21,Advent Calendar 2009 City (Day 20) RC Car Cones and Flag,2009,220,15
        7687-22,Advent Calendar 2009 City (Day 21) Lumberjack,2009,220,6
        7687-23,Advent Calendar 2009 City (Day 22) Chainsaw Sawhorse and Log,2009,220,14
        7687-24,Advent Calendar 2009 City (Day 23) Christmas Tree,2009,220,21
        7687-25,Advent Calendar 2009 City (Day 24) Santa and Fireplace,2009,220,26
        7687-3,Advent Calendar 2009 City (Day  2) Snowman,2009,220,10
        7687-4,Advent Calendar 2009 City (Day  3) Sleigh,2009,220,5
        7687-5,Advent Calendar 2009 City (Day  4) Minifigure on Skates,2009,220,7
        7687-6,Advent Calendar 2009 City (Day  5) Skate Stand,2009,220,12
        7687-7,Advent Calendar 2009 City (Day  6) Street Light with Garland,2009,220,12
        7687-8,Advent Calendar 2009 City (Day  7) Police Officer with Loudhailer,2009,220,5
        7687-9,Advent Calendar 2009 City (Day  8) Road Barrier,2009,220,11
        7688-1,Sports Plane,2010,53,105
        7690-1,MB-01 Eagle Command Base,2007,137,763
        7691-1,ETX Alien Mothership Assault,2007,137,433
        7692-1,MX-71 Recon Dropship,2007,137,434
        7693-1,ETX Alien Strike,2007,137,245
        7694-1,MT-31 Trike,2007,137,94
        7695-1,MX-11 Astro Fighter,2007,137,56
        7696-1,Commuter Jet,2011,53,107
        7697-1,MT-51 Claw-Tank Ambush,2007,137,373
        7699-1,MT-101 Armored Drilling Unit,2007,137,634
        7700-1,Stealth Hunter,2006,389,163
        770-1,Rescue Set,1976,420,142
        7701-1,Grand Titan,2006,389,196
        7702-1,Thunder Fury,2006,389,196
        7703-1,Fire Vulture,2006,389,176
        7704-1,Sonic Phantom,2006,389,216
        7705-1,Gate Assault,2006,389,401
        7706-1,Mobile Defense Tank,2006,389,371
        7707-1,Striking Venom,2006,389,645
        7708-1,Uplink,2006,389,68
        7709-1,Sentai Fortress,2006,389,1457
        7710-1,Push-Along Passenger Steam Train,1980,235,432
        7711-1,Sentry,2006,389,77
        7712-1,Supernova,2006,389,286
        7713-1,Bridge Walker vs. White Lightning,2006,389,652
        7714-1,Golden Guardian [Limited Gold Edition],2007,389,266
        7715-1,Push-Along Passenger Steam Train,1985,235,448
        7716-1,QUICK Good Guy White,2006,324,21
        7717-1,QUICK Bad Guy Green,2006,324,26
        7718-1,QUICK Bad Guy Yellow,2006,324,26
        7719-1,QUICK Good Guy Red,2006,324,21
        7721-1,Combat Crawler X2,2007,389,580
        7723-1,Police Pontoon Plane,2008,61,214
        7724-1,Advent Calendar 2008 City,2008,208,24
        7724-10,Advent Calendar 2008 City (Day  9) Ladder,2008,220,3
        7724-11,Advent Calendar 2008 City (Day 10) Chef and Paddle,2008,220,5
        7724-12,Advent Calendar 2008 City (Day 11) Table and Pizzas,2008,220,13
        7724-13,Advent Calendar 2008 City (Day 12) Oven,2008,220,9
        7724-14,Advent Calendar 2008 City (Day 13) Diver and Spear Gun,2008,220,1
        7724-15,Advent Calendar 2008 City (Day 14) Life Vest Fins and Bouy,2008,220,6
        7724-16,Advent Calendar 2008 City (Day 15) Underwater Scooter,2008,220,9
        7724-17,Advent Calendar 2008 City (Day 16) Police Officer and Camera,2008,220,2
        7724-18,Advent Calendar 2008 City (Day 17) Mug Shot Studio,2008,220,8
        7724-19,Advent Calendar 2008 City (Day 18) Criminal with Handcuffs,2008,220,5
        7724-2,Advent Calendar 2008 City (Day  1) Minifigure and Drumstick,2008,220,5
        7724-20,Advent Calendar 2008 City (Day 19) Train Worker,2008,220,4
        7724-21,Advent Calendar 2008 City (Day 20) Pallet Jack,2008,220,16
        7724-22,Advent Calendar 2008 City (Day 21) Pallet of Bottles,2008,220,18
        7724-23,Advent Calendar 2008 City (Day 22) Hiker with Ice Pick,2008,220,6
        7724-24,Advent Calendar 2008 City (Day 23) Snowmobile,2008,220,16
        7724-25,Advent Calendar 2008 City (Day 24) Female and Snowman,2008,220,15
        7724-3,Advent Calendar 2008 City (Day  2) Barbecue,2008,220,10
        7724-4,Advent Calendar 2008 City (Day 3) Table Cup and Frying Pan,2008,220,4
        7724-5,Advent Calendar 2008 City (Day  4) Female with Ice Cream,2008,220,5
        7724-6,Advent Calendar 2008 City (Day  5) Freezer Chest and Umbrella,2008,220,6
        7724-7,Advent Calendar 2008 City (Day  6) Ice Cream Cart and Sundae,2008,220,11
        7724-8,Advent Calendar 2008 City (Day  7) Fireman and Radio,2008,220,5
        7724-9,Advent Calendar 2008 City (Day  8) Kitten in a Tree,2008,220,6
        7725-1,Electric Passenger Train,1981,234,488
        7726-1,Coast Guard Truck with Speed Boat,2008,55,361
        7727-1,Freight Steam Train,1983,234,569
        7730-1,Electric Goods Train,1980,234,519
        7731-1,Mail Van,2008,50,65
        7732-1,Air Mail,2008,50,87
        7733-1,Truck & Forklift,2008,54,342
        7734-1,Cargo Plane,2008,54,462
        7735-1,Freight Train,1985,234,516
        7736-1,Coast Guard Quad Bike,2008,55,33
        7737-1,Off-Road Vehicle and Jet Scooter,2008,55,130
        7738-1,Coast Guard Helicopter and Life Raft,2008,55,447
        7739-1,Coast Guard Patrol Boat and Tower,2008,55,444
        7740-1,Inter-City Passenger Train,1980,234,784
        7741-1,Police Helicopter,2008,61,93
        7743-1,Police Command Center,2008,61,523
        7744-1,Police Headquarters,2008,61,957
        7745-1,High-Speed City Express Passenger Train,1985,234,735
        7746-1,Single-Drum Roller,2009,56,207
        7747-1,Wind Turbine Transport,2009,63,435
        7748-1,Corporate Alliance Tank Droid,2009,165,216
        7749-1,Echo Base,2009,169,155
        7750-1,Steam Engine,1980,234,267
        775-1,Fire Fighter Ship,1978,363,141
        7751-1,Ahsoka's Starfighter and Vulture Droid,2009,165,290
        7752-1,Count Dooku's Solar Sailer,2009,165,384
        7753-1,Pirate Tank,2009,165,371
        7754-1,Home One Mon Calamari Star Cruiser - Limited Edition,2009,169,788
        7755-1,Diesel Heavy Shunting Locomotive,1983,234,163
        7760-1,Diesel Shunter Locomotive,1980,234,151
        7770-1,Deep Sea Treasure Hunter,2007,310,79
        7771-1,Angler Ambush,2007,310,135
        7772-1,Lobster Strike,2007,310,224
        7773-1,Tiger Shark Attack,2007,310,341
        7774-1,Crab Crusher,2007,310,582
        7775-1,Aquabase Invasion,2007,310,850
        7776-1,The Shipwreck,2007,310,245
        7777-1,Idea Book 7777,1981,499,0
        7778-1,Midi-Scale Millennium Falcon,2009,169,355
        7779-1,The Batman Dragster: Catwoman Pursuit,2006,484,92
        7780-1,The Batboat: Hunt for Killer Croc,2006,484,194
        7781-1,The Batmobile: Two-Face's Escape,2006,484,392
        7782-1,The Batwing: The Joker's Aerial Assault,2006,484,529
        7783-1,The Batcave: The Penguin and Mr. Freeze's Invasion,2006,484,1090
        7784-1,The Batmobile Ultimate Collectors' Edition,2006,485,1045
        7785-1,Arkham Asylum,2006,484,868
        7786-1,The Batcopter: The Chase for the Scarecrow,2007,484,299
        7787-1,The Bat-Tank: The Riddler and Bane's Hideout,2007,484,651
        7789-1,Lotso's Dump Truck,2010,275,129
        7793-1,LEGO Standard Starter Set,2006,37,483
        7795-1,LEGO Deluxe Starter Set,2006,37,1092
        7796-1,House,2008,34,53
        7797-1,Bi-Plane,2008,24,37
        7798-1,Stegosaurus,2008,31,48
        7799-1,Cargo Chopper,2008,22,38
        7800-1,Off Road Racer,2009,120,28
        780-1,Road Construction Set,1976,416,159
        7801-1,Red Racer Polybag,2009,120,41
        7802-1,Black Racer Polybag,2009,120,28
        7803-1,Jeep,2009,30,38
        7804-1,Green Lizard,2009,22,33
        7805-1,Shark,2009,22,44
        7808-1,Yellow Airplane,2009,22,34
        7810-1,Push-Along Steam Engine,1980,235,96
        781-1,Storage Case,1982,473,1
        7813-1,Shell Tanker Wagon,1986,235,120
        7814-1,Crane Wagon with Small Container,1980,235,113
        7815-1,Passenger Carriage / Sleeper,1983,235,228
        7816-1,Shell Tanker Wagon,1980,235,111
        7817-1,Crane Wagon,1985,235,148
        7818-1,Passenger Carriage,1980,235,115
        7819-1,Postal Container Wagon Covered,1983,233,182
        7820-1,Mail Van,1980,233,211
        782-1,Storage Case,1984,473,1
        7821-1,Overhead Gantry and Lighting Maintenance Wagon,1983,235,90
        7822-1,Railway Station,1980,235,382
        7823-1,Container Crane Depot,1986,234,483
        7824-1,Railway Station,1983,235,478
        7825-1,Creator Bucket,2002,37,500
        7830-1,Small Blue Bucket,2002,37,200
        783-1,Storage Case,1985,473,1
        7831-1,Make-believe Bucket,2002,37,200
        7832-1,Small Blue Bucket,2002,37,200
        7834-1,Level Crossing Manual,1980,234,95
        7835-1,Manual Road Crossing,1985,235,134
        7836-1,Halloween Bucket,2003,206,200
        7837-1,Build and Create,2002,37,600
        7838-1,Freight Loading Depot with Wagon,1983,235,324
        7839-1,Car Transport Depot,1986,234,341
        7844-1,Duplo Airport Rescue Truck,2004,504,28
        7848-1,Toys 'R' Us Truck,2010,63,343
        7850-1,8 Straight Rails Gray 4.5v,1980,243,32
        785-1,Red Box,1973,473,1
        7851-1,8 Curved Rails Gray 4.5v,1980,243,32
        7852-1,Left and Right Points Manual Gray 4.5v,1980,243,14
        7854-1,8 Straight Electric Rails Gray 12v,1980,242,8
        7855-1,8 Curved Electric Rails Gray 12v,1980,242,8
        7856-1,Left and Right Manual Points with Electric Rails,1980,242,16
        78579-1,Action Pack (Target Exclusive),1998,50,4
        78579-2,Action Pack,1998,50,4
        7858-1,Remote Controlled Points Right 12v,1980,242,12
        7859-1,Remote Controlled Points Left 12v,1980,242,12
        78597-1,Extreme Action Pack,1999,87,3
        7860-1,Remote Controlled Signal 12v,1980,242,25
        786-1,Storage Cloth,1980,473,1
        7861-1,Lighting Set Electric 12v,1980,242,28
        7862-1,Remote Controlled Decoupling,1981,242,16
        7863-1,Remote Controlled Point Motor,1980,242,7
        7864-1,Transformer / Controller 12V,1980,242,34
        7865-1,12V Motor,1980,242,19
        7866-1,Remote Controlled Road Crossing,1983,234,194
        7867-1,12V Train Light Posts,1983,242,52
        78675-1,Exclusive RoboRiders Six Set Limited Edition Value Pack,2000,16,6
        7868-1,Mace Windu's Jedi Starfighter,2011,165,308
        7869-1,Battle for Geonosis,2011,165,335
        7870-1,Hans Christian Andersen Bucket,2005,37,499
        787-1,Play Mat with Drawstring,1977,473,1
        7871-1,Whale,2007,22,31
        7872-1,Lion,2007,31,57
        7873-1,Airplane,2007,24,38
        7875-1,Backhoe,2007,26,39
        7876-1,Cement Mixer,2007,26,44
        7877-1,Naboo Starfighter,2011,166,317
        78777-1,Alien Discovery,2000,135,3
        7879-1,Hoth Echo Base,2011,169,764
        78800-1,Soccer Bonus Set,2000,462,3
        7880-1,Big Pirate Ship,2006,504,34
        7881-1,Pirate Ship,2006,504,24
        7882-1,Shark Attack,2006,504,11
        7883-1,Treasure Hunt,2006,504,10
        7884-1,Batman's Buggy: The Escape of Mr. Freeze,2008,484,76
        7885-1,Robin's Scuba Jet: Attack of The Penguin,2008,484,207
        7886-1,The Batcycle: Harley Quinn's Hammer Truck,2008,484,273
        7888-1,The Tumbler: Joker's Ice Cream Surprise,2008,484,456
        7890-1,Ambulance,2006,60,117
        789-1,Storage Cloth,1987,473,1
        7891-1,Airport Firetruck,2006,53,147
        7892-1,Hospital,2006,60,385
        7893-1,Passenger Plane,2006,53,403
        7893-2,Passenger Plane - ANA version,2006,53,386
        7894-1,Airport,2006,53,704
        7894-2,Airport - ANA Version,2007,53,685
        7895-1,Switching Tracks,2006,245,8
        7896-1,Straight & Curved Rails,2006,245,16
        7897-1,Passenger Train,2006,240,494
        7898-1,Cargo Train Deluxe,2006,240,830
        7899-1,Police Boat,2006,61,199
        79000-1,Riddles for The Ring,2012,563,105
        7900-1,Heavy Loader,2006,56,348
        79001-1,Escape from Mirkwood Spiders,2012,563,298
        79002-1,Attack of the Wargs,2012,563,400
        79003-1,An Unexpected Gathering,2012,563,666
        79004-1,Barrel Escape,2012,563,333
        79005-1,The Wizard Battle,2013,567,113
        79006-1,The Council of Elrond,2013,567,242
        79007-1,Battle at the Black Gate,2013,569,655
        79008-1,Pirate Ship Ambush,2013,569,754
        79010-1,The Goblin King Battle,2012,563,838
        7901-1,Airplane Mechanic,2006,53,31
        79011-1,Dol Guldur Ambush,2013,564,217
        79012-1,Mirkwood Elf Army,2013,564,276
        79013-1,Lake-town Chase,2013,564,469
        79014-1,Dol Guldur Battle,2013,564,795
        79015-1,Witch-King Battle,2014,565,101
        79016-1,Attack on Lake-town,2014,565,313
        79017-1,The Battle of the Five Armies,2014,565,471
        79018-1,The Lonely Mountain,2014,565,864
        7902-1,Doctor's Car,2006,60,65
        7903-1,Rescue Helicopter,2006,60,248
        7904-1,Advent Calendar 2006 City,2006,208,24
        7904-10,Advent Calendar 2006 City (Day  9) Computer Desk & Chair,2006,220,8
        7904-11,Advent Calendar 2006 City (Day 10) Train Conductor with Signal Paddle,2006,220,6
        7904-12,Advent Calendar 2006 City (Day 11) Level Crossing and Signal,2006,220,22
        7904-13,Advent Calendar 2006 City (Day 12) Train Handcar,2006,220,17
        7904-14,Advent Calendar 2006 City (Day 13) Street Cleaner,2006,220,5
        7904-15,Advent Calendar 2006 City (Day 14) Street Cleaner's Pushcart,2006,220,13
        7904-16,Advent Calendar 2006 City (Day 15) Phone Kiosk,2006,220,12
        7904-17,Advent Calendar 2006 City (Day 16) Police Officer with Signal Paddle,2006,220,6
        7904-18,Advent Calendar 2006 City (Day 17) Police Barricade and Speed Limit Sign,2006,220,9
        7904-19,Advent Calendar 2006 City (Day 18) Speed Radar Gun,2006,220,7
        7904-2,Advent Calendar 2006 City (Day  1) Construction Worker,2006,220,5
        7904-20,Advent Calendar 2006 City (Day 19) Mechanic,2006,220,5
        7904-21,Advent Calendar 2006 City (Day 20) Tool Chest,2006,220,11
        7904-22,Advent Calendar 2006 City (Day 21) Work Bench with Vise,2006,220,13
        7904-23,Advent Calendar 2006 City (Day 22) Firefighter,2006,220,7
        7904-24,Advent Calendar 2006 City (Day 23) Water Cannon and Burning Oil Drum,2006,220,11
        7904-25,Advent Calendar 2006 City (Day 24) Santa Tree Gifts & Fireplace,2006,220,31
        7904-3,Advent Calendar 2006 City (Day  2) Traffic Control Sticks,2006,220,15
        7904-4,Advent Calendar 2006 City (Day  3) Traffic Cone Barricade Cement Finisher,2006,220,12
        7904-5,Advent Calendar 2006 City (Day  4) Airport Ground Crew,2006,220,8
        7904-6,Advent Calendar 2006 City (Day  5) Hand Truck and Luggage,2006,220,4
        7904-7,Advent Calendar 2006 City (Day  6) X-Ray Machine,2006,220,15
        7904-8,Advent Calendar 2006 City (Day  7) Doctor with bag,2006,220,5
        7904-9,Advent Calendar 2006 City (Day  8) Hospital Bed with IV Stand,2006,220,10
        7905-1,Building Crane,2006,56,726
        7906-1,Fireboat,2007,58,175
        7907-1,Advent Calendar 2007 City,2007,208,28
        7907-10,Advent Calendar 2007 City (Day  9) Radar,2007,220,10
        7907-11,Advent Calendar 2007 City (Day 10) Dock Worker,2007,220,4
        7907-12,Advent Calendar 2007 City (Day 11) Small Dock with Life Preserver,2007,220,9
        7907-13,Advent Calendar 2007 City (Day 12) Hand Truck and Load,2007,220,6
        7907-14,Advent Calendar 2007 City (Day 13) Mechanic and Wrench,2007,220,5
        7907-15,Advent Calendar 2007 City (Day 14) Car Wash Kiosk,2007,220,11
        7907-16,Advent Calendar 2007 City (Day 15) Cash Register and Display,2007,220,11
        7907-17,Advent Calendar 2007 City (Day 16) Train Worker and Briefcase,2007,220,5
        7907-18,Advent Calendar 2007 City (Day 17) Bench with Clock,2007,220,11
        7907-19,Advent Calendar 2007 City (Day 18) Signal Mast,2007,220,9
        7907-2,Advent Calendar 2007 City (Day  1) Firefighter and Saw,2007,220,5
        7907-20,Advent Calendar 2007 City (Day 19) Sanitary Engineer and Broom,2007,220,5
        7907-21,Advent Calendar 2007 City (Day 20) Dustbin and Shovel,2007,220,11
        7907-22,Advent Calendar 2007 City (Day 21) Dumpster,2007,220,13
        7907-23,Advent Calendar 2007 City (Day 22) Policeman with Megaphone,2007,220,5
        7907-24,Advent Calendar 2007 City (Day 23) Computer Desk and Chair,2007,220,10
        7907-25,Advent Calendar 2007 City (Day 24) Christmas Tree,2007,220,27
        7907-3,Advent Calendar 2007 City (Day  2) Fire Hydrant and Tools,2007,220,13
        7907-4,Advent Calendar 2007 City (Day  3) Crate with Burning Cylinders,2007,220,10
        7907-5,Advent Calendar 2007 City (Day  4) Construction Worker and Pickaxe,2007,220,5
        7907-6,Advent Calendar 2007 City (Day  5) Barricade,2007,220,12
        7907-7,Advent Calendar 2007 City (Day  6) Directional Sign,2007,220,22
        7907-8,Advent Calendar 2007 City (Day  7) Airline Worker and Radio,2007,220,5
        7907-9,Advent Calendar 2007 City (Day  8) Luggage Cart,2007,220,9
        79100-1,Kraang Lab Escape,2013,570,90
        7910-1,Robot Promotional (Duracell),2004,204,29
        79101-1,Shredder's Dragon Bike,2013,570,197
        79102-1,Stealth Shell in Pursuit,2013,570,160
        79103-1,Turtle Lair Attack,2013,570,485
        79104-1,The Shellraiser Street Chase,2013,570,618
        79104-2,The Shellraiser Street Chase V2.0,2013,570,649
        79104-3,The Shellraiser Street Chase (Technic Base Version),2013,570,635
        79105-1,Baxter Robot Rampage,2013,570,396
        79106-1,Cavalry Builder Set,2013,575,70
        79107-1,Comanche Camp,2013,575,161
        79108-1,Stagecoach Escape,2013,575,279
        79109-1,Colby City Showdown,2013,575,585
        791-1,Storage Box - Red,1972,473,1
        79110-1,Silver Mine Shootout,2013,575,642
        7911-1,Ship Promotional (Duracell),2004,204,33
        79111-1,Constitution Train Chase,2013,575,701
        79115-1,Turtle Van Takedown,2014,570,367
        79116-1,Big Rig Snow Getaway,2014,570,741
        79117-1,Turtle Lair Invasion,2014,570,885
        79118-1,Karai Bike Escape,2014,570,87
        79119-1,Mutation Chamber Unleashed,2014,570,195
        79120-1,T-Rawket Sky Strike,2014,570,285
        7912-1,Helicopter Promotional (Duracell),2004,204,26
        79121-1,Turtle Sub Undersea Chase,2014,570,682
        79122-1,Shredder’s Lair Rescue,2014,570,476
        7913-1,Clone Trooper Battle Pack,2011,165,85
        7914-1,Mandalorian Battle Pack,2011,165,68
        7915-1,Imperial V-wing Starfighter,2011,168,138
        7917-1,McDonald's Sports Set Number 3 - Blue Basketball Player #22,2004,459,4
        7918-1,McDonald's Sports Set Number 8 - Green Basketball Player #35,2004,459,4
        7919-1,McDonald's Sports Set Number 4 - White Hockey Player #5,2004,461,3
        7920-1,McDonald's Sports Set Number 5 - Blue Hockey Player #4,2004,461,3
        792-1,Storage Box - White,1972,473,1
        7921-1,McDonald's Sports Set Number 7 - Gray Vest Skateboarder,2004,460,5
        7922-1,McDonald's Sports Set Number 6 - Orange Vest Snowboarder,2004,460,4
        7923-1,McDonald's Sports Set Number 1 - White Soccer Player #4,2004,462,2
        7924-1,McDonald's Sports Set Number 2 - Red Soccer Player #11,2004,462,2
        7929-1,The Battle of Naboo,2011,166,241
        7930-1,Bounty Hunter Gunship,2011,165,389
        793-1,Storage Box - Blue,1972,473,1
        7931-1,T6 Jedi Shuttle,2011,165,391
        7936-1,Level Crossing,2010,233,138
        7937-1,Train Station,2010,233,367
        7938-1,Passenger Train,2010,240,668
        7939-1,Cargo Train,2010,240,838
        794-1,Storage Box - Yellow,1972,473,1
        7942-1,Off-Road Fire Rescue,2007,58,130
        7944-1,Fire Hovercraft,2007,58,273
        7945-1,Fire Station,2007,58,603
        7946-1,King's Castle,2010,196,932
        7947-1,Prison Tower Rescue,2010,196,365
        7948-1,Outpost Attack,2010,196,193
        7949-1,Prison Carriage Rescue,2010,196,50
        7950-1,Knight's Showdown,2010,196,61
        7952-1,Advent Calendar 2010 Kingdoms,2010,211,24
        7952-10,Advent Calendar 2010 Kingdoms (Day  9) - Chest with Jewels,2010,219,5
        7952-11,Advent Calendar 2010 Kingdoms (Day 10) - Skeleton,2010,219,6
        7952-12,Advent Calendar 2010 Kingdoms (Day 11) - Dungeon Cell Window with Handcuffs,2010,219,14
        7952-13,Advent Calendar 2010 Kingdoms (Day 12) - Pig with Apple,2010,219,2
        7952-14,Advent Calendar 2010 Kingdoms (Day 13) - Prince with Sword,2010,219,5
        7952-15,Advent Calendar 2010 Kingdoms (Day 14) - Sword in the Stone,2010,219,6
        7952-16,Advent Calendar 2010 Kingdoms (Day 15) - Jousting Dummy with Helmet and Halberd,2010,219,8
        7952-17,Advent Calendar 2010 Kingdoms (Day 16) - Barmaid,2010,219,4
        7952-18,Advent Calendar 2010 Kingdoms (Day 17) - Keg with Tap,2010,219,9
        7952-19,Advent Calendar 2010 Kingdoms (Day 18) - Cauldron,2010,219,3
        7952-2,Advent Calendar 2010 Kingdoms (Day  1) - Blacksmith with Hammer,2010,219,5
        7952-20,Advent Calendar 2010 Kingdoms (Day 19) - Lion Knight with Spear,2010,219,5
        7952-21,Advent Calendar 2010 Kingdoms (Day 20) - Catapult,2010,219,7
        7952-22,Advent Calendar 2010 Kingdoms (Day 21) - Lion Knight Scale Mail with Quiver and Crossbow,2010,219,6
        7952-23,Advent Calendar 2010 Kingdoms (Day 22) - Owl in Tree,2010,219,6
        7952-24,Advent Calendar 2010 Kingdoms (Day 23) - Cooking Table with Frying Pan,2010,219,12
        7952-25,Advent Calendar 2010 Kingdoms (Day 24) - Blue Wizard with Wand,2010,219,6
        7952-3,Advent Calendar 2010 Kingdoms (Day  2) - Anvil and Forge with Sword,2010,219,13
        7952-4,Advent Calendar 2010 Kingdoms (Day  3) - Weapons Rack,2010,219,11
        7952-5,Advent Calendar 2010 Kingdoms (Day  4) - Dragon Knight with Flail,2010,219,5
        7952-6,Advent Calendar 2010 Kingdoms (Day  5) - Weapons Cart with Spear,2010,219,9
        7952-7,Advent Calendar 2010 Kingdoms (Day  6) - Armor Rack with Plate Armor and Helmet,2010,219,7
        7952-8,Advent Calendar 2010 Kingdoms (Day  7) - Queen with Frog,2010,219,6
        7952-9,Advent Calendar 2010 Kingdoms (Day  8) - Throne,2010,219,7
        7953-1,Court Jester,2010,196,22
        7955-1,Wizard,2010,196,19
        7956-1,Ewok Attack,2011,169,166
        7957-1,Sith Nightspeeder,2011,165,213
        7958-1,Advent Calendar 2011 Star Wars,2011,209,25
        7958-10,Advent Calendar 2011 Star Wars (Day  9) - X-wing Fighter,2011,225,23
        7958-11,Advent Calendar 2011 Star Wars (Day 10) - Imperial Shuttle,2011,225,9
        7958-12,Advent Calendar 2011 Star Wars (Day 11) - Battle Droid Pilot,2011,225,6
        7958-13,Advent Calendar 2011 Star Wars (Day 12) - Rebel Snowspeeder,2011,225,17
        7958-14,Advent Calendar 2011 Star Wars (Day 13) - R2-Q5,2011,225,4
        7958-15,Advent Calendar 2011 Star Wars (Day 14) - Mouse Droid,2011,225,9
        7958-16,Advent Calendar 2011 Star Wars (Day 15) - Republic Gunship,2011,225,14
        7958-17,Advent Calendar 2011 Star Wars (Day 16) - Clone Pilot,2011,225,4
        7958-18,Advent Calendar 2011 Star Wars (Day 17) - Weapon Depot,2011,225,10
        7958-19,Advent Calendar 2011 Star Wars (Day 18) - Anakin's Y-wing Starfighter,2011,225,20
        7958-2,Advent Calendar 2011 Star Wars (Day  1) - Republic Cruiser,2011,225,19
        7958-20,Advent Calendar 2011 Star Wars (Day 19) - TIE Defender Pilot,2011,225,4
        7958-21,Advent Calendar 2011 Star Wars (Day 20) - TIE Fighter,2011,225,7
        7958-22,Advent Calendar 2011 Star Wars (Day 21) - Millennium Falcon,2011,225,13
        7958-23,Advent Calendar 2011 Star Wars (Day 22) - A-wing Fighter,2011,225,9
        7958-24,Advent Calendar 2011 Star Wars (Day 23) - Christmas Tree,2011,225,18
        7958-25,Advent Calendar 2011 Star Wars (Day 24) - Santa Yoda,2011,225,7
        7958-3,Advent Calendar 2011 Star Wars (Day  2) - Nute Gunray,2011,225,4
        7958-4,Advent Calendar 2011 Star Wars (Day  3) - Mechno-Chair,2011,225,13
        7958-5,Advent Calendar 2011 Star Wars (Day 4) - Separatist Spider Droid,2011,225,20
        7958-6,Advent Calendar 2011 Star Wars (Day  5) - Boba Fett's Slave I,2011,225,20
        7958-7,Advent Calendar 2011 Star Wars (Day  6) - Chewbacca,2011,225,3
        7958-8,Advent Calendar 2011 Star Wars (Day  7) - Tool Depot,2011,225,9
        7958-9,Advent Calendar 2011 Star Wars (Day 8) - Zev Senesca,2011,225,4
        7959-1,Geonosian Starfighter,2011,165,163
        7961-1,Darth Maul's Sith Infiltrator,2011,166,478
        7962-1,Anakin's and Sebulba's Podracers,2011,166,810
        7964-1,Republic Frigate,2011,165,1030
        7965-1,Millennium Falcon,2011,169,1253
        7967-1,Fast,2010,116,68
        7968-1,Strong,2010,116,90
        7970-1,Hero,2010,116,67
        7971-1,Bad,2010,116,71
        7976-1,Ocean Speeder,2011,315,53
        7977-1,Seabed Strider,2011,315,104
        7978-1,Angler Attack,2011,315,200
        7979-1,Advent Calendar 2008 Castle,2008,211,24
        7979-10,Advent Calendar 2008 Castle  (Day 9) - Crossbow on Wheels,2008,219,7
        7979-11,Advent Calendar 2008 Castle (Day 10) - Dwarf with Pick Axe,2008,219,6
        7979-12,Advent Calendar 2008 Castle (Day 11) - Fire and Crystal,2008,219,6
        7979-13,Advent Calendar 2008 Castle (Day 12) - Container on Wheels,2008,219,10
        7979-14,Advent Calendar 2008 Castle (Day 13) - Tools Storage with Frog,2008,219,4
        7979-15,Advent Calendar 2008 Castle (Day 14) - Evil Witch,2008,219,5
        7979-16,Advent Calendar 2008 Castle (Day 15) - Cooking Pot with Snake,2008,219,9
        7979-17,Advent Calendar 2008 Castle (Day 16) - Shelving with Bat,2008,219,12
        7979-18,Advent Calendar 2008 Castle (Day 17) - Crystal Ball,2008,219,5
        7979-19,Advent Calendar 2008 Castle (Day 18) - Maid with Broom and Rat,2008,219,6
        7979-2,Advent Calendar 2008 Castle  (Day 1) - Soldier with Spear,2008,219,5
        7979-20,Advent Calendar 2008 Castle (Day 19) - Food Basket,2008,219,4
        7979-21,Advent Calendar 2008 Castle (Day 20) - Dinner Table,2008,219,17
        7979-22,Advent Calendar 2008 Castle (Day 21) - Troll Warrior,2008,219,5
        7979-23,Advent Calendar 2008 Castle (Day 22) - Catapult,2008,219,14
        7979-24,Advent Calendar 2008 Castle (Day 23) - Treasure Chest with Spider,2008,219,6
        7979-25,Advent Calendar 2008 Castle (Day 24) - Jester,2008,219,4
        7979-3,Advent Calendar 2008 Castle  (Day 2) - Brick Arch with Flag and Shield,2008,219,10
        7979-4,Advent Calendar 2008 Castle  (Day 3) - Armour Stand,2008,219,8
        7979-5,Advent Calendar 2008 Castle  (Day 4) - White Skeleton with Flail,2008,219,7
        7979-6,Advent Calendar 2008 Castle  (Day 5) - Weapon Stand,2008,219,8
        7979-7,Advent Calendar 2008 Castle  (Day 6) - Black Skeleton with Crossbow,2008,219,7
        7979-8,Advent Calendar 2008 Castle  (Day 7) - Castle Soldier with Sword,2008,219,5
        7979-9,Advent Calendar 2008 Castle  (Day 8) - Archery Target,2008,219,6
        7984-1,Deep Sea Raider,2011,315,265
        7985-1,City of Atlantis,2011,315,686
        7990-1,Cement Mixer,2007,56,212
        7991-1,Garbage Truck,2007,63,205
        7992-1,Container Stacker,2007,54,217
        7993-1,Service Station,2007,50,393
        7994-1,LEGO City Harbor,2007,59,660
        7996-1,Double Crossover Track,2007,245,4
        7997-1,Train Station,2007,240,386
        7998-1,Heavy Hauler,2007,56,331
        8000-1,Pit Droid™ / Star Wars Pit Droid,2000,158,223
        800-1,Gear Set with Motor,1970,472,120
        8001-1,Battle Droid™ / Star Wars Battle Droid,2000,158,336
        800-2,Extra Bricks Red,1986,473,62
        8002-1,Destroyer Droid™ / Star Wars Destroyer Droid,2000,158,567
        8003-1,Volcano Climber,2000,16,35
        8004-1,Dirt Bike,2000,16,32
        8005-1,Ice Explorer,2000,16,34
        8006-1,Swamp Craft,2000,16,25
        8007-1,C-3PO™,2001,158,340
        8008-1,Stormtrooper™,2001,158,360
        8009-1,R2-D2™,2002,158,239
        8010-1,Darth Vader™,2002,158,390
        801-1,Gear Set,1970,472,112
        8011-1,Jango Fett™,2002,158,426
        801-2,Extra Bricks Blue,1986,473,62
        8012-1,Super Battle Droid™,2002,158,379
        8014-1,Clone Walker Battle Pack,2009,165,79
        8015-1,Assassin Droids Battle Pack,2009,165,94
        8016-1,Hyena Droid Bomber,2009,165,231
        8017-1,Darth Vader's TIE Fighter,2009,169,250
        8018-1,Armored Assault Tank (AAT),2009,165,406
        8019-1,Republic Attack Shuttle,2009,165,636
        8020-1,Universal Building Set,1984,21,119
        802-1,Gear Supplementary Set,1970,472,30
        802-2,Extra Bricks White,1986,473,62
        8022-1,TECHNIC Starter Set,1993,21,118
        8024-1,Universal Building Set,1989,21,114
        8026-1,Kraatu,2004,324,20
        8028-1,TIE Fighter - Mini,2008,163,44
        8029-1,Mini Snowspeeder,2008,159,66
        8030-1,Universal Building Set,1982,21,141
        803-1,Extra Bricks Yellow,1986,473,62
        8031-1,V-19 Torrent - Mini,2008,160,66
        803-2,Gear/Wheel Set,1972,472,163
        8032-1,Universal Set,1994,21,212
        8033-1,General Grievous Starfighter - Mini,2009,162,44
        8034-1,Universal Building Set,1989,21,187
        8035-1,Universal Building Set,1986,21,174
        8036-1,Separatist Shuttle,2009,165,258
        8037-1,Anakin's Y-wing Starfighter,2009,165,569
        8038-1,The Battle of Endor,2009,169,890
        8039-1,Venator-Class Republic Attack Cruiser,2009,165,1168
        8040-1,Universal Building Set,1984,21,162
        804-1,Extra Bricks Black,1986,473,62
        8041-1,Race Truck,2010,12,607
        8042-1,Universal Pneumatic Set,1993,21,230
        8043-1,Motorized Excavator,2010,7,1124
        8044-1,Universal Pneumatic Set,1989,21,198
        8045-1,Mini Telehandler,2010,7,118
        8046-1,Helicopter,2010,6,152
        8047-1,Compact Excavator,2010,7,252
        8048-1,Buggy,2010,11,313
        8049-1,Tractor with Log Loader,2010,8,525
        8050-1,Universal Building Set,1982,21,141
        805-1,Extra Bricks Gray,1986,473,62
        8051-1,Motorbike,2010,13,473
        8052-1,Container Truck,2010,7,685
        8053-1,Mobile Crane,2010,7,1288
        8054-1,Universal Building Set,1989,21,196
        8055-1,Universal Building Set with Motor,1986,21,186
        8056-1,Monster Crab Clash,2010,315,68
        8057-1,Wreck Raider,2010,315,64
        8058-1,Guardian of the Deep,2010,315,144
        8059-1,Seabed Scavenger,2010,315,119
        8060-1,Typhoon Turbo Sub,2010,315,197
        806-1,Extra Plates Blue,1986,473,42
        8061-1,Gateway of the Squid,2010,315,354
        8062-1,Universal Set with Storage Case,1994,21,410
        8063-1,Tractor with Trailer,2009,8,1100
        8064-1,Motorized Universal Building Set,1990,21,219
        8065-1,Mini Container Truck,2011,7,119
        8066-1,Off-Roader,2011,11,141
        8067-1,Mini Mobile Crane,2011,7,292
        8068-1,Rescue Helicopter,2011,6,407
        8069-1,Backhoe Loader,2011,7,608
        8070-1,Supercar,2011,1,1280
        807-1,Extra Plates Red,1986,473,42
        8071-1,Lift Truck,2011,5,592
        8072-1,Sea Jet,2010,315,24
        8073-1,Manta Warrior,2010,315,13
        8074-1,Universal Building Set with Flex System,1992,21,313
        8075-1,Neptune Carrier,2010,315,478
        8076-1,Deep Sea Striker,2010,315,260
        8077-1,Atlantis Exploration HQ,2010,315,474
        8078-1,Portal of Atlantis,2010,315,1009
        8079-1,Shadow Snapper,2010,315,244
        8080-1,Undersea Explorer,2010,315,361
        808-1,Wheels and Tires,1986,473,40
        8081-1,Extreme Cruiser,2011,5,589
        8082-1,Universal Building Set,1993,21,456
        8083-1,Rebel Trooper Battle Pack,2010,169,79
        8084-1,Snowtrooper Battle Pack,2010,169,74
        8085-1,Freeco Speeder,2010,165,176
        8086-1,Droid Tri-Fighter,2010,165,267
        8087-1,TIE Defender,2010,170,304
        8088-1,ARC-170 Starfighter,2010,165,395
        8089-1,Hoth Wampa Cave,2010,169,296
        8090-1,TECHNIC Universal Set,1982,21,277
        809-1,Doors and Windows,1986,473,38
        8091-1,Republic Swamp Speeder - Limited Edition,2010,165,175
        8092-1,Luke's Landspeeder,2010,169,163
        8093-1,Plo Koon’s Jedi Starfighter,2010,168,174
        8094-1,TECHNIC Control Center,1990,21,548
        8095-1,General Grievous’ Starfighter,2010,165,453
        8096-1,Emperor Palpatine’s Shuttle,2010,168,591
        8097-1,Slave I (Third Edition) [Initial Release],2010,169,562
        8098-1,Clone Turbo Tank,2010,165,1142
        8099-1,Midi-Scale Imperial Star Destroyer,2010,169,423
        810003-1,LEGO Collector,2008,497,0
        810005-1,LEGO Collector's Guide 2nd Edition,2011,497,0
        8100-1,Cyclone Defender,2007,389,91
        810-1,Basic Motor Set,1985,473,33
        8101-1,Claw Crusher,2007,389,98
        810-2,Town Plan - Continental European,1961,372,760
        8102-1,Blade Titan,2007,389,161
        810-3,Gear Truck Set,1974,472,110
        8103-1,Sky Guardian,2007,389,143
        8104-1,Shadow Crawler,2007,389,160
        8105-1,Iron Condor,2007,389,140
        8106-1,Aero Booster,2007,389,311
        8107-1,Fight for the Golden Tower,2007,389,570
        8108-1,Mobile Devastator,2007,389,1012
        8109-1,Flatbed Truck,2011,5,1114
        8110-1,Unimog U400,2011,5,2046
        8111-1,River Dragon,2008,389,111
        811-2,Gear Crane Set,1974,472,181
        8112-1,Battle Arachnoid,2008,389,130
        8113-1,Assault Tiger,2008,389,162
        8114-1,Chameleon Hunter,2008,389,187
        8115-1,Dark Panther,2008,389,243
        8117-1,Storm Lasher,2008,389,282
        8118-1,Hybrid Rescue Tank,2008,389,346
        8119-1,Thunder Racer,2009,120,47
        8120-1,Rally Sprinter,2009,120,46
        812-1,Gear Supplementary Set,1974,472,101
        8121-1,Track Marshal,2009,120,47
        8122-1,Desert Viper,2009,120,40
        8123-1,Ferrari F1 Racers,2009,112,140
        8124-1,Ice Rally,2009,120,170
        8125-1,Thunder Raceway,2009,120,160
        8126-1,Desert Challenge,2009,120,145
        8128-1,Cad Bane's Speeder,2010,165,317
        8129-1,AT-AT Walker,2010,169,811
        8130-1,Terrain Crusher,2007,120,43
        8131-1,Raceway Rider,2007,120,50
        813-2,Gear Bulldozer Set,1974,472,130
        8132-1,Night Driver,2007,120,40
        8133-1,Rally Rider,2007,120,50
        8134-1,Night Crusher,2007,120,263
        8135-1,Bridge Chase,2007,120,542
        8136-1,Fire Crusher,2007,116,64
        8137-1,Booster Beast,2007,116,69
        8138-1,Phantom Crasher,2007,116,84
        8139-1,Night Blazer,2007,116,65
        8140-1,Tow Trasher,2007,116,183
        8141-1,Off Road Power,2007,116,201
        814-2,Gear Farm Set,1975,472,89
        8142-1,Ferrari 248 1:24 (Vodafone stickers),2007,114,166
        8142-2,Ferrari 248 F1 1:24 (Alice version),2007,114,166
        8143-1,Ferrari 1:17 F430 Challenge,2007,114,690
        8144-1,Ferrari 248 F1 Team (Schumacher Edition),2007,114,709
        8144-2,Ferrari 248 F1 Team (Raikkonen Edition),2007,114,705
        8145-1,Ferrari 599 GTB Fiorano 1:10,2007,114,1325
        8146-1,Nitro Muscle,2007,116,597
        8147-1,Bullet Run,2007,120,794
        8148-1,EZ-Roadster,2008,120,44
        8149-1,Midnight Streak,2008,120,42
        8150-1,ZX Turbo,2008,120,54
        8151-1,Adrift Sport,2008,120,51
        8152-1,Speed Chasing,2008,120,141
        8153-1,Ferrari F1 Truck 1:55,2008,114,269
        8154-1,Brick Street Customs,2008,120,1019
        8155-1,Ferrari F1 Pit 1:55,2008,114,480
        8156-1,Ferrari FXX 1:17,2008,114,625
        8157-1,Ferrari F1 1:9,2009,114,996
        8158-1,Speed Racer & Snake Oiler,2008,118,241
        8159-1,Racer X & Taejo Togokhan,2008,118,236
        8160-1,Cruncher Block & Racer X,2008,118,366
        8161-1,Grand Prix Race,2008,118,598
        8162-1,Race Rig,2009,116,103
        8163-1,Blue Sprinter,2009,116,109
        8164-1,Extreme Wheelie,2009,116,86
        8165-1,Monster Jumper,2009,116,90
        8166-1,Wing Jumper,2009,116,202
        8167-1,Jump Riders,2009,116,208
        8168-1,Ferrari Victory,2009,114,187
        8169-1,Lamborghini Gallardo LP 560-4,2009,115,740
        8182-1,Monster Crushers,2009,120,387
        8183-1,Track Turbo RC,2009,117,91
        8184-1,Twin X-treme RC,2009,117,238
        8185-1,Ferrari Truck,2009,114,536
        8186-1,Street Extreme,2009,120,752
        8188-1,Fire Blaster,2010,439,69
        8189-1,Magma Mech,2010,439,185
        8190-1,Claw Catcher,2010,439,261
        819-1,Blue Sea Plate,1991,473,1
        8191-1,Lavatraz,2010,439,383
        8192-1,Lime Racer,2010,120,43
        8193-1,Blue Bullet,2010,120,49
        8194-1,Nitro Muscle,2010,120,47
        8195-1,Turbo Tow,2010,120,42
        8196-1,Chopper Jump,2010,120,141
        8197-1,Highway Chaos,2010,120,142
        8198-1,Ramp Crash,2010,120,145
        8199-1,Security Smash,2010,120,135
        8-2,Universal Building Set,1979,469,93
        8200-1,Radiator Springs Lightning McQueen,2011,269,35
        820-1,Red Plates Parts Pack,1980,473,34
        8201-1,Radiator Springs Classic Mater,2011,269,52
        8202-1,Blast Off Chopper with Bungee Cord Power!,1998,3,70
        8203-1,Rover Discovery,1998,11,36
        8204-1,Sky Flyer I,1998,6,41
        8205-1,Bungee Blaster,1997,12,63
        8206-1,Tokyo Pit Stop,2011,269,142
        8207-1,Dune Duster / Hawaiian Beach Racer,1996,11,81
        8208-1,Custom Cruiser,1998,13,53
        8209-1,F1 Racer / Future F1,1998,12,48
        8210-1,Nitro Bike GTX / GTX 500,1995,13,83
        8211-1,Brick Street Getaway,2010,120,550
        821264-1,The Lego High Speed Adventure Team (TRU Exclusive),1991,67,3
        8213-1,Spy Runner,1998,12,92
        8214-1,Gallardo LP 560-4 Polizia,2010,115,800
        8215-1,Gyro Copter,1997,6,106
        8216-1,Turbo I,1997,12,90
        8217-1,The Wasp,1998,6,63
        8218-1,Trike Tourer,1998,13,70
        8219-1,Go-Cart,1998,12,100
        822-1,Blue Plates Parts Pack,1980,473,34
        8221-1,Storming Enforcer,2011,116,95
        8222-1,V-TOL,1997,6,138
        8223-1,Hydrofoil 7 / Powerboat Columbia,1996,10,123
        8225-1,Road Rally V / Super Kart,1995,12,97
        8226-1,Mud Masher / Desert Stormer,1998,11,120
        8227-1,Dragon Dueller,2011,116,93
        8228-1,Sting Striker,2011,116,81
        8229-1,Tread Trekker,1997,11,185
        8230-1,Coastal Cop Buggy / Miami Police Patrol,1996,1,175
        8231-1,Vicious Viper,2011,116,95
        8232-1,Chopper Force,1997,6,275
        8233-1,MC vs. Stinger,1998,3,118
        8235-1,Front End Loader,1995,7,166
        8236-1,Bike Burner,2000,17,59
        8237-1,Slammer Racer / Formula Force,2000,17,112
        8238-1,Slammer Dragsters / Dueling Dragsters,2000,17,201
        8239-1,Cyber Challenge,1998,3,121
        8240-1,Slammer Stunt Bike,2001,17,152
        8241-1,Battle Cars,2001,17,110
        8242-1,Slammer Turbo,2001,17,251
        8244-1,Convertables,1996,21,275
        8245-1,Robot's Revenge,1998,3,222
        8246-1,Hydro Racer / Swamp Boat,1999,10,46
        8247-1,Road Rebel / Buggy Racer,1999,12,43
        8248-1,Forklift,1998,7,227
        8250-1,Search Sub [No CD],1997,10,370
        8251-1,Sonic Cycle / Motorbike,1999,13,88
        8252-1,Beach Buster / Police Car,1999,1,168
        8253-1,Fire Helicopter,1999,1,210
        8255-1,Rescue Motorbike / Rescue Trike,1999,13,192
        8256-1,Go-Kart,2009,12,143
        8257-1,Cyber Strikers,1998,3,367
        8258-1,Crane Truck,2009,15,1876
        8259-1,Mini Bulldozer,2009,7,165
        8260-1,Tractor,2009,7,104
        8261-1,Rally Truck,2009,11,198
        8262-1,Quad Bike,2009,13,307
        8263-1,Snow Groomer,2009,15,590
        8264-1,Hauler,2009,7,574
        8265-1,Front Loader,2009,7,1060
        8266-1,Spyder Slayer,1998,3,367
        8268-1,Scorpion Attack,1999,3,78
        8269-1,Competition Ultra Challenge [aka Cyber Stinger],1999,3,327
        8270-1,Rough Terrain Crane,2007,7,106
        8271-1,Wheel Loader,2007,7,200
        8272-1,Snowmobile,2007,11,331
        8273-1,Off Road Truck,2007,15,804
        8274-1,Combine Harvester,2007,8,1025
        8275-1,Motorized Bulldozer,2007,7,1381
        8277-1,Giant Model Set,1997,14,553
        8279-1,4WD X-Track,2000,11,448
        8280-1,Fire Engine / Fire Response Unit,1995,9,430
        8281-1,Mini Tractor,2006,8,121
        8282-1,Quad Bike,2006,13,200
        8283-1,Telehandler,2006,7,324
        8284-1,Tractor / Dune Buggy,2006,11,872
        8284-2,Tractor / Dune Buggy,2006,8,872
        8285-1,Tow Truck,2006,15,1877
        8286-1,3 In 1 Car / Amphipower,1996,15,731
        8287-1,Motor Box,2006,19,93
        8288-1,Crawler Crane,2006,7,800
        8289-1,Fire Truck,2006,9,1012
        8290-1,Mini Forklift,2008,7,88
        8291-1,Dirt Bike,2008,13,247
        8292-1,Cherry Picker,2008,7,724
        8293-1,Power Functions Motor Set,2008,438,10
        8294-1,Excavator,2008,7,719
        8295-1,Telescopic Handler,2008,7,1180
        8296-1,Dune Buggy,2008,11,199
        8297-1,Off-Roader,2008,11,1096
        8299-1,Search Sub With CDROM,1997,10,371
        8-3,Basic Set,1973,469,665
        8300-1,LEGO TECHNIC Team,2000,19,6
        830-1,Red Bricks Parts Pack,1980,473,46
        8301-1,Urban Enforcer,2011,120,44
        8302-1,Rod Rider,2011,120,47
        8303-1,Demon Destroyer,2011,120,50
        8304-1,Smokin' Slickster,2011,120,43
        8305-1,Duel Bikes,2000,3,208
        8307-1,Turbo Racer,2000,3,392
        831-1,Black Bricks Parts Pack,1980,473,46
        832-1,Blue Bricks Parts Pack,1980,473,46
        833-1,White Bricks Parts Pack,1980,473,46
        834-1,Yellow Bricks Parts Pack,1980,473,46
        8350-1,Pro Stunt,2003,113,30
        8353-1,Slammer Rhino,2003,113,218
        8354-1,Exo Force Bike,2003,113,99
        8355-1,H.O.T. Blaster Bike,2003,113,87
        8356-1,Jungle Monster,2003,113,115
        8357-1,Zonic Strike,2003,113,106
        8358-1,Off-Roader,2003,113,26
        8359-1,Desert Racer,2003,113,27
        8360-1,Track Racer,2003,113,23
        836-1,Doors and Windows Parts Pack,1980,473,37
        8362-1,Ferrari F1 Racer 1:24 Scale,2004,114,112
        8363-1,Baja Desert Racers,2003,113,321
        8364-1,Multi-Challenge Race Track,2003,121,623
        8365-1,Tuneable Racer,2003,113,195
        8366-1,Supersonic RC,2003,117,428
        8369-1,Dirt Crusher RC,2004,117,87
        8369-2,Dirt Crusher RC (Blue),2005,117,87
        8370-1,Nitro Stunt Bike,2003,113,89
        837-1,Wheels and Tires Parts Pack,1980,473,28
        8371-1,Extreme Power Bike,2003,113,97
        8374-1,Williams F1 Team Racer 1:27,2003,122,92
        8375-1,Ferrari F1 Pit Set,2004,114,217
        8376-1,Hot Flame RC Car,2003,117,256
        8378-1,Red Beast RC,2004,117,64
        8380-1,Red Maniac,2004,116,82
        8381-1,Exo Raider,2003,116,93
        8382-1,Hot Buster,2004,116,66
        8383-1,Nitro Terminator,2004,116,69
        8384-1,Jungle Crasher,2004,116,75
        8385-1,Exo Stealth,2004,116,81
        8386-1,Ferrari F1 Racer 1:10 Scale,2004,114,738
        8389-1,M. Schumacher and R. Barrichello,2004,114,13
        8396-1,Soldier's Arsenal,2009,153,17
        8397-1,Pirate Survival,2009,153,16
        8398-1,BBQ Stand,2009,50,22
        8399-1,K-9 Bot,2009,141,22
        8-4,Magnetic Train Couplers with Plates,1977,456,4
        8400-1,Space Speeder,2009,141,14
        8401-1,City Minifigure Collection,2009,62,59
        8402-1,Sports Car,2009,63,68
        8403-1,City House,2010,50,384
        8404-1,City Public Transport,2010,63,863
        8408-1,Desert Ranger,1996,11,288
        8409-1,Spidermonkey,2010,270,21
        8410-1,Swampfire,2010,270,22
        8411-1,ChromaStone,2010,270,21
        8412-1,Nighthawk / Sky Wasp,1995,6,283
        8414-1,Mountain Rambler,1997,11,243
        8415-1,Dump Truck,2005,7,284
        8416-1,Forklift,2005,7,729
        8417-1,Mag Wheel Master,1998,13,314
        8418-1,Mini Loader,2005,7,66
        8419-1,Excavator,2005,7,286
        8420-1,Street Bike,2005,13,506
        8421-1,Mobile Crane,2005,7,1884
        8422-1,Circuit Shock Racer / V-Twin Super Bike,1995,13,314
        8423-1,World Grand Prix Racing Rivalry,2011,269,135
        8424-1,Mater’s Spy Zone,2011,269,113
        8425-1,Black Hawk / Sky Stormer,1996,6,466
        8426-1,Escape at Sea,2011,269,158
        8428-1,Turbo Command Featuring CD-ROM Experience Expander,1998,11,472
        8429-1,Helicopter,2002,6,146
        8430-1,Motorbike,2002,13,317
        8431-1,Crane Truck,2002,7,861
        8432-1,TECHNIC Car,1998,11,471
        8433-1,Cool Movers,2004,15,216
        8434-1,Aircraft,2004,6,445
        8435-1,4WD,2004,11,778
        8436-1,Truck,2004,15,1037
        8437-1,Future Car,1997,11,420
        8438-1,Pneumatic Crane Truck,2003,7,845
        8439-1,Front End Loader,2004,7,591
        8440-1,Formula Flash / Formula Indy Racer,1995,12,418
        8441-1,Fork Lift Truck,2003,7,70
        8443-1,Pneumatic Log Loader / Pneumatic Logger,1996,7,334
        8444-1,Air Enforcer / Supercopter,1999,6,308
        8445-1,Indy Storm / Formula 1 Racer,1999,12,433
        8446-1,Crane Truck,1999,7,572
        8448-1,Super Street Sensation,1999,15,1436
        8450-1,Mission Experience Pack,2000,3,642
        8451-1,Dumper,2003,7,183
        8453-1,Front End Loader,2003,7,214
        8453-2,Front-End Loader Black Box,2004,7,214
        8454-1,Rescue Truck,2003,9,638
        8455-1,Backhoe Loader,2003,7,704
        8456-1,Fiber Optic Multi Set / Multi Racer Set (with Fibre Optics),1996,6,404
        8457-1,Power Puller,2000,12,977
        8458-1,Silver Champion / Formula 1 Racer,2000,12,1430
        8459-1,Pneumatic Front-End Loader,1997,7,602
        8460-1,Pneumatic Crane Truck / Mobile Crane,1995,7,855
        846-1,Lighting Bricks,1992,473,45
        8461-1,Williams F1 Racer,2002,122,1483
        8462-1,Tow Truck,1998,15,784
        8463-1,Forklift Truck,2001,7,232
        8464-1,Pneumatic Front End Loader,2001,7,582
        8465-1,Extreme Off-Roader,2001,11,363
        8465934-1,Muji Christmas Set,2009,301,120
        8465972-1,Muji Basic Set,2009,301,64
        8466-1,4x4 Off Roader,2001,11,1100
        8468-1,Power Crusher,2002,113,86
        8469-1,Slammer Raptor,2002,113,143
        8470-1,Slammer G-Force,2002,113,147
        8471-1,Nitro Burner,2002,113,118
        8472-1,Street 'n' Mud Racer,2002,113,348
        8473-1,Nitro Race Team,2002,113,510
        8475-1,RC Race Buggy,2002,117,283
        8479-1,Barcode Multi-Set,1997,15,1269
        8480-1,Space Shuttle,1996,6,1355
        8482-1,CyberMaster,1998,3,896
        8483-1,CyberMaster,1998,3,897
        8484-1,Ultimate Build Lightning McQueen,2011,269,241
        8485-1,Control Center / Control II,1995,21,1066
        8486-1,Mack’s Team Truck,2011,269,384
        8487-1,Flo's V8 Café,2011,269,516
        8490-1,Desert Hopper,2008,116,91
        8491-1,Ram Rod,2008,116,71
        8492-1,Mud Hopper,2008,116,58
        8493-1,Red Ace,2008,116,81
        8494-1,Ring of Fire,2008,116,268
        8495-1,Crosstown Craze,2008,120,503
        8496-1,Desert Hammer,2008,116,510
        8500-1,Torch / Fire Slizer,1999,20,33
        850-1,Fork lift truck,1977,4,216
        8501-1,Ski / Ice Slizer,1999,20,34
        850150-1,Santa Claus Classic Key Chain,2006,503,0
        850152-1,Blue Brick Key Chain,2007,503,0
        850154-1,LEGO® Red Brick Key Chain,2007,503,1
        8502-1,Turbo / City Slizer,1999,20,45
        8503-1,Scuba / Sub,1999,20,39
        850353-1,Darth Vader Key Chain,2008,503,0
        850355-1,Stormtrooper Key Chain (with Lego logo on back),2002,503,4
        8504-1,Jet / Judge Slizer,1999,20,44
        850423-1,Minifigure Presentation Boxes,2012,501,89
        850425-1,Business Card Holder,2012,501,150
        850426-1,Pencil Holder,2012,501,157
        850445-1,Ninjago Character Card Shrine,2012,435,88
        850446-1,Darth Maul Key Chain,2012,503,0
        850449-1,Minifigure Beach Accessory Pack,2012,535,64
        850452-1,Ghost Key Chain,2012,503,0
        850457-1,I Love LEGOLAND Magnet [Male],2012,501,6
        850458-1,VIP Top 5 Boxed Minifigures,2012,535,37
        850486-1,Rock Band,2012,301,62
        850487-1,Halloween Accessory Set,2012,558,56
        850502-1,I 'L brick' Anaheim Figure Magnet,2012,411,6
        850506-1,Card Making Kit,2012,501,0
        850507-1,LEGO® Marvel Super Heroes Spider-Man Key Chain,2012,503,0
        8505-1,Amazon / Jungle Slizer,1999,20,36
        850513-1,I Love Malaysia Magnet [Male],2012,501,6
        850529-1,Loki Key Chain,2012,501,0
        850581-1,Friends Calendar [English],2013,501,140
        850591-1,LEGO Friends Name Sign,2013,501,29
        850595-1,LEGO® Friends Notebook,2014,501,16
        850597-1,LEGO® Friends Carry Case,2013,501,31
        850598-1,LEGO® Legends of Chima™ Game Cards Binder,2013,502,0
        850602-1,LEGO® Legends of Chima™ Cragger Key Chain,2013,503,4
        850608-1,Key Chain Laval,2013,503,0
        8506-1,Granite / Rock Slizer,1999,20,34
        850617-1,City Police Accessory Set,2013,61,34
        850618-1,City Fire Accessory Set,2013,58,43
        850632-1,Ninjago Battle Pack,2013,435,36
        850635-1,LEGO® Star Wars™ Darth Vader™ Magnet,2013,501,2
        850642-1,LEGO® Star Wars™ Stormtrooper™ Magnet,2013,501,5
        850646-1,LEGO® Teenage Mutant Ninja Turtles™ Donatello Key Chain,2013,503,0
        850648-1,LEGO® Teenage Mutant Ninja Turtles™ Leonardo Key Chain,2013,503,0
        850653-1,LEGO® Teenage Mutant Ninja Turtles™ Michelangelo Key Chain,2013,503,0
        850656-1,LEGO® Teenage Mutant Ninja Turtles™ Raphael Key Chain,2013,503,0
        850664-1,LEGO® DC Universe™ Super Heroes Batman™ Magnet,2013,501,1
        850670-1,LEGO® DC Universe™ Super Heroes Superman™ Magnet,2013,501,0
        850682-1,Bilbo Baggins Magnet,2013,501,3
        850702-1,Classic Picture Frame,2013,501,52
        850705-1,Salt and Pepper Set,2013,501,0
        8507-1,Electro / Energy Slizer,1999,20,37
        850751-1,Orlando Picture Frame,2013,411,101
        850760-1,I Love Paris Magnet [Male],2013,501,6
        850779-1,Legends of Chima Minifigure Accessory Set,2013,571,42
        850789-1,LEGO® Friends Horse Bag Charm,2013,503,6
        850791-1,Minifigure Birthday Set,2013,301,20
        850794-1,Family Window Decals,2013,501,0
        850798-1,LEGO Classic Name Sign,2013,501,41
        850802-1,I Love Tokyo Magnet [Male],2011,501,6
        850807-1,LEGO® Gold Minifigure Key Chain,2013,503,0
        850808-1,LEGO® Gold 2x4 Stud Key Chain,2013,503,1
        8508-1,Supplementary Disks,1999,20,5
        850814-1,LEGO® Marvel Super Heroes The Hulk™ Key Chain,2013,503,0
        850838-1,Splinter Key Chain,2013,503,0
        850839-1,Classic Pirate Set,2013,147,43
        850841-1,LEGO® Classic Gift Wrap,2013,501,0
        850842-1,Fire Truck Holiday Bauble,2013,228,34
        850843-1,Dinosaur Holiday Bauble,2013,228,25
        850849-1,Friends Puppy Holiday Bauble,2013,227,29
        850850-1,Santa Holiday Bauble,2013,228,23
        850851-1,Lego Tree Holiday Bauble,2013,228,26
        850852-1,Lego Reindeer Holiday Bauble,2013,228,21
        850884-1,LEGO® Castle King Key Chain,2014,503,0
        850886-1,LEGO® Castle Dragon Wizard Key Chain,2014,503,0
        850888-1,Castle Knights Accessory Set,2014,371,36
        850889-1,Castle Dragons Accessory Set,2014,202,42
        850894-1,THE LEGO® MOVIE™ Emmet Key Chain,2014,503,0
        850895-1,THE LEGO® MOVIE™ Wyldstyle Key Chain,2014,503,0
        850896-1,THE LEGO® MOVIE™ Bad Cop Key Chain,2014,503,0
        850899-1,LEGO® Legends of Chima™ Playmat,2014,501,0
        850909-1,Sir Fangar Key Chain,2014,503,0
        8509-1,Swamp,2000,16,45
        850910-1,Legends of Chima Minifigure Accessory Set,2014,571,52
        850913-1,Fire and Ice Minifigure Accessory Set,2014,571,48
        850918-1,Ice Cube Tray,2014,501,0
        850929-1,LEGO® City Playmat,2014,501,0
        850932-1,Polar Accessory Set,2014,65,41
        850933-1,LEGO® City Policeman Key Chain,2014,503,0
        850935-1,Classic Minifigure Graduation Set,2014,501,27
        850936-1,Halloween Set,2014,230,11
        850939-1,Santa Set,2014,227,27
        850949-1,Christmas Snow Hut Ornament,2014,228,45
        850950-1,Christmas Cat Ornament,2014,228,34
        850951-1,Girl Minifigure Key Chain,2015,503,0
        850952-1,LEGO® Classic Firetruck Bag Charm,2014,503,0
        850953-1,Police Car Bag Charm,2014,503,0
        850963-1,LEGO® Friends Tumbler 2014,2014,501,14
        850967-1,Jungle Accessory Set,2014,494,39
        850972-1,Friendship Book,2014,501,0
        850996-1,Darth Vader Key Chain,2014,501,0
        850997-1,Princess Leia Key Chain,2014,503,0
        850998-1,LEGO® Star Wars™ Boba Fett™ Key Chain,2014,503,0
        850999-1,LEGO® Star Wars™ Stormtrooper™ Key Chain,2014,503,0
        851003-1,LEGO® Super Heroes The Joker Key Chain,2014,503,0
        851005-1,LEGO® Super Heroes Batgirl Key Chain,2014,503,0
        851007-1,Wolverine Magnet,2014,501,0
        8510-1,Lava,2000,16,35
        851015-1,LEGO® Legends of Chima™ Scorpion Sword & Shield,2014,501,0
        851091-1,R2-D2 Key Chain,2005,503,0
        851-1,Tractor,1977,4,324
        8511-1,Frost,2000,16,44
        8512-1,Onyx,2000,16,38
        851210-1,Lord Vladek Sword,2005,501,1
        8513-1,Dust,2000,16,45
        851317-1,LEGO® Star Wars™ Boba Fett™ Magnet,2014,501,0
        851318-1,Sir Fangar Claw & Shield,2014,501,0
        851320-1,LEGO® Minifigure Notebooks,2014,501,0
        851324-1,Dolphin Bag Charm,2014,503,4
        851325-1,Jungle Playmat,2014,501,0
        851331-1,I Love LEGOLAND Magnet [Female],2015,501,6
        851335-1,Ninja Sword,2015,501,0
        851336-1,Ninja Fork Weapon,2015,501,0
        851338-1,Ninja Belt & Throwing Star,2015,501,0
        851339-1,Ninja Bandana,2015,501,0
        851341-1,LEGO® Elves Playmat,2015,501,0
        851342-1,Ninja Army Building Set,2015,435,37
        851343-1,Drinking Bottle,2015,501,0
        851344-1,Tumbler,2015,501,13
        851351-1,Ninja Kai Key Chain,2015,503,0
        851352-1,Titanium Ninja Zane Key Chain,2015,503,0
        851353-1,Anacondrai Kapau Key Chain,2015,503,0
        851358-1,Holiday Bauble White Bricks,2015,206,62
        851362-1,Friends Party Set,2015,494,60
        851368-1,Laval Key Chain,2015,503,0
        851369-1,Icebite Key Chain,2015,503,0
        851393-1,Mermaid Key Chain,2015,503,0
        851394-1,Gingerbread Man Key Chain,2015,503,0
        851395-1,Robot Key Chain,2015,503,0
        851400-1,Upscaled Mug – Red,2015,501,0
        8514-1,Power,2000,16,32
        851417-1,LEGO Friends Wall Stickers,2015,501,0
        851463-1,Clone Trooper Key Chain,2007,503,0
        851464-1,Chewbacca Key Chain,2007,503,0
        851490-1,Lord Vladek Mask,2005,501,1
        851502-1,Ice Brick Tray - Yellow,2007,501,0
        8515-1,RoboRider Wheels,2000,16,4
        8516-1,The Boss,2000,16,124
        851659-1,Boba Fett Keyring,2008,503,0
        851687-1,Robin Key Chain,2007,503,0
        8517-1,Humungousaur,2010,270,14
        8518-1,Jet Ray,2010,270,16
        8519-1,Big Chill,2010,270,20
        851938-1,Princess Leia Key Chain,2007,503,0
        852001-1,Fantasy Era Castle Chess Set,2007,502,164
        8520-1,Millennium/Millennia,2000,20,134
        852095-1,Yellow Brick Key Chain,2007,503,1
        852-1,Reconnaisance Helicopter,1977,4,364
        8521-1,Flare,2000,20,44
        852113-1,Millennium Falcon Bag Charm,2007,503,0
        852114-1,Y-Wing Fighter (Exclusive Bag Charm),2007,503,0
        852115,Vader's TIE Fighter Key Chain,2007,503,0
        852132-1,Castle Tic Tac Toe,2007,502,86
        852146-1,Professor Henry Jones Key Chain,2008,503,0
        852194-1,Dwarf Key Chain,2008,503,0
        8522-1,Spark,2000,20,35
        852227-1,Pirate Playing Cards,2009,501,0
        852271-1,Battle Pack Knights,2008,193,35
        852272-1,Battle Pack Skeletons,2008,193,43
        852273-1,Pink Brick Key Chain,2008,503,1
        852293-1,Fantasy Era Castle Giant Chess Set,2008,502,2455
        8523-1,Blaster / Blaster Slizer,2000,20,89
        852331-1,Vintage Minifigure Collection Vol. 1,2008,535,21
        852333-1,Keychain Name Programme,2008,503,0
        852347-1,Shock Trooper Key Chain,2008,503,0
        852351-1,Obi-Wan Key Chain,2008,503,0
        852354-1,Asajj Ventress Key Chain,2008,503,0
        852445-1,Gold Brick Key Chain,2008,503,0
        852535-1,Vintage Minifigure Collection Vol. 2,2009,535,22
        852548-1,CW R7-A7 Key Chain,2009,503,0
        852549-1,CW Count Dooku Key Chain,2009,503,0
        852550-1,CW Yoda Key Chain,2009,501,0
        852551-1,Magnet Set Darth Maul 2009,2009,501,24
        852552-1,Magnet Set Royal Guard 2009,2009,501,18
        852553-1,Magnet Set Stormtrooper 2009,2009,501,18
        852554-1,Star Wars Magnet Set,2008,501,21
        852555-1,Magnet Set CW Yoda 2009,2009,501,22
        852697-1,Vintage Minifigure Collection Vol. 3,2009,535,22
        852701-1,Battle Pack Troll Warriors,2009,193,36
        852702-1,Battle Pack Dwarfs,2009,193,45
        852708-1,LEGO Minifigure Cake Mould,2009,501,0
        8527-1,LEGO Mindstorms NXT,2006,259,578
        852715-1,Star Wars Magnet Set,2009,501,19
        852737-1,Star Wars 10th Anniversary Stormtrooper Magnet,2009,501,6
        852741-1,Build your own Holiday Countdown Candle,2009,227,165
        852747-1,Battle Pack Pirates,2009,153,42
        852750-1,Pirates Tic Tac Toe,2009,501,86
        852753-1,Vintage Minifigure Collection Vol. 4,2009,535,25
        852769-1,Vintage Minifigure Collection Vol. 5,2010,535,20
        852771-1,Minifigure Ice Cube Tray,2010,501,0
        852774-1,Shark Warrior Key Chain,2010,503,0
        852777-1,Magnet Set,2010,501,21
        852786-1,Rose,2010,206,29
        8528-1,Converter Cables for Mindstorms NXT,2006,259,3
        852815-1, White Spaceman Key Chain,2010,503,0
        852820-1,Minifig Display Box,2010,501,15
        852837-1,C-3PO Key Chain,2010,503,0
        852838-1,Wicket Key Chain,2010,501,0
        852842-1,Biker Scout Key Chain,2010,503,0
        852843-1,Star Wars Magnet Set,2010,501,14
        852844-1,Star Wars Magnet Set,2010,501,16
        852845-1,Star Wars Magnet Set,2010,501,19
        852848-1,Woody Key Chain,2010,503,0
        852856-1,LEGO Club Max Key Chain,2010,503,0
        852858-1,Foldable red shopping bag,2010,501,0
        8529-1,Connector Cables for Mindstorms NXT,2006,259,7
        852921-1,Battle Pack Lion Knights,2010,196,36
        852922-1,Battle Pack Dragon Knights,2010,196,37
        852942-1,Prince of Persia Magnet Set,2010,501,23
        852948-1,Female Minifigure Magnet Set,2010,501,20
        852949-1,Toy Story Magnet Set,2010,501,15
        852950-1,Alien Key Chain,2010,503,0
        852979-1,Albus Dumbledore Key Chain,2010,503,0
        852980-1,Se verus Snape Key Chain,2010,503,0
        852981-1,Dobby Key Chain,2010,503,0
        852985-1,Duck Key Chain,2010,503,0
        852986-1,Crocodile Key Chain,2010,503,0
        852987-1,Penguin Key Chain,2010,501,0
        852995-1,{Ducks},2010,301,15
        852996-1,Lego Club Max,2010,301,4
        852997-1,LEGO 2011 US Calendar,2010,501,0
        8530-1,Masks,2001,348,3
        853037-1,Star Wars Magnet Set,2010,501,20
        853091-1,City Policeman Key Chain,2011,503,0
        853092-1,City Burglars Magnet Set,2011,501,0
        853-1,Auto Chassis,1977,4,608
        8531-1,Pohatu,2001,348,49
        853111-1,Exclusive Weapon Training Set - Limited Edition,2011,435,28
        853118-1,Key Chain Emperor Palpatine,2011,503,0
        8531-2,Pohatu - With mini CD-ROM,2001,348,50
        853130-1,Star Wars Magnet Set,2011,501,0
        853143-1,LEGO Signature Minifigure Stationery Set,2011,501,0
        853146-1,LEGO Signature Minifigure Playing Cards,2011,501,0
        853148-1,LEGO Classic Logo Magnet,2011,501,0
        853176-1,Skeleton Mummy Battle Pack,2011,437,29
        853187-1,Captain Jack Sparrow Key Chain,2011,501,0
        853191-1,Pirates of the Caribbean Magnet Set,2011,501,0
        8532-1,Onua,2001,348,30
        853213-1,Drink Tumbler,2012,501,9
        853219-1,Pirates of the Caribbean Battle Pack,2011,263,30
        8532-2,Onua - With mini CD-ROM,2001,348,33
        853261-1,LEGO Large Tote,2011,501,1
        853301-1,Alien Conquest Battle Pack,2011,127,27
        853305-1,Copenhagen Key Chain,2011,501,7
        8533-1,Gali,2001,348,35
        853313-1,Copenhagen LEGO Store Magnet [Male],2011,408,6
        8533-2,Gali - With mini CD-ROM,2001,348,36
        853340-1,Minifigure Wedding Favor Set,2011,408,30
        853344-1,Holiday Ornament with Red Bricks ,2011,227,32
        853345-1,Holiday Ornament with Gold Bricks,2011,227,42
        853346-1,Holiday Ornament with Green Bricks,2011,227,38
        853352-1,2012 US Calendar,2011,501,0
        853353-1,Holiday Scene Magnet,2011,501,47
        853358-1,Heroica Storage Mat,2011,501,18
        853373-1,LEGO Kingdoms Chess Set,2012,501,329
        853378-1,City Firemen Minifigure Pack,2012,58,22
        853379-1,Purple Brick Key Chain,2015,503,1
        853380-1,Turquoise Brick Key Chain,2015,503,1
        853393-1,Friends Picture Frame,2012,494,51
        853395-1,Friends Tumbler,2012,501,1
        8534-1,Tahu,2001,348,33
        8534-2,Tahu - With mini CD-ROM,2001,348,34
        853429-1,Batman Key Chain,2012,503,0
        853430-1,Superman Key Chain,2012,501,0
        853433-1,Wonder Woman Key Chain,2012,501,0
        853439-1,Upscaled Mug ,2015,501,0
        853440-1,LEGO Friends Jewelery Set,2015,501,22
        853441-1,Mini-doll Carry Case,2015,501,0
        853444-1,LEGO® Friends Mirror,2015,501,0
        853447-1,Ninja Sword & Sheath,2015,501,0
        853448-1,LEGO® Elves Diary,2015,501,0
        853449-1,Yoda™ Key Chain,2015,503,0
        853450-1,Emperor's Royal Guard™ Key Chain,2015,503,0
        853451-1,Chewbacca™ Key Chain,2015,503,0
        853461-1,LEGO Elves Bag Charm,2015,503,0
        853463-1,Swamp Police Key Chain,2015,503,0
        853464-1,Swamp Police Drinking Bottle,2015,501,0
        853465-1,Upscaled Mug – Blue,2015,501,0
        853469-1,Wicket™ Key Chain,2015,503,0
        853470-1,R2 D2™ Key Chain,2015,503,0
        853471-1,C 3PO™ Key Chain,2015,503,0
        853472-1,Luke Skywalker™ Key Chain,2015,503,0
        853474-1,Commander Gree™ Key Chain,2015,503,0
        853475-1,Imperial Gunner Key Chain,2015,503,0
        853476-1,Yoda™ Magnet,2015,501,2
        8535-1,Lewa,2001,348,36
        853515-1,Knights Army-Building Set,2016,605,26
        853516-1,Monsters Army-Building Set,2016,605,24
        8535-2,Lewa - With mini CD-ROM,2001,348,37
        853556-1,Mini-doll Campsite Set,2016,494,35
        853605-1,Poe Dameron™ Key Chain,2016,503,0
        853609-1,Minecraft Skin Pack,2016,577,1
        8536-1,Kopaka,2001,348,33
        8536-2,Kopaka - With mini CD-ROM,2001,348,34
        853648-1,Elves Roblin Bag Charm,2017,600,1
        853687-1,NINJAGO Accessory Set,2017,435,26
        8537-1,Nui-Rama,2001,343,148
        8538-1,Muaka and Kane-ra,2001,343,633
        8539-1,Manas,2001,343,456
        8540-1,Vakama,2001,356,26
        854-1,Go-Kart,1978,4,211
        8541-1,Matau,2001,356,25
        8542-1,Onewa,2001,356,29
        8543-1,Nokama,2001,356,27
        8544-1,Nuju,2001,356,29
        8545-1,Whenua,2001,356,28
        8546-1,Power Pack,2001,346,10
        8547-1,Mindstorms NXT 2.0,2009,259,620
        8548-1,Nui-Jaga,2001,343,226
        8549-1,Tarakava,2001,343,403
        8550-1,Gahlok Va,2002,329,26
        855-1,Mobile crane,1978,4,512
        8551-1,Kohrak Va,2002,329,28
        8552-1,Lehvak Va,2002,329,28
        8553-1,Pahrak Va,2002,329,27
        8554-1,Tahnok Va,2002,329,27
        8555-1,Nuhvok Va,2002,329,26
        8556-1,Boxor,2002,347,157
        8557-1,Exo-Toa,2002,347,378
        8558-1,Cahdok and Gahdok,2002,347,636
        8559-1,Krana,2002,324,0
        8560-1,Pahrak,2002,328,41
        856-1,Bulldozer,1979,4,372
        8561-1,Nuhvok,2002,328,41
        8562-1,Gahlok,2002,328,41
        8563-1,Tahnok,2002,328,41
        8564-1,Lehvak,2002,328,41
        8565-1,Kohrak,2002,328,41
        8566-1,Onua Nuva,2002,354,41
        8567-1,Lewa Nuva,2002,354,37
        8568-1,Pohatu Nuva,2002,354,43
        8569-1,Krana,2002,324,0
        8570-1,Gali Nuva,2002,354,44
        857-1,Motorcycle with sidecar,1979,4,409
        8571-1,Kopaka Nuva,2002,354,42
        8572-1,Tahu Nuva,2002,354,36
        8573-1,Nuhvok-Kal,2003,330,42
        8574-1,Tahnok-Kal,2003,330,42
        8575-1,Kohrak-Kal,2003,330,42
        8576-1,Lehvak-Kal,2003,330,42
        8577-1,Pahrak-Kal,2003,330,42
        8578-1,Gahlok-Kal,2003,330,42
        8580-1,Kraata,2003,346,3
        858-1,Auto Engines,1980,4,242
        8581-1,Kopeke,2003,335,25
        8582-1,Matoro,2003,335,25
        8583-1,Hahli,2003,335,25
        8584-1,Hewkii,2003,335,25
        8584-2,Hewkii (Kabaya Promotional),2003,335,25
        8585-1,Hafu,2003,335,25
        8585-2,Hafu (Kabaya Promotional),2003,335,25
        8586-1,Macku,2003,335,25
        8586-2,Macku (Kabaya Promotional),2003,335,25
        8587-1,Panrahk,2003,344,45
        8587-2,Panrahk - With Shadow Kraata (Promotional Set),2003,344,45
        8587-3,Panrahk - With mini CD-ROM,2003,344,46
        8588-1,Kurahk,2003,344,45
        8588-2,Kurahk - With Shadow Kraata (Promotional Set),2003,344,45
        8588-3,Kurahk - With mini CD-ROM,2003,344,45
        8589-1,Lerahk,2003,344,45
        8589-2,Lerahk - With Shadow Kraata (Promotional Set),2003,344,45
        8589-3,Lerahk - With mini CD-ROM,2003,344,46
        8590-1,Guurahk,2003,344,45
        8590-2,Guurahk - With Shadow Kraata (Promotional Set),2003,344,45
        8590-3,Guurahk - With mini CD-ROM,2003,344,46
        8591-1,Vorahk,2003,344,45
        8591-2,Vorahk - With Shadow Kraata,2003,344,45
        8591-3,Vorahk - With mini CD-ROM,2003,344,45
        8592-1,Turahk,2003,344,45
        8592-2,Turahk - With Shadow Kraata,2003,344,45
        8592-3,Turahk - With mini CD-ROM,2003,344,46
        8593-1,Makuta,2003,347,199
        8594-1,Jaller and Gukko,2003,347,172
        8595-1,Takua and Pewku,2003,347,221
        8596-1,Takanuva,2003,347,200
        8597-1,Krana Nuva,2002,324,0
        8601-1,Toa Vakama,2003,353,48
        8601-2,Toa Vakama - 2004 San Diego Comic-Con Exclusive (Does Not Contain Exclusive Disk),2004,353,48
        8602-1,Toa Nokama,2004,353,46
        8603-1,Toa Whenua,2004,353,49
        8604-1,Toa Onewa,2004,353,44
        8605-1,Toa Matau,2004,353,46
        8606-1,Toa Nuju,2004,353,48
        8607-1,Nuhrii,2004,336,27
        8608-1,Vhisola,2004,336,27
        8609-1,Tehutti,2004,336,27
        8610-1,Ahkmou,2004,336,27
        8611-1,Orkahm,2004,336,27
        8612-1,Ehrye,2004,336,30
        8613-1,Kanoka Disk Launcher Pack,2004,346,4
        8614-1,Vahki Nuurakh,2004,357,32
        8614-2,Vahki Nuurakh Limited Edition with Movie Edition Vahi and Disk Of Time,2004,357,33
        8615-1,Vahki Bordakh,2004,357,32
        8615-2,Vahki Bordakh Limited Edition with Movie Edition Vahi and Disk Of Time,2004,357,33
        8616-1,Vahki Vorzakh,2004,357,32
        8616-2,Vahki Vorzakh Limited Edition with Movie Edition Vahi and Disk Of Time,2004,357,33
        8617-1,Vahki Zadakh,2004,357,32
        8617-2,Vahki Zadakh Limited Edition with Movie Edition Vahi and Disk Of Time,2004,357,33
        8618-1,Vahki Rorzakh,2004,357,32
        8618-2,Vahki Rorzakh Limited Edition with Movie Edition Vahi and Disk Of Time,2004,357,33
        8619-1,Vahki Keerakh,2004,357,32
        8619-2,Vahki Keerakh Limited Edition with Movie Edition Vahi and Disk Of Time,2004,357,33
        8620-1,Snow Scooter,1986,2,101
        8621-1,Turaga Dume and Nivawk,2004,347,180
        8622-1,Nidhiki,2004,347,170
        8623-1,Krekka,2004,347,214
        8624-1,Race for the Mask of Life,2006,341,507
        8625-1,Umbra,2006,347,179
        8626-1,Irnakk,2006,347,11
        8630-1,Mission 3: Gold Hunt,2008,302,351
        8631-1,Mission 1: Jetpack Pursuit,2008,302,87
        8632-1,Mission 2: Swamp Raid,2008,302,230
        8633-1,Mission 4: Speedboat Rescue,2008,302,339
        8634-1,Mission 5: Turbocar Chase,2008,302,496
        8635-1,Mission 6: Mobile Command Center,2008,302,1153
        8636-1,Mission 7: Deep Sea Quest,2008,302,520
        8637-1,Mission 8: Volcano Base,2008,302,714
        8638-1,Spy Jet Escape,2011,269,332
        8639-1,Big Bentley Bust Out,2011,269,743
        8640-1,Polar Copter,1986,2,238
        8641-1,Flame Glider,2005,120,53
        8642-1,Monster Crusher,2005,120,42
        8643-1,Power Cruiser,2005,120,45
        8644-1,Street Maniac,2005,120,35
        8645-1,Muscle Slammer Bike,2005,116,126
        8646-1,Speed Slammer Bike,2005,116,126
        8647-1,Night Racer,2005,116,75
        8648-1,Buzz Saw,2005,116,63
        8649-1,Nitro Menace,2005,116,621
        8650-1,Furious Slammer Racer,2005,116,254
        8651-1,Jumping Giant,2005,116,241
        8652-1,Enzo Ferrari 1:17,2005,114,477
        8653-1,Enzo Ferrari 1:10,2005,114,1357
        8654-1,Scuderia Ferrari Truck,2005,114,831
        8655-1,RX-Sprinter,2005,120,57
        8656-1,F6 Truck,2005,120,46
        8657-1,ATR 4,2005,120,38
        8658-1,Big Bling Wheelie,2005,120,31
        8660-1,Arctic Rescue Unit,1986,2,387
        8661-1,Carbon Star,2006,120,43
        8662-1,Blue Renegade,2006,120,48
        8663-1,Fat Trax,2006,120,41
        8664-1,Road Hero,2006,120,54
        8665-1,Highway Enforcer {Box},2006,120,52
        8666-1,TunerX,2006,120,60
        8667-1,Action Wheelie,2006,116,78
        8668-1,LEGO Competition Racers: Racers Fly Wheel Side Rider,2006,116,109
        8669-1,Fire Spinner 360,2006,116,112
        8670-1,Jump Master,2006,116,104
        8671-1,Ferrari 430 Spider 1:17,2006,114,559
        8672-1,Ferrari Finish Line,2006,114,575
        8673-1,Ferrari F1 Fuel Stop,2006,114,188
        8674-1,Ferrari F1 Racer 1:8,2006,114,1245
        8675-1,Outdoor Challenger,2006,117,98
        8676-1,Sunset Cruiser,2006,117,53
        8677-1,Ultimate Build Mater,2011,269,287
        8678-1,Ultimate Build Francesco,2011,269,195
        8679-1,Tokyo International Circuit,2011,269,848
        8680-1,Arctic Rescue Base,1986,2,523
        8681-1,Tuner Garage,2006,120,654
        8682-1,Nitro Intimidator,2006,116,723
        8683-0,Minifigure Series 1 [Random Bag],2010,536,0
        8683-1,Tribal Hunter - Complete Set,2010,536,8
        8683-10,Super Wrestler - Complete Set,2010,536,5
        8683-11,Nurse - Complete Set,2010,536,7
        8683-12,Ninja - Complete Set,2010,536,6
        8683-13,Spaceman - Complete Set,2010,536,8
        8683-14,Forestman - Complete Set,2010,536,8
        8683-15,Deep Sea Diver - Complete Set,2010,536,9
        8683-16,Cowboy - Complete Set,2010,536,7
        8683-17,Collectable Minifigures - LEGO Minifigures Series 1 - Complete,2010,536,16
        8683-18,Minifigure Series 1 (Box of 60),2010,536,60
        8683-2,Cheerleader - Complete Set,2010,536,7
        8683-3,Caveman - Complete Set,2010,536,6
        8683-4,Circus Clown - Complete Set,2010,536,6
        8683-5,Zombie - Complete Set,2010,536,6
        8683-6,Skater - Complete Set,2010,536,8
        8683-7,Robot - Complete Set,2010,536,5
        8683-8,Demolition Dummy - Complete Set,2010,536,6
        8683-9,Magician - Complete Set,2010,536,7
        8684-0,Minifigure Series 2 [Random Bag],2010,537,0
        8684-1,Mariachi / Maraca Man - Complete Set,2010,537,9
        8684-10,Weightlifter - Complete Set,2010,537,8
        8684-11,Pop Star - Complete Set,2010,537,6
        8684-12,Skier - Complete Set,2010,537,9
        8684-13,Disco Dude - Complete Set,2010,537,6
        8684-14,Karate Master - Complete Set,2010,537,6
        8684-15,Surfer - Complete Set,2010,537,6
        8684-16,Pharaoh - Complete Set,2010,537,6
        8684-17,Collectable Minifigures - LEGO Minifigures Series 2 - Complete,2010,537,16
        8684-18,Minifigure Series 2 (Box of 60),2010,537,60
        8684-2,Spartan Warrior - Complete Set,2010,537,8
        8684-3,Circus Ringmaster - Complete Set,2010,537,6
        8684-4,Witch - Complete Set,2010,537,6
        8684-5,Vampire - Complete Set,2010,537,7
        8684-6,Traffic Cop - Complete Set,2010,537,7
        8684-7,Explorer - Complete Set,2010,537,7
        8684-8,Lifeguard - Complete Set,2010,537,6
        8684-9,Mime - Complete Set,2010,537,7
        8685-1,Toa Kopaka,2008,339,53
        8686-1,Toa Lewa,2008,339,51
        8687-1,Toa Pohatu,2008,339,67
        8688-1,Toa Gali,2008,338,60
        8689-1,Toa Tahu,2008,338,73
        8690-1,Toa Onua,2008,338,62
        8691-1,Antroz,2008,339,52
        8692-1,Vamprah,2008,339,48
        8693-1,Chirox,2008,339,48
        8694-1,Krika,2008,338,40
        8695-1,Gorast,2008,338,51
        8696-1,Bitil,2008,338,54
        8697-1,Toa Ignika,2008,359,140
        8698-1,Vultraz,2008,359,133
        8699-1,Takanuva,2008,359,267
        8700-1,Expert Builder Power Pack,1982,4,27
        870-1,Supplementary Set,1977,4,22
        8701-1,King Jayko,2006,198,130
        8702-1,Lord Vladek,2006,198,112
        8703-1,Sir Kentis,2006,198,42
        8704-1,Sir Adric,2006,198,40
        8705-1,Dracus,2006,198,38
        8706-1,Karzon,2006,198,44
        8707-1,Boulder Blaster,2009,439,295
        8708-1,Cave Crusher,2009,439,259
        8709-1,Underground Mining Station,2009,439,635
        8710-1,Supplementary Set,1980,4,124
        871-1,Supplementary Set,1977,4,78
        8712-1,Action Figures,1988,19,14
        8714-1,The LEGO TECHNIC Team / Team,1993,19,9
        8715-1,Ultimate Creatures Accessory Set,2005,346,401
        8719-1,Zamor Spheres,2006,346,10
        8720-1,Power Pack,1991,19,57
        872-1,Supplementary Set,1978,4,77
        8721-1,Velika,2006,337,21
        8722-1,Kazi,2006,337,25
        8723-1,Piruk,2006,337,27
        8724-1,Garan,2006,337,21
        8725-1,Balta,2006,337,22
        8726-1,Dalu,2006,337,25
        8727-1,Inika Toa Jaller,2006,351,46
        8728-1,Inika Toa Hahli,2006,351,46
        8729-1,Inika Toa Nuparu,2006,351,55
        8730-1,Inika Toa Hewkii,2006,351,62
        8731-1,Inika Toa Kongu,2006,351,46
        8732-1,Inika Toa Matoro,2006,351,47
        8733-1,Axonn,2006,347,196
        8734-1,Brutaka,2006,347,191
        8735-1,Power Pack Motor Set,1998,19,60
        8736-1,Toa Hordika Vakama,2005,350,48
        8737-1,Toa Hordika Nokama,2005,350,48
        8738-1,Toa Hordika Whenua,2005,350,48
        8739-1,Toa Hordika Onewa,2005,350,48
        8740-1,Toa Hordika Matau,2005,350,48
        874-1,Supplementary Set,1979,4,38
        8741-1,Toa Hordika Nuju,2005,350,48
        8742-1,Visorak Vohtarak,2005,358,48
        8743-1,Visorak Boggarak,2005,358,48
        8744-1,Visorak Oohnorak,2005,358,48
        8745-1,Visorak Roporak,2005,358,48
        8746-1,Visorak Keelerak,2005,358,48
        8747-1,Visorak Suukorak,2005,358,48
        8748-1,Rhotuka Spinners,2005,346,5
        875-1,Supplementary Set,1979,4,38
        8755-1,Keetongu,2005,347,203
        8756-1,Sidorak,2005,347,211
        8757-1,Visorak Battle Ram,2005,341,190
        8758-1,Tower of Toa,2005,341,407
        8759-1,Battle of Metru Nui,2005,341,871
        876-1,Supplementary Set,1979,4,38
        8761-1,Roodaka,2005,347,233
        8762-1,Toa Iruini,2005,349,53
        8763-1,Toa Norik,2005,349,55
        8764-1,Vezon & Fenrakk,2006,347,281
        8769-1,Visorak's Gate,2005,341,330
        8770-1,Danju (European version without Cards),2004,198,42
        877-1,Supplementary Set,1979,4,30
        8771-1,Jayko (European version without Cards),2004,198,45
        8772-1,Rascus (European version without Cards),2004,198,46
        8773-1,Santis (European version without Cards),2004,198,46
        8774-1,Vladek (European version without Cards),2004,198,48
        8777-1,Vladek Encounter,2004,198,42
        8778-1,Border Ambush,2004,198,177
        8779-1,The Grand Tournament,2004,198,321
        8780-1,Citadel of Orlan,2004,198,443
        878-1,Supplementary Set,1979,4,52
        8781-1,Castle of Morcia,2004,198,658
        8782-1,Danju (USA version with 3 Cards),2004,198,45
        8783-1,Jayko (USA version with 3 Cards),2004,198,48
        8784-1,Rascus (USA version with 3 Cards),2004,198,49
        8785-1,Santis (USA version with 3 Cards),2004,198,49
        8785452-1,MUJI Transparent Set,2010,301,0
        8785476-1,MUJI Sea Set,2010,301,91
        8785483-1,MUJI Circus Set,2010,301,91
        8785490-1,MUJI Animals Set,2010,301,0
        8785506-1,MUJI Colour Paper Pad and Perforation Grid,2010,301,0
        8786-1,Vladek (USA version with 3 Cards),2004,198,51
        8790-1,"King Mathias (Series 1) Limited Edition with Map and Cape, European",2004,198,41
        879-1,Supplementary Set,1979,4,87
        8791-1,Sir Danju,2005,198,42
        8792-1,Sir Jayko,2005,198,42
        8793-1,Sir Rascus,2005,198,44
        8794-1,Sir Santis,2005,198,44
        8795-1,Lord Vladek,2005,198,44
        8796-1,King Mathias (Series 2),2005,198,43
        8799-1,Knights' Castle Wall,2004,198,178
        88000-1,Power Functions AAA Battery Box,2011,438,1
        880001-1,Competition Racers with Stopwatch,1998,3,2
        880002-1,World Cup German Starter Set,1998,462,7
        880002-2,World Cup Dutch Starter Set,1998,462,7
        880002-3,World Cup UK Starter Set,1998,462,7
        8800-1,Vladek's Siege Engine,2004,198,192
        880010-1,Exclusive Roboriders Pack,2001,16,2
        880011-1,Exclusive Roboriders Pack,2001,16,2
        880012-1,Exclusive Roboriders Pack,2001,16,2
        88002-1,Power Functions Train Motor,2011,438,7
        88003-1,Power Functions L-Motor,2013,438,1
        88004-1,Power Functions Servo Motor,2013,438,1
        880-1,Supplementary Set,1979,4,22
        8801-1,Knights' Attack Barge,2005,198,165
        8802-1,Dark Fortress Landing,2005,198,144
        8803-0,Minifigure Series 3 [Random Bag],2011,538,0
        8803-1,Fisherman - Complete Set,2011,538,9
        8803-10,Tennis Player - Complete Set,2011,538,6
        8803-11,Race Car Driver - Complete Set,2011,538,7
        8803-12,Gorilla Suit Guy - Complete Set,2011,538,6
        8803-13,Space Alien - Complete Set,2011,538,6
        8803-14,Hula Dancer - Complete Set,2011,538,8
        8803-15,Rapper - Complete Set,2011,538,7
        8803-16,Baseball Player - Complete Set,2011,538,6
        8803-17,Collectable Minifigures - LEGO Minifigures Series 3 - Complete,2011,538,16
        8803-18,Minifigure Series 3 (Box of 60),2011,538,60
        8803-2,Pilot - Complete Set,2011,538,7
        8803-3,Tribal Chief - Complete Set,2011,538,6
        8803-4,Samurai Warrior - Complete Set,2011,538,7
        8803-5,Snowboarder - Complete Set,2011,538,7
        8803-6,Space Villain - Complete Set,2011,538,8
        8803-7,Sumo Wrestler - Complete Set,2011,538,6
        8803-8,Mummy - Complete Set,2011,538,5
        8803-9,Elf - Complete Set,2011,538,8
        8804-0,Minifigure Series 4 [Random Bag],2011,539,0
        8804-1,Lawn Gnome - Complete Set,2011,539,8
        8804-10,Sailor - Complete Set,2011,539,6
        8804-11,Soccer Player - Complete Set,2011,539,8
        8804-12,Werewolf - Complete Set,2011,539,6
        8804-13,Hazmat Guy - Complete Set,2011,539,6
        8804-14,Artist - Complete Set,2011,539,7
        8804-15,Ice Skater - Complete Set,2011,539,8
        8804-16,Crazy Scientist - Complete Set,2011,539,6
        8804-17,Collectable Minifigures - LEGO Minifigures Series 4 - Complete,2011,539,16
        8804-18,Minifigure Series 4 (Box of 60),2011,539,60
        8804-2,Kimono Girl - Complete Set,2011,539,6
        8804-3,Musketeer - Complete Set,2011,539,7
        8804-4,Punk Rocker - Complete Set,2011,539,6
        8804-5,Surfer Girl - Complete Set,2011,539,6
        8804-6,Viking - Complete Set,2011,539,10
        8804-7,The Monster - Complete Set,2011,539,5
        8804-8,Hockey Player - Complete Set,2011,539,11
        8804-9,Street Skater - Complete Set,2011,539,8
        8805-0,Minifigure Series 5 [Random Bag],2011,540,0
        8805-1,Graduate - Complete Set,2011,540,7
        8805-10,Fitness Instructor - Complete Set,2011,540,6
        8805-11,Detective - Complete Set,2011,540,6
        8805-12,Evil Dwarf - Complete Set,2011,540,10
        8805-13,Boxer - Complete Set,2011,540,5
        8805-14,Egyptian Queen - Complete Set,2011,540,6
        8805-15,Gangster - Complete Set,2011,540,7
        8805-16,Snowboarder Guy - Complete Set,2011,540,6
        8805-17,Collectable Minifigures - LEGO Minifigures Series 5 - Complete,2011,540,16
        8805-18,Minifigure Series 5 (Box of 60),2011,540,60
        8805-2,Gladiator - Complete Set,2011,540,7
        8805-3,Royal Guard - Complete Set,2011,540,6
        8805-4,Ice Fisherman - Complete Set,2011,540,8
        8805-5,Cave Woman - Complete Set,2011,540,7
        8805-6,Lizard Man - Complete Set,2011,540,6
        8805-7,Zookeeper - Complete Set,2011,540,7
        8805-8,Lumberjack - Complete Set,2011,540,6
        8805-9,Small Clown - Complete Set,2011,540,6
        8808-1,F1 Racer,1994,12,93
        8810-1,Cafe Racer,1991,13,80
        8811-1,Toa Lhikan & Kikanalo,2004,347,217
        8812-1,Aero Hawk II,1994,6,148
        8813-1,Battle at the Pass,2006,198,377
        8815-1,Speedway Bandit,1991,12,78
        8816-1,Off-Road Rambler,1994,11,185
        8818-1,Baja Blaster,1993,11,119
        8820-1,Mountain Rambler,1991,11,139
        8821-1,Rogue Knight Battleship,2006,198,153
        8822-1,Gargoyle Bridge,2006,198,234
        8823-1,Mistlands Tower,2006,198,437
        8824-1,Hovercraft,1994,10,192
        8825-1,Night Chopper,1991,6,113
        8826-1,ATX Sport Cycle,1993,13,95
        8827-0,Minifigure Series 6 [Random Bag],2012,541,0
        8827-1,Classic Alien - Complete Set,2012,541,6
        8827-10,Roman Soldier - Complete Set,2012,541,7
        8827-11,Surgeon - Complete Set,2012,541,7
        8827-12,Skater Girl - Complete Set,2012,541,8
        8827-13,Intergalactic Girl - Complete Set,2012,541,9
        8827-14,Butcher - Complete Set,2012,541,7
        8827-15,Mechanic - Complete Set,2012,541,7
        8827-16,Genie - Complete Set,2012,541,7
        8827-17,Collectable Minifigures - LEGO Minifigures Series 6 - Complete,2012,541,16
        8827-18,Minifigure Series 6 (Box of 60),2012,541,60
        8827-2,Highland Battler - Complete Set,2012,541,7
        8827-3,Sleepyhead - Complete Set,2012,541,6
        8827-4,Lady Liberty - Complete Set,2012,541,8
        8827-5,Bandit - Complete Set,2012,541,8
        8827-6,Flamenco Dancer - Complete Set,2012,541,6
        8827-7,Clockwork Robot - Complete Set,2012,541,6
        8827-8,Minotaur - Complete Set,2012,541,8
        8827-9,Leprechaun - Complete Set,2012,541,9
        8828-1,Front End Loader,1993,7,175
        8829-1,Dune Blaster,1994,11,277
        8830-1,Rally 6-wheeler,1990,12,169
        8831-0,Minifigure Series 7 [Random Bag],2012,542,0
        8831-1,Swimming Champion - Complete Set,2012,542,6
        8831-10,Jungle Boy - Complete Set,2012,542,7
        8831-11,Hippie - Complete Set,2012,542,9
        8831-12,Computer Programmer - Complete Set,2012,542,7
        8831-13,Viking Woman - Complete Set,2012,542,9
        8831-14,Evil Knight - Complete Set,2012,542,8
        8831-15,Rocker Girl - Complete Set,2012,542,6
        8831-16,Grandma Visitor - Complete Set,2012,542,7
        8831-17,LEGO Minifigures Series 7 - Complete,2012,542,16
        8831-18,Minifigure Series 7 (Box of 60),2012,542,60
        8831-2,Aztec Warrior - Complete Set,2012,542,7
        8831-3,Bunny Suit Guy - Complete Set,2012,542,7
        8831-4,Bride - Complete Set,2012,542,11
        8831-5,Ocean King - Complete Set,2012,542,7
        8831-6,Bagpiper - Complete Set,2012,542,7
        8831-7,Daredevil - Complete Set,2012,542,8
        8831-8,Galaxy Patrol - Complete Set,2012,542,7
        8831-9,Tennis Ace - Complete Set,2012,542,6
        8832-1,Roadster,1988,12,86
        8833-0,Minifigure Series 8 [Random Bag],2012,543,0
        8833-1,Evil Robot - Complete Set,2012,543,8
        8833-10,Santa - Complete Set,2012,543,7
        8833-11,Vampire Bat - Complete Set,2012,543,5
        8833-12,DJ - Complete Set,2012,543,7
        8833-13,Red Cheerleader - Complete Set,2012,543,7
        8833-14,Actor - Complete Set,2012,543,7
        8833-15,Pirate Captain - Complete Set,2012,543,7
        8833-16,Alien Villainess - Complete Set,2012,543,10
        8833-17,LEGO Minifigures Series 8 - Complete,2012,543,16
        8833-18,Minifigure Series 8 (Box of 60),2012,543,60
        8833-2,Conquistador - Complete Set,2012,543,8
        8833-3,Lederhosen Guy - Complete Set,2012,543,7
        8833-4,Cowgirl - Complete Set,2012,543,6
        8833-5,Football Player - Complete Set,2012,543,8
        8833-6,Diver - Complete Set,2012,543,8
        8833-7,Downhill Skier - Complete Set,2012,543,9
        8833-8,Businessman - Complete Set,2012,543,7
        8833-9,Fairy - Complete Set,2012,543,8
        8835-1,Forklift,1989,7,240
        8836-1,Sky Ranger,1993,6,273
        8837-1,Pneumatic Excavator,1992,7,257
        8838-1,Shock Cycle,1991,13,248
        8839-1,Supply Ship,1992,10,531
        8840-1,Rally Shock n' Roll Racer,1991,12,229
        8841-1,Desert Racer,1983,11,180
        8842-1,Go-Cart,1986,12,280
        8843-1,Fork Lift Truck,1984,7,272
        8844-1,Helicopter,1981,4,316
        8845-1,Dune Buggy,1981,4,174
        8846-1,Tow Truck,1982,4,379
        8847-1,Dragster,1983,4,250
        8848-1,Power Truck,1981,4,398
        8849-1,Tractor,1986,8,347
        8850-1,Rally Support Truck,1990,12,360
        885-1,Space Scooter,1979,130,20
        8851-1,Excavator,1984,7,362
        8852-1,Robot,1987,14,327
        8853-1,Excavator / Digger,1988,7,326
        8854-1,Power Crane,1989,7,516
        8855-1,Prop Plane,1988,6,570
        8856-1,Whirlwind Rescue,1991,6,516
        8857-1,Street Chopper / Trike,1993,13,377
        8857-2,LEGO Motorcycle,1980,4,409
        8858-1,Rebel Wrecker,1994,11,452
        8858-2,Auto Engines,1980,4,244
        8859-1,Tractor,1981,4,614
        8860-1,Car Chassis,1980,4,676
        886-1,Space Buggy,1979,130,20
        8862-1,Backhoe Grader,1989,7,679
        8863-1,Blizzard's Peak,2010,123,502
        8864-1,Desert of Destruction,2010,123,964
        8865-1,Test Car,1988,15,900
        8866-1,Train Motor (RC),2009,245,7
        8867-1,Flexible Train Track,2009,245,64
        8868-1,Airtech Claw Rig,1992,7,979
        8869-1,Power Functions Control Switch,2009,438,1
        8870-1,Power Functions Light,2009,438,1
        8871-1,Power Functions Extension Wire 50cm,2009,438,1
        8872-1,Forklift Transporter,1993,7,763
        8873-1,Fireball Catapult,2005,198,45
        8874-1,Battle Wagon,2005,198,126
        8875-1,King's Siege Tower,2005,198,131
        8876-1,Scorpion Prison Cave,2005,198,279
        8877-1,Vladek's Dark Fortress,2005,198,987
        8878-1,Rechargeable Battery Box,2009,438,1
        8879-1,IR Speed Remote Control,2009,438,1
        8880-1,Super Car,1994,15,1345
        8881-1,Power Functions Battery Box,2008,438,1
        8882-1,Power Functions XL-Motor,2008,438,1
        8883-1,Power Functions M-Motor,2008,438,1
        8884-1,Power Functions IR Receiver,2008,438,1
        8885-1,Power Functions IR Remote Control,2008,438,1
        8886-1,Power Functions Extension Wire,2008,438,1
        8887-1,Power Functions Transformer 10VDC,2009,438,1
        8888-1,Idea Book 8888,1980,498,1
        8889-1,Idea Book 8889,1984,498,1
        8890-1,Idea Book 8890,1988,498,1
        889-1,Radar Truck,1979,130,29
        8892-1,Piraka Outpost,2006,341,211
        8893-1,Lava Chamber Gate,2006,341,375
        8894-1,Piraka Stronghold,2006,341,649
        8896-1,Snake Canyon,2010,123,56
        8897-1,Jagged Jaws Reef,2010,123,190
        8898-1,Wreckage Road,2010,123,267
        8899-1,Gator Swamp,2010,123,329
        8900-1,Reidak,2006,340,41
        890-1,Windup Motor,1981,473,10
        8901-1,Hakann,2006,340,42
        8902-1,Vezok,2006,340,41
        8903-1,Zaktan,2006,340,42
        8904-1,Avak,2006,340,41
        8905-1,Thok,2006,340,42
        8907-1,Rock Hacker,2009,439,29
        8908-1,Monster Launcher,2009,439,15
        8909-0,Team GB Minifigures [Random Bag],2012,546,0
        8909-1,Brawny Boxer - Team GB,2012,546,6
        8909-17,Team GB Minifigures - Complete Set,2012,546,9
        8909-18,Team GB Minifigures - Sealed Box,2012,546,60
        8909-2,Stealth Swimmer - Team GB Complete Set with Stand and Accessories,2012,546,6
        8909-3,Relay Runner - Team GB Complete Set with Stand and Accessories,2012,546,7
        8909-4,Judo Fighter - Team GB Complete Set with Stand and Accessories,2012,546,6
        8909-5,Tactical Tennis Player - Team GB Complete Set with Stand and Accessories,2012,546,7
        8909-6,Flexible Gymnast - Team GB Complete Set with Stand and Accessories,2012,546,9
        8909-7,Wondrous Weightlifter - Team GB Complete Set with Stand and Accessories,2012,546,9
        8909-8,Horseback Rider - Team GB Complete Set with Stand and Accessories,2012,546,6
        8909-9,Agile Archer - Team GB Complete Set with Stand and Accessories,2012,546,7
        8910-1,Toa Mahri Kongu,2007,352,63
        891-1,Two-Man Scooter,1979,130,39
        8911-1,Toa Mahri Jaller,2007,352,67
        8912-1,Toa Mahri Hewkii,2007,352,61
        8913-1,Toa Mahri Nuparu,2007,352,58
        8914-1,Toa Mahri Hahli,2007,352,58
        891501-1,Ninjago Kai,2015,435,9
        891503-1,Cole polybag,2015,435,11
        891504-1,Weapon Rack,2015,435,25
        891505-1,Jay,2015,435,9
        891507-1,Zane foil pack,2015,435,9
        8915-1,Toa Mahri Matoro,2007,352,62
        8916-1,Takadox,2007,326,62
        891610-1,Clouse foil pack,2016,435,8
        891611-1,Cole foil pack,2016,435,16
        891613-1,Kai’s dragon,2016,435,21
        8917-1,Kalmah,2007,326,53
        8918-1,Carapar,2007,326,50
        8919-1,Mantax,2007,326,58
        8920-1,Ehlek,2007,326,54
        8921-1,Pridak,2007,326,47
        8922-1,Gadunka,2007,359,176
        8923-1,Hydraxon,2007,359,165
        8924-1,Maxilos and Spinax,2007,359,256
        8925-1,Barraki Deepsea Patrol,2007,341,200
        8926-1,Toa Undersea Attack,2007,341,357
        8927-1,Toa Terrain Crawler,2007,341,603
        8929-1,Defilak,2007,334,37
        8930-1,Dekar,2007,334,37
        8931-1,Thulox,2007,334,39
        8932-1,Morak,2007,334,40
        8934-1,Squid Ammo,2007,346,7
        8935-1,Nocturn,2007,359,114
        8939-1,Lesovikk,2007,359,149
        8940-1,Karzahni,2007,359,373
        894-1,Mobile Ground Tracking Station,1979,130,79
        8941-1,Rockoh T3,2008,327,388
        8942-1,Jetrax T6,2008,327,420
        8942-2,Jetrax T6 Limited Edition,2008,327,420
        8943-1,Axalara T9,2008,327,694
        8944-1,Tanma,2008,333,14
        8945-1,Solek,2008,333,14
        8946-1,Photok,2008,333,14
        8947-1,Radiak,2008,333,16
        8948-1,Gavla,2008,333,14
        8949-1,Kirop,2008,333,14
        895-1,Windup Motor,1986,473,10
        8952-1,Mutran & Vican,2008,359,90
        8953-1,Makuta Icarax,2008,359,159
        8954-1,Mazeka,2008,359,301
        8956-1,Stone Chopper,2009,439,33
        8957-1,Mine Mech,2009,439,69
        8958-1,Granite Grinder,2009,439,96
        8959-1,Claw Digger,2009,439,199
        8960-1,Thunder Driller,2009,439,237
        8961-1,Crystal Sweeper,2009,439,479
        8962-1,Crystal King,2009,439,169
        8963-1,Rock Wrecker,2009,439,224
        8964-1,Titanium Command Rig,2009,439,708
        8967-1,Gold Tooth's Getaway,2009,302,67
        8968-1,River Heist,2009,302,202
        8969-1,4-Wheeling Pursuit,2009,302,318
        8970-1,Robo Attack,2009,302,412
        897-1,Mobile Rocket Launcher,1979,130,77
        8971-1,Aerial Defense Unit,2009,302,698
        8972-1,Atakus,2009,325,13
        8973-1,Raanu,2009,325,14
        8974-1,Tarduk,2009,325,17
        8975-1,Berix,2009,325,15
        8976-1,Metus,2009,325,14
        8977-1,Zesk,2009,325,16
        8978-1,Skrall,2009,331,50
        8979-1,Malum,2009,331,59
        8980-1,Gresh,2009,331,55
        8981-1,Tarix,2009,331,57
        8982-1,Strakk,2009,331,46
        8983-1,Vorox,2009,331,51
        8984-1,Stronius,2009,332,55
        8985-1,Ackar,2009,332,55
        8986-1,Vastus,2009,332,52
        8987-1,Kiina,2009,332,43
        8988-1,Gelu,2009,332,52
        8989-1,Mata Nui,2009,332,52
        8990-1,Fero and Skirmix,2009,359,148
        8991-1,Tuma,2009,359,187
        8992-1,Cendox V1,2009,327,151
        8993-1,Kaxium V3,2009,327,251
        8994-1,Baranus V7,2009,327,263
        8995-1,Thornatus V9,2009,327,438
        8996-1,Skopio XV-1,2009,327,848
        8998-1,Toa Mata Nui,2009,359,366
        900-1,Universal Motor Set,1973,473,24
        9001-2,Medium Blue Storage Bin (16.5in x 12in x 6in),2007,528,1
        900-2,4 Small Wheels with Accessories,1969,371,12
        901-1,4.5V Motor Set,1976,473,31
        901-2,2 Large Wheels with Accessories,1969,371,7
        901503-1,Krait Polybag,2015,435,7
        90-2,Educational Box - Empty,1965,513,1
        9020-1,LEGO Soft Starter Set,1998,526,84
        902-1,5 Turntables,1969,371,5
        9021-1,Medium set of Soft Bricks,1999,526,52
        9022-1,Extra Soft Bricks,1999,526,32
        9023-1,Soft Brick Activity Set,2000,526,7
        9027-1,Duplo Bulk Set,2007,504,144
        903-1,Train Wheels and Couplers,1969,371,10
        906-1,12 doors and 5 hinges,1969,371,17
        9089-1,Tubes Experiment Set,2004,507,150
        9090-1,XL Duplo Bulk Set,1993,507,564
        9091-1,Playhouse Set,2010,504,125
        9092-1,Crazy Demon,2012,112,85
        9093-1,Bone Cruncher,2012,112,86
        9094-1,Star Striker,2012,112,88
        9095-1,Nitro Predator,2012,112,86
        9-1,Universal Building Set,1978,469,116
        910-1,Universal Building Set,1976,469,318
        911-1,Universal Building Set,1976,469,401
        911506-1,Null Set-Use SW911506-1,2015,301,1
        911609-1,Naboo Starfighter,2016,164,34
        911611-1,AAT,2016,158,37
        911613-1,TIE Bomber,2016,164,26
        911614-1,Yoda's Hut,2016,158,29
        911615-1,AT-AT,2016,158,48
        911618-1,Flash Speeder,2017,158,43
        912-1,Universal Building Set,1976,469,471
        914-2,"Windows, White",1969,371,10
        915-1,6 bricks with 16 and 20 studs and 3 Angle Bricks White/Red,1969,371,9
        915-2,6 bricks with 16 and 20 studs and 3 Angle Bricks Blue/Yellow,1969,371,9
        918-1,Space Transport,1979,130,86
        918-2,21 8-Stud Bricks,1969,371,126
        918-black-2,21 Black 2x4 Bricks,1969,371,21
        918-blue-2,21 Blue 2x4 Bricks,1969,371,21
        918-red-2,21 Red 2x4 Bricks,1969,371,21
        918-tclear-2,21 Trans-Clear 2x4 Bricks,1969,371,21
        918-white-2,21 White 2x4 Bricks,1969,371,21
        918-yellow-2,21 Yellow 2x4 Bricks,1969,371,21
        9-2,Trees & Flowers,1981,455,18
        920-2,Alpha-1 Rocket Base,1979,130,187
        9209-1,Community Services Set,2012,507,130
        9213-1,Dinosaurs Set,2007,504,95
        9217-1,Farm Set,2010,504,150
        9218-1,Wild Animals Set,2012,507,96
        922-2,"28 Bricks with 1, 2, 4, 6 and 8 Studs [Blue/Yellow]",1969,371,28
        9222-1,Duplo World People,2007,504,16
        9224-1,Duplo Community People,2006,504,21
        9227-1,Farm,2007,504,104
        9230-1,Duplo Town Set,2004,505,204
        924-1,Space Cruiser,1979,130,172
        9241-1,Wheels Set,2007,528,360
        9243-1,Doors Windows and Roof Tiles,2002,528,270
        9247-1,Community Workers,2005,533,133
        9247-2,Community Workers,2006,533,218
        9248-1,Bonus Lego Basic Town,1998,534,2
        9249-1,LEGO Basic Airport,1988,534,0
        9251-1,Lego Basic Just Bricks,2000,507,576
        9255-1,Basic Set,1992,534,185
        926-1,Command Centre (Center),1979,130,177
        9279-2,Small Lego System Baseplates,2008,528,9
        9280-1,Giant Lego Dacta Basic Set,1997,534,1417
        928-1,Galaxy Explorer,1979,130,342
        9286-1,Large Building Plates,1998,528,4
        9287-1,Bonus Lego Basic Town,1996,534,2472
        9293-1,Community Workers,1996,533,80
        9-3,Magnetic Train Couplers,1977,456,4
        930-1,Red Bricks,1973,473,45
        9301-1,Road Signs,1999,533,172
        9302-1,Creator Community Builders,2004,514,1690
        9303-1,Creator Community Builders,2004,514,1184
        9305-1,Jack Stone Transportation,2003,508,4
        9306-1,Creator Bulk,2003,22,610
        9310-1,Dinosaurs Set,2001,515,4
        931-1,White Bricks,1973,473,45
        9311-1,City Buildings Set,2010,533,815
        9314-1,Rescue Service Set,2010,533,1493
        9320-1,Voyage into Space,2003,527,637
        932-1,Blue and Yellow Bricks,1973,473,45
        9322-1,Town Developers Set,2007,533,1835
        9324-1,Micro Building Set,2007,533,1657
        933-1,Doors and Windows,1973,473,38
        9331-1,BuildToExpress Set,2009,507,207
        9333-1,Vehicles,2010,533,934
        9334-1,Animals,2010,507,1082
        9335-1,Space & Airport Set,2010,533,1182
        9337-1,Harbor Set,2011,533,906
        9338-1,LEGO SERIOUS Play mini-kit,2011,507,57
        9348-1,Community Minifigures,2011,533,264
        9349-1,Fairytale and Historic Minifigures,2011,507,232
        9353-1,Dacta Theme Set,1991,533,900
        9354-1,Town Street Theme,1991,533,488
        9355-1,Dacta Space Theme Set,1990,527,559
        9356-1,Town Environment,1986,533,639
        9360-1,{Roadplates and Scenery},1986,533,85
        936-1,Wheels and Tires,1973,473,20
        9361-1,People,1991,533,174
        9362-1,Road Plates,1991,533,8
        9364-1,Hospital,1993,533,584
        9365-1,Lego Dacta Community Vehicles,1993,533,739
        9369-1,Lego Dacta Community Vehicles,1998,533,6
        9370-1,Lego System Road Plates,1998,533,10
        937-1,Doors and Fences,1973,473,34
        9371-1,Town Vehicles,1999,533,353
        9373-1,Lego System Road Plates,2003,533,5
        9376-1,Lego Dacta Castle Set,1997,512,337
        9377-1,Lego Dacta Adventurers Set,1998,509,3
        9380-1,Lego Technic Racers,1998,529,5
        9384-1,Bricks,2010,528,884
        9385-1,Sceneries Set,2010,22,1229
        9386-1,Doors Windows & Roof Tiles,2010,528,278
        9387-1,Wheels Set,2011,507,286
        9388-1,Small building plates,2012,507,22
        9389-1,Community Starter Set,2012,507,1903
        9390-1,Mini Tow Truck,2012,1,138
        9391-1,Mini Crane,2012,5,218
        9392-1,Quad Bike,2012,5,198
        9393-1,Tractor,2012,5,353
        9394-1,Jet Plane,2012,5,508
        9395-1,Pick-Up Tow Truck,2012,5,953
        9396-1,Helicopter,2012,5,1055
        9397-1,Logging Truck,2012,1,1311
        9398-1,4 x 4 Crawler,2012,11,1326
        941-1,Black and Clear Bricks,1974,473,48
        9440-1,Venomari Shrine,2012,435,86
        9441-1,Kai’s Blade Cycle,2012,435,187
        9442-1,Jay's Storm Fighter,2012,435,242
        9443-1,Rattlecopter,2012,435,309
        9444-1,Cole’s Tread Assault,2012,435,285
        9445-1,Fangpyre Truck Ambush,2012,435,451
        9446-1,Destiny's Bounty,2012,435,683
        9447-1,Lasha's Bite Cycle,2012,435,248
        9448-1,Samurai Mech,2012,435,451
        9449-1,Ultra Sonic Raider,2012,435,620
        9450-1,Epic Dragon Battle,2012,435,900
        9452-1,Giant Lego Topic Set,1991,534,2195
        9453-1,Universal School Set,1997,534,697
        9454-1,Function Set,1992,534,350
        9455-1,Fangpyre Mech,2012,435,246
        9456-1,Spinner Battle Arena,2012,435,408
        9457-1,Crane Wrecking Ball,2012,435,414
        9461-1,The Swamp Creature,2012,558,70
        9462-1,The Mummy,2012,558,91
        9463-1,The Werewolf,2012,558,243
        9464-1,The Vampire Hearse,2012,558,313
        9465-1,The Zombies,2012,558,447
        9466-1,The Crazy Scientist & His Monster,2012,558,429
        9467-1,The Ghost Train,2012,558,741
        9468-1,The Vampyre Castle,2012,558,942
        9469-1,Gandalf Arrives,2012,567,83
        9470-1,Shelob Attacks,2012,569,227
        9471-1,Uruk-hai Army,2012,568,257
        9472-1,Attack on Weathertop,2012,567,429
        9473-1,The Mines of Moria,2012,567,780
        9474-1,The Battle of Helm’s Deep,2012,568,1365
        9476-1,The Orc Forge,2012,568,362
        9478-1,Fransesco Bernoulli,2012,269,49
        9479-1,Ivan Mater,2012,269,52
        9480-1,Finn McMissile,2012,269,52
        948-1,Go-Kart,1978,4,211
        9481-1,Jeff Gorvette,2012,269,54
        9483-1,Agent Mater’s Escape,2012,269,144
        9484-1,Red’s Water Rescue,2012,269,198
        9485-1,Ultimate Race Set,2012,269,279
        9486-1,Oil Rig Escape,2012,269,421
        9488-1,Elite Clone Trooper & Commando Droid Battle Pack,2012,165,105
        9489-1,Endor Rebel Trooper & Imperial Trooper Battle Pack,2012,169,77
        9490-1,Droid Escape,2012,169,136
        9491-1,Geonosian Cannon,2012,165,133
        9492-1,TIE Fighter,2012,169,413
        9493-1,X-wing Starfighter,2012,169,559
        9494-1,Anakin's Jedi Interceptor,2012,168,299
        9495-1,Gold Leader's Y-wing Starfighter,2012,169,457
        9496-1,Desert Skiff,2012,169,220
        9497-1,Republic Striker Starfighter,2012,158,378
        9498-1,Saesee Tiin's Jedi Starfighter,2012,165,243
        9499-1,Gungan Sub,2012,166,464
        9500-1,Sith Fury-class Interceptor,2012,170,746
        950-1,Fork Lift,1979,4,216
        9509-10,"Advent Calendar 2012, Star Wars (Day 9) - Imperial Officer",2012,225,4
        9509-12,"Advent Calendar 2012, Star Wars (Day 11) - Hoth Blaster Station",2012,225,6
        9509-14,"Advent Calendar 2012, Star Wars (Day 13) - Gonk Droid (GNK Power Droid)",2012,225,14
        9509-16,"Advent Calendar 2012, Star Wars (Day 15) - Snowtrooper",2012,225,4
        9509-18,"Advent Calendar 2012, Star Wars (Day 17) - Flash Speeder",2012,225,14
        9509-2,"Advent Calendar 2012, Star Wars (Day 1) - Gungan Sub",2012,225,13
        9509-21,"Advent Calendar 2012, Star Wars (Day 20) - General Grievous Starfighter",2012,225,14
        9509-23,"Advent Calendar 2012, Star Wars (Day 22) - Sith Infiltrator",2012,225,15
        9509-25,"Advent Calendar 2012, Star Wars (Day 24) - Santa Darth Maul",2012,225,7
        9509-4,"Advent Calendar 2012, Star Wars (Day 3) - Gungan Battle Depot",2012,225,8
        9509-6,"Advent Calendar 2012, Star Wars (Day 5) - Trade Federation MTT",2012,225,9
        9509-8,"Advent Calendar 2012, Star Wars (Day 7) - Naboo Starfighter",2012,225,16
        951-1,Bulldozer,1979,4,372
        951178-1,Basic Bricks,1987,534,18
        951-2,Lego TC logo Starter Pack,1988,529,16
        9515-1,Malevolence,2012,165,1098
        9516-1,Jabba’s Palace,2012,169,716
        952-1,Tractor,1978,4,322
        9525-1,Pre Vizsla's Mandalorian Fighter,2012,165,399
        9526-1,Palpatine’s Arrest,2012,168,646
        9530-1,Letters Set,2008,507,134
        9531-1,Numbers and Mosaics Set,2008,507,352
        954-1,Sky Copter,1978,4,364
        9544-1,Math Machines Set,2006,507,554
        955-1,Mobile Crane,1979,4,512
        9551-1,Kendo Cole,2012,435,28
        9552-1,Lloyd Garmadon,2012,435,26
        9553-1,Jay ZX,2012,435,29
        9554-1,Zane ZX,2012,435,38
        9555-1,Mezmo,2012,435,32
        9556-1,Bytar,2012,435,25
        9557-1,Lizaru,2012,435,25
        9558-1,Training Set,2012,435,218
        956-1,Auto Chassis,1978,4,603
        9561-1,Kai ZX,2012,435,21
        9562-1,Lasha,2012,435,21
        9563-1,Kendo Zane,2012,435,35
        9564-1,Snappa,2012,435,20
        9566-1,Samurai X,2012,435,23
        9567-1,Fang-Suei,2012,435,21
        9569-1,Spitta,2012,435,20
        9570-1,NRG Jay,2012,435,20
        9571-1,Fangdam,2012,435,19
        9572-1,NRG Cole,2012,435,15
        9573-1,Slithraa,2012,435,15
        9574-1,Lloyd ZX,2012,435,18
        9579-1,Starter Set,2012,435,53
        9580-1,WeDo Robotics Construction Set,2009,507,157
        9581-1,WeDo Robotics USB Hub,2009,521,1
        9583-1,WeDo Robotics Motion Sensor,2009,521,1
        9584-1,WeDo Robotics Tilt Sensor,2009,521,1
        9585-1,LEGO® Education WeDo Resource Set,2009,521,326
        9590-1,NRG Zane,2012,435,24
        9591-1,Weapon Pack,2012,435,73
        9594-1,Green City,2011,518,1356
        960-1,Power Pack,1978,4,22
        9604-1,LEGO TECHNIC and Pneumatic elements,1992,1,128
        9605-1,4.5V Technic Resource Set,1990,532,1534
        9607-1,Technology Activity Set,1994,529,318
        9608-1,Teacher's Guide for Technology Group Activity Set,1994,529,16
        9609-1,Technology Resource Set,1995,1,1730
        9610-1,Gear Set,1993,1,76
        961-1,Expert Builder/Gear Parts,1978,4,78
        9612-1,Lever Set,1993,1,63
        9614-1,Pulley Set,1995,1,77
        9615-1,Motor Add-On for Simple Mechanisms,1997,1,3
        9616-1,Wheels and Axles Mini Set,1995,529,82
        9617-1,Pneumatics I: Introduction to Air Power Set,1997,1,97
        9618-1,Structures Set,1997,529,439
        9628-1,Mechanisms Power Add-On Set,2008,532,3
        9630-1,Simple Mechanisms Set,1997,1,218
        9631-1,Simple and Motorized Machines Activity Pack,1997,529,24
        9632-1,Science & Technology Base Set,2006,529,341
        9633-1,Advanced Air Power Set,1999,1,217
        9636-1,Solar Add-on,2000,1,3
        9637-1,Speed Computer Add-on,2000,1,2
        9640-1,Gears Classroom Pack,1994,529,0
        9641-1,Mechanisms Pneumatics Add-On Set,2008,528,31
        9642-1,Levers Classroom Pack,1994,529,0
        9644-1,Pulley Classroom Pack,1994,529,0
        9645-1,Motorized Simple Machines Set,1997,529,2
        9646-1,Wheel and Axle Classroom Pack,1994,529,0
        9648-1,Education Resource Set [NXT Supplemental Set],2006,1,674
        9649-1,Technology Resource Set,2003,1,1154
        9650-1,Scenery Resource Set,2002,518,717
        9656-1,Early Simple Machines Set,2008,504,99
        9657-1,FIRST LEGO League Challenge 2012 - Senior Solutions,2012,398,1612
        9660-2,Motorized Mechanisms Set,2008,529,2
        9664-1,FIRST LEGO League Challenge 2013 - Nature's Fury,2013,398,1995
        9665-1,Mechanical Engineering Set,2001,1,315
        9667-1,Solar Panel,2010,532,1
        9668-1,Energy Display,2010,532,1
        9669-1,Electric Battery Box 9V 150 mAh (Rechargeable),2010,532,1
        9670-1,E-Motor with Gear Reduction Ratio 9.5 : 1,2010,532,1
        9674-1,Naboo Starfighter & Naboo,2012,166,56
        9675-1,Sebulba's Podracer & Tatooine,2012,166,80
        9676-1,TIE Interceptor & Death Star,2012,169,65
        9677-1,X-wing Starfighter & Yavin 4,2012,177,77
        9678-1,Twin-pod Cloud Car & Bespin,2012,177,78
        9679-1,AT-ST & Endor,2012,177,65
        9681-1,eLAB Renewable Energy Set,1999,531,713
        9684-1,Renewable Energy Set II,2003,1,732
        9685-1,Green Car Set,2003,1,47
        9686-1,Simple and Motorized Mechanisms Base Set,2009,507,389
        9688-1,Renewable Energy Add-On Set,2010,532,12
        9689-1,Simple Machines Set,2009,521,194
        9694-1,NXT Color Sensor,2010,259,1
        9695-1,Mindstorms Education Resource Set,2010,259,816
        9696-1,FIRST LEGO League Challenge 2010 - Body Forward v46,2010,398,1515
        9697-1,FIRST LEGO League Challenge 2011 - Food Factor,2011,398,2115
        9698-1,FIRST LEGO League Challenge 2009 - Smart Move,2009,398,1310
        9699-1,FIRST LEGO League Challenge 2008 - Climate Connections,2008,398,834
        970004-1,Yellow Band (Pack of 25),2002,524,25
        970005-1,9-Volt 1 x 2 Lamp Brick (Pack of 2),2002,524,2
        970008-1,1 x 2 Red Bricks (Pack of 50),2002,524,50
        970009-1,1 x 2 Blue Plates (Pack of 100),2002,524,100
        9700-1,Technic Control Center,1987,529,472
        970010-1,Hubs Gray (Pack of 50),2002,525,50
        970017-1,14-Tooth Beveled Gears (Pack of 100),2002,525,100
        970018-1,Gray Pulley Wheel (Pack of 50),2008,525,50
        970021-1,Red Rover Tires and Hubs (4 tires 4 hubs),2002,524,8
        970028-1,Shock Absorber (Pack of 10),2002,525,10
        970030-1,Lift Arm (Pack of 50),2002,525,50
        970036-1,2 x 2 Angle Plate (Pack of 25),2002,524,25
        970039-1,Lever Arm (Pack of 50),2002,525,50
        970040-1,Caterpillar Hub and Tread (Set of 2 treads 4 Hubs),2002,524,6
        970041-1,128 MM Connecting Leads (Pack of 3),2002,525,3
        970042-1,Piston Rod (Pack of 75),2002,525,75
        970043-1,Small Half Beam (Pack of 100),2002,525,100
        970047-1,Large Tire and Hub (2 tires 2 hubs),2002,524,4
        970098-1,Special Elements for Control Lab Set,2001,1,125
        970-1,Lighting Bricks,1978,473,17
        9701-1,Control Lab Building Set,1995,1,565
        970110-1,Pneumatic T-Pieces (Pack of 25),2002,525,25
        970111-1,Large Lawn Tire & Hub (4 tires 4 hubs),2002,524,8
        970112-1,Small Lawn Tire & Hub (4 tires 4 hubs),2002,524,8
        970113-1,Tire Pack (Set of 8),2002,524,8
        970115-1,1280 mm Connecting Leads (Pack of 3),2002,525,3
        970116-1,12 Tooth Double Bevel Gears (Pack of 25),2002,525,25
        970117-1,Pneumatic Hand Pump (Pack of 2),2002,525,2
        970118-1,Pneumatic Cylinder (Set of 2 small),2002,525,2
        970119-1,Pneumatic Tubing Service Pack,2002,525,2
        970120-1,Black Bands (Pack of 50),2002,524,25
        970121-1,Red Bands (Pack of 25),2002,524,25
        970122-1,Small White Bands (Pack of 24),2002,524,24
        970-2,47 1/3 elements (plates),1969,371,141
        9702-1,Control System Building Set,1993,1,222
        970600-1,1 x 2 Plate with Slides (Pack of 100),2002,524,100
        970601-1,Small Pulleys (Pack of 100),2002,525,100
        970602-1,Bushings (Pack of 100),2002,525,100
        970603-1,Connector Pegs (Pack of 100),2002,525,100
        970604-1,Friction Connector Pegs (Pack of 100),2002,525,100
        970605-1,Long Black Connector Pegs (Pack of 100),2002,525,100
        970606-1,Connector Pegs with Axles (Pack of 100),2002,525,100
        970607-1,Connector Pegs with Knobs (Pack of 100),2002,525,100
        970608-1,Connector Pegs (Pack of 100),2002,525,100
        970609-1,2-Stud Axles with Grooves (Pack of 100),2002,525,100
        970610-1,3-Stud Axles (Pack of 100),2002,525,100
        970611-1,Cross Axles with Knobs (Pack of 100),2002,525,100
        970612-1,4-Stud Axles (Pack of 50),2002,525,50
        970613-1,5-Stud Axles (Pack of 50),2002,525,50
        970614-1,6-Stud Axles (Pack of 50),2002,525,50
        970615-1,8-Stud Axles (Pack of 50),2002,525,50
        970616-1,10-Stud Axles (Pack of 50),2002,525,50
        970617-1,12-Stud Axles (Pack of 50),2002,525,50
        970618-1,Axle Extenders (Pack of 50)  {Axle Joiners},2002,525,50
        970619-1,Catches {Technic Pole Reverser Handles},2002,525,50
        970620-1,8 Tooth Gears (Pack of 100) 'Spur' Gears,2002,525,100
        970621-1,12 Tooth Bevel Gears (Pack of 50),2002,525,50
        970622-1,16 Tooth Gears (Pack of 50),2002,525,50
        970623-1,20 Tooth Double Bevel Gears (Pack of 25),2002,525,25
        970624-1,24-Tooth Crown Gears,2003,525,50
        970625-1,24 Tooth Gears (Pack of 50),2002,525,50
        970626-1,Technic Clutches,2003,525,10
        970627-1,40 Tooth Gears (Pack of 25),2002,525,25
        970628-1,Cross Blocks (Pack of 50),2002,525,50
        970629-1,Catches with Cross Holes (Pack of 50),2002,525,50
        970630-1,Pulleys (For micromotor pack of 10),2002,525,10
        970631-1,Bricks with Cross (axle) Holes (Pack of 50),2002,525,50
        970632-1,1 x 2 Beams,2002,525,50
        970633-1,1 x 4 Beams,2002,525,30
        970634-1,1 x 6 Beams,2002,525,30
        970635-1,1 x 8 Beams,2002,525,20
        970636-1,1 x 10 Beams,2002,525,20
        970637-1,1 x 12 Beams,2002,525,10
        970638-1,1 x 16 Beams,2002,525,10
        970639-1,2 x 2 Skid Plates (Pack of 50),2002,524,50
        970640-1,Tacho Wheels (Pack of 20),2002,525,20
        970641-1,Gear Casings (Pack of 10 contained 20 prior to 2005 Dacta catalog),2002,525,10
        970643-1,Bobbins {Technic Reels},2002,525,25
        970645-1,Chain Links,2003,525,100
        970646-1,Gear Blocks (Pack of 5),2002,525,5
        970653-1,Pole Reversing Switch,2003,524,1
        970654-1,9-Volt Connecting Leads (One each of 128mm 256 mm 1280 mm),2002,525,3
        970658-1,Air Storage Tanks,2002,525,2
        970659-1,Pneumatic Parts,2002,525,5
        970660-1,O-Ring and Pulley Wheels,2002,525,50
        970661-1,Skeleton and Ghost for Amusement Park Set,2002,524,70
        970662-1,Steering Wheels (Pack of 25),2002,525,25
        970663-1,Pneumatic Switch (Pack of 5),2002,525,5
        970665-1,Universal Joints (Pack of 10),2002,525,10
        970669-1,Special Elements for Simple Machines Set,2002,524,49
        970670-1,Special Elements for Team Challenge Set,2002,524,292
        970671-1,Special Elements for Cities and Transportation Set,2002,524,119
        970672-1,Special Elements for Amusement Park Set,2002,524,78
        970673-1,Special Elements for ROBO Technology Set,2002,524,71
        970674-1,Car Project Set,2002,524,79
        970675-1,House Project Set,2002,524,80
        970676-1,Bug Project Set,2002,524,83
        970677-1,Gadget Project Set,2002,524,48
        970678-1,Special Elements for eLAB Renewable Energy Set,2002,524,315
        970679-1,Special Elements For Mechanical Engineering Set,2004,524,130
        970680-1,Special Elements for Early Simple Machines Set,2002,524,19
        970683-1,Black Plates - Large Package,2002,524,165
        970684-1,Wheels (Tires hubs axle plates and bricks),2002,524,184
        970686-1,Roof Tiles,2002,524,180
        970687-1,Team Challenge Upgrade Kit,2002,524,95
        9707-1,Intelligent House Building Set,1996,1,164
        9709-1,RCX Programmable Brick,1998,1,1
        971-1,52 flat tile bricks,1969,371,156
        9713-1,Infrared Transmission Tower,1998,520,2
        9723-1,Cities and Transportation,2000,1,394
        9725-1,ROBOLAB Amusement Park Set,1999,520,248
        9730-1,RoboSports,1998,260,91
        9731-1,Vision Command [RCX Digital Colour Camera],2000,260,139
        9732-1,Extreme Creatures,1998,260,148
        9735-1,Robotics Discovery Set,1999,260,390
        9736-1,Exploration Mars,1999,260,158
        9738-1,Remote Control,1998,260,1
        9742-1,Photosynthesis Student Set,2008,517,74
        9743-1,Chromosomes - Student Set,2003,517,136
        9748-1,Droid Developer Kit,1999,261,658
        9749-1,NXT Temperature Sensor,2009,259,1
        9750-1,LEGO Interface,1986,532,4
        9751-1,Control Lab Serial Interface & Adapter,1995,530,2
        9752-1,Technic Control Center II,1996,532,14
        9753-1,TECHNIC Control Center [Dacta Kit],1993,1,14
        9754-1,Dark Side Developers Kit,2000,261,578
        9755-1,Temperature Sensor,1999,260,1
        9756-1,Rotation Sensor,1999,260,1
        9757-1,Touch Sensor with Cable,1999,260,2
        9758-1,Light Sensor 9V,1999,260,1
        9761-1,FIRST LEGO League Challenge 2004 - No Limits,2004,398,1437
        9762-1,FIRST LEGO League Challenge 2005 - Ocean Odyssey,2005,398,1471
        9763-1,FIRST LEGO League Challenge 2006 - Nano Quest,2006,398,1505
        9764-1,FIRST LEGO League Challenge 2007 - Power Puzzle,2007,398,1575
        9767-1,Interface Card/Cable for Apple IIe and IIGS,1989,529,1
        9771-1,Interface Card and Cable for TC Logo - IBM compatible,1989,532,3
        9776-1,Pneumatic Circuit,1999,1,4
        9780-1,ROBOLAB Starter Building Set,1998,520,1712
        9780545703307-1,Klutz: LEGO Chain Reactions,2015,497,39
        9781409350545-1,LEGO Legends of Chima: Character Encyclopedia,2014,497,0
        9783-1,Infrared Transmitter with USB Cable,2001,520,2
        9784-1,FIRST LEGO League Challenge 2001 - Arctic Impact,2001,398,1388
        9785-1,Robo Technology Set [Serial Cable],2003,1,221
        9786-1,Robo Technology Set [USB Cable],2003,1,221
        9789-2,FIRST LEGO League Challenge 2002 - City Sights,2002,398,1017
        9790-1,ROBOLAB Team Challenge Set (Serial),1999,520,727
        9793-1,ROBOLAB Team Challenge Set Version 2.5 [Serial Transmitter],2002,520,833
        9794-1,ROBOLAB Team Challenge Set Version 2.5 [USB],2003,1,832
        9795-1,ROBOLAB Intelligent House Building Set,2001,520,164
        9797-1,LEGO MINDSTORMS Education NXT Base Set,2006,519,434
        979760-1,Mars Exploration,2003,518,810
        9798-1,NXT Rechargeable Battery,2006,259,1
        9799-1,Sensor Adaptor for Mindstorms NXT to Vernier,2008,259,0
        980-2,"23 sloping bricks, including roof peak bricks, Blue",1969,371,23
        981-2,"34 sloping profile bricks, including profile peak bricks, Blue",1969,371,39
        9820-1,Geared Turntable,1989,1,64
        9822-1,Beams (Red),1994,1,68
        9823-1,Beams (Blue),1994,1,68
        9824-1,Beams (Yellow),1994,1,68
        9825-1,Pneumatic Elements,1994,1,3
        9826-1,Pneumatic Tubing,1994,1,1
        9831-1,Battery Box with Switch - 9v,1995,1,1
        9833-1,AC Adapter 230V - 10V Transformer,1996,259,1
        9833-3,AC Adapter 230V - 10V Transformer Type G Plug (British),2006,259,1
        9840-1,X-Large Blue Storage Bin (16.5in x 12in x 10in),2006,528,2
        9841-1,NXT Intelligent Brick,2006,259,1
        9842-1,NXT Servo Motor,2006,259,1
        9843-1,NXT Touch Sensor,2006,259,1
        9844-1,NXT Light Sensor,2006,259,1
        9845-1,NXT Sound Sensor,2006,259,1
        9846-1,NXT Ultrasonic Sensor,2006,259,1
        9847-1,Activity Cards for Non-Motorized Simple Machines (979630),1997,532,19
        9847-2,NXT Bluetooth Dongle,2006,259,0
        9848-1,Lamps and Fittings,1997,1,9
        9849-1,9V Micromotor,1995,525,4
        985-1,Lighting Device Parts Pack,1969,371,4
        9851-1,Assortment of Connectors,1992,1,453
        9852-1,Chain Link Pack,1992,1,229
        9853-1,Assortment of Gears,1992,1,122
        9854-1,Worm Gear Pack,1992,1,22
        9855-1,Assortment of Tires/Wheels,1992,1,56
        9856-1,Assortment of Cross Axles,1992,1,124
        9857-1,Assortment of Plate Pieces,1992,1,166
        9858-1,Assortment of Beams,1992,1,126
        9859-1,TECHNIC Motor 4.5 Volt,1992,1,1
        9860-1,Battery Box (4.5 Volt),1992,1,1
        986-1,One Light Bulb,1969,371,1
        9861-1,Connecting Leads,1992,1,8
        9862-1,Random Special Pieces,1992,1,96
        9863-1,Weighted Brick Pack,1992,1,4
        9864-1,Green Building Plates,1992,1,3
        9865-1,Optosensor,1992,1,2
        9866-1,Light and Transparent Bricks,1992,1,12
        9867-1,Touch Sensor,1992,1,1
        9868-1,Plugholders and Leads,1992,1,42
        9869-1,Building Plates (24 x 24),1992,524,3
        9870-1,Pneumatic Rubber Bands and Pneumatic Tubing,1992,1,144
        987-1,Number Bricks,1969,371,52
        9871-1,Yellow Beams,1992,1,76
        9874-1,Building Cards - 1090,1992,532,5
        9875-1,Building Cards - 1092,1992,532,4
        9876-1,Large Turntables,1992,1,2
        988-1,Alphabet Bricks,1969,371,45
        9883-1,Motor - 9v,1995,1,1
        9885-1,Sound element - 9v,1995,1,1
        9888-1,Touch Sensor,2002,1,1
        9889-1,Temperature Sensor,1995,1,1
        9890-1,Light Sensor,1995,1,1
        989-1,10 Traffic Signs,1969,371,10
        9891-1,Angle Sensor,1995,1,1
        9892-1,Brick Separators,1995,1,2
        98959-1,Motor,1977,4,40
        9897-1,9-Volt Connecting Leads,1998,1,3
        9898-1,9-Volt Long Connecting Leads,1996,1,2
        9899-1,Hubs and Tires,1999,1,20
        9900-1,Small Gear Wheels,1999,1,21
        990-1,Trees and Signs (1971 version with granulated trees and 4 bricks),1971,473,12
        990-2,Trees and Signs (1969 version with old style trees and 3 bricks),1969,473,11
        9911-1,9-Volt Touch Sensor and Leads,2004,260,3
        991118-1,3M Connecting Lead (Set of 2),2002,524,2
        9912-1,LEGO Solar Cell,1999,1,1
        991268-1,Special Elements Pack,2009,528,674
        991319-1,Medium Gray Storage Bin,2008,528,1
        991327-1,12-Tooth Black Double Conical Wheels (Pack of 25),2007,525,25
        991328-1,36-Tooth Double Conical Wheels (Pack of 25),2007,525,25
        991329-1,7-Stud Axles (Pack of 50),2007,525,50
        991330-1,New Turntables (Pack of 2),2007,525,2
        991331-2,Small Wide Tire & Hub (Pack of 8 each),2007,524,16
        991332-1,Technic Triangle (Pack of 25),2007,525,25
        991333-1,Cam Wheel (Pack of 25),2007,525,25
        991335-1,Swivel Magnet Pack (Pack of 10 each),2007,524,20
        991336-1,2-Stud Axles with Grooves (Pack of 100),2007,525,100
        991337-1,Connector Peg with Axle (Pack of 100),2007,525,100
        991369-1,Tracks and Sprockets Pack,2008,525,110
        991402-1,Studless Technic Beams,2008,525,35
        991403-1,Technic Angle Beams,2008,525,30
        991404-1,Technic Beams with Snaps,2008,525,30
        991405-1,Technic Crossblocks,2008,525,30
        991426-1,Black Plates - Large Package,2009,525,165
        991451-1,Tracks,2009,525,120
        991452-1,Sprockets,2009,525,22
        991464-1,LEGO Smart Kit,2009,507,20
        9916-1,LEGO Electrical Capacitor,1999,1,1
        991751-1,MINDSTORMS Energy Parts Pack,2012,525,46
        9918-1,Gear Block Yellow,1999,525,1
        9927-1,Beams (red),1999,1,44
        9928-1,Beams (blue),1999,1,44
        9929-1,Plates Red,1998,524,72
        9930-1,Plates Blue,1998,524,72
        9931-1,Plates Yellow,1998,524,72
        9932-1,Plates Black,1998,524,72
        9933-1,Basic Bricks (red),1999,524,62
        9934-1,Basic Bricks (yellow),1999,524,62
        9935-1,Basic Bricks (black),1999,524,62
        9936-1,Weight Elements,1998,524,2
        9937-1,Small Chain Links,1998,1,108
        9938-1,Conveyor Belt Links,1999,1,36
        9939-1,Assorted Pulleys,1999,1,14
        9940-1,Rubber Bands and String,1999,1,36
        994-1,LEGO fences with garden gates,1969,371,19
        9941-1,Cams & Linkages,1998,1,18
        9942-1,Connectors & Bushings,1998,1,160
        9943-1,Axles and Extenders,1998,1,54
        9945-1,Differentials,1998,525,14
        995-1,Lighting Bricks with Color Filters,1969,371,23
        9954-1,Special Elements for Mini Sets,2001,524,56
        9959-1,Special Elements for Intelligent House Building Set,2001,524,41
        9961-1,White Belts,1994,1,16
        9962-1,Flat Tiles,1994,524,12
        9963-1,Axle Extenders and Bushings,1995,1,88
        9964-1,Connector Pegs,1994,1,64
        9965-1,Gears 8- and 10-Tooth,1994,1,18
        9966-1,Large Gear Wheels,1999,1,16
        9967-1,Differential and Bevel Gears,1994,1,18
        9968-1,Pulley Wheels,1994,1,22
        9969-1,Tires and Spoked Hubs,1994,1,24
        9970-1,Axles - Short,1994,1,36
        9971-1,Axles - Long,1994,1,24
        9972-1,Plates (Red),1994,1,88
        9973-1,Plates (Blue),1994,1,88
        9974-1,Plates (Yellow),1994,1,88
        9975-1,Simple Machines,1987,529,122
        9999-1,Upgrade Kit for 9654,2008,507,7
        AMFlag-1,American Flag with Sticker For Stars (Legoland California),2002,427,62
        auditt-1,Audi TT Roadster (Legoland Deutschland),2002,425,57
        B001-1,"1 x 4 x 5 Black Window Frames, Transparent Blue Panes",2001,254,20
        B002-1,1 x 4 x 3 Train Window Clear,2000,254,25
        B004-1,2 x 4 Ridge Roof Tile Low Sloped Black,2003,254,25
        B005-1,2 x 4 Ridge Roof Tile Low Sloped Red,2003,254,25
        B100-1,Crazy Action Contraptions (Klutz),1998,529,64
        B110-1,Crazy Action Contraptions (Klutz) Vol. 2,2008,529,112
        b55dk-01,Lego Mursten - System i Leg Byggebog,1955,497,0
        b56de-01,Lego Bausteine - System im Spiel,1956,497,0
        b63de-01,LEGO Hobby und Modellbau,1963,497,0
        b66de-01,LEGO Motor Eisenbahn,1966,499,0
        BAG6-1,Gray Brick Separator with Black Frame Pieces,2006,254,56
        BAT8369-1,Battery Pack,2004,119,6
        BauMit-1,BAU MIT!,2009,301,1
        Berlin-1,"LEGO Store Grand Opening Exclusive Set, Berlin, Germany",2009,408,69
        bilmasks-1,Special Masks! - 2 (Dark) Copper Color Kanohi (Legoland Billund),2001,426,2
        BIO601601-1,Scorpion,2016,324,19
        BIO601602-1,Ekimu Falcon,2016,324,29
        Braintree-1,"LEGO Store Grand Opening Exclusive Set, South Shore Plaza, Braintree, MA",2008,408,58
        C001-1,LEGO Star Wars Clock,2008,501,0
        C8500-1,Robotops (8500 + 8501 + 8502 + 8503),1999,20,96
        C8504-1,Ultrarex (8504 + 8505 + 8506 + 8507),1999,20,88
        C8509-1,Swamp + Lava (8509 + 8510),2000,16,63
        C8509-2,Dust + Lava + Swamp [8509 + 8510 + 8513],2000,16,96
        C8509-3,Swamp + Frost + Onyx + Dust [8509 + 8511 + 8512 + 8513],2000,16,146
        C8509-4,Swamp + Frost + Onyx + Dust + Power [8509 + 8511 + 8512 + 8513 + 8514],2000,16,153
        C8509-5,Swamp + Lava + Frost + Onyx + Dust + Power [8509 + 8510 + 8511 + 8512 + 8513 + 8514],2000,16,211
        C8511-1,Frost + Dust (8511 + 8513),2000,16,73
        C8511-2,Frost + Onyx + Power [8511 + 8512 + 8514],2000,16,90
        C8512-1,Onyx + Power (8512 + 8514),2000,16,47
        C8521-1,Dynamo (8521 + 8522 + 8523),2000,20,142
        casbon-1,Castle Bonus Pack,1998,186,3
        CCegg-1,Chupa Chups Egg with Surprise Lego Set,2003,301,1
        celeb2015-1,Tatooine Mini-build - Star Wars Celebration Exclusive,2015,158,178
        CELEBV-1,Fan Celebration V - CubeDude - The Bounty Hunter Edition,2010,170,497
        celebvi-1,Boba Fett’s Slave I - Mini - Star Wars Celebration VI Exclusive,2012,169,81
        Cincinnati-1,"LEGO Store Grand Opening Exclusive Set, Kenwood Towne Centre, Cincinnati, OH",2009,408,93
        CITY951701-1,Policeman and Crook Foil Pack,2017,61,16
        cnminifigs-1,Ninja Minifig Packs 3-Pack,2000,434,3
        cokejpiii-1,Japanese Coca-Cola Studios Polybag Collection sets 4056 thru 4079,2001,273,24
        cokesoccer-1,Japanese Coca-Cola Soccer collection sets 4443 thru 4472,2002,462,30
        comcon001-1,Clone Wars Pack - San Diego Comic-Con 2008 Exclusive,2008,165,12
        comcon002-1,Indiana Jones Brickmaster Pack - San Diego Comic-Con 2008 Exclusive,2008,265,114
        comcon003-1,Batman and Joker Minifig Pack - San Diego Comic-Con 2008 Exclusive,2008,484,9
        comcon004-1,Collectible Display Set 1 - San Diego Comic-Con 2009 Exclusive,2009,165,5
        comcon005-1,Collectible Display Set 2 - San Diego Comic-Con 2009 Exclusive,2009,169,12
        comcon006-1,Collectible Display Set 4 - San Diego Comic-Con 2009 Exclusive,2009,165,30
        comcon007-1,Collectible Display Set 5 - San Diego Comic-Con 2009 Exclusive,2009,169,17
        comcon008-1,Collectible Display Set 3 - San Diego Comic-Con 2009 Exclusive,2009,169,16
        comcon009-1,Collectible Display Set 6 - San Diego Comic-Con 2009 Exclusive,2009,165,5
        comcon010-1,Mini Republic Dropship Mini AT-TE Brickmaster Pack - San Diego Comic-Con 2009 Exclusive,2009,161,202
        comcon011-1,LEGO Star Wars Holo-Brick Archives San Diego Comic-Con 2009 Exclusive,2009,170,3
        comcon013-1,Super Heroes Unite - Green Lantern - San Diego Comic-Con 2011 Exclusive,2011,486,4
        comcon014-1,Super Heroes Unite - Batman - San Diego Comic-Con 2011 Exclusive,2011,484,1
        comcon015-1,Star Wars Advent Calendar - San Diego Comic-Con 2011 Exclusive,2011,158,1
        comcon016-1,Super Heroes Unite - Green Lantern - New York Comic-Con 2011 Exclusive,2011,486,4
        comcon017-1,Super Heroes Unite - Superman - New York Comic-Con 2011 Exclusive,2011,489,5
        comcon018-1,Super Heroes Unite - Batman - New York Comic-Con 2011 Exclusive,2011,484,1
        comcon019-1,Darth Maul’s Sith Infiltrator - Mini - San Diego Comic-Con 2012 Exclusive,2012,158,91
        comcon020-1,Super Heroes Unite - Shazam Captain Marvel - San Diego Comic-Con 2012 Exclusive,2012,486,1
        comcon021-1,Super Heroes Unite - Phoenix Jean Gray - San Diego Comic-Con 2012 Exclusive,2012,491,5
        comcon022-1,Super Heroes Unite - Bizarro - San Diego Comic-Con 2012 Exclusive,2012,486,1
        comcon023-1,Super Heroes Unite - Venom - San Diego Comic-Con 2012 Exclusive,2012,488,3
        comcon024-1,Luke Skywalker's Landspeeder - Mini - New York Comic-Con 2012 Exclusive,2012,169,110
        comcon025-1,Shadow Leonardo - New York Comic-Con 2012 Exclusive,2012,570,0
        comcon026-1,Kraang - New York Comic-Con 2012 Exclusive,2012,570,0
        comcon027-1,Spiderwoman - San Diego Comic-Con 2013 Exclusive,2013,488,0
        comcon028-1,Spider-Man - San Diego Comic-Con 2013 Exclusive,2013,488,1
        comcon029-1,Black Superman - San Diego Comic-Con 2013 Exclusive,2013,489,3
        comcon030-1,Green Arrow - San Diego Comic-Con 2013 Exclusive,2013,486,1
        comcon031-1,Azog - San Diego Comic-Con 2013 Exclusive,2013,562,6
        comcon032-1,JEK-14 Mini Stealth Starfighter - San Diego Comic-Con 2013 Exclusive,2013,158,123
        comcon033-1,Micro Scale Bag End - San Diego Comic-Con 2013 Exclusive,2013,563,130
        comcon034-1,Rocket Raccoon’s Warbird,2014,483,145
        comcon035-1,The Collector - San Diego Comic-Con 2014 Exclusive,2014,483,8
        comcon037-1,Batman Classic TV Series Batmobile,2014,484,152
        comcon038-1,Bard the Bowman,2014,562,5
        comcon039-1,The Ghost Starship,2014,182,127
        comcon042-1,Tahu Mask - New York Comic-Con 2014 Exclusive,2014,324,1
        comcon046-1,All New Captain America (Sam Wilson) - San Diego Comic-Con 2015 Exclusive,2015,487,5
        CostaMesa-1,"LEGO Store Grand Opening Exclusive Set, South Coast Plaza, Costa Mesa, CA",2011,408,3
        D100340-1,LogIT Sensor Adapter,2010,259,0
        DC1-1,Commemorative Limited Edition Batman Announcement,2006,484,13
        DCSHDVD1-1,Justice League vs Bizarro League DVD/Blu-Ray,2015,501,5
        DCSHDVD2-1,Justice League: Attack of the Legion of Doom DVD/Blu-ray,2015,501,0
        DKAtlantis-1,Lego Brickmaster Atlantis (Hardcover),2010,497,157
        DKBATMANVD-1,Batman: The Visual Dictionary,2012,501,0
        DKCastle-1,Lego Brickmaster Castle (Hardcover),2009,497,141
        DKCity-1,Lego Brickmaster City (Hardcover),2011,497,146
        DKFriends-1,Friends Brickmaster: Treasure Hunt in Heartlake City,2012,497,103
        DKIDEASBOOK-1,The LEGO Ideas Book,2011,501,0
        DKLEGOBOOK-1,The LEGO Ideas Book - Unlock Your Imagination [ISBN-13 9780756686062],2009,497,1
        DKLEGOBOOK-2,The LEGO Ideas Book - You Can Build Anything [ISBN-13 9781405350679],2011,497,1
        DKNinjago-1,Lego Brickmaster Ninjago (Hardcover),2011,497,144
        DKNINJAGO2-1,Brickmaster: Ninjago 2 - Fight The Power Of The Snakes,2012,435,155
        DKPirates-1,Lego Brickmaster Pirates (Hardcover),2009,497,153
        DKSS-1,Standing Small,2009,501,1
        DKStarWars-1,Lego Brickmaster Star Wars (Hardcover),2010,497,251
        DKSTICKER-1,DK Minifigure Ultimate Sticker Collection,2010,501,0
        DKSWYoda-1,LEGO Star Wars: The Yoda Chronicles,2013,497,0
        Duck75-1,75th Anniversary Duck on Wheels,2007,301,44
        e1a1401-1,MUJI Basic Set,2011,301,64
        e1a1402-1,MUJI Animal / Vehicle Set,2011,301,196
        e1a1403-1,MUJI Moving Set,2011,301,109
        e1a1404-1,MUJI Christmas Set,2011,301,120
        EL241501-1,Enki the Panther,2015,600,14
        EL241502-1,Flamy the Fox,2015,600,12
        Elmhurst-1,"LEGO Store Grand Opening Exclusive Set, Queens Center Mall, Elmhurst, NY",2010,408,95
        EMMETSCAR-1,TRU Emmet's car,2014,578,40
        F6316-1,Flags and Posts,2006,254,100
        fdp01-1,LEGO Familiedage Puzzle Promo 2009,2009,301,7
        FR561502-1,Dressing table,2015,494,22
        FR561601-1,Baby Parrot And Nest,2016,494,16
        FR561602-1,Valentine’s day,2016,494,24
        FR561603-1,Cookie The Superstar,2016,494,20
        FR561604-1,Cute Kitchen,2016,494,24
        FR561605-1,Ice Cream Cart,2016,494,24
        FR561606-1,Rabbit and hutch,2016,494,18
        FR561607-1,Happy Beach,2016,494,17
        FR561608-1,Cookie Cart,2016,494,29
        FR561609-1,Olivia’s laboratory,2016,494,19
        FR561610-1,Scary Shop,2016,494,27
        FR561611-1,Gifts wrapping table,2016,494,22
        FR561612-1,Kitten foil pack,2016,494,23
        FR561701-1,Bear in Ice Cave foil pack,2017,494,24
        Frisco-1,"LEGO Store Grand Opening Exclusive Set, Stonebriar Centre, Frisco, TX",2009,408,60
        FRNDSMAGBEACH-1,LEGO Friends Magazine Issue 'Friends on the beach' Polybag,2014,494,20
        FRNDSMAGJNGLE-1,LEGO Friends Magazine Issue 'Jungle adventures' Polybag,2014,494,28
        fruit1-1,Apple - Hong Kong Lego Show Promotional,2007,33,8
        fruit2-1,Cherry - Hong Kong Lego Show Promotional,2007,33,11
        fruit3-1,Grapes - Hong Kong Lego Show Promotional,2007,33,7
        fruit4-1,Mango - Hong Kong Lego Show Promotional,2007,33,6
        fruit5-1,Melon - Hong Kong Lego Show Promotional,2007,33,8
        fruit6-1,Orange - Hong Kong Lego Show Promotional,2007,33,7
        fruit7-1,Pear - Hong Kong Lego Show Promotional,2007,33,10
        fruit8-1,Tree - Hong Kong Lego Show Promotional,2007,33,0
        G577-1,Vikings Chess Set,2006,502,206
        Glasgow-1,"LEGO Store Grand Opening Exclusive Set, Glasgow UK",2013,408,15
        Hanover-1,"LEGO Store Grand Opening Exclusive Set, Arundel Mills, Hanover, MD",2009,408,69
        Houston-1,"LEGO Store Grand Opening Exclusive Set, Baybrook Mall, Houston, TX",2008,408,65
        Houston-3,"LEGO Store Grand Opening Exclusive Set, The Woodlands Mall, Houston, TX",2012,408,15
        HPG01-1,Harry Potter Gallery 1 - Potter L. Malfoy Lockhart Madame Hooch,2002,246,0
        HPG02-1,Harry Potter Gallery 2 - Hagrid V. Dursley Crabbe Ron Weasley,2002,246,0
        HPG03-1,Harry Potter Gallery 3 - Dumbledore Ginny Weasley D. Malfoy Snape,2002,246,2
        HPG04-1,Harry Potter Gallery 4 - Tom Riddle McGonagall Dobby Goyle Hermione,2002,246,0
        iFountain-1,iFountain (Lego / Coca-Cola Employee Exclusive),2001,301,331
        ISBN1338112120-1,The LEGO Batman Movie: Chaos in Gotham City,2017,497,6
        JUNGLE-ADV-1,Jungle Adventures,2015,494,28
        K10001-1,Metroliner Kit,2001,236,2
        K10020-1,Santa Fe Starter Kit,2002,236,7
        K10022-1,Santa Fe Train Kit,2002,236,7
        K10039-1,LEGO Legend Castle Collection,2003,186,3
        K10041-1,LEGO Town Kit,2003,99,4
        K10068-1,Holiday Kit,2002,227,3
        K10079-1,Holiday Decoration II,2003,227,5
        K10124-1,Ultimate Plane Kit,2003,276,3
        K10131-1,Battle of Yavin Collection,2004,169,3
        K10158-1,Deluxe High Speed Train Collection,2005,239,4
        K10176-1,Classic Castle,2006,197,1
        K10194-1,Emerald Night Collection,2009,240,8
        K1062-1,Lego Road Safety Kit,1981,533,140
        k1062b,Set K1062 Activity Booklet,1981,533,1
        K1376-1,Spider-Man Adventure Kit,2003,488,3
        K1383-1,Scary Monster Madness Kit,2002,273,4
        K2159-1,Holiday Train Starter Collection,2006,236,31
        K3409-1,Ultimate Soccer Stadium Kit,2000,462,6
        K3433-1,Ultimate NBA Arena Kit,2004,459,3
        k34431-1,Lego Mosaic Cat,2003,277,2126
        k34432-1,Lego Mosaic Dino,2003,277,2846
        k34433-1,Lego Mosaic Johnny Thunder,2003,277,2126
        k34434-1,Lego Mosaic Tiger,2003,277,2216
        K3451-1,Famous Planes Kit,2002,276,2
        K3538-1,Snowboard Cross Race Kit,2003,460,3
        K3731-1,3D Pumpkin Pack Kit,2000,230,2
        K3801-1,RIS 2.0 Builders Kit,2003,260,3
        K4103-1,Creator Bucket bundled with 4782 (TRU Exclusive),2005,37,2
        K4346-1,X-Pod Kit,2004,478,4
        K4415-1,X-Pod Creator Collection,2006,479,4
        K4479-1,TIE Bomber & TIE Fighter Kit,2003,169,2
        K4480-1,Jabba's Palace Kit,2003,169,3
        K4482-1,Episode II Final Scene Kit,2003,167,3
        K4487-1,Star Wars Miniatures Kit I,2003,159,4
        K4488-1,Star Wars Miniatures Kit II,2003,159,4
        K4492-1,Star Wars Miniatures Kit III,2004,159,5
        K4511-1,Passenger Train Kit,2003,239,2
        K4512-1,Cargo Train Kit,2003,239,0
        K4515-1,Ultimate Track Kit,1992,244,15
        K4516-1,Oval Track Kit,1992,244,3
        K4519-1,Cross Track Kit,1992,244,6
        K4520-1,Special Track Kit,1992,244,4
        K4531-1,Deluxe Track Kit,1992,244,7
        K4609-1,Jack Stone Fire Rescue Kit,2001,283,3
        K4611-1,Jack Stone Police Rescue Kit,2001,281,4
        K4612-1,Jack Stone Kit,2002,282,3
        K4701-1,Chamber of Secrets Kit,2002,246,3
        K4706-1,Sorcerers Stone Kit,2002,251,7
        K4729-1,Deluxe Hogwarts Kit,2003,246,3
        K4751-1,Marauder's Map Kit  (contains 4750 4751 4695),2004,250,3
        K4755-1,Knight Bus Collection,2004,250,2
        K4852-1,Spider-Man Movie Kit,2003,488,5
        K4915-1,Mini Pods Collection,2006,23,4
        K5300-1,Train Accessories Kit,2003,244,3
        K5613-1,City Fire Station Collection,2008,58,0
        K5850-1,Belville Kit,2003,319,4
        K5858-1,The Golden Palace Collection,2003,320,3
        K5862-1,Flower Fairy Party Collection,2003,319,3
        K5974-1,Space Police Collection,2009,141,8
        K6243-1,Big Pirates Collection,2009,153,7
        K6290-1,Classic Pirates Kit,2001,148,3
        K6762-1,Western Kit,2002,475,3
        K7000-1,Dinosaurs Kit,2001,386,4
        K7029-1,Complete Castle Collection,2007,193,7
        K7035-1,World City Police Kit,2003,111,6
        K7094-1,Castle Collection US version,2007,193,6
        K7153-1,Episode II Ultimate Action Kit,2002,167,4
        K7204-1,Jedi Adventure Kit,2002,170,4
        K720x-1,Story Teller Pack,2002,170,4
        K7283-1,V-wing Space Battle Collection,2005,168,3
        K7317-1,Life on Mars Kit,2001,135,4
        K7417-1,Orient Expedition in Mount Everest Kit,2003,300,4
        K7418-1,Orient Expedition in India Kit,2003,300,4
        K7419-1,Orient Expedition in China Kit,2003,300,4
        K7422-1,Orient Expedition World Travel Kit,2003,300,3
        K7467-1,Space Exploration Kit,2003,387,3
        K7471-1,Discovery Space Kit,2003,387,5
        K7623-1,Indiana Jones Classic Adventures Collection,2008,264,4
        K7690-1,Mars Mission Collection,2008,137,7
        K7699-1,Complete Mars Mission Collection,2007,137,8
        K7734-1,Cargo Transport Collection,2008,54,4
        K7741-1,City Police Collection,2009,61,3
        K7744-1,Ultimate City Police Collection,2008,61,5
        K7775-1,Complete Aqua Raiders Collection,2007,310,6
        K7776-1,Ultimate Aqua Raiders Collection,2007,310,7
        K7890-1,Rescue Collection,2007,60,0
        K7894-1,City Airport Collection,2007,53,4
        K7895-1,Oval Track for RC Trains,2006,245,3
        K7896-1,Deluxe Track for RC Trains,2006,245,6
        K7906-1,Ultimate Firefighter Collection,2007,58,0
        K7945-1,Firefighter Collection,2007,58,0
        K8008-1,Darth Vader / Stormtrooper Kit,2002,18,2
        K8102-1,Humans vs. Robots Battle Machine Collection,2007,389,6
        K8107-1,Golden City Collection,2009,389,3
        K8111-1,Battle Machine Collection,2008,389,5
        K8130-1,Tiny Turbo III Collection,2007,120,4
        K8148-1,Mini Racers Collection,2008,120,4
        K8355-1,Twin Powered Street Racer Kit,2003,113,2
        K8358-1,Night Sprinter Kit,2003,113,3
        K8362-1,Ferrari Collection,2004,114,2
        K8371-1,Twin Powered Street Racer Kit 2,2003,113,2
        K8380-1,All-Terrain Racers Collection,2003,116,2
        K8381-1,High-Speed Racers Collection,2003,116,2
        K8383-1,Off-Road Racers Collection,2003,116,2
        K8533-1,Find the Power BIONICLE Kit,2001,324,9
        K8563-1,Bohrok Swarm Kit,2002,328,8
        K8564-1,Ultimate Bohrok Swarm Kit,2002,324,12
        K8566-1,Toa Nuva Hero Kit,2003,354,2
        K8572-1,Toa Nuva Kit,2003,354,6
        K8573-1,Bohrok-Kal Kit,2003,330,2
        K8578-1,Ultimate Bohrok-Kal Kit,2003,330,6
        K8586-1,Matoran Villagers Kit,2003,335,6
        K8587-1,Rahkshi Set (Panrahk and Kurahk),2003,344,2
        K8588-1,Ultimate Rahkshi Kit,2003,344,6
        K8590-1,Rahkshi Kaita Vo Kit,2003,344,3
        K8591-1,Rahkshi Kit (Panrahk and Vorahk),2003,344,2
        K8592-1,Rahkshi Kaita Za Kit,2003,344,3
        K8596-1,Takutanuva Kit,2003,347,2
        K8603-1,Toa Metru Legends Kit,2004,353,2
        K8605-1,Toa Metru Kit I,2004,353,3
        K8606-1,Toa Metru Kit II,2004,353,3
        k8612-1,Metru Nui Matoran Kit,2004,336,6
        K8614-1,Vahki Kit,2004,357,6
        K8615-1,Vahki Enforcers Kit (8614 & 8615),2004,357,2
        K8645-1,Slammer Propeller Hotrod,2005,116,2
        k8647-1,Dual-Engine Truck,2005,116,2
        K8667-1,Pullback Racer Collection,2006,116,2
        K8672-1,Ferrari Racing Collection,2006,114,2
        K8685-1,Phantoka Collection,2008,339,6
        K8688-1,Mistika Collection,2008,338,6
        K8725-1,Matoran of Voya Nui Collection (8721 8722 8723 8724 8725 8726),2006,337,6
        K8727-1,Toa Inika Collection (8727 8728 8729 8730 8731 8732),2006,351,6
        K8741-1,Toa Hordika Deluxe Collection (8736 8737 8738 8739 8740 8741),2005,350,6
        K8747-1,Visorak Collection (8742 8743 8744 8745 8746 8747),2005,358,6
        K8755-1,Titans Collection (8755 8756 8761),2005,347,3
        K8761-1,The Shadowed One (LEGO Club Members Exclusive),2005,347,235
        K8764-1,Warriors of Voya Nui Collection,2006,347,3
        K8800-1,Vladek's Attack Kit,2004,198,2
        K8882-1,Power Functions Train Accessories Pack,2009,245,6
        K8900-1,Piraka Collection (8900 8901 8902 8903 8904 8905),2006,340,6
        K8915-1,Toa Mahri Collection,2007,352,6
        K8916-1,Barraki Collection,2007,326,6
        K8924-1,Titans of Mahri Nui Collection,2007,359,3
        K8927-1,Mahri Nui Deepsea Collection,2007,341,3
        K8929-1,Matoran of Mahri Nui Collection,2007,334,4
        K8942-1,Ultimate BIONICLE Collection,2008,359,4
        K8944-1,Matoran of Light Collection,2008,333,6
        K8956-1,Power Miners Collection,2009,439,6
        K8978-1,Bionicle Glatorian Collection,2009,331,6
        K9833-1,Rechargeable Battery Set,2007,259,2
        K9833-2,Rechargeable Battery Set (AC Adapter 230V - 10V Transformer),2006,259,2
        K9916-1,Robotics Invention System Kit,2003,260,8
        kabbasic-1,Kabaya Basic 4-Pack,2000,467,4
        kabbion-1,Kabaya Bionicle 4-Pack (boxed 1417 1418 1419 1420),2001,356,4
        kabbion2-1,Va 4-pack Kabaya (contains 1431 1432 1433 1434),2002,329,4
        kabcity-1,City 4-Pack,2000,50,4
        kabcreat-1,Creator 4-Pack,2001,23,4
        kabdino-1,Dino Island 4-Pack,2000,298,4
        kabextreme-1,Kabaya Extreme Team 4-Pack,1999,87,4
        Kabinsect-1,Insectoids 4-Pack,1999,134,4
        kabkk-1,Knight's Kingdom 4-Pack,2000,197,4
        kabmars-1,Life on Mars 4-Pack,2001,135,4
        kabninja-1,Kabaya Ninja 4-Pack,1999,434,4
        kaborient-1,Orient Expedition 3-Pack (canned versions of 7422 7423 7424),2003,300,3
        kabrace-1,Race 4-Pack,2001,91,4
        kabrobo-1,Kabaya RoboRider 4-Pack,2000,16,4
        kabrock-1,Rock Raiders 4-Pack,2000,442,4
        kabsoccer-1,Kabaya Soccer 3-Pack,2002,462,3
        kabspace-1,Kabaya Space Port 4-Pack,1999,93,4
        kabstud-1,Studios 4-Pack,2001,273,4
        kabtec-1,Kabaya Technic Vehicle 4-Pack,1999,5,4
        KB565-1,RIS 2.0 Basics Kit,2004,260,4
        KCCHP-1,Coca Cola Harry Potter Gift Set,2002,246,7
        KFruit-1,Fruit Set - Hong Kong Lego Show Promotional,2007,33,8
        kk2vp1-1,Knights' Kingdom Value Pack 1 (with bonus water bottle),2004,198,3
        kk2vp2-1,Knights' Kingdom Value Pack 2 (with bonus water bottle),2004,198,3
        kk2vp3-1,Knights' Kingdom Value Pack 3 (with bonus water bottle),2004,198,3
        kkchrome-1,Knight's Kingdom Chrome Series (complete set),2000,197,4
        KLLCA21-1,Santa with Reindeer and Sleigh (Legoland California),2005,427,3
        KSB28-1,LEGO BrickMaster Sample Magazine,2008,501,0
        KT103-1,Large Train Engine Blue,2001,238,0
        KT104-1,Large Train Engine Green,2001,238,0
        KT105-1,Large Train Engine Black,2001,238,0
        KT106-1,Large Train Engine Brown,2001,238,0
        KT107-1,Large Train Engine Gray,2001,238,0
        KT203-1,Large Train Engine with Tender Blue,2001,238,0
        KT204-1,Large Train Engine with Tender Green,2001,238,0
        KT205-1,Large Train Engine with Tender Black,2001,238,0
        KT206-1,Large Train Engine with Tender Brown,2001,238,0
        KT207-1,Large Train Engine with Tender Gray,2001,238,0
        KT303-1,Small Train Engine Blue,2001,238,0
        KT304-1,Small Train Engine Green,2001,238,2
        KT305-1,Small Train Engine Black,2001,238,2
        KT306-1,Small Train Engine Brown,2001,238,2
        KT307-1,Small Train Engine Gray,2001,238,2
        KT403-1,Small Train Engine with Tender Blue,2001,238,0
        KT404-1,Small Train Engine with Tender Green,2001,238,0
        KT405-1,Small Train Engine with Tender Black,2001,238,0
        KT406-1,Small Train Engine with Tender Brown,2001,238,0
        KT407-1,Small Train Engine with Tender Gray,2001,238,0
        LADYBIRD2-1,The Quest For The Lost City Activity Book,2010,501,0
        LBCITYSPACE-1,LEGO City: Space Mission - Activity Book,2011,501,0
        LBFIRERESCUE-1,LEGO City: Fire Rescue! - Activity Book,2012,501,0
        ldd3-1,LEGO Digital Designer Promo,2009,301,3
        legobricks-1,Lego Bricks Box,1958,366,2
        lfv1-1,Le Fleuriste Collector Vase - Rapid Flore Pop Color,2010,301,352
        lfv2-1,Le Fleuriste Collector Vase - Happy,2010,301,297
        lfv3-1,Le Fleuriste Collector Vase - Monceau Fleurs Blue Chic,2010,301,350
        Lightbulb-1,Celebrating Moments That CLICK Light Bulb,2009,301,57
        LIT2009-1,LEGO Inside Tour (LIT) Exclusive 2009 Edition - Ole Kirk's House,2009,301,909
        Liverpool-1,LEGO Store Grand Opening Exclusive Set Liverpool UK,2011,408,12
        LLBUS-1,Bus (Legoland Deutschland),2002,425,45
        llca10-1,Dragon Sculpture (Legoland California),2000,425,70
        llca12-1,3D Witch (Legoland California),2004,427,103
        LLCA13-1,Trumpet (Legoland California),2004,425,178
        llca21-1,Sitting Santa (Legoland California),2005,427,42
        llca22-1,Santa's Sleigh (Legoland California),2005,427,76
        llca23-1,Reindeer (Legoland California),2005,427,72
        LLCA25-1,"Las Vegas Skyline, Eiffel Tower (LLCA Ambassador Pass Exclusive)",2005,425,151
        llca27-1,Legoland Pirate with Parrot (Legoland California),2006,430,70
        LLCA29-1,Pirate Treasure Chest Bank (LLCA Ambassador Pass Exclusive),2006,430,215
        LLCA30-1,Pirate Ship Diorama (LLCA Ambassador Pass Exclusive),2006,430,127
        llca3-1,Pelican Sculpture (Legoland California),2000,425,83
        LLCA31-1,Tree Frog Sculpture (LLCA Ambassador Pass Exclusive),2007,425,90
        llca34-1,Sarcophagus (LLCA Ambassador Pass Exclusive),2008,425,181
        llca35-1,Obelisk (LLCA Ambassador Pass Exclusive),2008,425,100
        llca4-1,Toy Soldier (Legoland California),2003,425,171
        LLCA51-1,Legoland California 10th Birthday Cupcake Box (LLCA Ambassador Pass Exclusive),2009,425,92
        LLCA52-1,Sand Castle - Ambassador Class 2010 (LLCA Ambassador Pass Exclusive),2010,425,229
        llca8-1,LEGO Heart (Legoland California),2004,425,58
        LLCABR1-1,Hau Mask - Green Brick (Legoland California),2001,426,168
        LLCABR2-1,Hau Mask - Blue Brick (Legoland California),2001,426,168
        LLCABR3-1,Hau Mask - Red Brick (Legoland California),2001,426,168
        LLCAPUM1-1,Build N Buy Pumpkin (Happy) (Legoland California),2002,427,31
        LLCAPUM2-1,Build N Buy Pumpkin (Sad) (Legoland California),2002,427,29
        LLKING-1,King (Legoland Deutschland),2003,425,59
        LLPlane-1,Airplane [Legoland Deutschland],2002,425,25
        LLSWAN-1,Swan (Legoland Deutschland),2003,425,72
        lmg001-1,LEGO Japan Small Duck,2003,301,8
        lmg002-1,LEGO Japan Cat,2004,301,10
        lmg003-1,LEGO Japan Ostrich,2004,301,10
        lmg003-2,LEGO Japan Ostrich Yellow Label Version,2006,301,10
        lmg004-1,LEGO Japan Spinning Top,2004,301,12
        lmg005-1,LEGO Japan Deer,2003,301,13
        lmg006-1,LEGO Japan Dog,2005,301,13
        lmg006-2,LEGO Japan Dog Blue Label Version,2006,301,13
        lmg007-1,LEGO Japan Snake,2005,301,9
        lmg008-1,LEGO Japan Whale,2005,301,10
        lmg009-1,LEGO Japan Snail,2004,301,8
        lmg010-1,LEGO Japan Santa,2005,301,13
        LOC113-1,Ewar,2013,571,15
        LOC114-1,Grumlo Promo Minifigure,2014,571,13
        LOC213-1,Razcal Promo Minifigure,2013,571,15
        LOC2-14,Outland Jump,2014,571,25
        LOC214-1,Speedorz Ramp,2014,571,25
        LOC391404-1,Worriz,2014,571,18
        LOC391405-1,Crocodile Hideout,2014,571,29
        LOC391406-1,Crug,2014,571,8
        LOC391408-1,Vornon,2014,571,11
        LOC391409-1,Ice Prison,2014,571,17
        LOC391410-1,Sykor,2014,571,11
        LOC391411-1,Ice Cannon,2014,571,27
        LOC391412-1,Worriz,2014,571,9
        LOC391501-1,Gorzan Polybag,2015,571,8
        LOC391502-1,Ice Crossbow,2015,571,27
        LOC391503-1,Lundor,2015,571,10
        LOC391504-1,Fire vs Ice Weaponry,2015,571,38
        LOC391505-1,Iceklaw,2015,571,8
        LOC391506-1,Fire Catapult,2015,571,25
        LOC391507-1,Stealthor foil pack,2015,571,8
        LOC391508-1,Bulkar,2015,571,9
        LOC471408-1,Lennox,2014,571,10
        lwp01-1,LEGO World Denmark Puzzle Promo,2009,301,7
        lwp02-1,LEGO World Zwolle Puzzle Promo 2009,2009,301,7
        lwp03-1,LEGO World Denmark Puzzle Promo 2010,2010,301,7
        lwp04-1,LEGO World Denmark Puzzle Promo 2011,2011,301,7
        lwp05-1,LEGO World Denmark Puzzle Promo 2012,2012,301,7
        lwp06-1,LEGO World Denmark Puzzle Promo 2013,2013,301,7
        Maine-1,Maine Space Grant Consortium Promotional Astronaut Polybag,1999,93,5
        makepromo-1,Make and Create Basic Set (Toyfair Nuernberg Promotion),2003,37,0
        MAY2013-1,Holocron Droid,2013,158,31
        MFCN-1,Chinese Minifig Collection Volume 1,2009,535,0
        MFCN-2,Chinese Minifig Collection Volume 2,2009,535,27
        MiniNXT-1,Mini NXT Brick,2008,259,3
        MiniRCX-1,Mini RCX Brick,2008,260,4
        Minneapolis-2,"LEGO Store Grand Re-opening Exclusive Set, Mall of America, Bloomington, MN",2010,408,125
        MissionViejo-1,LEGO Store Grand Opening Exclusive Set Mission Viejo Mall Mission Viejo CA,2011,408,13
        mln09-1,My Lego Network Promo LEGO World 2009,2009,301,3
        MMMB003-1,Monthly Mini Model Build February 2009 - Heart,2009,409,15
        MMMB009-1,Monthly Mini Model Build June 2009 - Sailing Boat,2009,409,27
        MMMB010-1,Monthly Mini Model Build July 2009 - US Flag,2009,409,15
        MMMB023-1,Monthly Mini Model Build April 2010 - Chick,2010,409,30
        MMMB026-1,Monthly Mini Model Build July 2010 - Watermelon,2010,409,43
        MMMB0908,Monthly Mini Model Build August 2009 - Lobster,2009,409,49
        MOMENTS-1,This moments,2015,494,18
        MS1032-1,Infrared Receiver Sensor for Mindstorms NXT,2010,259,0
        MS1034-1,Compass Sensor for Mindstorms NXT,2006,259,1
        MS1038-1,Color Sensor for Mindstorms NXT,2006,259,1
        MS1040-1,Accelerometer Sensor for Mindstorms NXT,2007,259,0
        MS1042-1,Infrared Seeker for Mindstorms NXT (Version 1),2007,259,0
        MS1044-1,Gyroscopic Sensor for Mindstorms NXT,2007,259,0
        MS1046-1,Infrared Link Sensor for Mindstorms NXT,2007,259,0
        MS1048-1,Mindstorms RF ID Sensor,2008,259,0
        MS1049-1,Mindstorms Keyfob Transponder,2008,259,0
        MS1060-1,Mindstorms NXT Touch Sensor Multiplexer,2009,259,0
        MYERNEXO-1,Micro Battle Blaster,2016,605,18
        MYERNEXO-2,Micro Mecha Horse,2016,605,24
        NAA1030-1,NXT Angle Sensor,2013,259,0
        NEO1048-1,EOPD Sensor for Mindstorms NXT (Electro Optical Sensor),2009,259,0
        NEX271606-1,Knight Racer,2016,605,21
        NEX271607-1,Firecracker Catapult,2016,605,17
        NEX271608-1,Kid Clay,2016,605,18
        NEX271609-1,Bat-Gun,2016,605,29
        NEX271610-1,Mighty Mech Bot,2016,605,34
        NEX271611-1,Pilot Bot,2016,605,13
        NEX271712-1,Clay and Training Stand,2017,605,18
        NEX271714-1,Robin,2017,605,19
        NIN561609-1,Kai foil pack #2,2016,435,13
        NIN891501-1,Ninjago Kai,2015,435,9
        NIN891503-1,Cole foil pack,2015,435,11
        NIN891505-1,Jay foil pack,2015,435,8
        NIN891506-1,Ming foil pack,2015,435,8
        NIN891507-1,Zane foil pack,2015,435,9
        NIN891508-1,Anacondrai Hideout,2015,435,24
        NIN891610-1,Clouse foil pack,2016,435,8
        NIN891612-1,Sqiffy,2016,435,7
        NIN891614-1,Cyren,2016,435,9
        NIN891615-1,Jay,2016,435,14
        NIN891616-1,Bucko,2016,435,9
        NIN891617-1,Titanium Zane,2016,435,15
        NIN891618-1,Ronin,2016,435,15
        NIN891619-1,Pirate fighter,2016,435,21
        NIN891620-1,Nya foil pack,2016,435,10
        NIN901503-1,Krait foil pack,2015,435,7
        NK271601-1,Lance,2016,605,14
        NK271602-1,Hover Horse,2016,605,34
        NK271603-1,Robin And Horse,2016,605,23
        NK271604-1,Goblin Spiders,2016,605,28
        NMS1035-1,NXT Magnetic Sensor,2010,259,1
        nqstudios-1,Nesquik Studios Promo 3-Pack,2001,273,3
        OklahomaCity-1,"LEGO Store Grand Opening Exclusive Set, Penn Square Mall, Oklahoma City, OK",2009,408,58
        OrlandPark-1,"LEGO Store Grand Opening Exclusive Set, Orland Park, IL",2009,408,58
        Paramus-1,"LEGO Store Grand Opening Exclusive Set, Paramus, NJ",2009,408,73
        pk1062,Lego Road Safety Kit Poster,1981,501,0
        Pleasanton-1,LEGO Store Grand Opening Exclusive Set Stoneridge Mall Pleasanton CA,2011,408,15
        PS3038-1,LEGO Star Wars: The Complete Saga,2007,501,0
        Ramboll-1,Ramboll Oil Platform,2008,301,215
        rrminifigs-1,Rock Raider Minifig Packs 3-Pack,2000,442,3
        Sacramento-1,"LEGO Store Grand Opening Exclusive Set, Arden Fair Mall, Sacramento, CA",2008,408,79
        SAMURAI-DROID-1,Samurai droid,2015,435,32
        SanDiego-1,LEGO Store Grand Opening Exclusive Set Fashion Valley San Diego CA,2011,408,15
        SDCC2015-1,Throne of Ultron,2015,487,196
        SDCC2015-2,Dagobah Mini-Build,2015,158,177
        SDCC2015-3,Action Comics #1 Superman,2015,489,145
        shell98small-1,Shell Town 1998 Promotional (complete set),1998,301,10
        shtown99small-1,Shell Town 1999 Promotional (complete set),1999,50,6
        Sphinx-1,Sphinx,2008,301,29
        Sunrise-1,"LEGO Store Grand Opening Exclusive Set, Sawgrass Mills, Sunrise, FL",2011,408,15
        sw117promo-1,Darth Vader Polybag - 56. International Toy Fair Nuernberg (N├╝rnberg),2005,168,2
        sw218promo-1,Darth Vader 10 Year Anniversary Promotional Fig polybag,2009,169,2
        SW911506-1,Snowspeeder,2015,163,19
        SW911508-1,Mini Slave 1,2015,159,20
        SW911509-1,Imperial Shooter,2015,182,20
        SW911510-1,Star Destroyer and TIE Fighter foil pack,2015,159,21
        SW911511-1,Jedi Weapon Stand,2015,158,16
        SW911607-1,Millennium Falcon ,2016,158,42
        SW911608-1,Landspeeder,2016,163,37
        SW911610-1,Probe Droid,2016,158,20
        SW911612-1,Acklay,2016,167,49
        SW911616-1,MTT Foil Pack,2016,158,44
        SW911617-1,Palpatine's Shuttle,2016,158,37
        SW911719-1,Kanan Jarrus foilpack,2017,182,6
        SW911720-1,The Ghost,2017,182,50
        SW911722-1,TIE Advanced foil pack,2017,158,26
        SW911723-1,Vulture Droid foil pack,2017,162,35
        SW911724-1,A-Wing,2017,182,47
        SWCOMIC1-1,X-Wing,2015,159,23
        SWDVDBD-1,The Padawan Menace,2011,501,0
        swminifigs-1,Star Wars Minifig Packs 4-Pack,2000,170,4
        SWMP-1,Star Wars / M&M Mosaic - Promo Set,2005,169,5461
        tech007promo-1,Technic Figure Cyber Person Promotional Polybag - [Toy Fair Nuernberg Promotion 1998],1998,3,1
        tf05-1,Lego Toy Fair 2005 Star Wars V.I.P. Gala Set,2005,168,38
        tktour-1,Tour De France (complete set),2000,50,4
        TLMPS-1,The LEGO Movie Promotional Set,2014,578,103
        tominifigs-1,Town Minifig Packs 2-Pack,2000,50,2
        Toronto-2,"LEGO Store Grand Opening Exclusive Set, Fairview Mall, Toronto, ON, Canada",2011,408,15
        Troy-1,"LEGO Store Grand Opening Exclusive Set, Somerset Collection, Troy, MI",2010,408,103
        TRU01-1,Harry Potter Quidditch Tower (TRU Event Exclusive),2002,246,37
        TRUBATSIGNAL-1,Batman Bat-Signal,2014,484,19
        trucapam-1,Captain America Mosaic,2016,598,71
        TRUCOGSWORTH-1,Toys 'r Us - Cogsworth,2016,301,47
        TRUFALCON-1,Millennium Falcon,2016,158,44
        TRUFRIENDS-1,Wishing Well,2017,494,33
        TRUGHOST-1,Rebel Micro Ghost,2014,170,42
        TRUJOKERMECH-1,The Joker Mini Mech Bot,2013,484,42
        TRUKAYAK-1,Kayak,2015,52,18
        TRULUMIERE-1,Toys 'r Us Lumiere,2016,301,23
        TRUNEXO-1,Micro Rumble Blade,2016,605,21
        TRUNEXO-2,Micro Chaos Chariot,2016,605,30
        TRUNINJAGO-1,Micro Shinto Shrine,2015,435,18
        TRUNINJAGO-2,Micro Electromech Robot,2015,435,28
        TRUNINJAGO-3,Micro Kai's Fighter Jet,2015,435,18
        TRUNINJAGO-4,Micro Morro Dragon,2015,435,29
        TRUTIE-1,TIE Fighter,2014,170,12
        TRUXWING-1,X-Wing,2014,170,23
        TRUXWING-2,Poe's X-Wing Fighter,2015,158,27
        tsuper-1,Technic Super Set,1991,12,3
        Vienna-1,"LEGO Store Grand Opening Exclusive Set, SCS, Wien, Austria",2013,408,17
        VP-1,Ice Planet Co-Pack of 6814 6879 and 6898,1995,133,3
        VP-10,Star Wars Value Pack with Free LEGO Backpack (K-Mart Australia Exclusive),2003,170,4
        VP-11,Star Wars Co-Pack of 7101 7111 and 7131,2000,166,3
        VP-12,Star Wars Co-Pack of 7121 and 7151,2000,166,2
        VP-13,Launch Command Value Pack - (6336 6516 6614),1995,88,3
        VP-14,Classic Town Value Pack Duopack (6581 6596),1998,67,2
        VP-15,Adventurers Super Value Pack,2000,298,3
        VP-17,Legoland Town Special Offer,1985,67,0
        VP-2,Star Wars Co-Pack of 7110 and 7144,2001,169,2
        VP-3,Star Wars Co-Pack of 7131 and 7151,2000,166,2
        VP-4,Star Wars Co-Pack of 7101 7111 and 7171,2000,166,3
        VP-5,UFO Value Pack,1997,144,3
        VP-6,Building Bonanza Value Pack 4886 with 7280 & 7281,2006,52,3
        VP-7,Fire Value Pack (6554 6407 6564),1997,98,3
        VP-8,Star Wars Co-Pack of 7130 and 7150,2000,169,2
        VPorient-1,Orient Expedition Value Pack with LEGO Backpack (K-Mart Australia Exclusive),2003,300,4
        vwkit-1,Volkswagen Kit,1959,366,22
        W991526-1,Homeschool Introduction to Simple and Motorized Mechanisms Pack,2009,529,0
        Wauwatosa-1,"LEGO Store Grand Opening Exclusive Set, Mayfair, Wauwatosa, WI",2012,408,15
        WHITEHOUSE-1,Micro White House,2015,598,59
        WishingWell-1,Wishing Well [Toys R Us Promo],2013,494,28
        wwgp1-1,Wild West Limited Edition Gift Pack,1996,476,3
    """.trimIndent()