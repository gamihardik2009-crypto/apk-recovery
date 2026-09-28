package D;

import H.B1;
import H.C0108g1;
import H.C0203u2;
import H.InterfaceC0180q3;
import H.Z2;
import I0.C0244a;
import I0.C0249f;
import I0.C0250g;
import I0.C0251h;
import I0.InterfaceC0252i;
import J.C0263f;
import J.C0265g;
import J.C0274k0;
import J.C0294v;
import J.C0300y;
import J.C0303z0;
import J.EnumC0293u0;
import J.W0;
import J2.InterfaceC0310g;
import J2.InterfaceC0328z;
import a.AbstractC0423a;
import android.content.ClipDescription;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.InterfaceC0470t;
import c0.AbstractC0598q;
import c0.C0566F;
import c0.C0577Q;
import c0.C0597p;
import c0.C0603v;
import c0.InterfaceC0570J;
import e0.InterfaceC0654d;
import j.C0736B;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import l.C0804m;
import l.C0805n;
import l.C0811u;
import m.AbstractC0831e;
import m.C0839l;
import m.InterfaceC0817A;
import m.j0;
import m.k0;
import m.m0;
import m.n0;
import m.o0;
import m.p0;
import m.r0;
import m.x0;
import m.y0;
import m2.C0880v;
import n1.C0939B;
import n1.C0945f;
import n2.AbstractC0946A;
import o.C0983i;
import o.C0988n;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import s.AbstractC1166e;
import s.C1184x;
import t0.C1238G;
import u0.C1287h;
import u0.InterfaceC1288h0;

