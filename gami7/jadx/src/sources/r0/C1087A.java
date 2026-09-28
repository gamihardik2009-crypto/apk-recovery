package r0;

import java.util.List;
import t0.AbstractC1234C;

/* renamed from: r0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087A extends AbstractC1234C {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1090D f9804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.e f9805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1087A(C1090D c1090d, y2.e eVar, String str) {
        super(str);
        this.f9804b = c1090d;
        this.f9805c = eVar;
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        C1090D c1090d = this.f9804b;
        c1090d.f9815o.f9904h = interfaceC1096J.getLayoutDirection();
        float c3 = interfaceC1096J.c();
        C1136y c1136y = c1090d.f9815o;
        c1136y.f9905i = c3;
        c1136y.f9906j = interfaceC1096J.s();
        boolean F = interfaceC1096J.F();
        y2.e eVar = this.f9805c;
        if (F || c1090d.f9808h.f10389j == null) {
            c1090d.f9811k = 0;
            InterfaceC1095I interfaceC1095I = (InterfaceC1095I) eVar.j(c1136y, new O0.a(j3));
            return new C1137z(interfaceC1095I, c1090d, c1090d.f9811k, interfaceC1095I, 1);
        }
        c1090d.f9812l = 0;
        InterfaceC1095I interfaceC1095I2 = (InterfaceC1095I) eVar.j(c1090d.f9816p, new O0.a(j3));
        return new C1137z(interfaceC1095I2, c1090d, c1090d.f9812l, interfaceC1095I2, 0);
    }
}
