package K1;

import B.F;
import B.z;
import B1.C;
import J.AbstractC0253a;
import J.W0;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import c0.InterfaceC0600s;
import e0.C0652b;
import f0.C0663b;
import j.AbstractC0739E;
import j.AbstractC0756l;
import j.C0757m;
import j.C0763s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import k.AbstractC0779a;
import k1.C0784b;
import m1.C0858d;
import n0.C0928g;
import n0.C0929h;
import n2.AbstractC0960l;
import r0.InterfaceC1129r;
import t0.C1261t;
import w1.C1387i;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4558a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4559b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4560c;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3) {
        this.f4558a = obj;
        this.f4559b = obj2;
        this.f4560c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r23, t0.r r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.m.a(long, t0.r, boolean):void");
    }

    public void b(String str) {
        r1.r rVar = (r1.r) this.f4558a;
        rVar.b();
        h hVar = (h) this.f4559b;
        C1387i a3 = hVar.a();
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        rVar.c();
        try {
            a3.b();
            rVar.o();
        } finally {
            rVar.j();
            hVar.c(a3);
        }
    }

    public boolean c(z zVar, boolean z3) {
        boolean z4;
        boolean z5;
        C0929h c0929h = (C0929h) this.f4559b;
        if (!c0929h.a((C0757m) zVar.f239c, (InterfaceC1129r) this.f4558a, zVar, z3)) {
            return false;
        }
        L.d dVar = c0929h.f8942a;
        int i2 = dVar.f4620j;
        if (i2 > 0) {
            Object[] objArr = dVar.f4618h;
            int i3 = 0;
            z4 = false;
            do {
                z4 = ((C0928g) objArr[i3]).h(zVar, z3) || z4;
                i3++;
            } while (i3 < i2);
        } else {
            z4 = false;
        }
        int i4 = dVar.f4620j;
        if (i4 > 0) {
            Object[] objArr2 = dVar.f4618h;
            int i5 = 0;
            z5 = false;
            do {
                z5 = ((C0928g) objArr2[i5]).g(zVar) || z5;
                i5++;
            } while (i5 < i4);
        } else {
            z5 = false;
        }
        c0929h.c(zVar);
        return z5 || z4;
    }

    public Object d() {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0253a.f4115a) {
            return this.f4560c;
        }
        R.f fVar = (R.f) ((AtomicReference) this.f4558a).get();
        int a3 = fVar.a(id);
        if (a3 >= 0) {
            return fVar.f5379c[a3];
        }
        return null;
    }

    public InterfaceC0600s e() {
        return ((C0652b) this.f4560c).f7551h.f7549c;
    }

    public O0.b f() {
        return ((C0652b) this.f4560c).f7551h.f7547a;
    }

    public C0663b g() {
        return (C0663b) this.f4559b;
    }

    public O0.k h() {
        return ((C0652b) this.f4560c).f7551h.f7548b;
    }

    public E2.d i() {
        Matcher matcher = (Matcher) this.f4558a;
        return C.m0(matcher.start(), matcher.end());
    }

    public long j() {
        return ((C0652b) this.f4560c).f7551h.f7550d;
    }

    public X k(z2.d dVar, String str) {
        X a3;
        z2.h.f(str, "key");
        b0 b0Var = (b0) this.f4558a;
        b0Var.getClass();
        LinkedHashMap linkedHashMap = b0Var.f6882a;
        X x2 = (X) linkedHashMap.get(str);
        boolean c3 = dVar.c(x2);
        Z z3 = (Z) this.f4559b;
        if (c3) {
            if (z3 instanceof U) {
                z2.h.c(x2);
                ((U) z3).e(x2);
            }
            z2.h.d(x2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return x2;
        }
        C0784b c0784b = new C0784b((G.s) this.f4560c);
        ((LinkedHashMap) c0784b.f1200h).put(C0858d.f8640a, str);
        z2.h.f(z3, "factory");
        try {
            try {
                a3 = z3.c(dVar, c0784b);
            } catch (AbstractMethodError unused) {
                a3 = z3.b(AbstractC0960l.i(dVar), c0784b);
            }
        } catch (AbstractMethodError unused2) {
            a3 = z3.a(AbstractC0960l.i(dVar));
        }
        z2.h.f(a3, "viewModel");
        X x3 = (X) linkedHashMap.put(str, a3);
        if (x3 != null) {
            x3.b();
        }
        return a3;
    }

    public boolean l() {
        m mVar;
        return ((W0) this.f4558a).getValue() != this.f4560c || ((mVar = (m) this.f4559b) != null && mVar.l());
    }

    public void m(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0253a.f4115a) {
            this.f4560c = obj;
            return;
        }
        synchronized (this.f4559b) {
            R.f fVar = (R.f) ((AtomicReference) this.f4558a).get();
            int a3 = fVar.a(id);
            if (a3 < 0) {
                ((AtomicReference) this.f4558a).set(fVar.b(id, obj));
            } else {
                fVar.f5379c[a3] = obj;
            }
        }
    }

    public void n(InterfaceC0600s interfaceC0600s) {
        ((C0652b) this.f4560c).f7551h.f7549c = interfaceC0600s;
    }

    public void o(O0.b bVar) {
        ((C0652b) this.f4560c).f7551h.f7547a = bVar;
    }

    public void p(C0663b c0663b) {
        this.f4559b = c0663b;
    }

    public void q(O0.k kVar) {
        ((C0652b) this.f4560c).f7551h.f7548b = kVar;
    }

    public void r(long j3) {
        ((C0652b) this.f4560c).f7551h.f7550d = j3;
    }

    public void s() {
        S.k kVar = (S.k) this.f4558a;
        LinkedHashMap linkedHashMap = kVar.f5570c;
        String str = (String) this.f4559b;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((y2.a) this.f4560c);
        }
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        kVar.f5570c.put(str, list);
    }

    public m(r1.r rVar) {
        this.f4558a = rVar;
        new b(rVar, 4);
        this.f4559b = new h(rVar, 2);
        this.f4560c = new h(rVar, 3);
    }

    public m(b0 b0Var, Z z3, G.s sVar) {
        z2.h.f(b0Var, "store");
        z2.h.f(z3, "factory");
        z2.h.f(sVar, "extras");
        this.f4558a = b0Var;
        this.f4559b = z3;
        this.f4560c = sVar;
    }

    public m(C1261t c1261t) {
        this.f4558a = c1261t;
        this.f4559b = new C0929h(0);
        C0763s c0763s = new C0763s();
        c0763s.f8034a = AbstractC0739E.f7971a;
        c0763s.f8035b = AbstractC0756l.f8007a;
        c0763s.f8036c = AbstractC0779a.f8103c;
        c0763s.d(AbstractC0739E.d(10));
        this.f4560c = c0763s;
    }

    public m() {
        this.f4558a = new AtomicReference(R.b.f5373b);
        this.f4559b = new Object();
    }

    public m(C0652b c0652b) {
        this.f4560c = c0652b;
        this.f4558a = new F(18, this);
    }

    public m(H0.s sVar, m mVar) {
        this.f4558a = sVar;
        this.f4559b = mVar;
        this.f4560c = sVar.f3415h;
    }

    public m(Matcher matcher, CharSequence charSequence) {
        z2.h.f(charSequence, "input");
        this.f4558a = matcher;
        this.f4559b = charSequence;
        this.f4560c = new H2.d(0, this);
    }
}
