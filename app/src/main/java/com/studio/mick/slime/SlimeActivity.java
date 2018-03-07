package com.studio.mick.slime;
import com.studio.mick.slime.R;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.games.GamesCallbackStatusCodes;
import com.google.android.gms.games.GamesClient;
import com.google.android.gms.games.GamesClientStatusCodes;
import com.google.android.gms.games.InvitationsClient;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayersClient;
import com.google.android.gms.games.RealTimeMultiplayerClient;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationCallback;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.realtime.OnRealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateCallback;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;


public class SlimeActivity extends AppCompatActivity {
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int turn;

    boolean end = false;
    boolean fun;
    int clicked;


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

        //  if (clicked == 0) {
        //     stop.setEnabled(false);
        //     PlayButton.setEnabled(true);
        //  }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked++;

                if (fun) {
                    choice();
                    b1.setClickable(false);

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


                }
                endGame();


            }

        });


    }


    public void choice() {
        if (turn == 1) {
            turn = 2;
            b1.setBackgroundResource(R.drawable.slime1);
            b1.setTag(R.drawable.slime1);

        } else if (turn == 2) {
            turn = 1;
            b1.setBackgroundResource(R.drawable.slime2);

            b1.setTag(R.drawable.slime2);

        }
    }

    public void choice2() {
        if (turn == 1) {
            turn = 2;
            b2.setBackgroundResource(R.drawable.slime1);

            b2.setTag(R.drawable.slime1);

        } else if (turn == 2) {
            turn = 1;
            b2.setBackgroundResource(R.drawable.slime2);

            b2.setTag(R.drawable.slime2);

        }
    }

    public void choice3() {
        if (turn == 1) {
            turn = 2;
            b3.setBackgroundResource(R.drawable.slime1);
            b3.setTag(R.drawable.slime1);

        } else if (turn == 2) {
            turn = 1;
            b3.setBackgroundResource(R.drawable.slime2);

            b3.setTag(R.drawable.slime2);
        }
    }

    public void choice4() {
        if (turn == 1) {
            turn = 2;
            b4.setBackgroundResource(R.drawable.slime1);

        } else if (turn == 2) {
            turn = 1;
            b4.setBackgroundResource(R.drawable.slime2);


        }
    }

    public void choice5() {
        if (turn == 1) {
            turn = 2;
            b5.setBackgroundResource(R.drawable.slime1);

        } else if (turn == 2) {
            turn = 1;
            b5.setBackgroundResource(R.drawable.slime2);

        }
    }

    public void choice6() {
        if (turn == 1) {
            turn = 2;
            b6.setBackgroundResource(R.drawable.slime1);

        } else if (turn == 2) {
            turn = 1;
            b6.setBackgroundResource(R.drawable.slime2);

        }
    }

    public void choice7() {
        if (turn == 1) {
            turn = 2;
            b7.setBackgroundResource(R.drawable.slime1);

        } else if (turn == 2) {
            turn = 1;
            b7.setBackgroundResource(R.drawable.slime2);


        }
    }

    public void choice8() {
        if (turn == 1) {
            turn = 2;
            b8.setBackgroundResource(R.drawable.slime1);

        } else if (turn == 2) {
            turn = 1;
            b8.setBackgroundResource(R.drawable.slime2);

        }
    }

    public void choice9() {

        if (turn == 1) {
            turn = 2;
            b9.setBackgroundResource(R.drawable.slime1);

        } else if (turn == 2) {
            turn = 1;
            b9.setBackgroundResource(R.drawable.slime2);

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

            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();


        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()
                && b1.getBackground().getConstantState() == b2.getBackground().getConstantState()
                && b1.getBackground().getConstantState() == b3.getBackground().getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();


        } else if (b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()
                && b3.getBackground().getConstantState() == b5.getBackground().getConstantState()
                && b3.getBackground().getConstantState() == b7.getBackground().getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();


        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()
                && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()
                && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime1).getConstantState()) {


            end = true;
            Toast.makeText(SlimeActivity.this, "Winner Green Slime!!", Toast.LENGTH_SHORT).show();
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Green Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("Alert");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b1.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();

        } else if (b2.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b3.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b4.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b5.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b6.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;
            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (b7.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b8.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState() && b9.getBackground().getConstantState() == getResources().getDrawable(R.drawable.slime2).getConstantState()) {


            end = true;

            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("WINNER");
            alertDialog.setMessage("Winner Red Slime");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();
        } else if (clicked == 9) {

            AlertDialog alertDialog = new AlertDialog.Builder(SlimeActivity.this).create();
            alertDialog.setTitle("DRAW");
            alertDialog.setMessage("DRAW");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Reset",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(SlimeActivity.this, Main2Activity.class);
                            startActivity(i);
                        }
                    });
            alertDialog.show();


        }


    }
}




