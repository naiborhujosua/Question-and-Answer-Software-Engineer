read formula
printf %.3f $(echo "scale=4;$formula" | bc )
