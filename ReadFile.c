#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>

int main()
{
    char Fname[20];
    int fd = 0;
    char Data[20];

    printf("Please enter file name that you want to create\n");
    scanf("%s",Fname);

    fd = open(Fname,0_RDWR);
    if(fd == -1)
    {
        printf("Unable to create the file\n");
        return -1;
    }
    else
    {
        printf("File is succesfully created with FD %d\n",fd);
    }
     read (fd,Data,10);
     printf("Data from file is:%s\n"Data);
    close(fd)
    
    return 0;
}