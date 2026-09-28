package T;

import n2.AbstractC0959k;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f5690a;

    /* renamed from: b, reason: collision with root package name */
    public int f5691b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5692c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5693d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5694e;

    public int a(int i2) {
        int i3 = this.f5690a + 1;
        int[] iArr = (int[]) this.f5692c;
        int length = iArr.length;
        if (i3 > length) {
            int i4 = length * 2;
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            AbstractC0959k.r(iArr, iArr2, 0, 0, 14);
            AbstractC0959k.r((int[]) this.f5693d, iArr3, 0, 0, 14);
            this.f5692c = iArr2;
            this.f5693d = iArr3;
        }
        int i5 = this.f5690a;
        this.f5690a = i5 + 1;
        int length2 = ((int[]) this.f5694e).length;
        if (this.f5691b >= length2) {
            int i6 = length2 * 2;
            int[] iArr4 = new int[i6];
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i7 + 1;
                iArr4[i7] = i8;
                i7 = i8;
            }
            AbstractC0959k.r((int[]) this.f5694e, iArr4, 0, 0, 14);
            this.f5694e = iArr4;
        }
        int i9 = this.f5691b;
        int[] iArr5 = (int[]) this.f5694e;
        this.f5691b = iArr5[i9];
        int[] iArr6 = (int[]) this.f5692c;
        iArr6[i5] = i2;
        ((int[]) this.f5693d)[i5] = i9;
        iArr5[i9] = i5;
        int i10 = iArr6[i5];
        while (i5 > 0) {
            int i11 = ((i5 + 1) >> 1) - 1;
            if (iArr6[i11] <= i10) {
                break;
            }
            b(i11, i5);
            i5 = i11;
        }
        return i9;
    }

    public void b(int i2, int i3) {
        int[] iArr = (int[]) this.f5692c;
        int[] iArr2 = (int[]) this.f5693d;
        int[] iArr3 = (int[]) this.f5694e;
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
        int i5 = iArr2[i2];
        iArr2[i2] = iArr2[i3];
        iArr2[i3] = i5;
        iArr3[iArr2[i2]] = i2;
        iArr3[iArr2[i3]] = i3;
    }
}
