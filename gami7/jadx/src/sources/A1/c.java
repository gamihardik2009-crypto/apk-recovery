package A1;

import android.os.Parcel;
import android.util.SparseIntArray;
import j.C0750f;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f131d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f132e;

    /* renamed from: f, reason: collision with root package name */
    public final int f133f;

    /* renamed from: g, reason: collision with root package name */
    public final int f134g;

    /* renamed from: h, reason: collision with root package name */
    public final String f135h;

    /* renamed from: i, reason: collision with root package name */
    public int f136i;

    /* renamed from: j, reason: collision with root package name */
    public int f137j;

    /* renamed from: k, reason: collision with root package name */
    public int f138k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0750f(0), new C0750f(0), new C0750f(0));
    }

    @Override // A1.b
    public final c a() {
        Parcel parcel = this.f132e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f137j;
        if (i2 == this.f133f) {
            i2 = this.f134g;
        }
        return new c(parcel, dataPosition, i2, this.f135h + "  ", this.f128a, this.f129b, this.f130c);
    }

    @Override // A1.b
    public final boolean e(int i2) {
        while (this.f137j < this.f134g) {
            int i3 = this.f138k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f137j;
            Parcel parcel = this.f132e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f138k = parcel.readInt();
            this.f137j += readInt;
        }
        return this.f138k == i2;
    }

    @Override // A1.b
    public final void h(int i2) {
        int i3 = this.f136i;
        SparseIntArray sparseIntArray = this.f131d;
        Parcel parcel = this.f132e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f136i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, C0750f c0750f, C0750f c0750f2, C0750f c0750f3) {
        super(c0750f, c0750f2, c0750f3);
        this.f131d = new SparseIntArray();
        this.f136i = -1;
        this.f138k = -1;
        this.f132e = parcel;
        this.f133f = i2;
        this.f134g = i3;
        this.f137j = i2;
        this.f135h = str;
    }
}
