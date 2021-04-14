   SYSTEM =     Bi
   ALGO = Fast

 Startparameter for this Run:
   NWRITE =      2;   LPETIM=.TRUE.    !write-flag & timer
   ISTART =      0    !job   : 0-new  1-cont  2-samecut
   ICHARG =      2    !if ISTART=0:2,0.  ICHARG=1, input from CHGCAR
   LCHARG =      T
   LWAVE  =      F
   ISYM   =      2
   LORBIT  =  10
   LSORBIT = T
   MAGMOM  = 6*0


 Electronic Relaxation
   NELM   =      500;
   EDIFF  =      1E-05   stopping-criterion for ELM
   LREAL  =    Auto
   ENCUT = 520 

 Ionic Relaxation
   IBRION =      -1   ionic relax: 0-MD 1-quasi-New 2-CG
   ISIF   =      0
   NSW    =      0
   EDIFFG =     -0.01
   POTIM  =      0.50

 DOS related values:
   ISMEAR =      0 #0 for insulators, >0 metals
   SIGMA  =      0.01 #default=0.2
