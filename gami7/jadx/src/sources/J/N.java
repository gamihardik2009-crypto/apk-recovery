package J;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4053a;

    /* renamed from: b, reason: collision with root package name */
    public int f4054b;

    public N() {
        this.f4053a = new int[10];
    }

    public int a() {
        int[] iArr = this.f4053a;
        int i2 = this.f4054b - 1;
        this.f4054b = i2;
        return iArr[i2];
    }

    public void b(int i2) {
        int i3 = this.f4054b;
        int[] iArr = this.f4053a;
        if (i3 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f4053a = copyOf;
        }
        int[] iArr2 = this.f4053a;
        int i4 = this.f4054b;
        this.f4054b = i4 + 1;
        iArr2[i4] = i2;
    }

    public void c(int i2, int i3, int i4) {
        int i5 = this.f4054b;
        int i6 = i5 + 3;
        int[] iArr = this.f4053a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f4053a = copyOf;
        }
        int[] iArr2 = this.f4053a;
        iArr2[i5] = i2 + i4;
        iArr2[i5 + 1] = i3 + i4;
        iArr2[i5 + 2] = i4;
        this.f4054b = i6;
    }

    public void d(int i2, int i3, int i4, int i5) {
        int i6 = this.f4054b;
        int i7 = i6 + 4;
        int[] iArr = this.f4053a;
        if (i7 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            z2.h.e(copyOf, "copyOf(this, newSize)");
            this.f4053a = copyOf;
        }
        int[] iArr2 = this.f4053a;
        iArr2[i6] = i2;
        iArr2[i6 + 1] = i3;
        iArr2[i6 + 2] = i4;
        iArr2[i6 + 3] = i5;
        this.f4054b = i7;
    }

    public void e(int i2, int i3) {
        if (i2 < i3) {
            int i4 = i2 - 3;
            for (int i5 = i2; i5 < i3; i5 += 3) {
                int[] iArr = this.f4053a;
                int i6 = iArr[i5];
                int i7 = iArr[i3];
                if (i6 < i7 || (i6 == i7 && iArr[i5 + 1] <= iArr[i3 + 1])) {
                    i4 += 3;
                    f(i4, i5);
                }
            }
            f(i4 + 3, i3);
            e(i2, i4);
            e(i4 + 6, i3);
        }
    }

    public void f(int i2, int i3) {
        int[] iArr = this.f4053a;
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
        int i5 = i2 + 1;
        int i6 = i3 + 1;
        int i7 = iArr[i5];
        iArr[i5] = iArr[i6];
        iArr[i6] = i7;
        int i8 = i2 + 2;
        int i9 = i3 + 2;
        int i10 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = i10;
    }

    public N(int i2) {
        this.f4053a = new int[i2];
    }
}
