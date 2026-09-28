package J;

import j.C0761q;
import java.util.ArrayList;
import java.util.List;
import m2.C0870l;

/* renamed from: J.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280n0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f4167a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4168b;

    /* renamed from: c, reason: collision with root package name */
    public int f4169c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4170d;

    /* renamed from: e, reason: collision with root package name */
    public final C0761q f4171e;

    /* renamed from: f, reason: collision with root package name */
    public final C0870l f4172f;

    public C0280n0(int i2, ArrayList arrayList) {
        this.f4167a = arrayList;
        this.f4168b = i2;
        if (!(i2 >= 0)) {
            C0257c.W("Invalid start index");
            throw null;
        }
        this.f4170d = new ArrayList();
        C0761q c0761q = new C0761q();
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Q q = (Q) this.f4167a.get(i4);
            int i5 = q.f4074c;
            int i6 = q.f4075d;
            c0761q.g(i5, new K(i4, i3, i6));
            i3 += i6;
        }
        this.f4171e = c0761q;
        this.f4172f = new C0870l(new B.y(14, this));
    }

    public final boolean a(int i2, int i3) {
        int i4;
        C0761q c0761q = this.f4171e;
        K k3 = (K) c0761q.e(i2);
        if (k3 == null) {
            return false;
        }
        int i5 = k3.f4042b;
        int i6 = i3 - k3.f4043c;
        k3.f4043c = i3;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = c0761q.f8025c;
        long[] jArr = c0761q.f8023a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128) {
                        K k4 = (K) objArr[(i7 << 3) + i9];
                        if (k4.f4042b >= i5 && !z2.h.a(k4, k3) && (i4 = k4.f4042b + i6) >= 0) {
                            k4.f4042b = i4;
                        }
                    }
                    j3 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
