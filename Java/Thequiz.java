package
        com.
                boostmytool;
import
        java.util.
        Scanner
                          ;

import
        java.
        util.          Random
        ;



public




class
                                         Thequiz






{




    Thequestion







        [


            ]



            quasi



        ;








    Scanner


                                                                            computing
                   ;








    int
                                                     Needforquestion



                        ;








                                                                                                        int


               result



                                                               ;





                                                      String
            denomination








              ;








    public





    String



    requiredenomination


                                                                                     (

    )






    {


        return


                                           denomination

                                                    ;






    }



                                                           int
      Needforquestion                                                                                        (




     )



     {
                                               return


                Needforquestion



                                                       ;
    }
     int
                                           needresult



             (


     )
     {
        return
                result
                ;
    }
    void
    placedenomination



                                                                                           (


            String


                                                                                       denomination



            )
    {
        this
                                                                                                      .
                                            denomination

                                                                        =
                denomination





        ;
    }
    void
                                       placeresult
            (



                    int




                            result
                                                                       )
    {





        this

                                                                                            .

                result

                                                                        =

                result






        ;
    }

     void
                              placeNeedforquestion

             (




                     int
                                                                                                                    Needforquestion
             )
     {
        this                                                                                                      .



                Needforquestion




                =



                Needforquestion







        ;
    }





    // constructor
     Thequiz
                                       (








     ){

        Random
                random                                                     =
                                                                                                new
                        Random
                        (




                        )
                ;
        int
                fixation


                =

                random

                                                                    .
                                                                 nextInt
                                (


                                        1000


                                )
                ;

        denomination

                =



                "Quiz"


                        +








                fixation
        ;
        Needforquestion





                =
                                                                                  0






        ;
        quasi
                =
                                                                  new
                Thequestion
                                                                                                              [
                                                                                 5
                                                                          ]

        ;
        computing
                                                       =


                new
                Scanner                                                                     (

                        System                                                                  .



                                in
        )



        ;
    }


     void
                                                                     Requirementforquestion
                (


                )                                           {

        if
        (




                Needforquestion
                                                                                                   ==
                        quasi                                                               .










                                length









        ){

            Thequestion
                           [


                                                                                              ]
                    calac

                                                                                      =
                    new




                    Thequestion






                    [
                            quasi
                                                                                      .
                                                           length
                                                                            *

                                    2

                    ]
                                                                                                             ;

            for
            (

                    int
                                                xl
                    =
                          0
                    ;                          xl


                            <
                                                        Needforquestion
                    ;
                                                  xl
                                                              ++
                              )                                                              {
                calac




                        [
                                xl
                        ]
                        =


                        quasi
                        [
                                                               xl
                                ]

                ;
            }
                                     quasi


                    =

                    calac


            ;
        }
        //
         //  brand new question added

         System
                            .
                out                          .
                                                   print
                (
                        "Please Enter a Numeric Question?: "       +
                                "    "







                )




         ;
        String

                query
                                                                       =



                computing


                        .



                        nextLine                                     (



                        )
                                                                                      ;
        System
                .
                out
                        .


                print
                                                  ("" +
                "" +
                "" +
                "   " +
                "" +
                "" +
                "Please enter four options:    " +
                "" +
                "" +
                "" +
                "" +
                "" +
                "\n1:"



        )





        ;
        String
                                               choice1
                                                 =
                             computing                                            .
                                                                     nextLine
                        (

                )
                                                                           ;

        System
                                    .
                out
                              .
                print
                        (
                                "2:"
                                                                                )
                                                                                                      ;
        String

                                   choice2


                                                   =
                computing
                                             .
                 nextLine
                                               (



                 )                                    ;
        System                            .
                out                      .


                print

                (
                        "3: "

                )

        ;
        String




                choice3

                =
                                                                 computing                                                 .
                                                                 nextLine

                                                                          (



                        )


                ;
        System.


                out.


                print

                        (
                                "4: "


                        )


        ;
        String
                                 choice4



                                                                =


                computing
                                                  .
                                              nextLine
                                    (

                                                         )
                      ;


        System                            .
                out                     .
                      print
                                     (
                                             "Please select the correct choice: "
                                        )
           ;

        int
                right
                                          =

                Integer                                      .
                                                      parseInt
                        (

                                computing                           .
                                nextLine

                                        (



                                )
                        );

        System
                                                             .

                out
                                                        .

                print


                        (

                                " Please enter Complexity level [1,10]: "


                        )





        ;

        int




                quanity
                                              =
                Integer
                                                               .
                        parseInt
                                                          (
                                                                                                        computing
                                                                          .
                                                                                        nextLine
                                                                                  (





                                                                                  )
                                                          )





                ;

      //now making a question

        Thequestion
                                                       query1
                =
                                                     new
                Thequestion

                (



                        query


                                                        ,
                        quanity



                                                                                  )


                ;

        query1.Addingchoices
                                                                     (
                        choice1
                        ,
                                                                             choice2
                                                                                                  ,
                                                                             choice3
                                                                                               ,
                                                                             choice4
                                                                                           ,

                                                                             right
                                                                     )

        ;

        quasi
                [
                        Needforquestion
                                                             ++
                ]

                =
                query1
        ;
    }

    void
                                              start
            (

    ){

        System                       .


                out         .



                println

                (
                        "\n" +
                                "      " +
                                "Now starting the quiz: "
                )


        ;

        for


        (
                                                   int

         xlzs

         =                                            0
                                                                     ;


        xlzs
                                                    <
                Needforquestion
                ;
         xlzs
                                                                     ++
        ) {
            System.out.println
                    (
                            quasi
                                                                         [
                                            xlzs
                                    ]                                         .
                                    getInquiry(

                                    )
                                              )
            ;
            quasi
                    [                          xlzs
                    ]                            .
                    getInquiry
                            (


                            )


                                                                                                         ;
            int
                    user
                                                                                                       =
                    computing                               .
                            nextInt(

                            )

                    ;



            if







            (
                    user







                            ==




                            quasi  [                                          xlzs
                                    ].


                                    getThecorrectchoice(

                                                                 )
                                                                                     )

            {
                result





                                                                               ++


                ;
                System.out.println


                        ("Right!")
                                                          ;
                                             }

                                  else
            {
                System                                    .
                        out                              .
                        println

                        (" Incorrect!")


                ;
            }
        }
    }

}
