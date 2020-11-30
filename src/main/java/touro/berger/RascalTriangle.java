package touro.berger;

public class RascalTriangle {

    //formula from https://apfstatic.s3.ap-south-1.amazonaws.com/s3fs-public/08_comac_rascal_triangle.pdf
    public int getElement(int row, int col) {
        return col * (row - col) + 1;
    }
}
