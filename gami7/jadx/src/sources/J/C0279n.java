package J;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import q2.InterfaceC1078i;

/* renamed from: J.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279n extends AbstractC0288s {

    /* renamed from: a, reason: collision with root package name */
    public final int f4160a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4161b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4162c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f4163d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4164e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0274k0 f4165f = C0257c.N(R.e.f5376k, W.f4107k);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0285q f4166g;

    public C0279n(C0285q c0285q, int i2, boolean z3, boolean z4, C0300y c0300y) {
        this.f4166g = c0285q;
        this.f4160a = i2;
        this.f4161b = z3;
        this.f4162c = z4;
    }

    @Override // J.AbstractC0288s
    public final void a(C0294v c0294v, R.a aVar) {
        this.f4166g.f4196b.a(c0294v, aVar);
    }

    @Override // J.AbstractC0288s
    public final void b() {
        C0285q c0285q = this.f4166g;
        c0285q.f4219z--;
    }

    @Override // J.AbstractC0288s
    public final boolean c() {
        return this.f4166g.f4196b.c();
    }

    @Override // J.AbstractC0288s
    public final boolean d() {
        return this.f4161b;
    }

    @Override // J.AbstractC0288s
    public final boolean e() {
        return this.f4162c;
    }

    @Override // J.AbstractC0288s
    public final InterfaceC0282o0 f() {
        return (InterfaceC0282o0) this.f4165f.getValue();
    }

    @Override // J.AbstractC0288s
    public final int g() {
        return this.f4160a;
    }

    @Override // J.AbstractC0288s
    public final InterfaceC1078i h() {
        return this.f4166g.f4196b.h();
    }

    @Override // J.AbstractC0288s
    public final void i(C0294v c0294v) {
        C0285q c0285q = this.f4166g;
        c0285q.f4196b.i(c0285q.f4201g);
        c0285q.f4196b.i(c0294v);
    }

    @Override // J.AbstractC0288s
    public final Z j(AbstractC0254a0 abstractC0254a0) {
        return this.f4166g.f4196b.j(abstractC0254a0);
    }

    @Override // J.AbstractC0288s
    public final void k(Set set) {
        HashSet hashSet = this.f4163d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f4163d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // J.AbstractC0288s
    public final void l(C0285q c0285q) {
        this.f4164e.add(c0285q);
    }

    @Override // J.AbstractC0288s
    public final void m(C0294v c0294v) {
        this.f4166g.f4196b.m(c0294v);
    }

    @Override // J.AbstractC0288s
    public final void n() {
        this.f4166g.f4219z++;
    }

    @Override // J.AbstractC0288s
    public final void o(C0285q c0285q) {
        HashSet hashSet = this.f4163d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(c0285q.f4197c);
            }
        }
        LinkedHashSet linkedHashSet = this.f4164e;
        z2.v.a(linkedHashSet);
        linkedHashSet.remove(c0285q);
    }

    @Override // J.AbstractC0288s
    public final void p(C0294v c0294v) {
        this.f4166g.f4196b.p(c0294v);
    }

    public final void q() {
        LinkedHashSet<C0285q> linkedHashSet = this.f4164e;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.f4163d;
            if (hashSet != null) {
                for (C0285q c0285q : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(c0285q.f4197c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}
