package a0;

import java.util.Arrays;
import java.util.Comparator;
import n2.AbstractC0959k;
import t0.AbstractC1248f;
import t0.C1236E;

/* renamed from: a0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final C0444u f6497a = new C0444u();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0442s c0442s = (C0442s) obj;
        C0442s c0442s2 = (C0442s) obj2;
        if (c0442s == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        if (c0442s2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        int i2 = 0;
        if (!AbstractC0427d.t(c0442s) || !AbstractC0427d.t(c0442s2)) {
            if (AbstractC0427d.t(c0442s)) {
                return -1;
            }
            return AbstractC0427d.t(c0442s2) ? 1 : 0;
        }
        C1236E v3 = AbstractC1248f.v(c0442s);
        C1236E v4 = AbstractC1248f.v(c0442s2);
        if (z2.h.a(v3, v4)) {
            return 0;
        }
        Object[] objArr = new C1236E[16];
        int i3 = 0;
        while (v3 != null) {
            int i4 = i3 + 1;
            if (objArr.length < i4) {
                objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                z2.h.e(objArr, "copyOf(this, newSize)");
            }
            if (i3 != 0) {
                AbstractC0959k.q(objArr, objArr, 0 + 1, 0, i3);
            }
            objArr[0] = v3;
            i3++;
            v3 = v3.s();
        }
        Object[] objArr2 = new C1236E[16];
        int i5 = 0;
        while (v4 != null) {
            int i6 = i5 + 1;
            if (objArr2.length < i6) {
                objArr2 = Arrays.copyOf(objArr2, Math.max(i6, objArr2.length * 2));
                z2.h.e(objArr2, "copyOf(this, newSize)");
            }
            if (i5 != 0) {
                AbstractC0959k.q(objArr2, objArr2, 0 + 1, 0, i5);
            }
            objArr2[0] = v4;
            i5++;
            v4 = v4.s();
        }
        int min = Math.min(i3 - 1, i5 - 1);
        if (min >= 0) {
            while (z2.h.a(objArr[i2], objArr2[i2])) {
                if (i2 != min) {
                    i2++;
                }
            }
            return z2.h.g(((C1236E) objArr[i2]).t(), ((C1236E) objArr2[i2]).t());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }
}
