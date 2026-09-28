package q1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: q1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067i {

    /* renamed from: a, reason: collision with root package name */
    public final int f9766a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9767b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9768c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9769d;

    public C1067i(int i2, int i3, long j3, long j4) {
        this.f9766a = i2;
        this.f9767b = i3;
        this.f9768c = j3;
        this.f9769d = j4;
    }

    public static C1067i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C1067i c1067i = new C1067i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1067i;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f9766a);
            dataOutputStream.writeInt(this.f9767b);
            dataOutputStream.writeLong(this.f9768c);
            dataOutputStream.writeLong(this.f9769d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1067i)) {
            return false;
        }
        C1067i c1067i = (C1067i) obj;
        return this.f9767b == c1067i.f9767b && this.f9768c == c1067i.f9768c && this.f9766a == c1067i.f9766a && this.f9769d == c1067i.f9769d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9767b), Long.valueOf(this.f9768c), Integer.valueOf(this.f9766a), Long.valueOf(this.f9769d));
    }
}
