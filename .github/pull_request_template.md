<ins>BEFORE marking pull request as ready for review</ins>
- [ ] Unit tests have been written for new logic, covering both happy and unhappy paths
- [ ] All unit tests have been run in local environment and have passed
- [ ] Code follows our [`coding standards and guidelines`](https://github.com/species360/phoenix-ui/blob/main/docs/StandardsAndGuidelines.md)
- [ ] Dependency check - have dependencies changed?  If yes:
    - [ ] Yarn.lock and package.json (front end) have been updated and are included in commit
    - [ ] Looked into change and tested that change will not break existing code
- [ ] Thorough manual testing has been done, covering acceptance criteria and all areas that these code changes might affect
- [ ] Translation keys/token values have been added following the [`translation key naming guidelines`](https://github.com/species360/phoenix-ui/blob/main/docs/Translation/TranslationKeyNaming.md)
- [ ] UI has been tested with translated values to test any component breaks (see [`Translation Guidelines and Usage`](https://github.com/species360/phoenix-ui/blob/main/docs/Translation/GuidelinesAndUsage.md) for steps)
- [ ] UX has reviewed and any suggested changes are complete
- [ ] Another developer has tested the code and any issues discovered have been resolved
- [ ] Code has been demonstrated and reviewed with product, UX, QA, and other developers

___

<ins>BEFORE merging pull request</ins>
- [ ] Any code direction/decisions made have been documented in the [`Standards and Guidelines MD file`](https://github.com/species360/phoenix-ui/blob/main/StandardsAndGuidelines.md)
- [ ] PR conversations are resolved and there are no outstanding change requests (person that created comment should be the one that marked it resolved)
- [ ] PR link has been added to the corresponding Jira ticket description
- [ ] Branch is up-to-date with main and has no conflicts
    - [ ] Manual and automated unit tests were completed again after all final changes to code
- [ ] New environment variables have been added to all GCP environment deployments

___

<ins>AFTER merging pull request</ins>
  - [ ] Verify any new translation keys are working correctly in Dev. There may be a delay of up to a minute due to caching by GCP.
