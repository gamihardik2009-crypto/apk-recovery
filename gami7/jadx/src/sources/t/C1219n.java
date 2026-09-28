package t;

import J2.InterfaceC0328z;
import java.util.List;
import java.util.Map;
import n2.AbstractC0961m;
import p.X;
import r0.InterfaceC1095I;

/* renamed from: t.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219n implements InterfaceC1095I {

    /* renamed from: a, reason: collision with root package name */
    public final C1220o f10287a;

    /* renamed from: b, reason: collision with root package name */
    public int f10288b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10289c;

    /* renamed from: d, reason: collision with root package name */
    public float f10290d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10291e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10292f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0328z f10293g;

    /* renamed from: h, reason: collision with root package name */
    public final O0.b f10294h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10295i;

    /* renamed from: j, reason: collision with root package name */
    public final List f10296j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10297k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10298l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10299m;

    /* renamed from: n, reason: collision with root package name */
    public final X f10300n;

    /* renamed from: o, reason: collision with root package name */
    public final int f10301o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10302p;
    public final /* synthetic */ InterfaceC1095I q;

    public C1219n(C1220o c1220o, int i2, boolean z3, float f3, InterfaceC1095I interfaceC1095I, float f4, boolean z4, InterfaceC0328z interfaceC0328z, O0.b bVar, long j3, List list, int i3, int i4, int i5, X x2, int i6, int i7) {
        this.f10287a = c1220o;
        this.f10288b = i2;
        this.f10289c = z3;
        this.f10290d = f3;
        this.f10291e = f4;
        this.f10292f = z4;
        this.f10293g = interfaceC0328z;
        this.f10294h = bVar;
        this.f10295i = j3;
        this.f10296j = list;
        this.f10297k = i3;
        this.f10298l = i4;
        this.f10299m = i5;
        this.f10300n = x2;
        this.f10301o = i6;
        this.f10302p = i7;
        this.q = interfaceC1095I;
    }

    public final boolean a(int i2, boolean z3) {
        C1220o c1220o;
        int i3;
        if (this.f10292f) {
            return false;
        }
        List list = this.f10296j;
        if (list.isEmpty() || (c1220o = this.f10287a) == null || (i3 = this.f10288b - i2) < 0 || i3 >= c1220o.f10317o) {
            return false;
        }
        C1220o c1220o2 = (C1220o) AbstractC0961m.G(list);
        C1220o c1220o3 = (C1220o) AbstractC0961m.M(list);
        c1220o2.getClass();
        c1220o3.getClass();
        int i4 = this.f10298l;
        int i5 = this.f10297k;
        if (i2 < 0) {
            if (Math.min((c1220o2.f10315m + c1220o2.f10317o) - i5, (c1220o3.f10315m + c1220o3.f10317o) - i4) <= (-i2)) {
                return false;
            }
        } else if (Math.min(i5 - c1220o2.f10315m, i4 - c1220o3.f10315m) <= i2) {
            return false;
        }
        this.f10288b -= i2;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1220o c1220o4 = (C1220o) list.get(i6);
            c1220o4.getClass();
            c1220o4.f10315m += i2;
            int[] iArr = c1220o4.f10319r;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                boolean z4 = c1220o4.f10305c;
                if ((z4 && i7 % 2 == 1) || (!z4 && i7 % 2 == 0)) {
                    iArr[i7] = iArr[i7] + i2;
                }
            }
            if (z3) {
                int size2 = c1220o4.f10304b.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    c1220o4.f10314l.a(i8, c1220o4.f10312j);
                }
            }
        }
        this.f10290d = i2;
        if (!this.f10289c && i2 > 0) {
            this.f10289c = true;
        }
        return true;
    }

    @Override // r0.InterfaceC1095I
    public final int f() {
        return this.q.f();
    }

    @Override // r0.InterfaceC1095I
    public final int h() {
        return this.q.h();
    }

    @Override // r0.InterfaceC1095I
    public final Map i() {
        return this.q.i();
    }

    @Override // r0.InterfaceC1095I
    public final void j() {
        this.q.j();
    }

    @Override // r0.InterfaceC1095I
    public final y2.c k() {
        return this.q.k();
    }
}
