package t;

import m2.C0880v;
import p.X;
import q2.InterfaceC1073d;
import r0.InterfaceC1095I;
import r2.EnumC1145a;
import v.InterfaceC1339K;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1209d implements InterfaceC1339K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1228w f10231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10232b;

    public C1209d(C1228w c1228w, boolean z3) {
        this.f10231a = c1228w;
        this.f10232b = z3;
    }

    @Override // v.InterfaceC1339K
    public final int a() {
        long e3;
        C1228w c1228w = this.f10231a;
        if (c1228w.h().f10300n == X.f9518h) {
            InterfaceC1095I interfaceC1095I = c1228w.h().q;
            e3 = l0.c.e(interfaceC1095I.f(), interfaceC1095I.h()) & 4294967295L;
        } else {
            InterfaceC1095I interfaceC1095I2 = c1228w.h().q;
            e3 = l0.c.e(interfaceC1095I2.f(), interfaceC1095I2.h()) >> 32;
        }
        return (int) e3;
    }

    @Override // v.InterfaceC1339K
    public final float b() {
        C1228w c1228w = this.f10231a;
        return (c1228w.f10346d.f10321b.g() * 500) + c1228w.f10346d.f10322c.g();
    }

    @Override // v.InterfaceC1339K
    public final int c() {
        C1228w c1228w = this.f10231a;
        return (-c1228w.h().f10297k) + c1228w.h().f10301o;
    }

    @Override // v.InterfaceC1339K
    public final A0.b d() {
        return this.f10232b ? new A0.b(-1, 1) : new A0.b(1, -1);
    }

    @Override // v.InterfaceC1339K
    public final Object e(int i2, InterfaceC1073d interfaceC1073d) {
        Object j3 = C1228w.j(this.f10231a, i2, interfaceC1073d);
        return j3 == EnumC1145a.f10026h ? j3 : C0880v.f8657a;
    }

    @Override // v.InterfaceC1339K
    public final float f() {
        C1228w c1228w = this.f10231a;
        int g3 = c1228w.f10346d.f10321b.g();
        int g4 = c1228w.f10346d.f10322c.g();
        return c1228w.a() ? (g3 * 500) + g4 + 100 : (g3 * 500) + g4;
    }
}
