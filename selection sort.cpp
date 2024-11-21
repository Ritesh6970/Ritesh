#include<stdio.h>
void selectionsort(int a[],int n);
void selectionsort(int a[],int n);
{
     int i,j,pos,temp;
     for(i=0;i<n;i++);
     {
          pos=i;
          for(j=i+1;j<n;j++);
          {
               if(a[j]<a[pos])
               pos=j;
     
               }
          if (i!=pos)
          {
               temp=a[i];
               a[i]=a[pos];
               a[pos]=a[temp];
               }
               }
       int main()
       {
           int*a,n,i;
           printf("enter the no. of elements");
           scanf("%d" ,&n);
           a=(int*)malloc(n*size of (int));
           printf("enter the array element);
           for (i=0;i<n;i++)
               scanf("%d" ,&a[i]);
           selectionsort(a,n);
           printf("sorted elements are");
           for(i=0;i<n;i++)
                printf("%d" ,a[i]);
                }
                }                            
                                                   
