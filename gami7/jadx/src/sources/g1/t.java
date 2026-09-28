package g1;

import h1.C0697a;
import h1.C0698b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f7758d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f7759a;

    /* renamed from: b, reason: collision with root package name */
    public final K1.i f7760b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f7761c = 0;

    public t(K1.i iVar, int i2) {
        this.f7760b = iVar;
        this.f7759a = i2;
    }

    public final int a(int i2) {
        C0697a c3 = c();
        int a3 = c3.a(16);
        if (a3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c3.f7787k;
        int i3 = a3 + c3.f7784h;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final int b() {
        C0697a c3 = c();
        int a3 = c3.a(16);
        if (a3 == 0) {
            return 0;
        }
        int i2 = a3 + c3.f7784h;
        return ((ByteBuffer) c3.f7787k).getInt(((ByteBuffer) c3.f7787k).getInt(i2) + i2);
    }

    public final C0697a c() {
        ThreadLocal threadLocal = f7758d;
        C0697a c0697a = (C0697a) threadLocal.get();
        if (c0697a == null) {
            c0697a = new C0697a();
            threadLocal.set(c0697a);
        }
        C0698b c0698b = (C0698b) this.f7760b.f4547i;
        int a3 = c0698b.a(6);
        if (a3 != 0) {
            int i2 = a3 + c0698b.f7784h;
            int i3 = (this.f7759a * 4) + ((ByteBuffer) c0698b.f7787k).getInt(i2) + i2 + 4;
            int i4 = ((ByteBuffer) c0698b.f7787k).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) c0698b.f7787k;
            c0697a.f7787k = byteBuffer;
            if (byteBuffer != null) {
                c0697a.f7784h = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                c0697a.f7785i = i5;
                c0697a.f7786j = ((ByteBuffer) c0697a.f7787k).getShort(i5);
            } else {
                c0697a.f7784h = 0;
                c0697a.f7785i = 0;
                c0697a.f7786j = 0;
            }
        }
        return c0697a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0697a c3 = c();
        int a3 = c3.a(4);
        sb.append(Integer.toHexString(a3 != 0 ? ((ByteBuffer) c3.f7787k).getInt(a3 + c3.f7784h) : 0));
        sb.append(", codepoints:");
        int b3 = b();
        for (int i2 = 0; i2 < b3; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
