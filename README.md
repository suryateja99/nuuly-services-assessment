# Nuuly Services Assessment

## Objectives

### Exercise 1
* Complete the `/create` endpoint to add new items to inventory to be purchased.
  * Creating purchase orders will increase the inventory by the amount received.
* Complete the `/purchase` endpoint to purchase items.
  * Purchasing items will decrease the inventory by the quantity requested.
  * Only allow items to be purchased if inventory exists.

### Exercise 2
* Update the `/purchase` endpoint to allow purchasing a list of items & quantity (instead of one at a time).
  * Purchasing items will decrease the inventory by the quantity requested.
  * Only allow items to be purchased if inventory exists.

### Exercise 3
* We want our analytics team to see what items were purchased the most/least.
* When an item is purchased, keep track of how many times that items was historically purchased.
* To do this, asynchronously produce a message that is consumed by a separate service to track the favorites.
* This should be done in a non-blocking manner to purchase requests since we just want this for reporting and not block the purchase endpoint.
* Complete the `/favorites` endpoint to return a lists of the most and least purchased items.


### Further notes
* Handle responses to the client in a suitable manner
  * Use appropriate HTTP responses and error handling
  * Return a response data to the client about what was updated
* Update existing code documentation to reflect changes made


For more information on the example code provided, view the JavaDocs with:
```bash
./gradlew javadoc && open build/docs/javadoc/index.html
```

## What you are given
* docker-compose
  * PostgreSQL
    * A database to track inventory
  * Kafka & ZooKeeper
    * A message broker to handle publishing and subscribing to topics
    * The configurations for Kafka are handled with the existing application code
  * Java gradle application
    * Built with SpringBoot, this is the API server to handle HTTP requests
* Kafka Producer/Consumer Template
  * In `ProducerService.java` & `Consumer.java` you can utilize those helper functions to send a message and consume a topic
* JPA Databases
  * Two database tables called `Inventory` and `Favorites`
  * These database tables that are auto-created at application start

## How to start
Run the following to spin up the API server and dependencies
```shell
docker-compose up --build
```

### Dependencies

[Install Docker](https://docs.docker.com/engine/installation/)

[Install Docker Compose](https://docs.docker.com/compose/install/)

## Submitting your assessment
#### Option 1
Fork this repo and push your completed work as a branch to your fork. Then share a link to the fork with us.

#### Option 2
Download this repo as a zip. Complete the work and zip the repo again. Then share the zipped repo with us.