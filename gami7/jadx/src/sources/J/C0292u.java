package J;

import android.os.Trace;
import j.C0735A;
import j.C0736B;
import j.C0760p;
import j.C0766v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n2.AbstractC0946A;
import n2.AbstractC0963o;
import t0.AbstractC1248f;
import t0.C1236E;
import t0.C1245c;
import t0.C1261t;
import t0.C1267z;
import t0.InterfaceC1264w;

/* renamed from: J.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4239a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4240b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4241c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4242d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4243e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4244f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4245g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4246h;

    /* renamed from: i, reason: collision with root package name */
    public Object f4247i;

    public C0292u(C1236E c1236e) {
        this.f4239a = 1;
        this.f4240b = c1236e;
        C1261t c1261t = new C1261t(c1236e);
        this.f4241c = c1261t;
        this.f4242d = c1261t;
        t0.n0 n0Var = c1261t.f10626S;
        this.f4243e = n0Var;
        this.f4244f = n0Var;
    }

    public static final void a(C0292u c0292u, V.n nVar, t0.Z z3) {
        c0292u.getClass();
        for (V.n nVar2 = nVar.f5862l; nVar2 != null; nVar2 = nVar2.f5862l) {
            if (nVar2 == t0.W.f10514a) {
                C1236E s3 = ((C1236E) c0292u.f4240b).s();
                z3.f10549v = s3 != null ? (C1261t) s3.f10378C.f4241c : null;
                c0292u.f4242d = z3;
                return;
            } else {
                if ((nVar2.f5860j & 2) != 0) {
                    return;
                }
                nVar2.J0(z3);
            }
        }
    }

    public static V.n b(V.m mVar, V.n nVar) {
        V.n nVar2;
        if (mVar instanceof t0.S) {
            nVar2 = ((t0.S) mVar).l();
            nVar2.f5860j = t0.a0.g(nVar2);
        } else {
            C1245c c1245c = new C1245c();
            c1245c.f5860j = t0.a0.e(mVar);
            c1245c.f10557u = mVar;
            c1245c.f10559w = new HashSet();
            nVar2 = c1245c;
        }
        if (!(!nVar2.f5869t)) {
            AbstractC0946A.r("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        nVar2.f5866p = true;
        V.n nVar3 = nVar.f5863m;
        if (nVar3 != null) {
            nVar3.f5862l = nVar2;
            nVar2.f5863m = nVar3;
        }
        nVar.f5863m = nVar2;
        nVar2.f5862l = nVar;
        return nVar2;
    }

    public static V.n c(V.n nVar) {
        boolean z3 = nVar.f5869t;
        if (z3) {
            C0766v c0766v = t0.a0.f10554a;
            if (!z3) {
                AbstractC0946A.r("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            t0.a0.b(nVar, -1, 2);
            nVar.H0();
            nVar.B0();
        }
        V.n nVar2 = nVar.f5863m;
        V.n nVar3 = nVar.f5862l;
        if (nVar2 != null) {
            nVar2.f5862l = nVar3;
            nVar.f5863m = null;
        }
        if (nVar3 != null) {
            nVar3.f5863m = nVar2;
            nVar.f5862l = null;
        }
        z2.h.c(nVar3);
        return nVar3;
    }

    public static void l(V.m mVar, V.m mVar2, V.n nVar) {
        if ((mVar instanceof t0.S) && (mVar2 instanceof t0.S)) {
            t0.V v3 = t0.W.f10514a;
            z2.h.d(nVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((t0.S) mVar2).m(nVar);
            if (nVar.f5869t) {
                t0.a0.d(nVar);
                return;
            } else {
                nVar.q = true;
                return;
            }
        }
        if (!(nVar instanceof C1245c)) {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
        C1245c c1245c = (C1245c) nVar;
        if (c1245c.f5869t) {
            c1245c.L0();
        }
        c1245c.f10557u = mVar2;
        c1245c.f5860j = t0.a0.e(mVar2);
        if (c1245c.f5869t) {
            c1245c.K0(false);
        }
        if (nVar.f5869t) {
            t0.a0.d(nVar);
        } else {
            nVar.q = true;
        }
    }

    public void d() {
        Set set = (Set) this.f4240b;
        if (!set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    A0 a02 = (A0) it.next();
                    it.remove();
                    a02.c();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public void e() {
        g(Integer.MIN_VALUE);
        ArrayList arrayList = (ArrayList) this.f4242d;
        boolean z3 = !arrayList.isEmpty();
        Set set = (Set) this.f4240b;
        if (z3) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C0736B c0736b = (C0736B) this.f4245g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(size);
                    if (obj instanceof A0) {
                        set.remove(obj);
                        ((A0) obj).a();
                    }
                    if (obj instanceof InterfaceC0271j) {
                        if (c0736b == null || !c0736b.c(obj)) {
                            ((InterfaceC0271j) obj).a();
                        } else {
                            ((InterfaceC0271j) obj).c();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f4241c;
        if (!arrayList2.isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    A0 a02 = (A0) arrayList2.get(i2);
                    set.remove(a02);
                    a02.b();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public boolean f(int i2) {
        return (i2 & ((V.n) this.f4244f).f5861k) != 0;
    }

    public void g(int i2) {
        ArrayList arrayList = (ArrayList) this.f4244f;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            ArrayList arrayList2 = null;
            int i4 = 0;
            C0760p c0760p = null;
            C0760p c0760p2 = null;
            while (true) {
                C0760p c0760p3 = (C0760p) this.f4247i;
                if (i4 >= c0760p3.f8022b) {
                    break;
                }
                if (i2 <= c0760p3.c(i4)) {
                    Object remove = arrayList.remove(i4);
                    int e3 = c0760p3.e(i4);
                    int e4 = ((C0760p) this.f4246h).e(i4);
                    if (arrayList2 == null) {
                        arrayList2 = AbstractC0963o.w(remove);
                        c0760p2 = new C0760p();
                        c0760p2.a(e3);
                        c0760p = new C0760p();
                        c0760p.a(e4);
                    } else {
                        z2.h.d(c0760p, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        z2.h.d(c0760p2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        arrayList2.add(remove);
                        c0760p2.a(e3);
                        c0760p.a(e4);
                    }
                } else {
                    i4++;
                }
            }
            if (arrayList2 != null) {
                z2.h.d(c0760p, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                z2.h.d(c0760p2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = arrayList2.size() - 1;
                while (i3 < size) {
                    int i5 = i3 + 1;
                    int size2 = arrayList2.size();
                    for (int i6 = i5; i6 < size2; i6++) {
                        int c3 = c0760p2.c(i3);
                        int c4 = c0760p2.c(i6);
                        if (c3 < c4 || (c4 == c3 && c0760p.c(i3) < c0760p.c(i6))) {
                            Object obj = arrayList2.get(i3);
                            arrayList2.set(i3, arrayList2.get(i6));
                            arrayList2.set(i6, obj);
                            int c5 = c0760p.c(i3);
                            c0760p.f(i3, c0760p.c(i6));
                            c0760p.f(i6, c5);
                            int c6 = c0760p2.c(i3);
                            c0760p2.f(i3, c0760p2.c(i6));
                            c0760p2.f(i6, c6);
                        }
                    }
                    i3 = i5;
                }
                ((ArrayList) this.f4242d).addAll(arrayList2);
            }
        }
    }

    public void h(Object obj, int i2, int i3, int i4) {
        g(i2);
        if (i4 < 0 || i4 >= i2) {
            ((ArrayList) this.f4242d).add(obj);
            return;
        }
        ((ArrayList) this.f4244f).add(obj);
        ((C0760p) this.f4246h).a(i3);
        ((C0760p) this.f4247i).a(i4);
    }

    public void i() {
        for (V.n nVar = (V.n) this.f4244f; nVar != null; nVar = nVar.f5863m) {
            nVar.G0();
            if (nVar.f5866p) {
                t0.a0.a(nVar);
            }
            if (nVar.q) {
                t0.a0.d(nVar);
            }
            nVar.f5866p = false;
            nVar.q = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:J.u A[IMMUTABLE_TYPE, THIS]) J.u.i java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void j(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:J.u A[IMMUTABLE_TYPE, THIS]) J.u.i java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public void k() {
        C1236E c1236e;
        C1267z c1267z;
        V.n nVar = ((t0.n0) this.f4243e).f5862l;
        t0.Z z3 = (C1261t) this.f4241c;
        V.n nVar2 = nVar;
        while (true) {
            c1236e = (C1236E) this.f4240b;
            if (nVar2 == null) {
                break;
            }
            InterfaceC1264w g3 = AbstractC1248f.g(nVar2);
            if (g3 != null) {
                t0.Z z4 = nVar2.f5865o;
                if (z4 != null) {
                    C1267z c1267z2 = (C1267z) z4;
                    InterfaceC1264w interfaceC1264w = c1267z2.f10639S;
                    c1267z2.s1(g3);
                    c1267z = c1267z2;
                    if (interfaceC1264w != nVar2) {
                        t0.e0 e0Var = c1267z2.f10544L;
                        c1267z = c1267z2;
                        if (e0Var != null) {
                            e0Var.invalidate();
                            c1267z = c1267z2;
                        }
                    }
                } else {
                    C1267z c1267z3 = new C1267z(c1236e, g3);
                    nVar2.J0(c1267z3);
                    c1267z = c1267z3;
                }
                z3.f10549v = c1267z;
                c1267z.f10548u = z3;
                z3 = c1267z;
            } else {
                nVar2.J0(z3);
            }
            nVar2 = nVar2.f5862l;
        }
        C1236E s3 = c1236e.s();
        z3.f10549v = s3 != null ? (C1261t) s3.f10378C.f4241c : null;
        this.f4242d = z3;
    }

    public String toString() {
        switch (this.f4239a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                V.n nVar = (V.n) this.f4244f;
                t0.n0 n0Var = (t0.n0) this.f4243e;
                if (nVar == n0Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (nVar != null && nVar != n0Var) {
                            sb.append(String.valueOf(nVar));
                            if (nVar.f5863m == n0Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                nVar = nVar.f5863m;
                            }
                        }
                    }
                }
                String sb2 = sb.toString();
                z2.h.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0292u(C0735A c0735a) {
        this.f4239a = 0;
        this.f4240b = c0735a;
        this.f4241c = new ArrayList();
        this.f4242d = new ArrayList();
        this.f4243e = new ArrayList();
        this.f4244f = new ArrayList();
        this.f4246h = new C0760p();
        this.f4247i = new C0760p();
    }
}
