package s;

/* renamed from: s.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1173l {

    /* renamed from: a, reason: collision with root package name */
    public static final C1165d f10149a = new C1165d(3);

    /* renamed from: b, reason: collision with root package name */
    public static final C1165d f10150b = new C1165d(2);

    /* renamed from: c, reason: collision with root package name */
    public static final C1167f f10151c = new C1167f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1167f f10152d = new C1167f(0);

    /* renamed from: e, reason: collision with root package name */
    public static final C1168g f10153e = new C1168g(0);

    /* renamed from: f, reason: collision with root package name */
    public static final C1168g f10154f = new C1168g(3);

    /* renamed from: g, reason: collision with root package name */
    public static final C1168g f10155g = new C1168g(2);

    static {
        new C1168g(1);
    }

    public static void a(int i2, int[] iArr, int[] iArr2, boolean z3) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f3 = (i2 - i4) / 2;
        if (!z3) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f3);
                f3 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f3);
            f3 += i8;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z3) {
        int i2 = 0;
        if (!z3) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public static void c(int i2, int[] iArr, int[] iArr2, boolean z3) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z3) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public static void d(int i2, int[] iArr, int[] iArr2, boolean z3) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (iArr.length == 0) ^ true ? (i2 - i4) / iArr.length : 0.0f;
        float f3 = length / 2;
        if (z3) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f3);
                f3 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static void e(int i2, int[] iArr, int[] iArr2, boolean z3) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f3 = (z3 && iArr.length == 1) ? max : 0.0f;
        if (z3) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f3);
                f3 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + max;
            i3++;
            i7++;
        }
    }

    public static void f(int i2, int[] iArr, int[] iArr2, boolean z3) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z3) {
            float f3 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f3);
                f3 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f4 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f4);
            f4 += i8 + length;
            i3++;
            i7++;
        }
    }
}
