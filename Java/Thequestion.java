package com.boostmytool;

public
class

Thequestion
                   {

                                      String




                                              inquiry
            ;
    String





            [


            ]





            choice;
                       int
                                                     complexity
                                  ;
    int



                                                            Thecorrectchoice
             ;


    public




    int




    complexitylevel




            (






    ) {
        return


                                                       complexity





                ;
    }
                       public
                         Thequestion
                                              (

                                                      String


                                                              zuess
                                                                                                 ,
                                                      int
                                                              complexity
                                               ) {
                           inquiry
                                   =
                                                            zuess
                           ;
                           choice
                                   =
                                                         new



                                           String
                                           [                            4
                                           ];
                           Thecorrectchoice


                                   =                                                     -
                                   1
                           ;
                           this                                        .


                                   complexity


                                                               =
                                   complexity





                                                          ;
                       }





    void
    needcomplexity



            (


                    int




                            complexity



            ) {
        this.
                complexity



                =





                complexity




        ;
    }













    public



    String


    getInquiry


            (






            )


    {
        return






                inquiry




                ;
    }
                       void Addingchoices






                               (
                                                String
                                                                                          cho1
                                                                              ,


                                                String
                                                                         cho2
                                                    ,                                  String
                                                                             cho3
                                       ,
                                                String
                                                                                           cho4
                                                     ,
                                                int
                                                                        dx
                                                                                         ) {
                           choice


                                   [

                                           0
                                   ]

                                   =

                                   cho1

                           ;
                           choice

                                   [

                                                   1

                                   ]
                                                                                   =

                                                             cho2

                           ;
                           choice
                                   [                          2

                                   ]                                                        =

                                                                            cho3
                           ;
                           choice

                                   [                     3

                                   ]


                                                            =

                                   cho4

                           ;
                                                                   Thecorrectchoice





                                   =


                                   dx



                           ;
                       }

    void



    needinquiry

            (

                    String
                                                                        inquiry




            ) {
        this.


                inquiry





                =




                inquiry









        ;
    }






                       void choices






                               (




                               )


                       {
                           for (


                                   int

                                   xl
                                             =
                                                   0
                                             ;
                                   xl <
                                           4

                                                   ;
                                   xl                                        ++


                           )


                           {
                               System                                        .


                                       out



                                       .                                            println
                                          (


                                                  (
                                                                       xl


                                                          +                          1



                                                  )

                                                          +


                                                          "." +
                                                          "" +
                                                          "" +
                                                          " "


                                                          +



                                                          choice




                                                          [


                                                                  xl

                                                                  ]


                                          );
                           }
                           System



                                   .




                                   out







                                           .



                                   print


                                   (




                                           "Your answer: "




                                   )




                                                      ;
                       }

                        void


                        placeThecorrectchoice




                                                                           (



                                        int




                                         Thecorrectchoice




                                                                           )





                        {
                           this
                                                                        .





                                   Thecorrectchoice


                                   =




                                   Thecorrectchoice







                           ;
                       }


                       public



                       int


                       getThecorrectchoice


                               (






                               )


                       {
                           return



                                   Thecorrectchoice




                                   ;
                       }


                       public




                       String


                               [


                                                       ]
                                                 getChoices
                               (



                       )


                       {
                           return
                                                                           choice
                                   ;
                       }
                       void
                       setChoices




                               (
                               String





                                       [




                                       ]
                                                                             choice




                               )


                       {
                           this                        .



                                   choice

                                                                     =

                                   choice


                           ;
                       }

}
