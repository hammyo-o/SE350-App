# SE350-App

## Sprint 3

This program is a stat tracker and analyzer for [Kovaaks Aim Trainer](https://store.steampowered.com/app/824270/KovaaKs/). Aim training is an important part for many competitive gamers so knowing your progression over time is important.

In KovaaK's, scenarios are typically 1-minute-long maps (accurately levels) created by the community to practice certain aiming techniques. Aim Trainers are typically played by competitive gamers who strive to increase their aiming within shooter games. Some players also play aim trainers for fun. Scenarios can be made with many differents including different enemy types, user and enemy movement types, speeds, and location, as well and different guns with different shooting speed, different ammo capacities, and reload times.

When figit config --global user.name "Your Name"nishing a Kovaaks scenario/map, the game automatically exports static .csv files containing the user's performance data for each RUN the user completes, one scenario exports every single run the user makes so a scenario could have dozens or even hundreds of runs.
The static and automatic files contain a ton of complex data because small nuances most definitely matter at a high level of play. Aim is a crucial skill in competitive gaming, and analyzing performance data helps players identify areas for improvement.

## Data present in the csv files that may be included in the app:

- the date the run of a scenario was completed
- scenario name and author
- run duration
- every single shot fired, including the time of the shot, the type of shot, the location of the shot, damage dealt, damage per second, and whether if each shot was a hit or a miss
- total accuracy within the run
- target data including the location of the target, the time it was present, the type of target, health of the target, number of targets, and the distance of the target from the player, time to kill per target and averaged out, and more
- session tracking data such as the total time spent playing the scenario, the number of runs completed, the total time the user has spent playing scenarios on that single app launch
- weapon name, type, and stats such as fire rate, reload time, and ammo capacity
- sensitivity settings of the player, FOV (field of view), DPI (dots per inch) settings of the player, whether the sensitivy settings were changed during the run, the values of the sensitivty randomizer if it was used, and more
- average FPS (frames per second) of the run, screen resolution, time paused during the run, and more

To ensure you are able to run the project independently without the game, the repo contains a prepopulated directory with my actual .csv log files. The src directory will have a script that compiles the application, launches the GUI, and runs the tracker against the included data.
### Planned Libraries

* **GUI:** TBD.
* **OpenCSV:** For parsing local CSV export data from the game.
* **JUnit:** For unit testing metric calculations.

### How to Run (Starter Code)

Compile to `bin`, then run with `-cp bin`:

```bash
javac -d bin src/*.java
java -cp bin Main
