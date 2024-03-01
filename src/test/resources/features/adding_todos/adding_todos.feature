@webtest
  Feature: Adding todo items
    As a busy person
    I want to be able to record he stuff I need to do
    So I can be sure to get it all done

    Rule: Users can add one or more items to their todo list
      Example: Adding a single item to a list
        Given Tom has an empty todo list
        When He adds "Buy some milk"
        Then He should have he following item in his list:
          | Buy some milk |