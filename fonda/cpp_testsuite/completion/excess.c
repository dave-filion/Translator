#if A       //1.1
# if B      //1-1.1-1
#  if C     //1-1.1-1.1-1
#   if D    //1-1.1-1.1-1.1-1
ONE;        //1-1.1-1.1-1.1-1.1-1
#   elif 1  //1-1.1-1.1-1.1-1
#   endif   //1-1.1-1.1-1.1-2
#  endif    //1-1.1-1.1-2
# endif     //1-1.1-2
# if E      //1-1.1-3
TWO;        //1-1.1-3.1-1
# endif     //1-1.1-4
#endif      //1.2
THREE;      //1.3
//EOF       //1.4
