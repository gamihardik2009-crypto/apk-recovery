package n1;

import B.C0000a;
import M2.J;
import M2.K;
import M2.O;
import M2.P;
import M2.d0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC0466o;
import androidx.lifecycle.InterfaceC0470t;
import androidx.lifecycle.b0;
import b.C0500x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n2.AbstractC0961m;
import n2.AbstractC0963o;
import n2.AbstractC0968t;
import n2.C0958j;
import n2.C0970v;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: A, reason: collision with root package name */
    public int f9112A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f9113B;

    /* renamed from: C, reason: collision with root package name */
    public final O f9114C;

    /* renamed from: D, reason: collision with root package name */
    public final J f9115D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9116a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f9117b;

    /* renamed from: c, reason: collision with root package name */
    public v f9118c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f9119d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f9120e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9121f;

    /* renamed from: g, reason: collision with root package name */
    public final C0958j f9122g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f9123h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f9124i;

    /* renamed from: j, reason: collision with root package name */
    public final K f9125j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f9126k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f9127l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f9128m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f9129n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0470t f9130o;

    /* renamed from: p, reason: collision with root package name */
    public m f9131p;
    public final CopyOnWriteArrayList q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0466o f9132r;

    /* renamed from: s, reason: collision with root package name */
    public final h f9133s;

    /* renamed from: t, reason: collision with root package name */
    public final C0500x f9134t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9135u;

    /* renamed from: v, reason: collision with root package name */
    public final F f9136v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f9137w;

    /* renamed from: x, reason: collision with root package name */
    public y2.c f9138x;

    /* renamed from: y, reason: collision with root package name */
    public y2.c f9139y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f9140z;

    public y(Context context) {
        Object obj;
        z2.h.f(context, "context");
        this.f9116a = context;
        Iterator it = G2.i.i0(context, C0941b.f9017k).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f9117b = (Activity) obj;
        this.f9122g = new C0958j();
        C0970v c0970v = C0970v.f9165h;
        this.f9123h = P.b(c0970v);
        d0 b3 = P.b(c0970v);
        this.f9124i = b3;
        this.f9125j = new K(b3);
        this.f9126k = new LinkedHashMap();
        this.f9127l = new LinkedHashMap();
        this.f9128m = new LinkedHashMap();
        this.f9129n = new LinkedHashMap();
        this.q = new CopyOnWriteArrayList();
        this.f9132r = EnumC0466o.f6899i;
        this.f9133s = new h(0, this);
        this.f9134t = new C0500x(this);
        this.f9135u = true;
        F f3 = new F();
        this.f9136v = f3;
        this.f9137w = new LinkedHashMap();
        this.f9140z = new LinkedHashMap();
        f3.a(new x(f3));
        f3.a(new C0942c(this.f9116a));
        this.f9113B = new ArrayList();
        O a3 = P.a(1, 0, 2, 2);
        this.f9114C = a3;
        this.f9115D = new J(a3);
    }

    public static s e(int i2, s sVar, boolean z3) {
        v vVar;
        if (sVar.f9093n == i2) {
            return sVar;
        }
        if (sVar instanceof v) {
            vVar = (v) sVar;
        } else {
            v vVar2 = sVar.f9088i;
            z2.h.c(vVar2);
            vVar = vVar2;
        }
        return vVar.h(i2, vVar, z3);
    }

    public static void l(y yVar, String str, C0938A c0938a, int i2) {
        if ((i2 & 2) != 0) {
            c0938a = null;
        }
        yVar.getClass();
        z2.h.f(str, "route");
        int i3 = s.f9086p;
        Uri parse = Uri.parse(l0.c.v(str));
        z2.h.b(parse);
        Q1.r rVar = new Q1.r(parse, (Object) null, (Object) null, 7);
        if (yVar.f9118c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + rVar + ". Navigation graph has not been set for NavController " + yVar + '.').toString());
        }
        v i4 = yVar.i(yVar.f9122g);
        r i5 = i4.i(rVar, true, true, i4);
        if (i5 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + rVar + " cannot be found in the navigation graph " + yVar.f9118c);
        }
        Bundle bundle = i5.f9082i;
        s sVar = i5.f9081h;
        Bundle b3 = sVar.b(bundle);
        if (b3 == null) {
            b3 = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        b3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        yVar.k(sVar, b3, c0938a);
    }

    public static /* synthetic */ void q(y yVar, C0945f c0945f) {
        yVar.p(c0945f, false, new C0958j());
    }

    public final void a(s sVar, Bundle bundle, C0945f c0945f, List list) {
        Object obj;
        Object obj2;
        s sVar2 = c0945f.f9028i;
        boolean z3 = sVar2 instanceof InterfaceC0943d;
        C0958j c0958j = this.f9122g;
        if (!z3) {
            while (!c0958j.isEmpty() && (((C0945f) c0958j.last()).f9028i instanceof InterfaceC0943d) && n(((C0945f) c0958j.last()).f9028i.f9093n, true, false)) {
            }
        }
        C0958j c0958j2 = new C0958j();
        boolean z4 = sVar instanceof v;
        Context context = this.f9116a;
        Object obj3 = null;
        if (z4) {
            s sVar3 = sVar2;
            do {
                z2.h.c(sVar3);
                sVar3 = sVar3.f9088i;
                if (sVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (z2.h.a(((C0945f) obj2).f9028i, sVar3)) {
                                break;
                            }
                        }
                    }
                    C0945f c0945f2 = (C0945f) obj2;
                    if (c0945f2 == null) {
                        c0945f2 = C1.b.b(context, sVar3, bundle, h(), this.f9131p);
                    }
                    c0958j2.e(c0945f2);
                    if ((!c0958j.isEmpty()) && ((C0945f) c0958j.last()).f9028i == sVar3) {
                        q(this, (C0945f) c0958j.last());
                    }
                }
                if (sVar3 == null) {
                    break;
                }
            } while (sVar3 != sVar);
        }
        s sVar4 = c0958j2.isEmpty() ? sVar2 : ((C0945f) c0958j2.first()).f9028i;
        while (sVar4 != null && d(sVar4.f9093n) != sVar4) {
            sVar4 = sVar4.f9088i;
            if (sVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (z2.h.a(((C0945f) obj).f9028i, sVar4)) {
                            break;
                        }
                    }
                }
                C0945f c0945f3 = (C0945f) obj;
                if (c0945f3 == null) {
                    c0945f3 = C1.b.b(context, sVar4, sVar4.b(bundle2), h(), this.f9131p);
                }
                c0958j2.e(c0945f3);
            }
        }
        if (!c0958j2.isEmpty()) {
            sVar2 = ((C0945f) c0958j2.first()).f9028i;
        }
        while (!c0958j.isEmpty() && (((C0945f) c0958j.last()).f9028i instanceof v)) {
            s sVar5 = ((C0945f) c0958j.last()).f9028i;
            z2.h.d(sVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((v) sVar5).q.c(sVar2.f9093n) != null) {
                break;
            } else {
                q(this, (C0945f) c0958j.last());
            }
        }
        C0945f c0945f4 = (C0945f) (c0958j.isEmpty() ? null : c0958j.f9162i[c0958j.f9161h]);
        if (c0945f4 == null) {
            c0945f4 = (C0945f) (c0958j2.isEmpty() ? null : c0958j2.f9162i[c0958j2.f9161h]);
        }
        if (!z2.h.a(c0945f4 != null ? c0945f4.f9028i : null, this.f9118c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                s sVar6 = ((C0945f) previous).f9028i;
                v vVar = this.f9118c;
                z2.h.c(vVar);
                if (z2.h.a(sVar6, vVar)) {
                    obj3 = previous;
                    break;
                }
            }
            C0945f c0945f5 = (C0945f) obj3;
            if (c0945f5 == null) {
                v vVar2 = this.f9118c;
                z2.h.c(vVar2);
                v vVar3 = this.f9118c;
                z2.h.c(vVar3);
                c0945f5 = C1.b.b(context, vVar2, vVar3.b(bundle), h(), this.f9131p);
            }
            c0958j2.e(c0945f5);
        }
        Iterator it = c0958j2.iterator();
        while (it.hasNext()) {
            C0945f c0945f6 = (C0945f) it.next();
            Object obj4 = this.f9137w.get(this.f9136v.b(c0945f6.f9028i.f9087h));
            if (obj4 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + sVar.f9087h + " should already be created").toString());
            }
            ((i) obj4).a(c0945f6);
        }
        c0958j.addAll(c0958j2);
        c0958j.f(c0945f);
        Iterator it2 = AbstractC0961m.Q(c0958j2, c0945f).iterator();
        while (it2.hasNext()) {
            C0945f c0945f7 = (C0945f) it2.next();
            v vVar4 = c0945f7.f9028i.f9088i;
            if (vVar4 != null) {
                j(c0945f7, f(vVar4.f9093n));
            }
        }
    }

    public final boolean b() {
        C0958j c0958j;
        while (true) {
            c0958j = this.f9122g;
            if (c0958j.isEmpty() || !(((C0945f) c0958j.last()).f9028i instanceof v)) {
                break;
            }
            q(this, (C0945f) c0958j.last());
        }
        C0945f c0945f = (C0945f) c0958j.j();
        ArrayList arrayList = this.f9113B;
        if (c0945f != null) {
            arrayList.add(c0945f);
        }
        this.f9112A++;
        u();
        int i2 = this.f9112A - 1;
        this.f9112A = i2;
        if (i2 == 0) {
            ArrayList Y2 = AbstractC0961m.Y(arrayList);
            arrayList.clear();
            Iterator it = Y2.iterator();
            while (it.hasNext()) {
                C0945f c0945f2 = (C0945f) it.next();
                Iterator it2 = this.q.iterator();
                if (it2.hasNext()) {
                    B1.t.w(it2.next());
                    s sVar = c0945f2.f9028i;
                    c0945f2.g();
                    throw null;
                }
                this.f9114C.d(c0945f2);
            }
            this.f9123h.k(AbstractC0961m.Y(c0958j));
            this.f9124i.k(r());
        }
        return c0945f != null;
    }

    public final boolean c(ArrayList arrayList, s sVar, boolean z3, boolean z4) {
        String str;
        z2.o oVar = new z2.o();
        C0958j c0958j = new C0958j();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D d3 = (D) it.next();
            z2.o oVar2 = new z2.o();
            C0945f c0945f = (C0945f) this.f9122g.last();
            this.f9139y = new j(oVar2, oVar, this, z4, c0958j);
            d3.e(c0945f, z4);
            this.f9139y = null;
            if (!oVar2.f11905h) {
                break;
            }
        }
        if (z4) {
            LinkedHashMap linkedHashMap = this.f9128m;
            if (!z3) {
                G2.c cVar = new G2.c(new G2.d(G2.i.i0(sVar, C0941b.f9018l), new k(this, 0), 1), (byte) 0);
                while (cVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((s) cVar.next()).f9093n);
                    g gVar = (g) (c0958j.isEmpty() ? null : c0958j.f9162i[c0958j.f9161h]);
                    linkedHashMap.put(valueOf, gVar != null ? gVar.f9038h : null);
                }
            }
            if (!c0958j.isEmpty()) {
                g gVar2 = (g) c0958j.first();
                G2.c cVar2 = new G2.c(new G2.d(G2.i.i0(d(gVar2.f9039i), C0941b.f9019m), new k(this, 1), 1), (byte) 0);
                while (true) {
                    boolean hasNext = cVar2.hasNext();
                    str = gVar2.f9038h;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((s) cVar2.next()).f9093n), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.f9129n.put(str, c0958j);
                }
            }
        }
        v();
        return oVar.f11905h;
    }

    public final s d(int i2) {
        s sVar;
        v vVar = this.f9118c;
        if (vVar == null) {
            return null;
        }
        if (vVar.f9093n == i2) {
            return vVar;
        }
        C0945f c0945f = (C0945f) this.f9122g.j();
        if (c0945f == null || (sVar = c0945f.f9028i) == null) {
            sVar = this.f9118c;
            z2.h.c(sVar);
        }
        return e(i2, sVar, false);
    }

    public final C0945f f(int i2) {
        Object obj;
        C0958j c0958j = this.f9122g;
        ListIterator listIterator = c0958j.listIterator(c0958j.a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C0945f) obj).f9028i.f9093n == i2) {
                break;
            }
        }
        C0945f c0945f = (C0945f) obj;
        if (c0945f != null) {
            return c0945f;
        }
        StringBuilder l3 = B1.t.l("No destination with ID ", i2, " is on the NavController's back stack. The current destination is ");
        C0945f c0945f2 = (C0945f) c0958j.j();
        l3.append(c0945f2 != null ? c0945f2.f9028i : null);
        throw new IllegalArgumentException(l3.toString().toString());
    }

    public final v g() {
        v vVar = this.f9118c;
        if (vVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        z2.h.d(vVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return vVar;
    }

    public final EnumC0466o h() {
        return this.f9130o == null ? EnumC0466o.f6900j : this.f9132r;
    }

    public final v i(C0958j c0958j) {
        s sVar;
        C0945f c0945f = (C0945f) c0958j.j();
        if (c0945f == null || (sVar = c0945f.f9028i) == null) {
            sVar = this.f9118c;
            z2.h.c(sVar);
        }
        if (sVar instanceof v) {
            return (v) sVar;
        }
        v vVar = sVar.f9088i;
        z2.h.c(vVar);
        return vVar;
    }

    public final void j(C0945f c0945f, C0945f c0945f2) {
        this.f9126k.put(c0945f, c0945f2);
        LinkedHashMap linkedHashMap = this.f9127l;
        if (linkedHashMap.get(c0945f2) == null) {
            linkedHashMap.put(c0945f2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c0945f2);
        z2.h.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x021b, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0105, code lost:
    
        if (r28.f9093n == r5.f9093n) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f7, code lost:
    
        if (z2.h.a(r13, r5) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        r5 = new n2.C0958j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
    
        if (n2.AbstractC0963o.u(r12) < r14) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        r8 = (n1.C0945f) n2.AbstractC0968t.D(r12);
        t(r8);
        r13 = new n1.C0945f(r8.f9027h, r8.f9028i, r8.f9028i.b(r29), r8.f9030k, r8.f9031l, r8.f9032m, r8.f9033n);
        r13.f9030k = r8.f9030k;
        r13.h(r8.f9036r);
        r5.e(r13);
        r14 = r14;
        r9 = r9;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        r26 = r3;
        r25 = r9;
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0168, code lost:
    
        if (r3.hasNext() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016a, code lost:
    
        r6 = (n1.C0945f) r3.next();
        r7 = r6.f9028i.f9088i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0174, code lost:
    
        if (r7 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        j(r6, f(r7.f9093n));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017f, code lost:
    
        r12.f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0183, code lost:
    
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018b, code lost:
    
        if (r3.hasNext() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r5 = (n1.C0945f) r3.next();
        r6 = r11.b(r5.f9028i.f9087h);
        r7 = r5.f9028i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019f, code lost:
    
        if ((r7 instanceof n1.s) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a2, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a3, code lost:
    
        if (r7 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a7, code lost:
    
        r8 = new n1.C0939B();
        r8.f9008b = true;
        r12 = r8.f9008b;
        r13 = r8.f9007a;
        r13.f9141a = r12;
        r13.f9142b = r8.f9009c;
        r12 = r8.f9010d;
        r8 = r8.f9011e;
        r13.f9143c = r12;
        r13.f9144d = null;
        r13.f9145e = false;
        r13.f9146f = r8;
        r13.a();
        r6.c(r7);
        r6 = r6.b();
        r7 = r6.f9044a;
        r7.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d6, code lost:
    
        r8 = n2.AbstractC0961m.Y((java.util.Collection) r6.f9048e.f4811h.getValue());
        r12 = r8.listIterator(r8.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f0, code lost:
    
        if (r12.hasPrevious() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0200, code lost:
    
        if (z2.h.a(((n1.C0945f) r12.previous()).f9032m, r5.f9032m) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0202, code lost:
    
        r12 = r12.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020a, code lost:
    
        r8.set(r12, r5);
        r6.f9045b.k(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0212, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0209, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0207, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0217, code lost:
    
        r7.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x025c A[LOOP:1: B:19:0x0256->B:21:0x025c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(n1.s r28, android.os.Bundle r29, n1.C0938A r30) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.y.k(n1.s, android.os.Bundle, n1.A):void");
    }

    public final void m() {
        C0958j c0958j = this.f9122g;
        if (c0958j.isEmpty()) {
            return;
        }
        C0945f c0945f = (C0945f) c0958j.j();
        s sVar = c0945f != null ? c0945f.f9028i : null;
        z2.h.c(sVar);
        if (n(sVar.f9093n, true, false)) {
            b();
        }
    }

    public final boolean n(int i2, boolean z3, boolean z4) {
        s sVar;
        C0958j c0958j = this.f9122g;
        if (c0958j.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC0961m.S(c0958j).iterator();
        while (true) {
            if (!it.hasNext()) {
                sVar = null;
                break;
            }
            sVar = ((C0945f) it.next()).f9028i;
            D b3 = this.f9136v.b(sVar.f9087h);
            if (z3 || sVar.f9093n != i2) {
                arrayList.add(b3);
            }
            if (sVar.f9093n == i2) {
                break;
            }
        }
        if (sVar != null) {
            return c(arrayList, sVar, z3, z4);
        }
        int i3 = s.f9086p;
        Log.i("NavController", "Ignoring popBackStack to destination " + l0.c.A(this.f9116a, i2) + " as it was not found on the current back stack");
        return false;
    }

    public final boolean o(String str, boolean z3, boolean z4) {
        Object obj;
        C0958j c0958j = this.f9122g;
        if (c0958j.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c0958j.listIterator(c0958j.a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C0945f c0945f = (C0945f) obj;
            s sVar = c0945f.f9028i;
            Bundle g3 = c0945f.g();
            sVar.getClass();
            z2.h.f(str, "route");
            boolean z5 = true;
            if (!z2.h.a(sVar.f9094o, str)) {
                r f3 = sVar.f(str);
                if (z2.h.a(sVar, f3 != null ? f3.f9081h : null)) {
                    if (g3 != null) {
                        Bundle bundle = f3.f9082i;
                        if (bundle != null) {
                            Set<String> keySet = bundle.keySet();
                            z2.h.e(keySet, "matchingArgs.keySet()");
                            for (String str2 : keySet) {
                                if (g3.containsKey(str2)) {
                                    B1.t.w(f3.f9081h.f9092m.get(str2));
                                }
                            }
                        }
                    } else {
                        f3.getClass();
                    }
                }
                z5 = false;
                break;
            }
            if (z3 || !z5) {
                arrayList.add(this.f9136v.b(c0945f.f9028i.f9087h));
            }
            if (z5) {
                break;
            }
        }
        C0945f c0945f2 = (C0945f) obj;
        s sVar2 = c0945f2 != null ? c0945f2.f9028i : null;
        if (sVar2 != null) {
            return c(arrayList, sVar2, z3, z4);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    public final void p(C0945f c0945f, boolean z3, C0958j c0958j) {
        m mVar;
        K k3;
        Set set;
        C0958j c0958j2 = this.f9122g;
        C0945f c0945f2 = (C0945f) c0958j2.last();
        if (!z2.h.a(c0945f2, c0945f)) {
            throw new IllegalStateException(("Attempted to pop " + c0945f.f9028i + ", which is not the top of the back stack (" + c0945f2.f9028i + ')').toString());
        }
        AbstractC0968t.D(c0958j2);
        i iVar = (i) this.f9137w.get(this.f9136v.b(c0945f2.f9028i.f9087h));
        boolean z4 = true;
        if ((iVar == null || (k3 = iVar.f9049f) == null || (set = (Set) k3.f4811h.getValue()) == null || !set.contains(c0945f2)) && !this.f9127l.containsKey(c0945f2)) {
            z4 = false;
        }
        EnumC0466o enumC0466o = c0945f2.f9034o.f6909c;
        EnumC0466o enumC0466o2 = EnumC0466o.f6900j;
        if (enumC0466o.compareTo(enumC0466o2) >= 0) {
            if (z3) {
                c0945f2.h(enumC0466o2);
                c0958j.e(new g(c0945f2));
            }
            if (z4) {
                c0945f2.h(enumC0466o2);
            } else {
                c0945f2.h(EnumC0466o.f6898h);
                t(c0945f2);
            }
        }
        if (z3 || z4 || (mVar = this.f9131p) == null) {
            return;
        }
        String str = c0945f2.f9032m;
        z2.h.f(str, "backStackEntryId");
        b0 b0Var = (b0) mVar.f9060b.remove(str);
        if (b0Var != null) {
            b0Var.a();
        }
    }

    public final ArrayList r() {
        EnumC0466o enumC0466o;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9137w.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0466o = EnumC0466o.f6901k;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((i) it.next()).f9049f.f4811h.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C0945f c0945f = (C0945f) obj;
                if (!arrayList.contains(c0945f) && c0945f.f9036r.compareTo(enumC0466o) < 0) {
                    arrayList2.add(obj);
                }
            }
            AbstractC0968t.B(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f9122g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C0945f c0945f2 = (C0945f) next;
            if (!arrayList.contains(c0945f2) && c0945f2.f9036r.compareTo(enumC0466o) >= 0) {
                arrayList3.add(next);
            }
        }
        AbstractC0968t.B(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C0945f) next2).f9028i instanceof v)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean s(int i2, Bundle bundle, C0938A c0938a) {
        s g3;
        C0945f c0945f;
        s sVar;
        LinkedHashMap linkedHashMap = this.f9128m;
        if (!linkedHashMap.containsKey(Integer.valueOf(i2))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i2));
        Collection values = linkedHashMap.values();
        z2.h.f(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (Boolean.valueOf(z2.h.a((String) it.next(), str)).booleanValue()) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f9129n;
        z2.v.c(linkedHashMap2);
        C0958j c0958j = (C0958j) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        C0945f c0945f2 = (C0945f) this.f9122g.j();
        if (c0945f2 == null || (g3 = c0945f2.f9028i) == null) {
            g3 = g();
        }
        if (c0958j != null) {
            Iterator it2 = c0958j.iterator();
            while (it2.hasNext()) {
                g gVar = (g) it2.next();
                s e3 = e(gVar.f9039i, g3, true);
                Context context = this.f9116a;
                if (e3 == null) {
                    int i3 = s.f9086p;
                    throw new IllegalStateException(("Restore State failed: destination " + l0.c.A(context, gVar.f9039i) + " cannot be found from the current destination " + g3).toString());
                }
                arrayList.add(gVar.a(context, e3, h(), this.f9131p));
                g3 = e3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((C0945f) next).f9028i instanceof v)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it4.hasNext()) {
                break;
            }
            C0945f c0945f3 = (C0945f) it4.next();
            List list = (List) AbstractC0961m.N(arrayList2);
            if (list != null && (c0945f = (C0945f) AbstractC0961m.M(list)) != null && (sVar = c0945f.f9028i) != null) {
                str2 = sVar.f9087h;
            }
            if (z2.h.a(str2, c0945f3.f9028i.f9087h)) {
                list.add(c0945f3);
            } else {
                arrayList2.add(AbstractC0963o.w(c0945f3));
            }
        }
        z2.o oVar = new z2.o();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            D b3 = this.f9136v.b(((C0945f) AbstractC0961m.G(list2)).f9028i.f9087h);
            this.f9138x = new C0000a(oVar, arrayList, new z2.q(), this, bundle, 4);
            b3.d(list2, c0938a);
            this.f9138x = null;
        }
        return oVar.f11905h;
    }

    public final void t(C0945f c0945f) {
        z2.h.f(c0945f, "child");
        C0945f c0945f2 = (C0945f) this.f9126k.remove(c0945f);
        if (c0945f2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f9127l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c0945f2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            i iVar = (i) this.f9137w.get(this.f9136v.b(c0945f2.f9028i.f9087h));
            if (iVar != null) {
                iVar.b(c0945f2);
            }
            linkedHashMap.remove(c0945f2);
        }
    }

    public final void u() {
        AtomicInteger atomicInteger;
        K k3;
        Set set;
        ArrayList Y2 = AbstractC0961m.Y(this.f9122g);
        if (Y2.isEmpty()) {
            return;
        }
        s sVar = ((C0945f) AbstractC0961m.M(Y2)).f9028i;
        ArrayList arrayList = new ArrayList();
        if (sVar instanceof InterfaceC0943d) {
            Iterator it = AbstractC0961m.S(Y2).iterator();
            while (it.hasNext()) {
                s sVar2 = ((C0945f) it.next()).f9028i;
                arrayList.add(sVar2);
                if (!(sVar2 instanceof InterfaceC0943d) && !(sVar2 instanceof v)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (C0945f c0945f : AbstractC0961m.S(Y2)) {
            EnumC0466o enumC0466o = c0945f.f9036r;
            s sVar3 = c0945f.f9028i;
            EnumC0466o enumC0466o2 = EnumC0466o.f6902l;
            EnumC0466o enumC0466o3 = EnumC0466o.f6901k;
            if (sVar != null && sVar3.f9093n == sVar.f9093n) {
                if (enumC0466o != enumC0466o2) {
                    i iVar = (i) this.f9137w.get(this.f9136v.b(sVar3.f9087h));
                    if (z2.h.a((iVar == null || (k3 = iVar.f9049f) == null || (set = (Set) k3.f4811h.getValue()) == null) ? null : Boolean.valueOf(set.contains(c0945f)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f9127l.get(c0945f)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(c0945f, enumC0466o3);
                    } else {
                        hashMap.put(c0945f, enumC0466o2);
                    }
                }
                s sVar4 = (s) AbstractC0961m.H(arrayList);
                if (sVar4 != null && sVar4.f9093n == sVar3.f9093n) {
                    AbstractC0968t.C(arrayList);
                }
                sVar = sVar.f9088i;
            } else if ((!arrayList.isEmpty()) && sVar3.f9093n == ((s) AbstractC0961m.G(arrayList)).f9093n) {
                s sVar5 = (s) AbstractC0968t.C(arrayList);
                if (enumC0466o == enumC0466o2) {
                    c0945f.h(enumC0466o3);
                } else if (enumC0466o != enumC0466o3) {
                    hashMap.put(c0945f, enumC0466o3);
                }
                v vVar = sVar5.f9088i;
                if (vVar != null && !arrayList.contains(vVar)) {
                    arrayList.add(vVar);
                }
            } else {
                c0945f.h(EnumC0466o.f6900j);
            }
        }
        Iterator it2 = Y2.iterator();
        while (it2.hasNext()) {
            C0945f c0945f2 = (C0945f) it2.next();
            EnumC0466o enumC0466o4 = (EnumC0466o) hashMap.get(c0945f2);
            if (enumC0466o4 != null) {
                c0945f2.h(enumC0466o4);
            } else {
                c0945f2.i();
            }
        }
    }

    public final void v() {
        boolean z3 = false;
        if (this.f9135u) {
            C0958j c0958j = this.f9122g;
            if (!(c0958j instanceof Collection) || !c0958j.isEmpty()) {
                Iterator it = c0958j.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if ((!(((C0945f) it.next()).f9028i instanceof v)) && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
                if (i2 > 1) {
                    z3 = true;
                }
            }
        }
        C0500x c0500x = this.f9134t;
        c0500x.f7021a = z3;
        y2.a aVar = c0500x.f7023c;
        if (aVar != null) {
            aVar.c();
        }
    }
}
