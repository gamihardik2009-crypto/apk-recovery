package h1;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import o2.C1000f;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0699c {

    /* renamed from: h, reason: collision with root package name */
    public int f7784h;

    /* renamed from: i, reason: collision with root package name */
    public int f7785i;

    /* renamed from: j, reason: collision with root package name */
    public int f7786j;

    /* renamed from: k, reason: collision with root package name */
    public Object f7787k;

    public AbstractC0699c() {
        if (C1.b.f620i == null) {
            C1.b.f620i = new C1.b(24, false);
        }
    }

    public int a(int i2) {
        if (i2 < this.f7786j) {
            return ((ByteBuffer) this.f7787k).getShort(this.f7785i + i2);
        }
        return 0;
    }

    public void b() {
        if (((C1000f) this.f7787k).f9347o != this.f7786j) {
            throw new ConcurrentModificationException();
        }
    }

    public void e() {
        while (true) {
            int i2 = this.f7784h;
            C1000f c1000f = (C1000f) this.f7787k;
            if (i2 >= c1000f.f9345m || c1000f.f9342j[i2] >= 0) {
                return;
            } else {
                this.f7784h = i2 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f7784h < ((C1000f) this.f7787k).f9345m;
    }

    public void remove() {
        b();
        if (this.f7785i == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        C1000f c1000f = (C1000f) this.f7787k;
        c1000f.e();
        c1000f.m(this.f7785i);
        this.f7785i = -1;
        this.f7786j = c1000f.f9347o;
    }
}
