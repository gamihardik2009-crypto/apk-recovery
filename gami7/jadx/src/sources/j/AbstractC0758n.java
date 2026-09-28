package j;

import java.util.ConcurrentModificationException;
import k.AbstractC0779a;

/* renamed from: j.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0758n {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8012a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f8013b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8014c = new Object();

    public static final void a(C0742H c0742h) {
        int i2 = c0742h.f7979k;
        int[] iArr = c0742h.f7977i;
        Object[] objArr = c0742h.f7978j;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f8014c) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        c0742h.f7976h = false;
        c0742h.f7979k = i3;
    }

    public static final void b(C0751g c0751g, int i2) {
        z2.h.f(c0751g, "<this>");
        c0751g.f8000h = new int[i2];
        c0751g.f8001i = new Object[i2];
    }

    public static final int c(C0751g c0751g, Object obj, int i2) {
        z2.h.f(c0751g, "<this>");
        int i3 = c0751g.f8002j;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0779a.a(c0751g.f8000h, c0751g.f8002j, i2);
            if (a3 < 0 || z2.h.a(obj, c0751g.f8001i[a3])) {
                return a3;
            }
            int i4 = a3 + 1;
            while (i4 < i3 && c0751g.f8000h[i4] == i2) {
                if (z2.h.a(obj, c0751g.f8001i[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a3 - 1; i5 >= 0 && c0751g.f8000h[i5] == i2; i5--) {
                if (z2.h.a(obj, c0751g.f8001i[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
