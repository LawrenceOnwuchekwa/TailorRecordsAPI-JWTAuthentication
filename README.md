# Tailor Records API



## Table of contents

- [Overview](#overview)
  - [Screenshot](#screenshot)
  - [Links](#links)
- [My process](#my-process)
  - [Built with](#built-with)
  - [What I learned](#what-i-learned)
  - [Continued development](#continued-development)
  - [Useful resources](#useful-resources)
- [Author](#author)
- [Acknowledgments](#acknowledgments)


## Overview
  The purpose of this is to allow as a fashion designer to register your customers and store their measurements.
  As a fashion designer, you can create a family or an individual account.
  The system should be able to allow you store customers' measurements so they can be retrieved at any time. 
  The purpose of this is to eliminate the use of books by tailors/fashion designers to store customers’ measurement information.
## My process

### Built with

- Springboot
- SpringWeb
- Spring datajpa
- MySQL
- Hibernate
- Jwt web token api
### What I learned


```hibernate
  Creating relationship with entities via annotations like te one to many relationship
 Using the Annotation:
        @Inheritance(strategy = InheritanceType.JOINED)
        @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
```jwt authentication
  Authentication and Authorization using JWT web tokens

```

### Continued development

Going forward I will be working on more complex entity relationships to gain mastery with modelling database and using entity relationships with hibernate.

### Useful resources

- [Resource](https://www.youtube.com/playlist?list=PLEocw3gLFc8UYNv0uRG399GSggi8icTL6) - This helped me to really grasp hibernate. I really liked this pattern of teaching.
- 
## Author

- Github - [Onwuchekwa Lawrence](https://github.com/LawrenceOnwuchekwa/TailorRecordsAPI-JWTAuthentication)
- Twitter - [@masterHillz](https://twitter.com/masterHillz)


## Acknowledgments