/* renamed from: D.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053w extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f904i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f905j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f906k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0053w(Object obj, int i2, Object obj2) {
        super(1);
        this.f904i = i2;
        this.f905j = obj;
        this.f906k = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.c
    public final Object l(Object obj) {
        InterfaceC1288h0 interfaceC1288h0;
        ClipDescription primaryClipDescription;
        String concat;
        C0472v e3;
        int i2 = 3;
        int i3 = 4;
        int i4 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i5 = 1;
        switch (this.f904i) {
            case 0:
                n0.r rVar = (n0.r) obj;
                if (((B.F) this.f905j).y(rVar.f8959c, (C0.E) this.f906k)) {
                    rVar.a();
                }
                return C0880v.f8657a;
            case 1:
                C0983i c0983i = (C0983i) obj;
                X x2 = (X) this.f905j;
                I0.I i6 = x2.f785f;
                boolean z3 = !C0.J.b(x2.l().f3933b);
                C0274k0 c0274k0 = x2.f790k;
                boolean z4 = z3 && ((Boolean) c0274k0.getValue()).booleanValue();
                C0108g1 c0108g1 = new C0108g1(i5, i5);
                C0988n c0988n = (C0988n) this.f906k;
                C0983i.b(c0983i, c0108g1, z4, new b0(c0988n, x2, objArr == true ? 1 : 0));
                C0983i.b(c0983i, new C0108g1(i4, i5), z3, new b0(c0988n, x2, i5));
                C0983i.b(c0983i, new C0108g1(i2, i5), ((Boolean) c0274k0.getValue()).booleanValue() && (interfaceC1288h0 = x2.f786g) != null && (primaryClipDescription = ((C1287h) interfaceC1288h0).f11055a.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*"), new b0(c0988n, x2, i4));
                C0983i.b(c0983i, new C0108g1(i3, i5), C0.J.c(x2.l().f3933b) != x2.l().f3932a.f500a.length(), new b0(c0988n, x2, i2));
                return C0880v.f8657a;
            case 2:
                A0.w.d((A0.k) obj, ((String) this.f905j) + ", " + ((String) this.f906k));
                return C0880v.f8657a;
            case 3:
                List list = (List) obj;
                Long l3 = (Long) list.get(0);
                Long l4 = (Long) list.get(1);
                Object obj2 = list.get(2);
                z2.h.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(3);
                z2.h.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                E2.d dVar = new E2.d(intValue, ((Integer) obj3).intValue(), 1);
                Object obj4 = list.get(4);
                z2.h.d(obj4, "null cannot be cast to non-null type kotlin.Int");
                return new B1(l3, l4, dVar, ((Integer) obj4).intValue(), (InterfaceC0180q3) this.f905j, (Locale) this.f906k);
            case 4:
                InterfaceC0654d interfaceC0654d = (InterfaceC0654d) obj;
                float P2 = interfaceC0654d.P(Z2.f2217c);
                W0 w02 = (W0) this.f905j;
                long j3 = ((C0603v) w02.getValue()).f7279a;
                float f3 = 2;
                float P3 = interfaceC0654d.P(I.v.f3805a / f3);
                float f4 = P2 / f3;
                interfaceC0654d.k0(j3, P3 - f4, (r19 & 4) != 0 ? interfaceC0654d.x() : 0L, 1.0f, (r19 & 16) != 0 ? e0.g.f7556a : new e0.h(P2, 0.0f, 0, 0, 30), null, 3);
                W0 w03 = (W0) this.f906k;
                if (Float.compare(((O0.e) w03.getValue()).f5138h, 0) > 0) {
                    interfaceC0654d.k0(((C0603v) w02.getValue()).f7279a, interfaceC0654d.P(((O0.e) w03.getValue()).f5138h) - f4, (r19 & 4) != 0 ? interfaceC0654d.x() : 0L, 1.0f, (r19 & 16) != 0 ? e0.g.f7556a : e0.g.f7556a, null, 3);
                }
                return C0880v.f8657a;
            case AbstractC1166e.f10138f /* 5 */:
                ((C0203u2) this.f905j).f3176a.setValue(new C1184x((s.Y) this.f906k, (s.Y) obj));
                return C0880v.f8657a;
            case AbstractC1166e.f10136d /* 6 */:
                AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
                List list2 = (List) this.f905j;
                AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) list2.get(0), 0, 0);
                AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) list2.get(1), 0, ((AbstractC1103Q) list2.get(0)).f9835i);
                int i7 = ((AbstractC1103Q) list2.get(0)).f9835i;
                AbstractC1103Q abstractC1103Q = (AbstractC1103Q) this.f906k;
                AbstractC1102P.d(abstractC1102P, abstractC1103Q, 0, i7 - (abstractC1103Q.f9835i / 2));
                return C0880v.f8657a;
            case 7:
                InterfaceC0252i interfaceC0252i = (InterfaceC0252i) obj;
                String str = ((InterfaceC0252i) this.f905j) == interfaceC0252i ? " > " : "   ";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                ((B.z) this.f906k).getClass();
                if (interfaceC0252i instanceof C0244a) {
                    StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    C0244a c0244a = (C0244a) interfaceC0252i;
                    sb2.append(c0244a.f3867a.f500a.length());
                    sb2.append(", newCursorPosition=");
                    concat = B1.t.j(sb2, c0244a.f3868b, ')');
                } else if (interfaceC0252i instanceof I0.w) {
                    StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                    I0.w wVar = (I0.w) interfaceC0252i;
                    sb3.append(wVar.f3926a.f500a.length());
                    sb3.append(", newCursorPosition=");
                    concat = B1.t.j(sb3, wVar.f3927b, ')');
                } else if (interfaceC0252i instanceof I0.v) {
                    concat = interfaceC0252i.toString();
                } else if (interfaceC0252i instanceof C0250g) {
                    concat = interfaceC0252i.toString();
                } else if (interfaceC0252i instanceof C0251h) {
                    concat = interfaceC0252i.toString();
                } else if (interfaceC0252i instanceof I0.x) {
                    concat = interfaceC0252i.toString();
                } else if (interfaceC0252i instanceof I0.k) {
                    ((I0.k) interfaceC0252i).getClass();
                    concat = "FinishComposingTextCommand()";
                } else if (interfaceC0252i instanceof C0249f) {
                    ((C0249f) interfaceC0252i).getClass();
                    concat = "DeleteAllCommand()";
                } else {
                    String b3 = z2.t.a(interfaceC0252i.getClass()).b();
                    if (b3 == null) {
                        b3 = "{anonymous EditCommand}";
                    }
                    concat = "Unknown EditCommand: ".concat(b3);
                }
                sb.append(concat);
                return sb.toString();
            case 8:
                C0265g c0265g = (C0265g) this.f905j;
                Object obj5 = c0265g.f4135i;
                C0263f c0263f = (C0263f) this.f906k;
                synchronized (obj5) {
                    c0265g.f4137k.remove(c0263f);
                    if (c0265g.f4137k.isEmpty()) {
                        c0265g.f4139m.set(0);
                    }
                }
                return C0880v.f8657a;
            case AbstractC1166e.f10135c /* 9 */:
                J.S s3 = (J.S) this.f905j;
                Object obj6 = s3.f4082b;
                InterfaceC0310g interfaceC0310g = (InterfaceC0310g) this.f906k;
                synchronized (obj6) {
                    ((List) s3.f4083c).remove(interfaceC0310g);
                }
                return C0880v.f8657a;
            case AbstractC1166e.f10137e /* 10 */:
                Throwable th = (Throwable) obj;
                C0303z0 c0303z0 = (C0303z0) this.f905j;
                Object obj7 = c0303z0.f4302b;
                Throwable th2 = (Throwable) this.f906k;
                synchronized (obj7) {
                    if (th2 != null) {
                        if (th != null) {
                            try {
                                r3 = th instanceof CancellationException ? null : th;
                                if (r3 != null) {
                                    B1.C.p(th2, r3);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        r3 = th2;
                    }
                    c0303z0.f4304d = r3;
                    c0303z0.f4317r.k(EnumC0293u0.f4248h);
                }
                return C0880v.f8657a;
            case 11:
                ((C0294v) this.f905j).A(obj);
                C0736B c0736b = (C0736B) this.f906k;
                if (c0736b != null) {
                    c0736b.a(obj);
                }
                return C0880v.f8657a;
            case 12:
                ((K2.d) this.f905j).f4607j.removeCallbacks((Runnable) this.f906k);
                return C0880v.f8657a;
            case 13:
                R0.x xVar = (R0.x) this.f905j;
                xVar.setPositionProvider((R0.A) this.f906k);
                xVar.l();
                return new R0.h();
            case 14:
                AbstractC1102P abstractC1102P2 = (AbstractC1102P) obj;
                float f5 = ((V.s) this.f906k).f5878u;
                abstractC1102P2.getClass();
                long m3 = AbstractC0423a.m(0, 0);
                AbstractC1103Q abstractC1103Q2 = (AbstractC1103Q) this.f905j;
                AbstractC1102P.a(abstractC1102P2, abstractC1103Q2);
                abstractC1103Q2.l0(O0.h.c(m3, abstractC1103Q2.f9838l), f5, null);
                return C0880v.f8657a;
            case AbstractC1166e.f10139g /* 15 */:
                AbstractC1102P.j((AbstractC1102P) obj, (AbstractC1103Q) this.f905j, 0, 0, ((C0597p) this.f906k).f7268u, 4);
                return C0880v.f8657a;
            case 16:
                AbstractC1102P.j((AbstractC1102P) obj, (AbstractC1103Q) this.f905j, 0, 0, ((C0577Q) this.f906k).f7231K, 4);
                return C0880v.f8657a;
            case 17:
                AbstractC1102P abstractC1102P3 = (AbstractC1102P) obj;
                float g3 = ((C0811u) this.f906k).f8244c.g();
                abstractC1102P3.getClass();
                long m4 = AbstractC0423a.m(0, 0);
                AbstractC1103Q abstractC1103Q3 = (AbstractC1103Q) this.f905j;
                AbstractC1102P.a(abstractC1102P3, abstractC1103Q3);
                abstractC1103Q3.l0(O0.h.c(m4, abstractC1103Q3.f9838l), g3, null);
                return C0880v.f8657a;
            case 18:
                k0 k0Var = (k0) obj;
                C0805n c0805n = (C0805n) this.f905j;
                W0 w04 = (W0) c0805n.f8228d.e(k0Var.b());
                long j4 = w04 != null ? ((O0.j) w04.getValue()).f5147a : 0L;
                W0 w05 = (W0) c0805n.f8228d.e(k0Var.c());
                long j5 = w05 != null ? ((O0.j) w05.getValue()).f5147a : 0L;
                l.S s4 = (l.S) ((C0804m) this.f906k).f8223c.getValue();
                if (s4 != null) {
                    InterfaceC0817A interfaceC0817A = (InterfaceC0817A) s4.f8163b.j(new O0.j(j4), new O0.j(j5));
                    if (interfaceC0817A != null) {
                        return interfaceC0817A;
                    }
                }
                return AbstractC0831e.m(0.0f, null, 7);
            case 19:
                C0839l c0839l = (C0839l) obj;
                ((y2.e) this.f905j).j(c0839l.f8512e.getValue(), ((x0) this.f906k).f8601b.l(c0839l.f8513f));
                return C0880v.f8657a;
            case 20:
                J2.B.r((InterfaceC0328z) this.f905j, null, 4, new n0((p0) this.f906k, null), 1);
                return new o0(0);
            case 21:
                p0 p0Var = (p0) this.f905j;
                T.r rVar2 = p0Var.f8556j;
                p0 p0Var2 = (p0) this.f906k;
                rVar2.add(p0Var2);
                return new r0(p0Var, objArr2 == true ? 1 : 0, p0Var2);
            case 22:
                return new r0((p0) this.f905j, i5, (j0) this.f906k);
            case 23:
                p0 p0Var3 = (p0) this.f905j;
                T.r rVar3 = p0Var3.f8555i;
                m0 m0Var = (m0) this.f906k;
                rVar3.add(m0Var);
                return new r0(p0Var3, i4, m0Var);
            case 24:
                C1238G c1238g = (C1238G) obj;
                c1238g.a();
                InterfaceC0654d.U(c1238g, ((C0566F) this.f905j).f7189a, (AbstractC0598q) this.f906k, 0.0f, null, 60);
                return C0880v.f8657a;
            case 25:
                C1238G c1238g2 = (C1238G) obj;
                c1238g2.a();
                InterfaceC0654d.U(c1238g2, (InterfaceC0570J) this.f905j, (AbstractC0598q) this.f906k, 0.0f, null, 60);
                return C0880v.f8657a;
            case 26:
                ((r.l) this.f905j).c((r.j) this.f906k);
                return C0880v.f8657a;
            case 27:
                C0939B c0939b = (C0939B) obj;
                z2.h.f(c0939b, "$this$navOptions");
                n1.z zVar = c0939b.f9007a;
                zVar.f9147g = 0;
                zVar.f9148h = 0;
                zVar.f9149i = -1;
                zVar.f9150j = -1;
                n1.s sVar = (n1.s) this.f905j;
                if (sVar instanceof n1.v) {
                    int i8 = n1.s.f9086p;
                    Iterator it = l0.c.B(sVar).iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        n1.y yVar = (n1.y) this.f906k;
                        if (hasNext) {
                            n1.s sVar2 = (n1.s) it.next();
                            C0945f c0945f = (C0945f) yVar.f9122g.j();
                            n1.s sVar3 = c0945f != null ? c0945f.f9028i : null;
                            if (z2.h.a(sVar2, sVar3 != null ? sVar3.f9088i : null)) {
                            }
                        } else {
                            int i9 = n1.v.f9104u;
                            c0939b.f9010d = AbstractC0946A.j(yVar.g()).f9093n;
                            C0300y c0300y = new C0300y();
                            c0300y.f4287a = true;
                            c0939b.f9011e = c0300y.f4287a;
                        }
                    }
                }
                return C0880v.f8657a;
            case 28:
                n1.y yVar2 = (n1.y) this.f905j;
                yVar2.getClass();
                InterfaceC0470t interfaceC0470t = (InterfaceC0470t) this.f906k;
                z2.h.f(interfaceC0470t, "owner");
                if (!z2.h.a(interfaceC0470t, yVar2.f9130o)) {
                    InterfaceC0470t interfaceC0470t2 = yVar2.f9130o;
                    n1.h hVar = yVar2.f9133s;
                    if (interfaceC0470t2 != null && (e3 = interfaceC0470t2.e()) != null) {
                        e3.f(hVar);
                    }
                    yVar2.f9130o = interfaceC0470t;
                    interfaceC0470t.e().a(hVar);
                }
                return new o0(1);
            default:
                return new r0((W0) this.f905j, i3, (o1.i) this.f906k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053w(y2.e eVar) {
        super(1);
        this.f904i = 19;
        x0 x0Var = y0.f8602a;
        this.f905j = eVar;
        this.f906k = x0Var;
    }
}
