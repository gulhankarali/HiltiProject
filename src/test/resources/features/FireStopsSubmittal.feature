Feature: FireStops Submittal
  @sc1
  Scenario: Filtering according to Joint radio button
    Given user navigates to firestops webpage
    When user choses Joint radio button
    Then Main system search filters appear
    And user choses Concrete Floor from list box of Barrier Type
    And user choses " 2 Hour " from list box of F-Rating
    And user choses " 6 in. or Greater " from list box of Max. Joint Width
    Then "37" results are listed
    And user choses "HI/BPF 120-06 (CEJ 216P)" out of "37" results in the result set
    Then user clicks Submittal Button
    Given FireStops builder page appears
    And "2" FireStops systems are listed
    Then user unchecks all of them and checks again first one
    And user unchecks Mineral wool check box
    And user choses No Cover Page radio button from Submittal Options
    And user choses Include Page Number Yes radio button from Submittal Options
    And user clicks Generate Submittal button
    And system produces product spec as downloadable pdf file
