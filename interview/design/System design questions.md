# SYSTEM DESIGN PREPARATION
  Here I am listing down most frequently asked design questions. 

## Design TinyURL or bitly (a URL shortening service)
Given a (typically) long URL, how would how would you design service that would generate a shorter and unique alias for it.
Discuss things like:
* How to generate a unique ID for each URL?
* How would you generate unique IDs at scale (thousands of URL shortening requests coming every second)?
* How would your service handle redirects?
* How would you support custom short URLs?
* How to delete expired URLs etc?
* How to track click stats?

## Design YouTube, Netflix or Twitch (a global video streaming service)
Videos mean that your service will be storing and transmitting petabytes and petabytes of data.You should discuss how to efficiently store and distribute data in away that a huge number of users can watch and share them simultaneously (e.g. imagine streaming the latest episode of a hit TV show like Games of Thrones).
In addition, discuss:
* How would you record stats about videos e.g the total number of views, up-votes/down-votes, etc.
* How would a user add comments on videos (in realtime).


## Design bookmyshow

## Design restaurant reservation system

References
-------------
https://hackernoon.com/top-10-system-design-interview-questions-for-software-engineers-8561290f0444
https://www.careercup.com/page?pid=system-design-interview-questions
