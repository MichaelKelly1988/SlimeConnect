package com.studio.mick.slime;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;


public class SlimeComputeActivity extends AppCompatActivity {
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int turn;

    boolean end = false;
    boolean fun;
    int clicked;
    Random rnd = new Random();
    boolean mick = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slime);
        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);

        turn = 1;
        fun = true;
        clicked = 0;



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;

                if (fun) {
                    choice();
                    b1.setClickable(false);
                    mick = true;

                }
                endGame();


            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;
                if (fun) {
                    choice2();
                    b2.setClickable(false);
                    mick = true;

                }
                endGame();


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;
                if (fun) {
                    choice3();
                    b3.setClickable(false);
                    mick = true;
                }
                endGame();


            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;
                if (fun) {
                    choice4();
                    b4.setClickable(false);
                    mick = true;
                }
                endGame();


            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;
                if (fun) {
                    choice5();
                    b5.setClickable(false);
                    mick = true;

                }
                endGame();


            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;
                if (fun) {
                    choice6();
                    b6.setClickable(false);
                    mick = true;

                }
                endGame();

            }

        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;
                if (fun) {
                    choice7();
                    b7.setClickable(false);
                    mick = true;

                }
                endGame();

            }

        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;
                if (fun) {
                    choice8();
                    b8.setClickable(false);
                    mick = true;
                }
                endGame();


            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;
                if (fun) {

                    choice9();
                    b9.setClickable(false);
                    mick = true;


                }
                endGame();


            }

        });


    }


    public void choice() {
        if (turn == 1) {

            b1.setBackgroundResource(R.drawable.slime1);
            b1.setTag(R.drawable.slime1);

            r();


        }
    }


    public void choice2() {
        if (turn == 1) {

            b2.setBackgroundResource(R.drawable.slime1);

            r();


        }
    }


    public void choice3() {
        if (turn == 1) {

            b3.setBackgroundResource(R.drawable.slime1);

            r();

        }
    }

    public void choice4() {
        if (turn == 1) {

            b4.setBackgroundResource(R.drawable.slime1);

            r();


        }
    }

    public void choice5() {
        if (turn == 1) {

            b5.setBackgroundResource(R.drawable.slime1);

            r();
        }
    }

    public void choice6() {
        if (turn == 1) {

            b6.setBackgroundResource(R.drawable.slime1);

            r();

        }
    }

    public void choice7() {
        if (turn == 1) {

            b7.setBackgroundResource(R.drawable.slime1);

            r();


        }
    }

    public void choice8() {
        if (turn == 1) {

            b8.setBackgroundResource(R.drawable.slime1);

            r();

        }
    }

    public void choice9() {


        if (turn == 1) {

            b9.setBackgroundResource(R.drawable.slime1);

            r();

        }
    }


    public void endGame() {


        engine();


        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        }

    }

    public void engine() {


        if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()
                && b1.getBackground().getConstantState() == b2.getBackground().getConstantState()
                && b1.getBackground().getConstantState() == b3.getBackground().getConstantState()) {

            //   Toast.makeText(SlimeActivity.this, "WINNER GREEN SLIME!!", Toast.LENGTH_SHORT).show();
            end = true;
            //  Toast.makeText(SlimeActivity.this, "Winner Green Slime!!", Toast.LENGTH_SHORT).show();

            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();


        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()
                && b1.getBackground().getConstantState() == b2.getBackground().getConstantState()
                && b1.getBackground().getConstantState() == b3.getBackground().getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();


        } else if (b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()
                && b3.getBackground().getConstantState() == b5.getBackground().getConstantState()
                && b3.getBackground().getConstantState() == b7.getBackground().getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();


        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() &&
                b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() &&
                b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Greem Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        }

        else if (b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            Toast.makeText(SlimeComputeActivity.this, "Winner Green Slime!!", Toast.LENGTH_SHORT).show();
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()
                && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()
                && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;

            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (clicked == 9) {

            AlertDialog alertDialog = new AlertDialog.Builder(SlimeComputeActivity.this).create();
            alertDialog.setTitle("DRAW");
            alertDialog.setMessage("DRAW");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeComputeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        }
    }



