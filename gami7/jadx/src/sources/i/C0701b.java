package i;

import java.util.Iterator;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701b extends AbstractC0704e implements Iterator {

    /* renamed from: h, reason: collision with root package name */
    public C0702c f7789h;

    /* renamed from: i, reason: collision with root package name */
    public C0702c f7790i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7791j;

    public C0701b(C0702c c0702c, C0702c c0702c2, int i2) {
        this.f7791j = i2;
        this.f7789h = c0702c2;
        this.f7790i = c0702c;
    }

    @Override // i.AbstractC0704e
    public final void a(C0702c c0702c) {
        C0702c c0702c2 = null;
        if (this.f7789h == c0702c && c0702c == this.f7790i) {
            this.f7790i = null;
            this.f7789h = null;
        }
        C0702c c0702c3 = this.f7789h;
        if (c0702c3 == c0702c) {
            this.f7789h = b(c0702c3);
        }
        C0702c c0702c4 = this.f7790i;
        if (c0702c4 == c0702c) {
            C0702c c0702c5 = this.f7789h;
            if (c0702c4 != c0702c5 && c0702c5 != null) {
                c0702c2 = c(c0702c4);
            }
            this.f7790i = c0702c2;
        }
    }

    public final C0702c b(C0702c c0702c) {
        switch (this.f7791j) {
            case 0:
                return c0702c.f7795k;
            default:
                return c0702c.f7794j;
        }
    }

    public final C0702c c(C0702c c0702c) {
        switch (this.f7791j) {
            case 0:
                return c0702c.f7794j;
            default:
                return c0702c.f7795k;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7790i != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0702c c0702c = this.f7790i;
        C0702c c0702c2 = this.f7789h;
        this.f7790i = (c0702c == c0702c2 || c0702c2 == null) ? null : c(c0702c);
        return c0702c;
    }
}
