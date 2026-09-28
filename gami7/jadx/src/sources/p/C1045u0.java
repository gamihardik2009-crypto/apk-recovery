package p;

import C0.C0018a;
import J2.InterfaceC0328z;
import a0.C0442s;
import a0.InterfaceC0433j;
import a0.InterfaceC0436m;
import android.view.KeyEvent;
import java.util.List;
import l0.C0813a;
import m.C0850x;
import m2.C0880v;
import n0.AbstractC0937p;
import n0.C0919B;
import n0.C0930i;
import n0.EnumC0931j;
import n1.C0944e;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import t0.AbstractC1248f;

/* renamed from: p.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045u0 extends M implements t0.b0, InterfaceC0436m, l0.d, t0.m0 {
    public n.j0 E;
    public U F;

    /* renamed from: G, reason: collision with root package name */
    public final Q1.r f9687G;

    /* renamed from: H, reason: collision with root package name */
    public final C1014e0 f9688H;

    /* renamed from: I, reason: collision with root package name */
    public final C1031n f9689I;

    /* renamed from: J, reason: collision with root package name */
    public final C0 f9690J;

    /* renamed from: K, reason: collision with root package name */
    public final C1028l0 f9691K;

    /* renamed from: L, reason: collision with root package name */
    public final C1027l f9692L;

    /* renamed from: M, reason: collision with root package name */
    public C1005a f9693M;

    /* renamed from: N, reason: collision with root package name */
    public C0018a f9694N;

    /* renamed from: O, reason: collision with root package name */
    public C1043t0 f9695O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, p.u0, t0.n] */
    /* JADX WARN: Type inference failed for: r2v3, types: [p.U] */
    public C1045u0(n.j0 j0Var, InterfaceC1013e interfaceC1013e, U u3, X x2, InterfaceC1047v0 interfaceC1047v0, r.l lVar, boolean z3, boolean z4) {
        super(C1015f.f9596l, z3, lVar, x2);
        C1018g0 c1018g0 = androidx.compose.foundation.gestures.a.f6606a;
        this.E = j0Var;
        this.F = u3;
        Q1.r rVar = new Q1.r(6);
        this.f9687G = rVar;
        C1014e0 c1014e0 = new C1014e0();
        c1014e0.f9587u = z3;
        K0(c1014e0);
        this.f9688H = c1014e0;
        C1031n c1031n = new C1031n(new C0850x(new B.F(androidx.compose.foundation.gestures.a.f6608c)));
        this.f9689I = c1031n;
        n.j0 j0Var2 = this.E;
        ?? r22 = this.F;
        C0 c02 = new C0(interfaceC1047v0, j0Var2, r22 == 0 ? c1031n : r22, x2, z4, rVar);
        this.f9690J = c02;
        C1028l0 c1028l0 = new C1028l0(c02, z3);
        this.f9691K = c1028l0;
        C1027l c1027l = new C1027l(x2, c02, z4, interfaceC1013e);
        K0(c1027l);
        this.f9692L = c1027l;
        K0(new m0.f(c1028l0, rVar));
        K0(new C0442s());
        w.i iVar = new w.i();
        iVar.f11429u = c1027l;
        K0(iVar);
        K0(new n.L(new C0919B(7, (Object) this)));
    }

    @Override // V.n
    public final void C0() {
        AbstractC1248f.s(this, new C0944e(3, this));
        this.f9693M = C1005a.f9553a;
    }

    @Override // a0.InterfaceC0436m
    public final void H(InterfaceC0433j interfaceC0433j) {
        interfaceC0433j.b(false);
    }

    @Override // p.M
    public final Object R0(K k3, InterfaceC1073d interfaceC1073d) {
        n.c0 c0Var = n.c0.f8754i;
        C0 c02 = this.f9690J;
        Object e3 = c02.e(c0Var, new C1030m0(c02, null, k3), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }

    @Override // p.M
    public final void S0(long j3) {
    }

    @Override // p.M
    public final void T0(long j3) {
        InterfaceC0328z interfaceC0328z = (InterfaceC0328z) ((y2.a) this.f9687G.f5323c).c();
        if (interfaceC0328z == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        J2.B.r(interfaceC0328z, null, 0, new C1032n0(this, j3, null), 3);
    }

    @Override // p.M
    public final boolean U0() {
        n.j0 j0Var;
        C0 c02 = this.f9690J;
        return c02.f9384a.d() || ((j0Var = c02.f9385b) != null && j0Var.e());
    }

    @Override // t0.m0
    public final void k(A0.k kVar) {
        if (this.f9470y && (this.f9694N == null || this.f9695O == null)) {
            this.f9694N = new C0018a(13, this);
            this.f9695O = new C1043t0(this, null);
        }
        C0018a c0018a = this.f9694N;
        if (c0018a != null) {
            F2.d[] dVarArr = A0.w.f123a;
            kVar.e(A0.j.f38d, new A0.a(null, c0018a));
        }
        C1043t0 c1043t0 = this.f9695O;
        if (c1043t0 != null) {
            F2.d[] dVarArr2 = A0.w.f123a;
            kVar.e(A0.j.f39e, c1043t0);
        }
    }

    @Override // l0.d
    public final boolean p(KeyEvent keyEvent) {
        return false;
    }

    @Override // t0.b0
    public final void s0() {
        AbstractC1248f.s(this, new C0944e(3, this));
    }

    @Override // l0.d
    public final boolean t(KeyEvent keyEvent) {
        long e3;
        if (!this.f9470y) {
            return false;
        }
        if ((!C0813a.a(l0.c.C(keyEvent), C0813a.f8274l) && !C0813a.a(K1.f.d(keyEvent.getKeyCode()), C0813a.f8273k)) || !C1.y.r(l0.c.D(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z3 = this.f9690J.f9387d == X.f9518h;
        C1027l c1027l = this.f9692L;
        if (z3) {
            int i2 = (int) (c1027l.f9628C & 4294967295L);
            e3 = K1.f.e(0.0f, C0813a.a(K1.f.d(keyEvent.getKeyCode()), C0813a.f8273k) ? i2 : -i2);
        } else {
            int i3 = (int) (c1027l.f9628C >> 32);
            e3 = K1.f.e(C0813a.a(K1.f.d(keyEvent.getKeyCode()), C0813a.f8273k) ? i3 : -i3, 0.0f);
        }
        J2.B.r(y0(), null, 0, new C1036p0(this, e3, null), 3);
        return true;
    }

    @Override // p.M, t0.k0
    public final void t0(C0930i c0930i, EnumC0931j enumC0931j, long j3) {
        long j4;
        List list = c0930i.f8943a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.f9469x.l((n0.r) list.get(i2))).booleanValue()) {
                super.t0(c0930i, enumC0931j, j3);
                break;
            }
            i2++;
        }
        if (enumC0931j == EnumC0931j.f8947i && AbstractC0937p.d(c0930i.f8945c, 6)) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!(!((n0.r) list.get(i3)).b())) {
                    return;
                }
            }
            z2.h.c(this.f9693M);
            O0.b bVar = AbstractC1248f.v(this).f10402x;
            b0.c cVar = new b0.c(0L);
            int size3 = list.size();
            int i4 = 0;
            while (true) {
                j4 = cVar.f7058a;
                if (i4 >= size3) {
                    break;
                }
                cVar = new b0.c(b0.c.h(j4, ((n0.r) list.get(i4)).f8966j));
                i4++;
            }
            J2.B.r(y0(), null, 0, new C1039r0(this, b0.c.i(-bVar.P(64), j4), null), 3);
            int size4 = list.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((n0.r) list.get(i5)).a();
            }
        }
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
