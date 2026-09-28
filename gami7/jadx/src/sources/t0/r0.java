package t0;

import J.C0257c;
import J.InterfaceC0259d;
import java.util.ArrayList;
import u0.C1314v;

/* loaded from: classes.dex */
public final class r0 implements InterfaceC0259d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10622a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10623b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Object f10624c;

    public r0(Object obj) {
        this.f10622a = obj;
        this.f10624c = obj;
    }

    @Override // J.InterfaceC0259d
    public final void a(int i2, Object obj) {
        ((C1236E) this.f10624c).x(i2, (C1236E) obj);
    }

    @Override // J.InterfaceC0259d
    public final void b(Object obj) {
        this.f10623b.add(this.f10624c);
        this.f10624c = obj;
    }

    @Override // J.InterfaceC0259d
    public final void c() {
        ArrayList arrayList = this.f10623b;
        if (!arrayList.isEmpty()) {
            this.f10624c = arrayList.remove(arrayList.size() - 1);
        } else {
            C0257c.X("empty stack");
            throw null;
        }
    }

    @Override // J.InterfaceC0259d
    public final void clear() {
        this.f10623b.clear();
        this.f10624c = this.f10622a;
        ((C1236E) this.f10622a).N();
    }

    @Override // J.InterfaceC0259d
    public final /* bridge */ /* synthetic */ void d(int i2, Object obj) {
    }

    @Override // J.InterfaceC0259d
    public final void e() {
        f0 f0Var = ((C1236E) this.f10622a).f10395p;
        if (f0Var != null) {
            ((C1314v) f0Var).w();
        }
    }

    @Override // J.InterfaceC0259d
    public final void f(int i2, int i3, int i4) {
        ((C1236E) this.f10624c).H(i2, i3, i4);
    }

    @Override // J.InterfaceC0259d
    public final Object g() {
        return this.f10624c;
    }

    @Override // J.InterfaceC0259d
    public final void h(int i2, int i3) {
        ((C1236E) this.f10624c).O(i2, i3);
    }
}
