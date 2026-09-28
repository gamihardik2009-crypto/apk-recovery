package u;

import m2.C0880v;
import p.X;
import q2.InterfaceC1073d;
import r0.InterfaceC1095I;
import r2.EnumC1145a;
import v.InterfaceC1339K;

/* loaded from: classes.dex */
public final class z implements InterfaceC1339K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f10814a;

    public z(x xVar) {
        this.f10814a = xVar;
    }

    @Override // v.InterfaceC1339K
    public final int a() {
        long e3;
        x xVar = this.f10814a;
        if (xVar.g().f10751k == X.f9518h) {
            InterfaceC1095I interfaceC1095I = xVar.g().f10754n;
            e3 = l0.c.e(interfaceC1095I.f(), interfaceC1095I.h()) & 4294967295L;
        } else {
            InterfaceC1095I interfaceC1095I2 = xVar.g().f10754n;
            e3 = l0.c.e(interfaceC1095I2.f(), interfaceC1095I2.h()) >> 32;
        }
        return (int) e3;
    }

    @Override // v.InterfaceC1339K
    public final float b() {
        x xVar = this.f10814a;
        return (xVar.f10796b.f10321b.g() * 500) + xVar.f10796b.f10322c.g();
    }

    @Override // v.InterfaceC1339K
    public final int c() {
        x xVar = this.f10814a;
        return (-xVar.g().f10748h) + xVar.g().f10752l;
    }

    @Override // v.InterfaceC1339K
    public final A0.b d() {
        return new A0.b(-1, -1);
    }

    @Override // v.InterfaceC1339K
    public final Object e(int i2, InterfaceC1073d interfaceC1073d) {
        Object i3 = x.i(this.f10814a, i2, interfaceC1073d);
        return i3 == EnumC1145a.f10026h ? i3 : C0880v.f8657a;
    }

    @Override // v.InterfaceC1339K
    public final float f() {
        x xVar = this.f10814a;
        int g3 = xVar.f10796b.f10321b.g();
        int g4 = xVar.f10796b.f10322c.g();
        return xVar.a() ? (g3 * 500) + g4 + 100 : (g3 * 500) + g4;
    }
}
