package i;

import java.util.Iterator;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703d extends AbstractC0704e implements Iterator {

    /* renamed from: h, reason: collision with root package name */
    public C0702c f7796h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7797i = true;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0705f f7798j;

    public C0703d(C0705f c0705f) {
        this.f7798j = c0705f;
    }

    @Override // i.AbstractC0704e
    public final void a(C0702c c0702c) {
        C0702c c0702c2 = this.f7796h;
        if (c0702c == c0702c2) {
            C0702c c0702c3 = c0702c2.f7795k;
            this.f7796h = c0702c3;
            this.f7797i = c0702c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7797i) {
            return this.f7798j.f7799h != null;
        }
        C0702c c0702c = this.f7796h;
        return (c0702c == null || c0702c.f7794j == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7797i) {
            this.f7797i = false;
            this.f7796h = this.f7798j.f7799h;
        } else {
            C0702c c0702c = this.f7796h;
            this.f7796h = c0702c != null ? c0702c.f7794j : null;
        }
        return this.f7796h;
    }
}
