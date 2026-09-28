package J;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4081a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4082b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4083c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4084d;

    public S() {
        this.f4082b = new Object();
        this.f4083c = new ArrayList();
        this.f4084d = new ArrayList();
        this.f4081a = true;
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (!this.f4081a) {
                    return null;
                }
                long[] jArr = (long[]) this.f4082b;
                int length = jArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    int i5 = 1;
                    boolean z3 = jArr[i2] > 0;
                    boolean[] zArr = (boolean[]) this.f4083c;
                    if (z3 != zArr[i3]) {
                        int[] iArr = (int[]) this.f4084d;
                        if (!z3) {
                            i5 = 2;
                        }
                        iArr[i3] = i5;
                    } else {
                        ((int[]) this.f4084d)[i3] = 0;
                    }
                    zArr[i3] = z3;
                    i2++;
                    i3 = i4;
                }
                this.f4081a = false;
                return (int[]) ((int[]) this.f4084d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public S(int i2) {
        this.f4082b = new long[i2];
        this.f4083c = new boolean[i2];
        this.f4084d = new int[i2];
    }
}