public void r() {
    int x = rnd.nextInt(8) + 1;


    switch (x) {
        case 1:
            if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                    b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {
                b1.setClickable(false);
                if(b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                        b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                    b2.setClickable(false);
                    if(b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                            b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                        b3.setClickable(false);
                        if(b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                            b4.setClickable(false);
                            if(b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                    b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                b5.setClickable(false);
                                if(b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                        b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                    b6.setClickable(false);
                                    if(b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                            b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                        b7.setClickable(false);
                                        if(b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                            b8.setClickable(false);
                                            if(b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                    b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                b8.setClickable(false);

                                            }else{ b9.setBackgroundResource(R.drawable.slime2);

                                            }

                                        }else{ b8.setBackgroundResource(R.drawable.slime2);

                                        }

                                    }else{ b7.setBackgroundResource(R.drawable.slime2);

                                    }

                                }else{ b6.setBackgroundResource(R.drawable.slime2);

                                }

                            }else{ b5.setBackgroundResource(R.drawable.slime2);

                            }

                        }else{ b4.setBackgroundResource(R.drawable.slime2);

                        }

                    }else{ b3.setBackgroundResource(R.drawable.slime2);

                    }

                }else{ b2.setBackgroundResource(R.drawable.slime2);

                }
            }else {
                b1.setBackgroundResource(R.drawable.slime2);
            }
            break;
            case 2:
                if (b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                        b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {
                    b2.setClickable(false);
                    if(b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                            b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                        b1.setClickable(false);
                        if(b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                            b3.setClickable(false);
                            if(b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                    b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                b4.setClickable(false);
                                if(b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                        b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                    b5.setClickable(false);
                                    if(b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                            b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                        b6.setClickable(false);
                                        if(b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                            b7.setClickable(false);
                                            if(b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                    b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                b8.setClickable(false);
                                                if(b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                        b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                    b9.setClickable(false);

                                                }else{ b9.setBackgroundResource(R.drawable.slime2);
                                                    b9.setClickable(false);

                                                }

                                            }else{ b8.setBackgroundResource(R.drawable.slime2);
                                                b8.setClickable(false);

                                            }

                                        }else{ b7.setBackgroundResource(R.drawable.slime2);
                                            b7.setClickable(false);

                                        }

                                    }else{ b6.setBackgroundResource(R.drawable.slime2);
                                        b6.setClickable(false);

                                    }

                                }else{ b5.setBackgroundResource(R.drawable.slime2);
                                    b5.setClickable(false);

                                }

                            }else{ b4.setBackgroundResource(R.drawable.slime2);
                                b4.setClickable(false);

                            }

                        }else{ b3.setBackgroundResource(R.drawable.slime2);
                            b3.setClickable(false);

                        }

                    }else{ b1.setBackgroundResource(R.drawable.slime2);
                        b1.setClickable(false);

                    }
                }else {
                    b2.setBackgroundResource(R.drawable.slime2);
                    b2.setClickable(false);
                }
                break;
            case 3:
                if (b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                        b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {
                    b3.setClickable(false);
                    if(b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                            b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                        b2.setClickable(false);
                        if(b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                            b1.setClickable(false);
                            if(b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                    b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                b4.setClickable(false);
                                if(b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                        b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                    b5.setClickable(false);
                                    if(b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                            b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                        b6.setClickable(false);
                                        if(b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                            b7.setClickable(false);
                                            if(b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                    b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                b8.setClickable(false);
                                                if(b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                        b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){


                                                }else{ b9.setBackgroundResource(R.drawable.slime2);
                                                         b9.setClickable(false);

                                                }

                                            }else{ b8.setBackgroundResource(R.drawable.slime2);
                                                b8.setClickable(false);

                                            }

                                        }else{ b7.setBackgroundResource(R.drawable.slime2);
                                            b7.setClickable(false);

                                        }

                                    }else{ b6.setBackgroundResource(R.drawable.slime2);
                                        b6.setClickable(false);

                                    }

                                }else{ b5.setBackgroundResource(R.drawable.slime2);
                                    b5.setClickable(false);

                                }

                            }else{ b4.setBackgroundResource(R.drawable.slime2);
                                b4.setClickable(false);

                            }

                        }else{ b1.setBackgroundResource(R.drawable.slime2);
                            b1.setClickable(false);

                        }

                    }else{ b2.setBackgroundResource(R.drawable.slime2);
                        b2.setClickable(false);

                    }
                }else {
                    b3.setBackgroundResource(R.drawable.slime2);
                    b3.setClickable(false);
                }
                break;
            case 4:
                if (b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                        b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {
                    if(b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                            b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                        if(b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                            if(b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                    b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                if(b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                        b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                    if(b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                            b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                        if(b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                            if(b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                    b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                if(b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                        b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){

                                                }else{ b9.setBackgroundResource(R.drawable.slime2);

                                                }

                                            }else{ b8.setBackgroundResource(R.drawable.slime2);

                                            }

                                        }else{ b7.setBackgroundResource(R.drawable.slime2);

                                        }

                                    }else{ b6.setBackgroundResource(R.drawable.slime2);

                                    }

                                }else{ b5.setBackgroundResource(R.drawable.slime2);

                                }

                            }else{ b1.setBackgroundResource(R.drawable.slime2);

                            }

                        }else{ b3.setBackgroundResource(R.drawable.slime2);

                        }

                    }else{ b2.setBackgroundResource(R.drawable.slime2);

                    }
                }else {
                    b4.setBackgroundResource(R.drawable.slime2);
                }
                break;
            case 5:
                if (b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                        b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {
                    if(b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                            b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                        if(b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                            if(b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                    b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                if(b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                        b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                    if(b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                            b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                        if(b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                            if(b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                    b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                if(b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                        b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){

                                                }else{ b9.setBackgroundResource(R.drawable.slime2);

                                                }

                                            }else{ b8.setBackgroundResource(R.drawable.slime2);

                                            }

                                        }else{ b7.setBackgroundResource(R.drawable.slime2);

                                        }

                                    }else{ b6.setBackgroundResource(R.drawable.slime2);

                                    }

                                }else{ b1.setBackgroundResource(R.drawable.slime2);

                                }

                            }else{ b4.setBackgroundResource(R.drawable.slime2);

                            }

                        }else{ b3.setBackgroundResource(R.drawable.slime2);

                        }

                    }else{ b2.setBackgroundResource(R.drawable.slime2);

                    }
                }else {
                    b5.setBackgroundResource(R.drawable.slime2);
                }
                break;
            case 6:
                if (b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                        b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {
                    if(b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                            b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                        if(b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                            if(b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                    b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                if(b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                        b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                    if(b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                            b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                        if(b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                            if(b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                    b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                if(b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                        b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){

                                                }else{ b9.setBackgroundResource(R.drawable.slime2);

                                                }

                                            }else{ b8.setBackgroundResource(R.drawable.slime2);

                                            }

                                        }else{ b7.setBackgroundResource(R.drawable.slime2);

                                        }

                                    }else{ b1.setBackgroundResource(R.drawable.slime2);

                                    }

                                }else{ b5.setBackgroundResource(R.drawable.slime2);

                                }

                            }else{ b4.setBackgroundResource(R.drawable.slime2);

                            }

                        }else{ b3.setBackgroundResource(R.drawable.slime2);

                        }

                    }else{ b2.setBackgroundResource(R.drawable.slime2);

                    }
                }else {
                    b6.setBackgroundResource(R.drawable.slime2);
                }
                break;
            case 7:
                if (b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                        b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {
                    if(b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                            b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                        if(b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                            if(b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                    b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                if(b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                        b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                    if(b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                            b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                        if(b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                            if(b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                    b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                if(b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                        b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){

                                                }else{ b9.setBackgroundResource(R.drawable.slime2);

                                                }

                                            }else{ b8.setBackgroundResource(R.drawable.slime2);

                                            }

                                        }else{ b1.setBackgroundResource(R.drawable.slime2);

                                        }

                                    }else{ b6.setBackgroundResource(R.drawable.slime2);

                                    }

                                }else{ b5.setBackgroundResource(R.drawable.slime2);

                                }

                            }else{ b4.setBackgroundResource(R.drawable.slime2);

                            }

                        }else{ b3.setBackgroundResource(R.drawable.slime2);

                        }

                    }else{ b2.setBackgroundResource(R.drawable.slime2);

                    }
                }else {
                    b7.setBackgroundResource(R.drawable.slime2);
                }
                break;
            case 8:
                if (b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                        b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {
                    if(b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                            b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                        if(b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                            if(b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                    b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                if(b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                        b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                    if(b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                            b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                        if(b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                            if(b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                    b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                if(b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                        b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){

                                                }else{ b9.setBackgroundResource(R.drawable.slime2);

                                                }

                                            }else{ b1.setBackgroundResource(R.drawable.slime2);

                                            }

                                        }else{ b7.setBackgroundResource(R.drawable.slime2);

                                        }

                                    }else{ b6.setBackgroundResource(R.drawable.slime2);

                                    }

                                }else{ b5.setBackgroundResource(R.drawable.slime2);

                                }

                            }else{ b4.setBackgroundResource(R.drawable.slime2);

                            }

                        }else{ b3.setBackgroundResource(R.drawable.slime2);

                        }

                    }else{ b2.setBackgroundResource(R.drawable.slime2);

                    }
                }else {
                    b8.setBackgroundResource(R.drawable.slime2);
                }
                break;
            case 9:
                if (b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                        b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {
                    if(b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                            b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                        if(b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                            if(b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                    b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                if(b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                        b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                    if(b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                            b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                        if(b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                            if(b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                    b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){
                                                if(b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() ||
                                                        b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()){

                                                }else{ b1.setBackgroundResource(R.drawable.slime2);

                                                }

                                            }else{ b8.setBackgroundResource(R.drawable.slime2);

                                            }

                                        }else{ b7.setBackgroundResource(R.drawable.slime2);

                                        }

                                    }else{ b6.setBackgroundResource(R.drawable.slime2);

                                    }

                                }else{ b5.setBackgroundResource(R.drawable.slime2);

                                }

                            }else{ b4.setBackgroundResource(R.drawable.slime2);

                            }

                        }else{ b3.setBackgroundResource(R.drawable.slime2);

                        }

                    }else{ b2.setBackgroundResource(R.drawable.slime2);

                    }
                }else {
                    b9.setBackgroundResource(R.drawable.slime2);
                }
                break;
        }
    }



}







