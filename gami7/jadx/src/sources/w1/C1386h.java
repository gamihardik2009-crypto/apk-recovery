package w1;

import android.database.sqlite.SQLiteProgram;

/* renamed from: w1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1386h implements v1.d {

    /* renamed from: h, reason: collision with root package name */
    public final SQLiteProgram f11464h;

    public C1386h(SQLiteProgram sQLiteProgram) {
        z2.h.f(sQLiteProgram, "delegate");
        this.f11464h = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11464h.close();
    }

    @Override // v1.d
    public final void k(double d3, int i2) {
        this.f11464h.bindDouble(i2, d3);
    }

    @Override // v1.d
    public final void m(int i2, byte[] bArr) {
        this.f11464h.bindBlob(i2, bArr);
    }

    @Override // v1.d
    public final void n(int i2) {
        this.f11464h.bindNull(i2);
    }

    @Override // v1.d
    public final void p(String str, int i2) {
        z2.h.f(str, "value");
        this.f11464h.bindString(i2, str);
    }

    @Override // v1.d
    public final void t(long j3, int i2) {
        this.f11464h.bindLong(i2, j3);
    }
}
