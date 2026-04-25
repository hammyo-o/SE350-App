# SE350-App

## Sprint 2

I can think of two example projects I would want to do. The first is in typescript, in case that is allowed. I'd prefer doing that choice.

1. An extension for [Paperback](https://apps.apple.com/us/app/paperback-comic-manga-reader/id1626613373), an IOS manga reader app. It uses custom repos/extensions created by users to parse through specific web services or websites. For example, I could make an extension for a gallery site that allows for many settings including: tag filtering, date filtering, page count filtering (if in an album), searching, and a lot more if supported by the website, or easily implementable without performance impact. This is hard for the grader to test because the version I am running of Paperback is one that is in unreleased beta (v0.9). That version is a complete rework of the appstore version of 0.8.11. Instead, I could record and narrate over a video with the features and working extension. I would appreciate that if acceptable.

2. A stat tracker and analyzer for [Kovaaks Aim Trainer](https://store.steampowered.com/app/824270/KovaaKs/) because I play games a lot and enjoy aim training. Aim training is an important part for many competitive gamers so knowing your progression over time is important. I could add multiple aspects like date filtering, scenario filtering, play times, reaction time, etc.

### Planned Libraries (For Option 2)

* **GUI:** TBD.
* **OpenCSV:** For parsing local CSV export data from the game.
* **JUnit:** For unit testing metric calculations.

### How to Run (Starter Code)

Compile to `bin`, then run with `-cp bin`:

```bash
javac -d bin src/*.java
java -cp bin Main
