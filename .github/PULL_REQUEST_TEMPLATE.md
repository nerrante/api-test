<ins>Before pull request creation</ins>
- [ ] All unit tests have been run in local environment and have passed 
- [ ] APIs return meaningful error messages and codes, and follow our [`best practices`](https://confluence.isis.org/display/TechTeam/API+Strategy)
- [ ] Code follows our [`coding standards and guidelines`](https://confluence.isis.org/display/TechTeam/Coding+Standards+and+Guidelines)
- [ ] Dependency check - have dependencies changed?  If yes:
  - [ ] Yarn.lock (front end) or pom.xml (back end) has been updated and is included in commit 
  - [ ] Looked into change and tested that change will not break existing code 
- [ ] Thorough manual testing has been done, covering acceptance criteria and all areas that these code changes might affect 
- [ ] UX has reviewed and any suggested changes are complete 
- [ ] Another developer has tested the code 

___

<ins>Before merging pull request</ins>
- [ ] Code has been demonstrated and reviewed with product, UX, QA, and other developers 
- [ ] Any code direction/decisions made have been documented [`here`](https://confluence.isis.org/display/TechTeam/Coding+Standards+and+Guidelines) 
- [ ] PR conversations are resolved and there are no outstanding change requests (person that created comment should be the one that marked it resolved) 
- [ ] Branch is up to date with main and has no conflicts 
  - [ ] Manual and automated unit tests were completed again after all changes to code 
- [ ] Automated unit tests all passed 
- [ ] Automated build succeeded 
